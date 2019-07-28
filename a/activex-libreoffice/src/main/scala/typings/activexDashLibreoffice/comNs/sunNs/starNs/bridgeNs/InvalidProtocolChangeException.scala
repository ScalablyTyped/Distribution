package typings.activexDashLibreoffice.comNs.sunNs.starNs.bridgeNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Indicates, that a requested property change could not be executed by the remote counterpart.
  * @see XProtocolProperties
  */
trait InvalidProtocolChangeException extends Exception {
  /** The first invalid property. */
  var invalidProperty: ProtocolProperty
  /** Contains 1, if the property name is unknown to the thrower; or contains 2, if the property's value can't be accepted by the thrower. */
  var reason: Double
}

object InvalidProtocolChangeException {
  @scala.inline
  def apply(Context: XInterface, Message: String, invalidProperty: ProtocolProperty, reason: Double): InvalidProtocolChangeException = {
    val __obj = js.Dynamic.literal(Context = Context, Message = Message, invalidProperty = invalidProperty, reason = reason)
  
    __obj.asInstanceOf[InvalidProtocolChangeException]
  }
}

