package typings.awsSdk.clientsServicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOperationRequest extends StObject {
  
  /**
    * The ID of the operation that you want to get more information about.
    */
  var OperationId: ResourceId
}
object GetOperationRequest {
  
  inline def apply(OperationId: ResourceId): GetOperationRequest = {
    val __obj = js.Dynamic.literal(OperationId = OperationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOperationRequest]
  }
  
  extension [Self <: GetOperationRequest](x: Self) {
    
    inline def setOperationId(value: ResourceId): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
  }
}
