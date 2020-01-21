package typings.actionsOnGoogle

import typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotDELIVERY_ADDRESS
import typings.actionsOnGoogle.helperHelperMod.Helper
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2DeliveryAddressValue
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2DeliveryAddressValueSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/transaction/deliveryaddress", JSImport.Namespace)
@js.native
object deliveryaddressMod extends js.Object {
  @js.native
  /**
    * @param options The raw {@link GoogleActionsV2DeliveryAddressValueSpec}
    * @public
    */
  class DeliveryAddress () extends Helper[actionsDotintentDotDELIVERY_ADDRESS, GoogleActionsV2DeliveryAddressValueSpec] {
    def this(options: GoogleActionsV2DeliveryAddressValueSpec) = this()
  }
  
  type DeliveryAddressArgument = GoogleActionsV2DeliveryAddressValue
}

