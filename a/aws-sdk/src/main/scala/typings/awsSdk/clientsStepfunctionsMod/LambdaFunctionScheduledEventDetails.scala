package typings.awsSdk.clientsStepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaFunctionScheduledEventDetails extends StObject {
  
  /**
    * The JSON data input to the lambda function. Length constraints apply to the payload size, and are expressed as bytes in UTF-8 encoding.
    */
  var input: js.UndefOr[SensitiveData] = js.undefined
  
  /**
    * Contains details about input for an execution history event.
    */
  var inputDetails: js.UndefOr[HistoryEventExecutionDataDetails] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the scheduled lambda function.
    */
  var resource: Arn
  
  /**
    * The maximum allowed duration of the lambda function.
    */
  var timeoutInSeconds: js.UndefOr[TimeoutInSeconds] = js.undefined
}
object LambdaFunctionScheduledEventDetails {
  
  inline def apply(resource: Arn): LambdaFunctionScheduledEventDetails = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaFunctionScheduledEventDetails]
  }
  
  extension [Self <: LambdaFunctionScheduledEventDetails](x: Self) {
    
    inline def setInput(value: SensitiveData): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputDetails(value: HistoryEventExecutionDataDetails): Self = StObject.set(x, "inputDetails", value.asInstanceOf[js.Any])
    
    inline def setInputDetailsUndefined: Self = StObject.set(x, "inputDetails", js.undefined)
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setResource(value: Arn): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setTimeoutInSeconds(value: TimeoutInSeconds): Self = StObject.set(x, "timeoutInSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeoutInSecondsUndefined: Self = StObject.set(x, "timeoutInSeconds", js.undefined)
  }
}
