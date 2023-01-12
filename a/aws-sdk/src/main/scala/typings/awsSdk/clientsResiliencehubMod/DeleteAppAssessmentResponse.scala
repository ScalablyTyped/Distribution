package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAppAssessmentResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the assessment. The format for this ARN is: arn:partition:resiliencehub:region:account:app-assessment/app-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference.
    */
  var assessmentArn: Arn
  
  /**
    * The current status of the assessment for the resiliency policy.
    */
  var assessmentStatus: AssessmentStatus
}
object DeleteAppAssessmentResponse {
  
  inline def apply(assessmentArn: Arn, assessmentStatus: AssessmentStatus): DeleteAppAssessmentResponse = {
    val __obj = js.Dynamic.literal(assessmentArn = assessmentArn.asInstanceOf[js.Any], assessmentStatus = assessmentStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAppAssessmentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteAppAssessmentResponse] (val x: Self) extends AnyVal {
    
    inline def setAssessmentArn(value: Arn): Self = StObject.set(x, "assessmentArn", value.asInstanceOf[js.Any])
    
    inline def setAssessmentStatus(value: AssessmentStatus): Self = StObject.set(x, "assessmentStatus", value.asInstanceOf[js.Any])
  }
}
