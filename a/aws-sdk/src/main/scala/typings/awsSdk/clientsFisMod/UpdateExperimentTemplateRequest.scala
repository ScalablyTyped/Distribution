package typings.awsSdk.clientsFisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateExperimentTemplateRequest extends StObject {
  
  /**
    * The actions for the experiment.
    */
  var actions: js.UndefOr[UpdateExperimentTemplateActionInputMap] = js.undefined
  
  /**
    * A description for the template.
    */
  var description: js.UndefOr[ExperimentTemplateDescription] = js.undefined
  
  /**
    * The ID of the experiment template.
    */
  var id: ExperimentTemplateId
  
  /**
    * The configuration for experiment logging.
    */
  var logConfiguration: js.UndefOr[UpdateExperimentTemplateLogConfigurationInput] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role that grants the FIS service permission to perform service actions on your behalf.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * The stop conditions for the experiment.
    */
  var stopConditions: js.UndefOr[UpdateExperimentTemplateStopConditionInputList] = js.undefined
  
  /**
    * The targets for the experiment.
    */
  var targets: js.UndefOr[UpdateExperimentTemplateTargetInputMap] = js.undefined
}
object UpdateExperimentTemplateRequest {
  
  inline def apply(id: ExperimentTemplateId): UpdateExperimentTemplateRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateExperimentTemplateRequest]
  }
  
  extension [Self <: UpdateExperimentTemplateRequest](x: Self) {
    
    inline def setActions(value: UpdateExperimentTemplateActionInputMap): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setDescription(value: ExperimentTemplateDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: ExperimentTemplateId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLogConfiguration(value: UpdateExperimentTemplateLogConfigurationInput): Self = StObject.set(x, "logConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLogConfigurationUndefined: Self = StObject.set(x, "logConfiguration", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    
    inline def setStopConditions(value: UpdateExperimentTemplateStopConditionInputList): Self = StObject.set(x, "stopConditions", value.asInstanceOf[js.Any])
    
    inline def setStopConditionsUndefined: Self = StObject.set(x, "stopConditions", js.undefined)
    
    inline def setStopConditionsVarargs(value: UpdateExperimentTemplateStopConditionInput*): Self = StObject.set(x, "stopConditions", js.Array(value*))
    
    inline def setTargets(value: UpdateExperimentTemplateTargetInputMap): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
  }
}
