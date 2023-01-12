package typings.awsSdk.clientsFisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Experiment extends StObject {
  
  /**
    * The actions for the experiment.
    */
  var actions: js.UndefOr[ExperimentActionMap] = js.undefined
  
  /**
    * The time that the experiment was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time that the experiment ended.
    */
  var endTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the experiment template.
    */
  var experimentTemplateId: js.UndefOr[ExperimentTemplateId] = js.undefined
  
  /**
    * The ID of the experiment.
    */
  var id: js.UndefOr[ExperimentId] = js.undefined
  
  /**
    * The configuration for experiment logging.
    */
  var logConfiguration: js.UndefOr[ExperimentLogConfiguration] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role that grants the FIS service permission to perform service actions on your behalf.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * The time that the experiment started.
    */
  var startTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The state of the experiment.
    */
  var state: js.UndefOr[ExperimentState] = js.undefined
  
  /**
    * The stop conditions for the experiment.
    */
  var stopConditions: js.UndefOr[ExperimentStopConditionList] = js.undefined
  
  /**
    * The tags for the experiment.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The targets for the experiment.
    */
  var targets: js.UndefOr[ExperimentTargetMap] = js.undefined
}
object Experiment {
  
  inline def apply(): Experiment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Experiment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Experiment] (val x: Self) extends AnyVal {
    
    inline def setActions(value: ExperimentActionMap): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setExperimentTemplateId(value: ExperimentTemplateId): Self = StObject.set(x, "experimentTemplateId", value.asInstanceOf[js.Any])
    
    inline def setExperimentTemplateIdUndefined: Self = StObject.set(x, "experimentTemplateId", js.undefined)
    
    inline def setId(value: ExperimentId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLogConfiguration(value: ExperimentLogConfiguration): Self = StObject.set(x, "logConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLogConfigurationUndefined: Self = StObject.set(x, "logConfiguration", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setState(value: ExperimentState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStopConditions(value: ExperimentStopConditionList): Self = StObject.set(x, "stopConditions", value.asInstanceOf[js.Any])
    
    inline def setStopConditionsUndefined: Self = StObject.set(x, "stopConditions", js.undefined)
    
    inline def setStopConditionsVarargs(value: ExperimentStopCondition*): Self = StObject.set(x, "stopConditions", js.Array(value*))
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTargets(value: ExperimentTargetMap): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
  }
}
