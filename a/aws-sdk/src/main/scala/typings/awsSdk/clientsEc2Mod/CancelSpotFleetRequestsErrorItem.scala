package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelSpotFleetRequestsErrorItem extends StObject {
  
  /**
    * The error.
    */
  var Error: js.UndefOr[CancelSpotFleetRequestsError] = js.undefined
  
  /**
    * The ID of the Spot Fleet request.
    */
  var SpotFleetRequestId: js.UndefOr[String] = js.undefined
}
object CancelSpotFleetRequestsErrorItem {
  
  inline def apply(): CancelSpotFleetRequestsErrorItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelSpotFleetRequestsErrorItem]
  }
  
  extension [Self <: CancelSpotFleetRequestsErrorItem](x: Self) {
    
    inline def setError(value: CancelSpotFleetRequestsError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
    
    inline def setSpotFleetRequestId(value: String): Self = StObject.set(x, "SpotFleetRequestId", value.asInstanceOf[js.Any])
    
    inline def setSpotFleetRequestIdUndefined: Self = StObject.set(x, "SpotFleetRequestId", js.undefined)
  }
}
