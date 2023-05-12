package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVpcEndpointResponse extends StObject {
  
  /**
    * Details about the deleted endpoint.
    */
  var deleteVpcEndpointDetail: js.UndefOr[DeleteVpcEndpointDetail] = js.undefined
}
object DeleteVpcEndpointResponse {
  
  inline def apply(): DeleteVpcEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteVpcEndpointResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteVpcEndpointResponse] (val x: Self) extends AnyVal {
    
    inline def setDeleteVpcEndpointDetail(value: DeleteVpcEndpointDetail): Self = StObject.set(x, "deleteVpcEndpointDetail", value.asInstanceOf[js.Any])
    
    inline def setDeleteVpcEndpointDetailUndefined: Self = StObject.set(x, "deleteVpcEndpointDetail", js.undefined)
  }
}
