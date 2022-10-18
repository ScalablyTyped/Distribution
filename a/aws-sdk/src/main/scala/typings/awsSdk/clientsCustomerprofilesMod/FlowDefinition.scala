package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlowDefinition extends StObject {
  
  /**
    * A description of the flow you want to create.
    */
  var Description: js.UndefOr[FlowDescription] = js.undefined
  
  /**
    * The specified name of the flow. Use underscores (_) or hyphens (-) only. Spaces are not allowed.
    */
  var FlowName: typings.awsSdk.clientsCustomerprofilesMod.FlowName
  
  /**
    * The Amazon Resource Name of the AWS Key Management Service (KMS) key you provide for encryption.
    */
  var KmsArn: typings.awsSdk.clientsCustomerprofilesMod.KmsArn
  
  /**
    * The configuration that controls how Customer Profiles retrieves data from the source.
    */
  var SourceFlowConfig: typings.awsSdk.clientsCustomerprofilesMod.SourceFlowConfig
  
  /**
    * A list of tasks that Customer Profiles performs while transferring the data in the flow run.
    */
  var Tasks: typings.awsSdk.clientsCustomerprofilesMod.Tasks
  
  /**
    * The trigger settings that determine how and when the flow runs.
    */
  var TriggerConfig: typings.awsSdk.clientsCustomerprofilesMod.TriggerConfig
}
object FlowDefinition {
  
  inline def apply(
    FlowName: FlowName,
    KmsArn: KmsArn,
    SourceFlowConfig: SourceFlowConfig,
    Tasks: Tasks,
    TriggerConfig: TriggerConfig
  ): FlowDefinition = {
    val __obj = js.Dynamic.literal(FlowName = FlowName.asInstanceOf[js.Any], KmsArn = KmsArn.asInstanceOf[js.Any], SourceFlowConfig = SourceFlowConfig.asInstanceOf[js.Any], Tasks = Tasks.asInstanceOf[js.Any], TriggerConfig = TriggerConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowDefinition]
  }
  
  extension [Self <: FlowDefinition](x: Self) {
    
    inline def setDescription(value: FlowDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFlowName(value: FlowName): Self = StObject.set(x, "FlowName", value.asInstanceOf[js.Any])
    
    inline def setKmsArn(value: KmsArn): Self = StObject.set(x, "KmsArn", value.asInstanceOf[js.Any])
    
    inline def setSourceFlowConfig(value: SourceFlowConfig): Self = StObject.set(x, "SourceFlowConfig", value.asInstanceOf[js.Any])
    
    inline def setTasks(value: Tasks): Self = StObject.set(x, "Tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksVarargs(value: Task*): Self = StObject.set(x, "Tasks", js.Array(value*))
    
    inline def setTriggerConfig(value: TriggerConfig): Self = StObject.set(x, "TriggerConfig", value.asInstanceOf[js.Any])
  }
}
