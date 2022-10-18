package typings.awsSdk.clientsStepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartExecutionInput extends StObject {
  
  /**
    * The string that contains the JSON input data for the execution, for example:  "input": "{\"first_name\" : \"test\"}"   If you don't include any JSON input data, you still must include the two braces, for example: "input": "{}"   Length constraints apply to the payload size, and are expressed as bytes in UTF-8 encoding.
    */
  var input: js.UndefOr[SensitiveData] = js.undefined
  
  /**
    * The name of the execution. This name must be unique for your AWS account, region, and state machine for 90 days. For more information, see  Limits Related to State Machine Executions in the AWS Step Functions Developer Guide. A name must not contain:   white space   brackets &lt; &gt; { } [ ]    wildcard characters ? *    special characters " # % \ ^ | ~ ` $ &amp; , ; : /    control characters (U+0000-001F, U+007F-009F)   To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
    */
  var name: js.UndefOr[Name] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the state machine to execute.
    */
  var stateMachineArn: Arn
  
  /**
    * Passes the AWS X-Ray trace header. The trace header can also be passed in the request payload.
    */
  var traceHeader: js.UndefOr[TraceHeader] = js.undefined
}
object StartExecutionInput {
  
  inline def apply(stateMachineArn: Arn): StartExecutionInput = {
    val __obj = js.Dynamic.literal(stateMachineArn = stateMachineArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartExecutionInput]
  }
  
  extension [Self <: StartExecutionInput](x: Self) {
    
    inline def setInput(value: SensitiveData): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStateMachineArn(value: Arn): Self = StObject.set(x, "stateMachineArn", value.asInstanceOf[js.Any])
    
    inline def setTraceHeader(value: TraceHeader): Self = StObject.set(x, "traceHeader", value.asInstanceOf[js.Any])
    
    inline def setTraceHeaderUndefined: Self = StObject.set(x, "traceHeader", js.undefined)
  }
}
