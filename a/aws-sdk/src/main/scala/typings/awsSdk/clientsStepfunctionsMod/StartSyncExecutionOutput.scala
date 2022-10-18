package typings.awsSdk.clientsStepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartSyncExecutionOutput extends StObject {
  
  /**
    * An object that describes workflow billing details, including billed duration and memory use.
    */
  var billingDetails: js.UndefOr[BillingDetails] = js.undefined
  
  /**
    * A more detailed explanation of the cause of the failure.
    */
  var cause: js.UndefOr[SensitiveCause] = js.undefined
  
  /**
    * The error code of the failure.
    */
  var error: js.UndefOr[SensitiveError] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) that identifies the execution.
    */
  var executionArn: Arn
  
  /**
    * The string that contains the JSON input data of the execution. Length constraints apply to the payload size, and are expressed as bytes in UTF-8 encoding.
    */
  var input: js.UndefOr[SensitiveData] = js.undefined
  
  var inputDetails: js.UndefOr[CloudWatchEventsExecutionDataDetails] = js.undefined
  
  /**
    * The name of the execution.
    */
  var name: js.UndefOr[Name] = js.undefined
  
  /**
    * The JSON output data of the execution. Length constraints apply to the payload size, and are expressed as bytes in UTF-8 encoding.  This field is set only if the execution succeeds. If the execution fails, this field is null. 
    */
  var output: js.UndefOr[SensitiveData] = js.undefined
  
  var outputDetails: js.UndefOr[CloudWatchEventsExecutionDataDetails] = js.undefined
  
  /**
    * The date the execution is started.
    */
  var startDate: js.Date
  
  /**
    * The Amazon Resource Name (ARN) that identifies the state machine.
    */
  var stateMachineArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The current status of the execution.
    */
  var status: SyncExecutionStatus
  
  /**
    * If the execution has already ended, the date the execution stopped.
    */
  var stopDate: js.Date
  
  /**
    * The AWS X-Ray trace header that was passed to the execution.
    */
  var traceHeader: js.UndefOr[TraceHeader] = js.undefined
}
object StartSyncExecutionOutput {
  
  inline def apply(executionArn: Arn, startDate: js.Date, status: SyncExecutionStatus, stopDate: js.Date): StartSyncExecutionOutput = {
    val __obj = js.Dynamic.literal(executionArn = executionArn.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], stopDate = stopDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSyncExecutionOutput]
  }
  
  extension [Self <: StartSyncExecutionOutput](x: Self) {
    
    inline def setBillingDetails(value: BillingDetails): Self = StObject.set(x, "billingDetails", value.asInstanceOf[js.Any])
    
    inline def setBillingDetailsUndefined: Self = StObject.set(x, "billingDetails", js.undefined)
    
    inline def setCause(value: SensitiveCause): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    inline def setError(value: SensitiveError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setExecutionArn(value: Arn): Self = StObject.set(x, "executionArn", value.asInstanceOf[js.Any])
    
    inline def setInput(value: SensitiveData): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputDetails(value: CloudWatchEventsExecutionDataDetails): Self = StObject.set(x, "inputDetails", value.asInstanceOf[js.Any])
    
    inline def setInputDetailsUndefined: Self = StObject.set(x, "inputDetails", js.undefined)
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOutput(value: SensitiveData): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputDetails(value: CloudWatchEventsExecutionDataDetails): Self = StObject.set(x, "outputDetails", value.asInstanceOf[js.Any])
    
    inline def setOutputDetailsUndefined: Self = StObject.set(x, "outputDetails", js.undefined)
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStateMachineArn(value: Arn): Self = StObject.set(x, "stateMachineArn", value.asInstanceOf[js.Any])
    
    inline def setStateMachineArnUndefined: Self = StObject.set(x, "stateMachineArn", js.undefined)
    
    inline def setStatus(value: SyncExecutionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStopDate(value: js.Date): Self = StObject.set(x, "stopDate", value.asInstanceOf[js.Any])
    
    inline def setTraceHeader(value: TraceHeader): Self = StObject.set(x, "traceHeader", value.asInstanceOf[js.Any])
    
    inline def setTraceHeaderUndefined: Self = StObject.set(x, "traceHeader", js.undefined)
  }
}
