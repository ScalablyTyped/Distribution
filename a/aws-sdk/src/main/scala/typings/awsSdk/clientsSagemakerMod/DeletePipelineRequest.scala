package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePipelineRequest extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent operation completes no more than one time.
    */
  var ClientRequestToken: IdempotencyToken
  
  /**
    * The name of the pipeline to delete.
    */
  var PipelineName: typings.awsSdk.clientsSagemakerMod.PipelineName
}
object DeletePipelineRequest {
  
  inline def apply(ClientRequestToken: IdempotencyToken, PipelineName: PipelineName): DeletePipelineRequest = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], PipelineName = PipelineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePipelineRequest]
  }
  
  extension [Self <: DeletePipelineRequest](x: Self) {
    
    inline def setClientRequestToken(value: IdempotencyToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setPipelineName(value: PipelineName): Self = StObject.set(x, "PipelineName", value.asInstanceOf[js.Any])
  }
}
