package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Experiment extends StObject {
  
  /**
    * The ARN of the experiment.
    */
  var arn: ExperimentArn
  
  /**
    * The date and time that the experiment is first created.
    */
  var createdTime: js.Date
  
  /**
    * A description of the experiment.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * A structure that contains the date and time that the experiment started and ended.
    */
  var execution: js.UndefOr[ExperimentExecution] = js.undefined
  
  /**
    * The date and time that the experiment was most recently updated.
    */
  var lastUpdatedTime: js.Date
  
  /**
    * An array of structures that defines the metrics used for the experiment, and whether a higher or lower value for each metric is the goal.
    */
  var metricGoals: js.UndefOr[MetricGoalsList] = js.undefined
  
  /**
    * The name of the experiment.
    */
  var name: ExperimentName
  
  /**
    * A structure that contains the configuration of which variation to use as the "control" version. The "control" version is used for comparison with other variations. This structure also specifies how much experiment traffic is allocated to each variation.
    */
  var onlineAbDefinition: js.UndefOr[OnlineAbDefinition] = js.undefined
  
  /**
    * The name or ARN of the project that contains this experiment.
    */
  var project: js.UndefOr[ProjectArn] = js.undefined
  
  /**
    * This value is used when Evidently assigns a particular user session to the experiment. It helps create a randomization ID to determine which variation the user session is served. This randomization ID is a combination of the entity ID and randomizationSalt.
    */
  var randomizationSalt: js.UndefOr[RandomizationSalt] = js.undefined
  
  /**
    * In thousandths of a percent, the amount of the available audience that is allocated to this experiment. The available audience is the total audience minus the audience that you have allocated to overrides or current launches of this feature. This is represented in thousandths of a percent, so a value of 10,000 is 10% of the available audience.
    */
  var samplingRate: js.UndefOr[SplitWeight] = js.undefined
  
  /**
    * A structure that contains the time and date that Evidently completed the analysis of the experiment.
    */
  var schedule: js.UndefOr[ExperimentSchedule] = js.undefined
  
  /**
    * The audience segment being used for the experiment, if a segment is being used.
    */
  var segment: js.UndefOr[SegmentArn] = js.undefined
  
  /**
    * The current state of the experiment.
    */
  var status: ExperimentStatus
  
  /**
    * If the experiment was stopped, this is the string that was entered by the person who stopped the experiment, to explain why it was stopped.
    */
  var statusReason: js.UndefOr[Description] = js.undefined
  
  /**
    * The list of tag keys and values associated with this experiment.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * An array of structures that describe the configuration of each feature variation used in the experiment.
    */
  var treatments: js.UndefOr[TreatmentList] = js.undefined
  
  /**
    * The type of this experiment. Currently, this value must be aws.experiment.onlineab.
    */
  var `type`: ExperimentType
}
object Experiment {
  
  inline def apply(
    arn: ExperimentArn,
    createdTime: js.Date,
    lastUpdatedTime: js.Date,
    name: ExperimentName,
    status: ExperimentStatus,
    `type`: ExperimentType
  ): Experiment = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdTime = createdTime.asInstanceOf[js.Any], lastUpdatedTime = lastUpdatedTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Experiment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Experiment] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ExperimentArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "createdTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExecution(value: ExperimentExecution): Self = StObject.set(x, "execution", value.asInstanceOf[js.Any])
    
    inline def setExecutionUndefined: Self = StObject.set(x, "execution", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setMetricGoals(value: MetricGoalsList): Self = StObject.set(x, "metricGoals", value.asInstanceOf[js.Any])
    
    inline def setMetricGoalsUndefined: Self = StObject.set(x, "metricGoals", js.undefined)
    
    inline def setMetricGoalsVarargs(value: MetricGoal*): Self = StObject.set(x, "metricGoals", js.Array(value*))
    
    inline def setName(value: ExperimentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOnlineAbDefinition(value: OnlineAbDefinition): Self = StObject.set(x, "onlineAbDefinition", value.asInstanceOf[js.Any])
    
    inline def setOnlineAbDefinitionUndefined: Self = StObject.set(x, "onlineAbDefinition", js.undefined)
    
    inline def setProject(value: ProjectArn): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setRandomizationSalt(value: RandomizationSalt): Self = StObject.set(x, "randomizationSalt", value.asInstanceOf[js.Any])
    
    inline def setRandomizationSaltUndefined: Self = StObject.set(x, "randomizationSalt", js.undefined)
    
    inline def setSamplingRate(value: SplitWeight): Self = StObject.set(x, "samplingRate", value.asInstanceOf[js.Any])
    
    inline def setSamplingRateUndefined: Self = StObject.set(x, "samplingRate", js.undefined)
    
    inline def setSchedule(value: ExperimentSchedule): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    inline def setSegment(value: SegmentArn): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    inline def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
    
    inline def setStatus(value: ExperimentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: Description): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTreatments(value: TreatmentList): Self = StObject.set(x, "treatments", value.asInstanceOf[js.Any])
    
    inline def setTreatmentsUndefined: Self = StObject.set(x, "treatments", js.undefined)
    
    inline def setTreatmentsVarargs(value: Treatment*): Self = StObject.set(x, "treatments", js.Array(value*))
    
    inline def setType(value: ExperimentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
