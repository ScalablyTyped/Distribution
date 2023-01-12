package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsOrdersV3VerticalsPurchasePickupInfoCurbsideInfo extends StObject {
  
  /**
    * Partners need additional information to facilitate curbside pickup
    * orders. Depending upon what fulfillment type is chosen, corresponding
    * details would be collected from the user.
    */
  var curbsideFulfillmentType: js.UndefOr[
    GoogleActionsOrdersV3VerticalsPurchasePickupInfoCurbsideInfoCurbsideFulfillmentType
  ] = js.undefined
  
  /**
    * Vehicle details of the user placing the order.
    */
  var userVehicle: js.UndefOr[GoogleActionsOrdersV3VerticalsCommonVehicle] = js.undefined
}
object GoogleActionsOrdersV3VerticalsPurchasePickupInfoCurbsideInfo {
  
  inline def apply(): GoogleActionsOrdersV3VerticalsPurchasePickupInfoCurbsideInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsPurchasePickupInfoCurbsideInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleActionsOrdersV3VerticalsPurchasePickupInfoCurbsideInfo] (val x: Self) extends AnyVal {
    
    inline def setCurbsideFulfillmentType(value: GoogleActionsOrdersV3VerticalsPurchasePickupInfoCurbsideInfoCurbsideFulfillmentType): Self = StObject.set(x, "curbsideFulfillmentType", value.asInstanceOf[js.Any])
    
    inline def setCurbsideFulfillmentTypeUndefined: Self = StObject.set(x, "curbsideFulfillmentType", js.undefined)
    
    inline def setUserVehicle(value: GoogleActionsOrdersV3VerticalsCommonVehicle): Self = StObject.set(x, "userVehicle", value.asInstanceOf[js.Any])
    
    inline def setUserVehicleUndefined: Self = StObject.set(x, "userVehicle", js.undefined)
  }
}
