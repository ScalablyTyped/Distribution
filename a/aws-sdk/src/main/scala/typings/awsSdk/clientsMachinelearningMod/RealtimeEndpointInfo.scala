package typings.awsSdk.clientsMachinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RealtimeEndpointInfo extends StObject {
  
  /**
    * The time that the request to create the real-time endpoint for the MLModel was received. The time is expressed in epoch time.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The current status of the real-time endpoint for the MLModel. This element can have one of the following values:     NONE - Endpoint does not exist or was previously deleted.    READY - Endpoint is ready to be used for real-time predictions.    UPDATING - Updating/creating the endpoint.   
    */
  var EndpointStatus: js.UndefOr[RealtimeEndpointStatus] = js.undefined
  
  /**
    * The URI that specifies where to send real-time prediction requests for the MLModel.  Note: The application must wait until the real-time endpoint is ready before using this URI.
    */
  var EndpointUrl: js.UndefOr[VipURL] = js.undefined
  
  /**
    *  The maximum processing rate for the real-time endpoint for MLModel, measured in incoming requests per second.
    */
  var PeakRequestsPerSecond: js.UndefOr[IntegerType] = js.undefined
}
object RealtimeEndpointInfo {
  
  inline def apply(): RealtimeEndpointInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RealtimeEndpointInfo]
  }
  
  extension [Self <: RealtimeEndpointInfo](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setEndpointStatus(value: RealtimeEndpointStatus): Self = StObject.set(x, "EndpointStatus", value.asInstanceOf[js.Any])
    
    inline def setEndpointStatusUndefined: Self = StObject.set(x, "EndpointStatus", js.undefined)
    
    inline def setEndpointUrl(value: VipURL): Self = StObject.set(x, "EndpointUrl", value.asInstanceOf[js.Any])
    
    inline def setEndpointUrlUndefined: Self = StObject.set(x, "EndpointUrl", js.undefined)
    
    inline def setPeakRequestsPerSecond(value: IntegerType): Self = StObject.set(x, "PeakRequestsPerSecond", value.asInstanceOf[js.Any])
    
    inline def setPeakRequestsPerSecondUndefined: Self = StObject.set(x, "PeakRequestsPerSecond", js.undefined)
  }
}
