package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsOrdersV3VerticalsPurchasePickupInfoCurbsideInfo extends js.Object {
  
  /**
    * Partners need additional information to facilitate curbside pickup
    * orders. Depending upon what fulfillment type is chosen, corresponding
    * details would be collected from the user.
    */
  var curbsideFulfillmentType: js.UndefOr[
    GoogleActionsOrdersV3VerticalsPurchasePickupInfoCurbsideInfoCurbsideFulfillmentType
  ] = js.native
  
  /**
    * Vehicle details of the user placing the order.
    */
  var userVehicle: js.UndefOr[GoogleActionsOrdersV3VerticalsCommonVehicle] = js.native
}
object GoogleActionsOrdersV3VerticalsPurchasePickupInfoCurbsideInfo {
  
  @scala.inline
  def apply(): GoogleActionsOrdersV3VerticalsPurchasePickupInfoCurbsideInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsPurchasePickupInfoCurbsideInfo]
  }
  
  @scala.inline
  implicit class GoogleActionsOrdersV3VerticalsPurchasePickupInfoCurbsideInfoOps[Self <: GoogleActionsOrdersV3VerticalsPurchasePickupInfoCurbsideInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCurbsideFulfillmentType(value: GoogleActionsOrdersV3VerticalsPurchasePickupInfoCurbsideInfoCurbsideFulfillmentType): Self = this.set("curbsideFulfillmentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurbsideFulfillmentType: Self = this.set("curbsideFulfillmentType", js.undefined)
    
    @scala.inline
    def setUserVehicle(value: GoogleActionsOrdersV3VerticalsCommonVehicle): Self = this.set("userVehicle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserVehicle: Self = this.set("userVehicle", js.undefined)
  }
}
