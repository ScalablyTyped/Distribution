package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.UNSPECIFIED_TOKENIZATION_TYPE
  - typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.PAYMENT_GATEWAY
  - typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.DIRECT
*/
trait GoogleActionsV2OrdersPaymentMethodTokenizationParametersTokenizationType extends js.Object

object GoogleActionsV2OrdersPaymentMethodTokenizationParametersTokenizationType {
  @scala.inline
  def DIRECT: typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.DIRECT = this.cast("DIRECT")
  @scala.inline
  def PAYMENT_GATEWAY: typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.PAYMENT_GATEWAY = this.cast("PAYMENT_GATEWAY")
  @scala.inline
  def UNSPECIFIED_TOKENIZATION_TYPE: typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.UNSPECIFIED_TOKENIZATION_TYPE = this.cast("UNSPECIFIED_TOKENIZATION_TYPE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

