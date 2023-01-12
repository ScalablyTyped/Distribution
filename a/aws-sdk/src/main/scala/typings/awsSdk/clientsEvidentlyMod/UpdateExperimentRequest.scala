package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateExperimentRequest extends StObject {
  
  /**
    * An optional description of the experiment.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The name of the experiment to update.
    */
  var experiment: ExperimentName
  
  /**
    * An array of structures that defines the metrics used for the experiment, and whether a higher or lower value for each metric is the goal.
    */
  var metricGoals: js.UndefOr[MetricGoalConfigList] = js.undefined
  
  /**
    * A structure that contains the configuration of which variation o use as the "control" version. The "control" version is used for comparison with other variations. This structure also specifies how much experiment traffic is allocated to each variation.
    */
  var onlineAbConfig: js.UndefOr[OnlineAbConfig] = js.undefined
  
  /**
    * The name or ARN of the project that contains the experiment that you want to update.
    */
  var project: ProjectRef
  
  /**
    * When Evidently assigns a particular user session to an experiment, it must use a randomization ID to determine which variation the user session is served. This randomization ID is a combination of the entity ID and randomizationSalt. If you omit randomizationSalt, Evidently uses the experiment name as the randomizationSalt.
    */
  var randomizationSalt: js.UndefOr[RandomizationSalt] = js.undefined
  
  /**
    * Removes a segment from being used in an experiment. You can't use this parameter if the experiment is currently running.
    */
  var removeSegment: js.UndefOr[PrimitiveBoolean] = js.undefined
  
  /**
    * The portion of the available audience that you want to allocate to this experiment, in thousandths of a percent. The available audience is the total audience minus the audience that you have allocated to overrides or current launches of this feature. This is represented in thousandths of a percent. For example, specify 20,000 to allocate 20% of the available audience.
    */
  var samplingRate: js.UndefOr[SplitWeight] = js.undefined
  
  /**
    * Adds an audience segment to an experiment. When a segment is used in an experiment, only user sessions that match the segment pattern are used in the experiment. You can't use this parameter if the experiment is currently running.
    */
  var segment: js.UndefOr[SegmentRef] = js.undefined
  
  /**
    * An array of structures that define the variations being tested in the experiment.
    */
  var treatments: js.UndefOr[TreatmentConfigList] = js.undefined
}
object UpdateExperimentRequest {
  
  inline def apply(experiment: ExperimentName, project: ProjectRef): UpdateExperimentRequest = {
    val __obj = js.Dynamic.literal(experiment = experiment.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateExperimentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateExperimentRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExperiment(value: ExperimentName): Self = StObject.set(x, "experiment", value.asInstanceOf[js.Any])
    
    inline def setMetricGoals(value: MetricGoalConfigList): Self = StObject.set(x, "metricGoals", value.asInstanceOf[js.Any])
    
    inline def setMetricGoalsUndefined: Self = StObject.set(x, "metricGoals", js.undefined)
    
    inline def setMetricGoalsVarargs(value: MetricGoalConfig*): Self = StObject.set(x, "metricGoals", js.Array(value*))
    
    inline def setOnlineAbConfig(value: OnlineAbConfig): Self = StObject.set(x, "onlineAbConfig", value.asInstanceOf[js.Any])
    
    inline def setOnlineAbConfigUndefined: Self = StObject.set(x, "onlineAbConfig", js.undefined)
    
    inline def setProject(value: ProjectRef): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setRandomizationSalt(value: RandomizationSalt): Self = StObject.set(x, "randomizationSalt", value.asInstanceOf[js.Any])
    
    inline def setRandomizationSaltUndefined: Self = StObject.set(x, "randomizationSalt", js.undefined)
    
    inline def setRemoveSegment(value: PrimitiveBoolean): Self = StObject.set(x, "removeSegment", value.asInstanceOf[js.Any])
    
    inline def setRemoveSegmentUndefined: Self = StObject.set(x, "removeSegment", js.undefined)
    
    inline def setSamplingRate(value: SplitWeight): Self = StObject.set(x, "samplingRate", value.asInstanceOf[js.Any])
    
    inline def setSamplingRateUndefined: Self = StObject.set(x, "samplingRate", js.undefined)
    
    inline def setSegment(value: SegmentRef): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    inline def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
    
    inline def setTreatments(value: TreatmentConfigList): Self = StObject.set(x, "treatments", value.asInstanceOf[js.Any])
    
    inline def setTreatmentsUndefined: Self = StObject.set(x, "treatments", js.undefined)
    
    inline def setTreatmentsVarargs(value: TreatmentConfig*): Self = StObject.set(x, "treatments", js.Array(value*))
  }
}
