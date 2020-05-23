package typings.activexLibreoffice.com_.sun.star.lang

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to locate a specific connection point for a specified UIK and manages a sequence of connections points.
  *
  * An implementation of this interface **must** support the {@link com.sun.star.uno.XWeak} interface. Look at the language binding for a superclass or
  * something else.
  * @see XConnectionPoint
  * @see com.sun.star.uno.XWeak
  */
trait XConnectionPointContainer extends XInterface {
  /** @returns a sequence of all outgoing types; specifies which are supported by this connectable object. */
  val ConnectionPointTypes: SafeArray[`type`]
  /**
    * creates a connection between this object and a client's sink, where the sink implements the outgoing interface specified with ID.
    *
    * The interface is advised under the connection point you get with `queryConnectionPoint( id )` .
    *
    * Use this method instead of the advise method at the connection point, only if you know that the broadcaster supports the outgoing interface, or if it
    * does not matter that the outgoing interface is not supported.
    * @see XConnectionPoint.advise
    */
  def advise(aType: `type`, xListener: XInterface): Unit
  /** @returns a sequence of all outgoing types; specifies which are supported by this connectable object. */
  def getConnectionPointTypes(): SafeArray[`type`]
  /**
    * @param aType specifies the connection point's type.
    * @returns an {@link XConnectionPoint} interface of a connection point for a specified type if that type describes a supported outgoing interface. It is NUL
    */
  def queryConnectionPoint(aType: `type`): XConnectionPoint
  /**
    * terminates a notification previously set up with advise at the container or at the suitable connection point.
    * @see XConnectionPoint.unadvise
    */
  def unadvise(aType: `type`, xListener: XInterface): Unit
}

object XConnectionPointContainer {
  @scala.inline
  def apply(
    ConnectionPointTypes: SafeArray[`type`],
    acquire: () => Unit,
    advise: (`type`, XInterface) => Unit,
    getConnectionPointTypes: () => SafeArray[`type`],
    queryConnectionPoint: `type` => XConnectionPoint,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    unadvise: (`type`, XInterface) => Unit
  ): XConnectionPointContainer = {
    val __obj = js.Dynamic.literal(ConnectionPointTypes = ConnectionPointTypes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), advise = js.Any.fromFunction2(advise), getConnectionPointTypes = js.Any.fromFunction0(getConnectionPointTypes), queryConnectionPoint = js.Any.fromFunction1(queryConnectionPoint), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), unadvise = js.Any.fromFunction2(unadvise))
    __obj.asInstanceOf[XConnectionPointContainer]
  }
}

