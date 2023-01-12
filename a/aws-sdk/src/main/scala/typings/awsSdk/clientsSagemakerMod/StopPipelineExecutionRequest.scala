package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopPipelineExecutionRequest extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent operation completes no more than once.
    */
  var ClientRequestToken: IdempotencyToken
  
  /**
    * The Amazon Resource Name (ARN) of the pipeline execution.
    */
  var PipelineExecutionArn: typings.awsSdk.clientsSagemakerMod.PipelineExecutionArn
}
object StopPipelineExecutionRequest {
  
  inline def apply(ClientRequestToken: IdempotencyToken, PipelineExecutionArn: PipelineExecutionArn): StopPipelineExecutionRequest = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], PipelineExecutionArn = PipelineExecutionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopPipelineExecutionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopPipelineExecutionRequest] (val x: Self) extends AnyVal {
    
    inline def setClientRequestToken(value: IdempotencyToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setPipelineExecutionArn(value: PipelineExecutionArn): Self = StObject.set(x, "PipelineExecutionArn", value.asInstanceOf[js.Any])
  }
}
