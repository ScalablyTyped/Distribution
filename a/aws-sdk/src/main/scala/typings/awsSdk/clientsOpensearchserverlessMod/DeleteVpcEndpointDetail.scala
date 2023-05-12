package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVpcEndpointDetail extends StObject {
  
  /**
    * The unique identifier of the endpoint.
    */
  var id: js.UndefOr[VpcEndpointId] = js.undefined
  
  /**
    * The name of the endpoint.
    */
  var name: js.UndefOr[VpcEndpointName] = js.undefined
  
  /**
    * The current status of the endpoint deletion process.
    */
  var status: js.UndefOr[VpcEndpointStatus] = js.undefined
}
object DeleteVpcEndpointDetail {
  
  inline def apply(): DeleteVpcEndpointDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteVpcEndpointDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteVpcEndpointDetail] (val x: Self) extends AnyVal {
    
    inline def setId(value: VpcEndpointId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: VpcEndpointName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatus(value: VpcEndpointStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
