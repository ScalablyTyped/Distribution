package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFlowDefinitionRequest extends StObject {
  
  /**
    * The name of your flow definition.
    */
  var FlowDefinitionName: typings.awsSdk.clientsSagemakerMod.FlowDefinitionName
  
  /**
    * An object containing information about the events that trigger a human workflow.
    */
  var HumanLoopActivationConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.HumanLoopActivationConfig] = js.undefined
  
  /**
    * An object containing information about the tasks the human reviewers will perform.
    */
  var HumanLoopConfig: typings.awsSdk.clientsSagemakerMod.HumanLoopConfig
  
  /**
    * Container for configuring the source of human task requests. Use to specify if Amazon Rekognition or Amazon Textract is used as an integration source.
    */
  var HumanLoopRequestSource: js.UndefOr[typings.awsSdk.clientsSagemakerMod.HumanLoopRequestSource] = js.undefined
  
  /**
    * An object containing information about where the human review results will be uploaded.
    */
  var OutputConfig: FlowDefinitionOutputConfig
  
  /**
    * The Amazon Resource Name (ARN) of the role needed to call other services on your behalf. For example, arn:aws:iam::1234567890:role/service-role/AmazonSageMaker-ExecutionRole-20180111T151298.
    */
  var RoleArn: typings.awsSdk.clientsSagemakerMod.RoleArn
  
  /**
    * An array of key-value pairs that contain metadata to help you categorize and organize a flow definition. Each tag consists of a key and a value, both of which you define.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateFlowDefinitionRequest {
  
  inline def apply(
    FlowDefinitionName: FlowDefinitionName,
    HumanLoopConfig: HumanLoopConfig,
    OutputConfig: FlowDefinitionOutputConfig,
    RoleArn: RoleArn
  ): CreateFlowDefinitionRequest = {
    val __obj = js.Dynamic.literal(FlowDefinitionName = FlowDefinitionName.asInstanceOf[js.Any], HumanLoopConfig = HumanLoopConfig.asInstanceOf[js.Any], OutputConfig = OutputConfig.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFlowDefinitionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateFlowDefinitionRequest] (val x: Self) extends AnyVal {
    
    inline def setFlowDefinitionName(value: FlowDefinitionName): Self = StObject.set(x, "FlowDefinitionName", value.asInstanceOf[js.Any])
    
    inline def setHumanLoopActivationConfig(value: HumanLoopActivationConfig): Self = StObject.set(x, "HumanLoopActivationConfig", value.asInstanceOf[js.Any])
    
    inline def setHumanLoopActivationConfigUndefined: Self = StObject.set(x, "HumanLoopActivationConfig", js.undefined)
    
    inline def setHumanLoopConfig(value: HumanLoopConfig): Self = StObject.set(x, "HumanLoopConfig", value.asInstanceOf[js.Any])
    
    inline def setHumanLoopRequestSource(value: HumanLoopRequestSource): Self = StObject.set(x, "HumanLoopRequestSource", value.asInstanceOf[js.Any])
    
    inline def setHumanLoopRequestSourceUndefined: Self = StObject.set(x, "HumanLoopRequestSource", js.undefined)
    
    inline def setOutputConfig(value: FlowDefinitionOutputConfig): Self = StObject.set(x, "OutputConfig", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
