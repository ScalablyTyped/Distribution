package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVpcEndpointResponse extends StObject {
  
  /**
    * Details about the updated VPC endpoint.
    */
  var UpdateVpcEndpointDetail: js.UndefOr[typings.awsSdk.clientsOpensearchserverlessMod.UpdateVpcEndpointDetail] = js.undefined
}
object UpdateVpcEndpointResponse {
  
  inline def apply(): UpdateVpcEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateVpcEndpointResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateVpcEndpointResponse] (val x: Self) extends AnyVal {
    
    inline def setUpdateVpcEndpointDetail(value: UpdateVpcEndpointDetail): Self = StObject.set(x, "UpdateVpcEndpointDetail", value.asInstanceOf[js.Any])
    
    inline def setUpdateVpcEndpointDetailUndefined: Self = StObject.set(x, "UpdateVpcEndpointDetail", js.undefined)
  }
}
