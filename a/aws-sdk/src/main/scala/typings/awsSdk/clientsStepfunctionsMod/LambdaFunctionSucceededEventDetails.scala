package typings.awsSdk.clientsStepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaFunctionSucceededEventDetails extends StObject {
  
  /**
    * The JSON data output by the lambda function. Length constraints apply to the payload size, and are expressed as bytes in UTF-8 encoding.
    */
  var output: js.UndefOr[SensitiveData] = js.undefined
  
  /**
    * Contains details about the output of an execution history event.
    */
  var outputDetails: js.UndefOr[HistoryEventExecutionDataDetails] = js.undefined
}
object LambdaFunctionSucceededEventDetails {
  
  inline def apply(): LambdaFunctionSucceededEventDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LambdaFunctionSucceededEventDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LambdaFunctionSucceededEventDetails] (val x: Self) extends AnyVal {
    
    inline def setOutput(value: SensitiveData): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputDetails(value: HistoryEventExecutionDataDetails): Self = StObject.set(x, "outputDetails", value.asInstanceOf[js.Any])
    
    inline def setOutputDetailsUndefined: Self = StObject.set(x, "outputDetails", js.undefined)
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
  }
}
