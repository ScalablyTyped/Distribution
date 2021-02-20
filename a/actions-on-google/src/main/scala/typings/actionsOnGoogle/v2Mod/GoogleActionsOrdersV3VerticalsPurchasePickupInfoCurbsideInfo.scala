package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsOrdersV3VerticalsPurchasePickupInfoCurbsideInfo extends StObject {
  
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
  implicit class GoogleActionsOrdersV3VerticalsPurchasePickupInfoCurbsideInfoMutableBuilder[Self <: GoogleActionsOrdersV3VerticalsPurchasePickupInfoCurbsideInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurbsideFulfillmentType(value: GoogleActionsOrdersV3VerticalsPurchasePickupInfoCurbsideInfoCurbsideFulfillmentType): Self = StObject.set(x, "curbsideFulfillmentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurbsideFulfillmentTypeUndefined: Self = StObject.set(x, "curbsideFulfillmentType", js.undefined)
    
    @scala.inline
    def setUserVehicle(value: GoogleActionsOrdersV3VerticalsCommonVehicle): Self = StObject.set(x, "userVehicle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserVehicleUndefined: Self = StObject.set(x, "userVehicle", js.undefined)
  }
}
