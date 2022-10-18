package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestResult extends StObject {
  
  /**
    * The amount of time that the function took to run as a percentage of the maximum allowed time. For example, a compute utilization of 35 means that the function completed in 35% of the maximum allowed time.
    */
  var ComputeUtilization: js.UndefOr[String] = js.undefined
  
  /**
    * If the result of testing the function was an error, this field contains the error message.
    */
  var FunctionErrorMessage: js.UndefOr[sensitiveStringType] = js.undefined
  
  /**
    * Contains the log lines that the function wrote (if any) when running the test.
    */
  var FunctionExecutionLogs: js.UndefOr[FunctionExecutionLogList] = js.undefined
  
  /**
    * The event object returned by the function. For more information about the structure of the event object, see Event object structure in the Amazon CloudFront Developer Guide.
    */
  var FunctionOutput: js.UndefOr[sensitiveStringType] = js.undefined
  
  /**
    * Contains configuration information and metadata about the CloudFront function that was tested.
    */
  var FunctionSummary: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.FunctionSummary] = js.undefined
}
object TestResult {
  
  inline def apply(): TestResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestResult]
  }
  
  extension [Self <: TestResult](x: Self) {
    
    inline def setComputeUtilization(value: String): Self = StObject.set(x, "ComputeUtilization", value.asInstanceOf[js.Any])
    
    inline def setComputeUtilizationUndefined: Self = StObject.set(x, "ComputeUtilization", js.undefined)
    
    inline def setFunctionErrorMessage(value: sensitiveStringType): Self = StObject.set(x, "FunctionErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setFunctionErrorMessageUndefined: Self = StObject.set(x, "FunctionErrorMessage", js.undefined)
    
    inline def setFunctionExecutionLogs(value: FunctionExecutionLogList): Self = StObject.set(x, "FunctionExecutionLogs", value.asInstanceOf[js.Any])
    
    inline def setFunctionExecutionLogsUndefined: Self = StObject.set(x, "FunctionExecutionLogs", js.undefined)
    
    inline def setFunctionExecutionLogsVarargs(value: String*): Self = StObject.set(x, "FunctionExecutionLogs", js.Array(value*))
    
    inline def setFunctionOutput(value: sensitiveStringType): Self = StObject.set(x, "FunctionOutput", value.asInstanceOf[js.Any])
    
    inline def setFunctionOutputUndefined: Self = StObject.set(x, "FunctionOutput", js.undefined)
    
    inline def setFunctionSummary(value: FunctionSummary): Self = StObject.set(x, "FunctionSummary", value.asInstanceOf[js.Any])
    
    inline def setFunctionSummaryUndefined: Self = StObject.set(x, "FunctionSummary", js.undefined)
  }
}
