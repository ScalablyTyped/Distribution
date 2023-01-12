package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoMLCandidate extends StObject {
  
  /**
    * The name of the candidate.
    */
  var CandidateName: typings.awsSdk.clientsSagemakerMod.CandidateName
  
  /**
    * The properties of an AutoML candidate job.
    */
  var CandidateProperties: js.UndefOr[typings.awsSdk.clientsSagemakerMod.CandidateProperties] = js.undefined
  
  /**
    * The candidate's status.
    */
  var CandidateStatus: typings.awsSdk.clientsSagemakerMod.CandidateStatus
  
  /**
    * Information about the candidate's steps.
    */
  var CandidateSteps: typings.awsSdk.clientsSagemakerMod.CandidateSteps
  
  /**
    * The creation time.
    */
  var CreationTime: js.Date
  
  /**
    * The end time.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The failure reason.
    */
  var FailureReason: js.UndefOr[AutoMLFailureReason] = js.undefined
  
  var FinalAutoMLJobObjectiveMetric: js.UndefOr[typings.awsSdk.clientsSagemakerMod.FinalAutoMLJobObjectiveMetric] = js.undefined
  
  /**
    * Information about the inference container definitions.
    */
  var InferenceContainers: js.UndefOr[AutoMLContainerDefinitions] = js.undefined
  
  /**
    * The last modified time.
    */
  var LastModifiedTime: js.Date
  
  /**
    * The objective's status.
    */
  var ObjectiveStatus: typings.awsSdk.clientsSagemakerMod.ObjectiveStatus
}
object AutoMLCandidate {
  
  inline def apply(
    CandidateName: CandidateName,
    CandidateStatus: CandidateStatus,
    CandidateSteps: CandidateSteps,
    CreationTime: js.Date,
    LastModifiedTime: js.Date,
    ObjectiveStatus: ObjectiveStatus
  ): AutoMLCandidate = {
    val __obj = js.Dynamic.literal(CandidateName = CandidateName.asInstanceOf[js.Any], CandidateStatus = CandidateStatus.asInstanceOf[js.Any], CandidateSteps = CandidateSteps.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], ObjectiveStatus = ObjectiveStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMLCandidate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoMLCandidate] (val x: Self) extends AnyVal {
    
    inline def setCandidateName(value: CandidateName): Self = StObject.set(x, "CandidateName", value.asInstanceOf[js.Any])
    
    inline def setCandidateProperties(value: CandidateProperties): Self = StObject.set(x, "CandidateProperties", value.asInstanceOf[js.Any])
    
    inline def setCandidatePropertiesUndefined: Self = StObject.set(x, "CandidateProperties", js.undefined)
    
    inline def setCandidateStatus(value: CandidateStatus): Self = StObject.set(x, "CandidateStatus", value.asInstanceOf[js.Any])
    
    inline def setCandidateSteps(value: CandidateSteps): Self = StObject.set(x, "CandidateSteps", value.asInstanceOf[js.Any])
    
    inline def setCandidateStepsVarargs(value: AutoMLCandidateStep*): Self = StObject.set(x, "CandidateSteps", js.Array(value*))
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setFailureReason(value: AutoMLFailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setFinalAutoMLJobObjectiveMetric(value: FinalAutoMLJobObjectiveMetric): Self = StObject.set(x, "FinalAutoMLJobObjectiveMetric", value.asInstanceOf[js.Any])
    
    inline def setFinalAutoMLJobObjectiveMetricUndefined: Self = StObject.set(x, "FinalAutoMLJobObjectiveMetric", js.undefined)
    
    inline def setInferenceContainers(value: AutoMLContainerDefinitions): Self = StObject.set(x, "InferenceContainers", value.asInstanceOf[js.Any])
    
    inline def setInferenceContainersUndefined: Self = StObject.set(x, "InferenceContainers", js.undefined)
    
    inline def setInferenceContainersVarargs(value: AutoMLContainerDefinition*): Self = StObject.set(x, "InferenceContainers", js.Array(value*))
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setObjectiveStatus(value: ObjectiveStatus): Self = StObject.set(x, "ObjectiveStatus", value.asInstanceOf[js.Any])
  }
}
