package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAppAssessmentRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the assessment. The format for this ARN is: arn:partition:resiliencehub:region:account:app-assessment/app-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference guide.
    */
  var assessmentArn: Arn
}
object DescribeAppAssessmentRequest {
  
  inline def apply(assessmentArn: Arn): DescribeAppAssessmentRequest = {
    val __obj = js.Dynamic.literal(assessmentArn = assessmentArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAppAssessmentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAppAssessmentRequest] (val x: Self) extends AnyVal {
    
    inline def setAssessmentArn(value: Arn): Self = StObject.set(x, "assessmentArn", value.asInstanceOf[js.Any])
  }
}
