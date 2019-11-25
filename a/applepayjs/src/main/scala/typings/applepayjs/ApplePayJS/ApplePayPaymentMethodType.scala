package typings.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A payment card's type of payment.
  */
/* Rewritten from type alias, can be one of: 
  - typings.applepayjs.applepayjsStrings.debit
  - typings.applepayjs.applepayjsStrings.credit
  - typings.applepayjs.applepayjsStrings.prepaid
  - typings.applepayjs.applepayjsStrings.store
*/
trait ApplePayPaymentMethodType extends js.Object

object ApplePayPaymentMethodType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def credit: typings.applepayjs.applepayjsStrings.credit = this.cast("credit")
  @scala.inline
  def debit: typings.applepayjs.applepayjsStrings.debit = this.cast("debit")
  @scala.inline
  def prepaid: typings.applepayjs.applepayjsStrings.prepaid = this.cast("prepaid")
  @scala.inline
  def store: typings.applepayjs.applepayjsStrings.store = this.cast("store")
}

