package typings.awsSdk.autoscalingplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScalingPlan extends StObject {
  
  /**
    * The application source.
    */
  var ApplicationSource: typings.awsSdk.autoscalingplansMod.ApplicationSource
  
  /**
    * The Unix time stamp when the scaling plan was created.
    */
  var CreationTime: js.UndefOr[TimestampType] = js.undefined
  
  /**
    * The scaling instructions.
    */
  var ScalingInstructions: typings.awsSdk.autoscalingplansMod.ScalingInstructions
  
  /**
    * The name of the scaling plan.
    */
  var ScalingPlanName: typings.awsSdk.autoscalingplansMod.ScalingPlanName
  
  /**
    * The version number of the scaling plan.
    */
  var ScalingPlanVersion: typings.awsSdk.autoscalingplansMod.ScalingPlanVersion
  
  /**
    * The status of the scaling plan.    Active - The scaling plan is active.    ActiveWithProblems - The scaling plan is active, but the scaling configuration for one or more resources could not be applied.    CreationInProgress - The scaling plan is being created.    CreationFailed - The scaling plan could not be created.    DeletionInProgress - The scaling plan is being deleted.    DeletionFailed - The scaling plan could not be deleted.    UpdateInProgress - The scaling plan is being updated.    UpdateFailed - The scaling plan could not be updated.  
    */
  var StatusCode: ScalingPlanStatusCode
  
  /**
    * A simple message about the current status of the scaling plan.
    */
  var StatusMessage: js.UndefOr[XmlString] = js.undefined
  
  /**
    * The Unix time stamp when the scaling plan entered the current status.
    */
  var StatusStartTime: js.UndefOr[TimestampType] = js.undefined
}
object ScalingPlan {
  
  @scala.inline
  def apply(
    ApplicationSource: ApplicationSource,
    ScalingInstructions: ScalingInstructions,
    ScalingPlanName: ScalingPlanName,
    ScalingPlanVersion: ScalingPlanVersion,
    StatusCode: ScalingPlanStatusCode
  ): ScalingPlan = {
    val __obj = js.Dynamic.literal(ApplicationSource = ApplicationSource.asInstanceOf[js.Any], ScalingInstructions = ScalingInstructions.asInstanceOf[js.Any], ScalingPlanName = ScalingPlanName.asInstanceOf[js.Any], ScalingPlanVersion = ScalingPlanVersion.asInstanceOf[js.Any], StatusCode = StatusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingPlan]
  }
  
  @scala.inline
  implicit class ScalingPlanMutableBuilder[Self <: ScalingPlan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationSource(value: ApplicationSource): Self = StObject.set(x, "ApplicationSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTime(value: TimestampType): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setScalingInstructions(value: ScalingInstructions): Self = StObject.set(x, "ScalingInstructions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingInstructionsVarargs(value: ScalingInstruction*): Self = StObject.set(x, "ScalingInstructions", js.Array(value :_*))
    
    @scala.inline
    def setScalingPlanName(value: ScalingPlanName): Self = StObject.set(x, "ScalingPlanName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingPlanVersion(value: ScalingPlanVersion): Self = StObject.set(x, "ScalingPlanVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: ScalingPlanStatusCode): Self = StObject.set(x, "StatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: XmlString): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    @scala.inline
    def setStatusStartTime(value: TimestampType): Self = StObject.set(x, "StatusStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusStartTimeUndefined: Self = StObject.set(x, "StatusStartTime", js.undefined)
  }
}
