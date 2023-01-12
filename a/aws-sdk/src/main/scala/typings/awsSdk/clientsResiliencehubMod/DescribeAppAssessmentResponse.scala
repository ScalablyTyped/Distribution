package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAppAssessmentResponse extends StObject {
  
  /**
    * The assessment for an AWS Resilience Hub application, returned as an object. This object includes Amazon Resource Names (ARNs), compliance information, compliance status, cost, messages, resiliency scores, and more.
    */
  var assessment: AppAssessment
}
object DescribeAppAssessmentResponse {
  
  inline def apply(assessment: AppAssessment): DescribeAppAssessmentResponse = {
    val __obj = js.Dynamic.literal(assessment = assessment.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAppAssessmentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAppAssessmentResponse] (val x: Self) extends AnyVal {
    
    inline def setAssessment(value: AppAssessment): Self = StObject.set(x, "assessment", value.asInstanceOf[js.Any])
  }
}
