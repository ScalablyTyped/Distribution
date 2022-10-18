package typings.awsSdk.clientsStepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateStateMachineInput extends StObject {
  
  /**
    * The Amazon States Language definition of the state machine. See Amazon States Language.
    */
  var definition: js.UndefOr[Definition] = js.undefined
  
  /**
    * The LoggingConfiguration data type is used to set CloudWatch Logs options.
    */
  var loggingConfiguration: js.UndefOr[LoggingConfiguration] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role of the state machine.
    */
  var roleArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the state machine.
    */
  var stateMachineArn: Arn
  
  /**
    * Selects whether AWS X-Ray tracing is enabled.
    */
  var tracingConfiguration: js.UndefOr[TracingConfiguration] = js.undefined
}
object UpdateStateMachineInput {
  
  inline def apply(stateMachineArn: Arn): UpdateStateMachineInput = {
    val __obj = js.Dynamic.literal(stateMachineArn = stateMachineArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStateMachineInput]
  }
  
  extension [Self <: UpdateStateMachineInput](x: Self) {
    
    inline def setDefinition(value: Definition): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setLoggingConfiguration(value: LoggingConfiguration): Self = StObject.set(x, "loggingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLoggingConfigurationUndefined: Self = StObject.set(x, "loggingConfiguration", js.undefined)
    
    inline def setRoleArn(value: Arn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    
    inline def setStateMachineArn(value: Arn): Self = StObject.set(x, "stateMachineArn", value.asInstanceOf[js.Any])
    
    inline def setTracingConfiguration(value: TracingConfiguration): Self = StObject.set(x, "tracingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setTracingConfigurationUndefined: Self = StObject.set(x, "tracingConfiguration", js.undefined)
  }
}
