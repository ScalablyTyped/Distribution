package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallbackStepMetadata extends StObject {
  
  /**
    * The pipeline generated token from the Amazon SQS queue.
    */
  var CallbackToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.CallbackToken] = js.undefined
  
  /**
    * A list of the output parameters of the callback step.
    */
  var OutputParameters: js.UndefOr[OutputParameterList] = js.undefined
  
  /**
    * The URL of the Amazon Simple Queue Service (Amazon SQS) queue used by the callback step.
    */
  var SqsQueueUrl: js.UndefOr[String256] = js.undefined
}
object CallbackStepMetadata {
  
  inline def apply(): CallbackStepMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallbackStepMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CallbackStepMetadata] (val x: Self) extends AnyVal {
    
    inline def setCallbackToken(value: CallbackToken): Self = StObject.set(x, "CallbackToken", value.asInstanceOf[js.Any])
    
    inline def setCallbackTokenUndefined: Self = StObject.set(x, "CallbackToken", js.undefined)
    
    inline def setOutputParameters(value: OutputParameterList): Self = StObject.set(x, "OutputParameters", value.asInstanceOf[js.Any])
    
    inline def setOutputParametersUndefined: Self = StObject.set(x, "OutputParameters", js.undefined)
    
    inline def setOutputParametersVarargs(value: OutputParameter*): Self = StObject.set(x, "OutputParameters", js.Array(value*))
    
    inline def setSqsQueueUrl(value: String256): Self = StObject.set(x, "SqsQueueUrl", value.asInstanceOf[js.Any])
    
    inline def setSqsQueueUrlUndefined: Self = StObject.set(x, "SqsQueueUrl", js.undefined)
  }
}
