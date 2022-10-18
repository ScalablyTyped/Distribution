package typings.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOperationDetailRequest extends StObject {
  
  /**
    * The identifier for the operation for which you want to get the status. Route 53 returned the identifier in the response to the original request.
    */
  var OperationId: typings.awsSdk.clientsRoute53domainsMod.OperationId
}
object GetOperationDetailRequest {
  
  inline def apply(OperationId: OperationId): GetOperationDetailRequest = {
    val __obj = js.Dynamic.literal(OperationId = OperationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOperationDetailRequest]
  }
  
  extension [Self <: GetOperationDetailRequest](x: Self) {
    
    inline def setOperationId(value: OperationId): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
  }
}
