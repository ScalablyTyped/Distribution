package typings.awsSdk.clientsStepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStateMachineOutput extends StObject {
  
  /**
    * The date the state machine is created.
    */
  var creationDate: js.Date
  
  /**
    * The Amazon States Language definition of the state machine. See Amazon States Language.
    */
  var definition: Definition
  
  var loggingConfiguration: js.UndefOr[LoggingConfiguration] = js.undefined
  
  /**
    * The name of the state machine. A name must not contain:   white space   brackets &lt; &gt; { } [ ]    wildcard characters ? *    special characters " # % \ ^ | ~ ` $ &amp; , ; : /    control characters (U+0000-001F, U+007F-009F)   To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
    */
  var name: Name
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role used when creating this state machine. (The IAM role maintains security by granting Step Functions access to AWS resources.)
    */
  var roleArn: Arn
  
  /**
    * The Amazon Resource Name (ARN) that identifies the state machine.
    */
  var stateMachineArn: Arn
  
  /**
    * The current status of the state machine.
    */
  var status: js.UndefOr[StateMachineStatus] = js.undefined
  
  /**
    * Selects whether AWS X-Ray tracing is enabled.
    */
  var tracingConfiguration: js.UndefOr[TracingConfiguration] = js.undefined
  
  /**
    * The type of the state machine (STANDARD or EXPRESS).
    */
  var `type`: StateMachineType
}
object DescribeStateMachineOutput {
  
  inline def apply(
    creationDate: js.Date,
    definition: Definition,
    name: Name,
    roleArn: Arn,
    stateMachineArn: Arn,
    `type`: StateMachineType
  ): DescribeStateMachineOutput = {
    val __obj = js.Dynamic.literal(creationDate = creationDate.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], stateMachineArn = stateMachineArn.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStateMachineOutput]
  }
  
  extension [Self <: DescribeStateMachineOutput](x: Self) {
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setDefinition(value: Definition): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setLoggingConfiguration(value: LoggingConfiguration): Self = StObject.set(x, "loggingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLoggingConfigurationUndefined: Self = StObject.set(x, "loggingConfiguration", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: Arn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setStateMachineArn(value: Arn): Self = StObject.set(x, "stateMachineArn", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: StateMachineStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTracingConfiguration(value: TracingConfiguration): Self = StObject.set(x, "tracingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setTracingConfigurationUndefined: Self = StObject.set(x, "tracingConfiguration", js.undefined)
    
    inline def setType(value: StateMachineType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
