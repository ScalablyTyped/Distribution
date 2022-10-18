package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFlowDefinitionResponse extends StObject {
  
  /**
    * The timestamp when the flow definition was created.
    */
  var CreationTime: js.Date
  
  /**
    * The reason your flow definition failed.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.clientsSagemakerMod.FailureReason] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the flow defintion.
    */
  var FlowDefinitionArn: typings.awsSdk.clientsSagemakerMod.FlowDefinitionArn
  
  /**
    * The Amazon Resource Name (ARN) of the flow definition.
    */
  var FlowDefinitionName: typings.awsSdk.clientsSagemakerMod.FlowDefinitionName
  
  /**
    * The status of the flow definition. Valid values are listed below.
    */
  var FlowDefinitionStatus: typings.awsSdk.clientsSagemakerMod.FlowDefinitionStatus
  
  /**
    * An object containing information about what triggers a human review workflow.
    */
  var HumanLoopActivationConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.HumanLoopActivationConfig] = js.undefined
  
  /**
    * An object containing information about who works on the task, the workforce task price, and other task details.
    */
  var HumanLoopConfig: typings.awsSdk.clientsSagemakerMod.HumanLoopConfig
  
  /**
    * Container for configuring the source of human task requests. Used to specify if Amazon Rekognition or Amazon Textract is used as an integration source.
    */
  var HumanLoopRequestSource: js.UndefOr[typings.awsSdk.clientsSagemakerMod.HumanLoopRequestSource] = js.undefined
  
  /**
    * An object containing information about the output file.
    */
  var OutputConfig: FlowDefinitionOutputConfig
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon Web Services Identity and Access Management (IAM) execution role for the flow definition.
    */
  var RoleArn: typings.awsSdk.clientsSagemakerMod.RoleArn
}
object DescribeFlowDefinitionResponse {
  
  inline def apply(
    CreationTime: js.Date,
    FlowDefinitionArn: FlowDefinitionArn,
    FlowDefinitionName: FlowDefinitionName,
    FlowDefinitionStatus: FlowDefinitionStatus,
    HumanLoopConfig: HumanLoopConfig,
    OutputConfig: FlowDefinitionOutputConfig,
    RoleArn: RoleArn
  ): DescribeFlowDefinitionResponse = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], FlowDefinitionArn = FlowDefinitionArn.asInstanceOf[js.Any], FlowDefinitionName = FlowDefinitionName.asInstanceOf[js.Any], FlowDefinitionStatus = FlowDefinitionStatus.asInstanceOf[js.Any], HumanLoopConfig = HumanLoopConfig.asInstanceOf[js.Any], OutputConfig = OutputConfig.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFlowDefinitionResponse]
  }
  
  extension [Self <: DescribeFlowDefinitionResponse](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setFlowDefinitionArn(value: FlowDefinitionArn): Self = StObject.set(x, "FlowDefinitionArn", value.asInstanceOf[js.Any])
    
    inline def setFlowDefinitionName(value: FlowDefinitionName): Self = StObject.set(x, "FlowDefinitionName", value.asInstanceOf[js.Any])
    
    inline def setFlowDefinitionStatus(value: FlowDefinitionStatus): Self = StObject.set(x, "FlowDefinitionStatus", value.asInstanceOf[js.Any])
    
    inline def setHumanLoopActivationConfig(value: HumanLoopActivationConfig): Self = StObject.set(x, "HumanLoopActivationConfig", value.asInstanceOf[js.Any])
    
    inline def setHumanLoopActivationConfigUndefined: Self = StObject.set(x, "HumanLoopActivationConfig", js.undefined)
    
    inline def setHumanLoopConfig(value: HumanLoopConfig): Self = StObject.set(x, "HumanLoopConfig", value.asInstanceOf[js.Any])
    
    inline def setHumanLoopRequestSource(value: HumanLoopRequestSource): Self = StObject.set(x, "HumanLoopRequestSource", value.asInstanceOf[js.Any])
    
    inline def setHumanLoopRequestSourceUndefined: Self = StObject.set(x, "HumanLoopRequestSource", js.undefined)
    
    inline def setOutputConfig(value: FlowDefinitionOutputConfig): Self = StObject.set(x, "OutputConfig", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
  }
}
