package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVpcEndpointDetail extends StObject {
  
  /**
    * The unique identifier of the endpoint.
    */
  var id: js.UndefOr[VpcEndpointId] = js.undefined
  
  /**
    * The name of the endpoint.
    */
  var name: js.UndefOr[VpcEndpointName] = js.undefined
  
  /**
    * The current status in the endpoint creation process.
    */
  var status: js.UndefOr[VpcEndpointStatus] = js.undefined
}
object CreateVpcEndpointDetail {
  
  inline def apply(): CreateVpcEndpointDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVpcEndpointDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateVpcEndpointDetail] (val x: Self) extends AnyVal {
    
    inline def setId(value: VpcEndpointId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: VpcEndpointName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatus(value: VpcEndpointStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
