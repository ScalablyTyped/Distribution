package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartDeploymentResponse extends StObject {
  
  /**
    * The unique ID of the asynchronous operation that this request started. You can use it combined with the ListOperations call to track the operation's progress.
    */
  var OperationId: UUID
}
object StartDeploymentResponse {
  
  inline def apply(OperationId: UUID): StartDeploymentResponse = {
    val __obj = js.Dynamic.literal(OperationId = OperationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDeploymentResponse]
  }
  
  extension [Self <: StartDeploymentResponse](x: Self) {
    
    inline def setOperationId(value: UUID): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
  }
}
