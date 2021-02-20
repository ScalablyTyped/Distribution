package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsOrdersV3VerticalsPurchasePickupInfo extends StObject {
  
  /**
    * Details specific to the curbside information. If pickup_type is not
    * \"CURBSIDE\", this field would be ignored.
    */
  var curbsideInfo: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePickupInfoCurbsideInfo] = js.native
  
  /**
    * Pick up method, such as INSTORE, CURBSIDE etc.
    */
  var pickupType: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePickupInfoPickupType] = js.native
}
object GoogleActionsOrdersV3VerticalsPurchasePickupInfo {
  
  @scala.inline
  def apply(): GoogleActionsOrdersV3VerticalsPurchasePickupInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsPurchasePickupInfo]
  }
  
  @scala.inline
  implicit class GoogleActionsOrdersV3VerticalsPurchasePickupInfoMutableBuilder[Self <: GoogleActionsOrdersV3VerticalsPurchasePickupInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurbsideInfo(value: GoogleActionsOrdersV3VerticalsPurchasePickupInfoCurbsideInfo): Self = StObject.set(x, "curbsideInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurbsideInfoUndefined: Self = StObject.set(x, "curbsideInfo", js.undefined)
    
    @scala.inline
    def setPickupType(value: GoogleActionsOrdersV3VerticalsPurchasePickupInfoPickupType): Self = StObject.set(x, "pickupType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickupTypeUndefined: Self = StObject.set(x, "pickupType", js.undefined)
  }
}
