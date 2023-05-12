package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointMetadata extends StObject {
  
  /**
    * The name of the endpoint configuration.
    */
  var EndpointConfigName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.EndpointConfigName] = js.undefined
  
  /**
    * The name of the endpoint.
    */
  var EndpointName: typings.awsSdk.clientsSagemakerMod.EndpointName
  
  /**
    *  The status of the endpoint. For possible values of the status of an endpoint, see EndpointSummary. 
    */
  var EndpointStatus: js.UndefOr[typings.awsSdk.clientsSagemakerMod.EndpointStatus] = js.undefined
  
  /**
    *  If the status of the endpoint is Failed, or the status is InService but update operation fails, this provides the reason why it failed. 
    */
  var FailureReason: js.UndefOr[typings.awsSdk.clientsSagemakerMod.FailureReason] = js.undefined
}
object EndpointMetadata {
  
  inline def apply(EndpointName: EndpointName): EndpointMetadata = {
    val __obj = js.Dynamic.literal(EndpointName = EndpointName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndpointMetadata] (val x: Self) extends AnyVal {
    
    inline def setEndpointConfigName(value: EndpointConfigName): Self = StObject.set(x, "EndpointConfigName", value.asInstanceOf[js.Any])
    
    inline def setEndpointConfigNameUndefined: Self = StObject.set(x, "EndpointConfigName", js.undefined)
    
    inline def setEndpointName(value: EndpointName): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
    
    inline def setEndpointStatus(value: EndpointStatus): Self = StObject.set(x, "EndpointStatus", value.asInstanceOf[js.Any])
    
    inline def setEndpointStatusUndefined: Self = StObject.set(x, "EndpointStatus", js.undefined)
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
  }
}
