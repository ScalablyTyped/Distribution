package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetVpcEndpointRequest extends StObject {
  
  /**
    * A list of VPC endpoint identifiers.
    */
  var ids: VpcEndpointIds
}
object BatchGetVpcEndpointRequest {
  
  inline def apply(ids: VpcEndpointIds): BatchGetVpcEndpointRequest = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetVpcEndpointRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetVpcEndpointRequest] (val x: Self) extends AnyVal {
    
    inline def setIds(value: VpcEndpointIds): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsVarargs(value: VpcEndpointId*): Self = StObject.set(x, "ids", js.Array(value*))
  }
}
