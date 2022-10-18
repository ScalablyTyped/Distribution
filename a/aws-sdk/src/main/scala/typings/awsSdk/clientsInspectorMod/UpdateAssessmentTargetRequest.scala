package typings.awsSdk.clientsInspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAssessmentTargetRequest extends StObject {
  
  /**
    * The ARN of the assessment target that you want to update.
    */
  var assessmentTargetArn: Arn
  
  /**
    * The name of the assessment target that you want to update.
    */
  var assessmentTargetName: AssessmentTargetName
  
  /**
    * The ARN of the resource group that is used to specify the new resource group to associate with the assessment target.
    */
  var resourceGroupArn: js.UndefOr[Arn] = js.undefined
}
object UpdateAssessmentTargetRequest {
  
  inline def apply(assessmentTargetArn: Arn, assessmentTargetName: AssessmentTargetName): UpdateAssessmentTargetRequest = {
    val __obj = js.Dynamic.literal(assessmentTargetArn = assessmentTargetArn.asInstanceOf[js.Any], assessmentTargetName = assessmentTargetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAssessmentTargetRequest]
  }
  
  extension [Self <: UpdateAssessmentTargetRequest](x: Self) {
    
    inline def setAssessmentTargetArn(value: Arn): Self = StObject.set(x, "assessmentTargetArn", value.asInstanceOf[js.Any])
    
    inline def setAssessmentTargetName(value: AssessmentTargetName): Self = StObject.set(x, "assessmentTargetName", value.asInstanceOf[js.Any])
    
    inline def setResourceGroupArn(value: Arn): Self = StObject.set(x, "resourceGroupArn", value.asInstanceOf[js.Any])
    
    inline def setResourceGroupArnUndefined: Self = StObject.set(x, "resourceGroupArn", js.undefined)
  }
}
