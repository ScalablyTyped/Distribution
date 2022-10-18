package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartAppAssessmentResponse extends StObject {
  
  /**
    * The assessment created.
    */
  var assessment: AppAssessment
}
object StartAppAssessmentResponse {
  
  inline def apply(assessment: AppAssessment): StartAppAssessmentResponse = {
    val __obj = js.Dynamic.literal(assessment = assessment.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartAppAssessmentResponse]
  }
  
  extension [Self <: StartAppAssessmentResponse](x: Self) {
    
    inline def setAssessment(value: AppAssessment): Self = StObject.set(x, "assessment", value.asInstanceOf[js.Any])
  }
}
