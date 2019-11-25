package typings.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The payment capabilities supported by the merchant.
  */
/* Rewritten from type alias, can be one of: 
  - typings.applepayjs.applepayjsStrings.supports3DS
  - typings.applepayjs.applepayjsStrings.supportsEMV
  - typings.applepayjs.applepayjsStrings.supportsCredit
  - typings.applepayjs.applepayjsStrings.supportsDebit
*/
trait ApplePayMerchantCapability extends js.Object

object ApplePayMerchantCapability {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def supports3DS: typings.applepayjs.applepayjsStrings.supports3DS = this.cast("supports3DS")
  @scala.inline
  def supportsCredit: typings.applepayjs.applepayjsStrings.supportsCredit = this.cast("supportsCredit")
  @scala.inline
  def supportsDebit: typings.applepayjs.applepayjsStrings.supportsDebit = this.cast("supportsDebit")
  @scala.inline
  def supportsEMV: typings.applepayjs.applepayjsStrings.supportsEMV = this.cast("supportsEMV")
}

