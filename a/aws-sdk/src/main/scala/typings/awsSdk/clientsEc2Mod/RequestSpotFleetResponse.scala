package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestSpotFleetResponse extends StObject {
  
  /**
    * The ID of the Spot Fleet request.
    */
  var SpotFleetRequestId: js.UndefOr[String] = js.undefined
}
object RequestSpotFleetResponse {
  
  inline def apply(): RequestSpotFleetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestSpotFleetResponse]
  }
  
  extension [Self <: RequestSpotFleetResponse](x: Self) {
    
    inline def setSpotFleetRequestId(value: String): Self = StObject.set(x, "SpotFleetRequestId", value.asInstanceOf[js.Any])
    
    inline def setSpotFleetRequestIdUndefined: Self = StObject.set(x, "SpotFleetRequestId", js.undefined)
  }
}
