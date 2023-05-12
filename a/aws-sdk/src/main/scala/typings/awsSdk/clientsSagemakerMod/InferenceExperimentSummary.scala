package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InferenceExperimentSummary extends StObject {
  
  /**
    * The timestamp at which the inference experiment was completed.
    */
  var CompletionTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The timestamp at which the inference experiment was created.
    */
  var CreationTime: js.Date
  
  /**
    * The description of the inference experiment.
    */
  var Description: js.UndefOr[InferenceExperimentDescription] = js.undefined
  
  /**
    * The timestamp when you last modified the inference experiment.
    */
  var LastModifiedTime: js.Date
  
  /**
    * The name of the inference experiment.
    */
  var Name: InferenceExperimentName
  
  /**
    *  The ARN of the IAM role that Amazon SageMaker can assume to access model artifacts and container images, and manage Amazon SageMaker Inference endpoints for model deployment. 
    */
  var RoleArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.RoleArn] = js.undefined
  
  /**
    * The duration for which the inference experiment ran or will run. The maximum duration that you can set for an inference experiment is 30 days.
    */
  var Schedule: js.UndefOr[InferenceExperimentSchedule] = js.undefined
  
  /**
    * The status of the inference experiment.
    */
  var Status: InferenceExperimentStatus
  
  /**
    * The error message for the inference experiment status result.
    */
  var StatusReason: js.UndefOr[InferenceExperimentStatusReason] = js.undefined
  
  /**
    * The type of the inference experiment.
    */
  var Type: InferenceExperimentType
}
object InferenceExperimentSummary {
  
  inline def apply(
    CreationTime: js.Date,
    LastModifiedTime: js.Date,
    Name: InferenceExperimentName,
    Status: InferenceExperimentStatus,
    Type: InferenceExperimentType
  ): InferenceExperimentSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[InferenceExperimentSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InferenceExperimentSummary] (val x: Self) extends AnyVal {
    
    inline def setCompletionTime(value: js.Date): Self = StObject.set(x, "CompletionTime", value.asInstanceOf[js.Any])
    
    inline def setCompletionTimeUndefined: Self = StObject.set(x, "CompletionTime", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: InferenceExperimentDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setName(value: InferenceExperimentName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setSchedule(value: InferenceExperimentSchedule): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
    
    inline def setStatus(value: InferenceExperimentStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: InferenceExperimentStatusReason): Self = StObject.set(x, "StatusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "StatusReason", js.undefined)
    
    inline def setType(value: InferenceExperimentType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
