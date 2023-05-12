package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVpcEndpointResponse extends StObject {
  
  /**
    * Details about the created interface VPC endpoint.
    */
  var createVpcEndpointDetail: js.UndefOr[CreateVpcEndpointDetail] = js.undefined
}
object CreateVpcEndpointResponse {
  
  inline def apply(): CreateVpcEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVpcEndpointResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateVpcEndpointResponse] (val x: Self) extends AnyVal {
    
    inline def setCreateVpcEndpointDetail(value: CreateVpcEndpointDetail): Self = StObject.set(x, "createVpcEndpointDetail", value.asInstanceOf[js.Any])
    
    inline def setCreateVpcEndpointDetailUndefined: Self = StObject.set(x, "createVpcEndpointDetail", js.undefined)
  }
}
