package typings.actionsDashOnDashGoogle

import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.actionsDOTintentDOTDELIVERY_ADDRESS
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2DeliveryAddressValue
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2DeliveryAddressValueSpec
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperHelperMod.Helper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/transaction/deliveryaddress", JSImport.Namespace)
@js.native
object distServiceActionssdkConversationHelperTransactionDeliveryaddressMod extends js.Object {
  @js.native
  /**
    * @param options The raw {@link GoogleActionsV2DeliveryAddressValueSpec}
    * @public
    */
  class DeliveryAddress () extends Helper[actionsDOTintentDOTDELIVERY_ADDRESS, GoogleActionsV2DeliveryAddressValueSpec] {
    def this(options: GoogleActionsV2DeliveryAddressValueSpec) = this()
  }
  
  type DeliveryAddressArgument = GoogleActionsV2DeliveryAddressValue
}

