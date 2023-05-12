package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetVpcEndpointResponse extends StObject {
  
  /**
    * Details about the specified VPC endpoint.
    */
  var vpcEndpointDetails: js.UndefOr[VpcEndpointDetails] = js.undefined
  
  /**
    * Error information for a failed request.
    */
  var vpcEndpointErrorDetails: js.UndefOr[VpcEndpointErrorDetails] = js.undefined
}
object BatchGetVpcEndpointResponse {
  
  inline def apply(): BatchGetVpcEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetVpcEndpointResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetVpcEndpointResponse] (val x: Self) extends AnyVal {
    
    inline def setVpcEndpointDetails(value: VpcEndpointDetails): Self = StObject.set(x, "vpcEndpointDetails", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointDetailsUndefined: Self = StObject.set(x, "vpcEndpointDetails", js.undefined)
    
    inline def setVpcEndpointDetailsVarargs(value: VpcEndpointDetail*): Self = StObject.set(x, "vpcEndpointDetails", js.Array(value*))
    
    inline def setVpcEndpointErrorDetails(value: VpcEndpointErrorDetails): Self = StObject.set(x, "vpcEndpointErrorDetails", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointErrorDetailsUndefined: Self = StObject.set(x, "vpcEndpointErrorDetails", js.undefined)
    
    inline def setVpcEndpointErrorDetailsVarargs(value: VpcEndpointErrorDetail*): Self = StObject.set(x, "vpcEndpointErrorDetails", js.Array(value*))
  }
}
