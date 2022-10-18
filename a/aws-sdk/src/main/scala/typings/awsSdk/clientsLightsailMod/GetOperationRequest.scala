package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOperationRequest extends StObject {
  
  /**
    * A GUID used to identify the operation.
    */
  var operationId: NonEmptyString
}
object GetOperationRequest {
  
  inline def apply(operationId: NonEmptyString): GetOperationRequest = {
    val __obj = js.Dynamic.literal(operationId = operationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOperationRequest]
  }
  
  extension [Self <: GetOperationRequest](x: Self) {
    
    inline def setOperationId(value: NonEmptyString): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
  }
}
