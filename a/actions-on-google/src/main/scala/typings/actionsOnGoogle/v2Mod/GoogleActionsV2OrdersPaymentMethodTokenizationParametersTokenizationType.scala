package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.actionsOnGoogle.actionsOnGoogleStrings.UNSPECIFIED_TOKENIZATION_TYPE
  - typings.actionsOnGoogle.actionsOnGoogleStrings.PAYMENT_GATEWAY
  - typings.actionsOnGoogle.actionsOnGoogleStrings.DIRECT
*/
trait GoogleActionsV2OrdersPaymentMethodTokenizationParametersTokenizationType extends js.Object

object GoogleActionsV2OrdersPaymentMethodTokenizationParametersTokenizationType {
  @scala.inline
  def DIRECT: typings.actionsOnGoogle.actionsOnGoogleStrings.DIRECT = this.cast("DIRECT")
  @scala.inline
  def PAYMENT_GATEWAY: typings.actionsOnGoogle.actionsOnGoogleStrings.PAYMENT_GATEWAY = this.cast("PAYMENT_GATEWAY")
  @scala.inline
  def UNSPECIFIED_TOKENIZATION_TYPE: typings.actionsOnGoogle.actionsOnGoogleStrings.UNSPECIFIED_TOKENIZATION_TYPE = this.cast("UNSPECIFIED_TOKENIZATION_TYPE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

