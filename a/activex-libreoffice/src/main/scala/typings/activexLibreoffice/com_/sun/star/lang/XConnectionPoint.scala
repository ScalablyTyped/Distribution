package typings.activexLibreoffice.com_.sun.star.lang

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * supports connection points for connectable objects.
  *
  * Connectable objects support the following features:
  *
  * outgoing interfaces, such as event sets;the ability to enumerate the types of the outgoing interfaces;the ability to connect and disconnect sinks to
  * the object for those outgoing types;the ability to enumerate the connections that exist to a particular outgoing interface.
  *
  * **When to Implement?**
  *
  * To create a connectable object, you need to implement objects that provide two related interfaces:
  *
  * {@link XConnectionPointContainer}{@link XConnectionPoint}
  *
  * The {@link XConnectionPointContainer} interface is implemented on the connectable object to indicate the existence of the outgoing interfaces. It
  * provides a sequence of sub-objects. It also provides access to all the connection point sub-objects, each of which implements the {@link
  * XConnectionPoint} interface. The {@link XConnectionPoint} interface provides a sequence of sub-objects.
  *
  * Each connection point is a separate sub-object to avoid circular reference counting problems. A connection point controls how many connections (one or
  * more) it will allow in its implementation of {@link XConnectionPoint.advise()} .
  *
  * **When to use?**
  *
  * A client can use the {@link XConnectionPointContainer} interface:
  *
  * to get a sequence of connection points for each outgoing type.to obtain access to connection point sub-objects with the {@link XConnectionPoint}
  * interface for each outgoing type. Through the {@link XConnectionPoint} interface, a client starts or terminates an advisory loop with the connectable
  * object and the client's own sink. The client can also use the {@link XConnectionPoint} interface to get a sequence of the connections that it knows
  * about.
  * @see XConnectionPointContainer
  */
trait XConnectionPoint
  extends StObject
     with XInterface {
  
  /**
    * @returns the {@link XConnectionPointContainer} interface on the parent connectable object.
    * @see XConnectionPointContainer
    */
  val ConnectionPointContainer: XConnectionPointContainer
  
  /**
    * @returns the type of the outgoing interface managed by this connection point.  Using the XConnectionPointContainer::getConnectionPoints() method, a client
    * @see XConnectionPointContainer.findConnectionPoint
    */
  val ConnectionType: `type`
  
  /** @returns a sequence of all currently advised connections. */
  val Connections: SafeArray[XInterface]
  
  /**
    * creates a connection between a connection point and a client's sink, where the sink implements the outgoing interface supported by this connection
    * point.
    *
    * A few `add...Listener` methods need additional parameters to add listeners or throw exceptions. One of these methods is {@link
    * com.sun.star.beans.XPropertySet.addPropertyChangeListener()} . We ignore the problem in this interface. A solution must be provided in an additional
    * {@link XConnectionPoint} interface.
    * @param xListener specifies the listener interface on the client's advise sink. The client's sink receives outgoing calls from the connection point container.
    * @see com.sun.star.beans.XPropertySet.addPropertyChangeListener
    * @throws ListenerExistException if it is a unicast broadcaster and a listener is already set.
    * @throws InvalidListenerException if the listener does not supply the needed interfaces.
    */
  def advise(xListener: XInterface): Unit
  
  /**
    * @returns the {@link XConnectionPointContainer} interface on the parent connectable object.
    * @see XConnectionPointContainer
    */
  def getConnectionPointContainer(): XConnectionPointContainer
  
  /**
    * @returns the type of the outgoing interface managed by this connection point.  Using the XConnectionPointContainer::getConnectionPoints() method, a client
    * @see XConnectionPointContainer.findConnectionPoint
    */
  def getConnectionType(): `type`
  
  /** @returns a sequence of all currently advised connections. */
  def getConnections(): SafeArray[XInterface]
  
  /**
    * terminates a notification previously set up with advise.
    *
    * A few `remove...Listener` methods need additional parameters to add listeners or throw exceptions. One of these methods is {@link
    * com.sun.star.beans.XPropertySet.removePropertyChangeListener()} . We ignore the problem in this interface. A solution must be provided in an
    * additional {@link XConnectionPoint} interface.
    * @param xListener specifies the listener interface on the client's advise sink.
    * @see com.sun.star.beans.XPropertySet.removePropertyChangeListener
    */
  def unadvise(xListener: XInterface): Unit
}
object XConnectionPoint {
  
  inline def apply(
    ConnectionPointContainer: XConnectionPointContainer,
    ConnectionType: `type`,
    Connections: SafeArray[XInterface],
    acquire: () => Unit,
    advise: XInterface => Unit,
    getConnectionPointContainer: () => XConnectionPointContainer,
    getConnectionType: () => `type`,
    getConnections: () => SafeArray[XInterface],
    queryInterface: `type` => Any,
    release: () => Unit,
    unadvise: XInterface => Unit
  ): XConnectionPoint = {
    val __obj = js.Dynamic.literal(ConnectionPointContainer = ConnectionPointContainer.asInstanceOf[js.Any], ConnectionType = ConnectionType.asInstanceOf[js.Any], Connections = Connections.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), advise = js.Any.fromFunction1(advise), getConnectionPointContainer = js.Any.fromFunction0(getConnectionPointContainer), getConnectionType = js.Any.fromFunction0(getConnectionType), getConnections = js.Any.fromFunction0(getConnections), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), unadvise = js.Any.fromFunction1(unadvise))
    __obj.asInstanceOf[XConnectionPoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XConnectionPoint] (val x: Self) extends AnyVal {
    
    inline def setAdvise(value: XInterface => Unit): Self = StObject.set(x, "advise", js.Any.fromFunction1(value))
    
    inline def setConnectionPointContainer(value: XConnectionPointContainer): Self = StObject.set(x, "ConnectionPointContainer", value.asInstanceOf[js.Any])
    
    inline def setConnectionType(value: `type`): Self = StObject.set(x, "ConnectionType", value.asInstanceOf[js.Any])
    
    inline def setConnections(value: SafeArray[XInterface]): Self = StObject.set(x, "Connections", value.asInstanceOf[js.Any])
    
    inline def setGetConnectionPointContainer(value: () => XConnectionPointContainer): Self = StObject.set(x, "getConnectionPointContainer", js.Any.fromFunction0(value))
    
    inline def setGetConnectionType(value: () => `type`): Self = StObject.set(x, "getConnectionType", js.Any.fromFunction0(value))
    
    inline def setGetConnections(value: () => SafeArray[XInterface]): Self = StObject.set(x, "getConnections", js.Any.fromFunction0(value))
    
    inline def setUnadvise(value: XInterface => Unit): Self = StObject.set(x, "unadvise", js.Any.fromFunction1(value))
  }
}
