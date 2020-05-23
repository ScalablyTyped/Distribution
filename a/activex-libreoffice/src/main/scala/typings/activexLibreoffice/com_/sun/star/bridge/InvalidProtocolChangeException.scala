package typings.activexLibreoffice.com_.sun.star.bridge

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], invalidProperty = invalidProperty.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidProtocolChangeException]
  }
}

