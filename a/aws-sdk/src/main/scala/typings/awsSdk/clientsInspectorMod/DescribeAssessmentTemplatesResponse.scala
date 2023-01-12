package typings.awsSdk.clientsInspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAssessmentTemplatesResponse extends StObject {
  
  /**
    * Information about the assessment templates.
    */
  var assessmentTemplates: AssessmentTemplateList
  
  /**
    * Assessment template details that cannot be described. An error code is provided for each failed item.
    */
  var failedItems: FailedItems
}
object DescribeAssessmentTemplatesResponse {
  
  inline def apply(assessmentTemplates: AssessmentTemplateList, failedItems: FailedItems): DescribeAssessmentTemplatesResponse = {
    val __obj = js.Dynamic.literal(assessmentTemplates = assessmentTemplates.asInstanceOf[js.Any], failedItems = failedItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAssessmentTemplatesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAssessmentTemplatesResponse] (val x: Self) extends AnyVal {
    
    inline def setAssessmentTemplates(value: AssessmentTemplateList): Self = StObject.set(x, "assessmentTemplates", value.asInstanceOf[js.Any])
    
    inline def setAssessmentTemplatesVarargs(value: AssessmentTemplate*): Self = StObject.set(x, "assessmentTemplates", js.Array(value*))
    
    inline def setFailedItems(value: FailedItems): Self = StObject.set(x, "failedItems", value.asInstanceOf[js.Any])
  }
}
