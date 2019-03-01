package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.langNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * @returns the {@link XConnectionPointContainer} interface on the parent connectable object.
    * @see XConnectionPointContainer
    */
  val ConnectionPointContainer: XConnectionPointContainer
  /**
    * @returns the type of the outgoing interface managed by this connection point.  Using the XConnectionPointContainer::getConnectionPoints() method, a client
    * @see XConnectionPointContainer.findConnectionPoint
    */
  val ConnectionType: activexDashLibreofficeLib.`type`
  /** @returns a sequence of all currently advised connections. */
  val Connections: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface]
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
  def advise(xListener: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface): scala.Unit
  /**
    * @returns the {@link XConnectionPointContainer} interface on the parent connectable object.
    * @see XConnectionPointContainer
    */
  def getConnectionPointContainer(): XConnectionPointContainer
  /**
    * @returns the type of the outgoing interface managed by this connection point.  Using the XConnectionPointContainer::getConnectionPoints() method, a client
    * @see XConnectionPointContainer.findConnectionPoint
    */
  def getConnectionType(): activexDashLibreofficeLib.`type`
  /** @returns a sequence of all currently advised connections. */
  def getConnections(): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface]
  /**
    * terminates a notification previously set up with advise.
    *
    * A few `remove...Listener` methods need additional parameters to add listeners or throw exceptions. One of these methods is {@link
    * com.sun.star.beans.XPropertySet.removePropertyChangeListener()} . We ignore the problem in this interface. A solution must be provided in an
    * additional {@link XConnectionPoint} interface.
    * @param xListener specifies the listener interface on the client's advise sink.
    * @see com.sun.star.beans.XPropertySet.removePropertyChangeListener
    */
  def unadvise(xListener: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface): scala.Unit
}

object XConnectionPoint {
  @scala.inline
  def apply(
    ConnectionPointContainer: XConnectionPointContainer,
    ConnectionType: activexDashLibreofficeLib.`type`,
    Connections: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    acquire: js.Function0[scala.Unit],
    advise: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit],
    getConnectionPointContainer: js.Function0[XConnectionPointContainer],
    getConnectionType: js.Function0[activexDashLibreofficeLib.`type`],
    getConnections: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface]
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    unadvise: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit]
  ): XConnectionPoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ConnectionPointContainer")(ConnectionPointContainer)
    __obj.updateDynamic("ConnectionType")(ConnectionType)
    __obj.updateDynamic("Connections")(Connections)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("advise")(advise)
    __obj.updateDynamic("getConnectionPointContainer")(getConnectionPointContainer)
    __obj.updateDynamic("getConnectionType")(getConnectionType)
    __obj.updateDynamic("getConnections")(getConnections)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("unadvise")(unadvise)
    __obj.asInstanceOf[XConnectionPoint]
  }
}

