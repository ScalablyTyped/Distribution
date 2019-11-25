package typings.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Payment pass activation states.
  */
/* Rewritten from type alias, can be one of: 
  - typings.applepayjs.applepayjsStrings.activated
  - typings.applepayjs.applepayjsStrings.requiresActivation
  - typings.applepayjs.applepayjsStrings.activating
  - typings.applepayjs.applepayjsStrings.suspended
  - typings.applepayjs.applepayjsStrings.deactivated
*/
trait ApplePayPaymentPassActivationState extends js.Object

object ApplePayPaymentPassActivationState {
  @scala.inline
  def activated: typings.applepayjs.applepayjsStrings.activated = this.cast("activated")
  @scala.inline
  def activating: typings.applepayjs.applepayjsStrings.activating = this.cast("activating")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deactivated: typings.applepayjs.applepayjsStrings.deactivated = this.cast("deactivated")
  @scala.inline
  def requiresActivation: typings.applepayjs.applepayjsStrings.requiresActivation = this.cast("requiresActivation")
  @scala.inline
  def suspended: typings.applepayjs.applepayjsStrings.suspended = this.cast("suspended")
}

