package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateNetworkTopologyResult extends StObject {
  
  /**
  		 * Specifies the count of DirtyAreas Validated.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html#ValidateNetworkTopologyResult)
  		 */
  var dirtyAreaCount: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Specifies whether TransferLimit was exceeded.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html#ValidateNetworkTopologyResult)
  		 */
  var exceededTransferLimit: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Specifies whether a full update occured.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html#ValidateNetworkTopologyResult)
  		 */
  var fullUpdate: Boolean
  
  /**
  		 * Returns the moment of the validation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html#ValidateNetworkTopologyResult)
  		 */
  var moment: js.UndefOr[js.Date] = js.undefined
  
  /**
  		 * Returns serviceEdits from validation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html#ValidateNetworkTopologyResult)
  		 */
  var serviceEdits: js.UndefOr[EditedFeatureResult] = js.undefined
  
  /**
  		 * Specifies whether a validateError was created.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html#ValidateNetworkTopologyResult)
  		 */
  var validateErrorsCreated: js.UndefOr[Boolean] = js.undefined
}
object ValidateNetworkTopologyResult {
  
  inline def apply(fullUpdate: Boolean): ValidateNetworkTopologyResult = {
    val __obj = js.Dynamic.literal(fullUpdate = fullUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateNetworkTopologyResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidateNetworkTopologyResult] (val x: Self) extends AnyVal {
    
    inline def setDirtyAreaCount(value: Double): Self = StObject.set(x, "dirtyAreaCount", value.asInstanceOf[js.Any])
    
    inline def setDirtyAreaCountUndefined: Self = StObject.set(x, "dirtyAreaCount", js.undefined)
    
    inline def setExceededTransferLimit(value: Boolean): Self = StObject.set(x, "exceededTransferLimit", value.asInstanceOf[js.Any])
    
    inline def setExceededTransferLimitUndefined: Self = StObject.set(x, "exceededTransferLimit", js.undefined)
    
    inline def setFullUpdate(value: Boolean): Self = StObject.set(x, "fullUpdate", value.asInstanceOf[js.Any])
    
    inline def setMoment(value: js.Date): Self = StObject.set(x, "moment", value.asInstanceOf[js.Any])
    
    inline def setMomentUndefined: Self = StObject.set(x, "moment", js.undefined)
    
    inline def setServiceEdits(value: EditedFeatureResult): Self = StObject.set(x, "serviceEdits", value.asInstanceOf[js.Any])
    
    inline def setServiceEditsUndefined: Self = StObject.set(x, "serviceEdits", js.undefined)
    
    inline def setValidateErrorsCreated(value: Boolean): Self = StObject.set(x, "validateErrorsCreated", value.asInstanceOf[js.Any])
    
    inline def setValidateErrorsCreatedUndefined: Self = StObject.set(x, "validateErrorsCreated", js.undefined)
  }
}
