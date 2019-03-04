package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Indicates, that a requested property change could not be executed by the remote counterpart.
  * @see XProtocolProperties
  */
trait InvalidProtocolChangeException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** The first invalid property. */
  var invalidProperty: ProtocolProperty
  /** Contains 1, if the property name is unknown to the thrower; or contains 2, if the property's value can't be accepted by the thrower. */
  var reason: scala.Double
}

object InvalidProtocolChangeException {
  @scala.inline
  def apply(
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Message: java.lang.String,
    invalidProperty: ProtocolProperty,
    reason: scala.Double
  ): InvalidProtocolChangeException = {
    val __obj = js.Dynamic.literal(Context = Context, Message = Message, invalidProperty = invalidProperty, reason = reason)
  
    __obj.asInstanceOf[InvalidProtocolChangeException]
  }
}

