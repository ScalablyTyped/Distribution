package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssessmentReportsResponse extends StObject {
  
  /**
    *  The list of assessment reports that the ListAssessmentReports API returned. 
    */
  var assessmentReports: js.UndefOr[AssessmentReportsMetadata] = js.undefined
  
  /**
    *  The pagination token that's used to fetch the next set of results. 
    */
  var nextToken: js.UndefOr[Token] = js.undefined
}
object ListAssessmentReportsResponse {
  
  inline def apply(): ListAssessmentReportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssessmentReportsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAssessmentReportsResponse] (val x: Self) extends AnyVal {
    
    inline def setAssessmentReports(value: AssessmentReportsMetadata): Self = StObject.set(x, "assessmentReports", value.asInstanceOf[js.Any])
    
    inline def setAssessmentReportsUndefined: Self = StObject.set(x, "assessmentReports", js.undefined)
    
    inline def setAssessmentReportsVarargs(value: AssessmentReportMetadata*): Self = StObject.set(x, "assessmentReports", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
