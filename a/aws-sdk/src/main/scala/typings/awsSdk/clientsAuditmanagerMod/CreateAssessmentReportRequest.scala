package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAssessmentReportRequest extends StObject {
  
  /**
    *  The identifier for the assessment. 
    */
  var assessmentId: UUID
  
  /**
    *  The description of the assessment report. 
    */
  var description: js.UndefOr[AssessmentReportDescription] = js.undefined
  
  /**
    *  The name of the new assessment report. 
    */
  var name: AssessmentReportName
  
  /**
    * A SQL statement that represents an evidence finder query. Provide this parameter when you want to generate an assessment report from the results of an evidence finder search query. When you use this parameter, Audit Manager generates a one-time report using only the evidence from the query output. This report does not include any assessment evidence that was manually added to a report using the console, or associated with a report using the API.  To use this parameter, the enablementStatus of evidence finder must be ENABLED.   For examples and help resolving queryStatement validation exceptions, see Troubleshooting evidence finder issues in the Audit Manager User Guide. 
    */
  var queryStatement: js.UndefOr[QueryStatement] = js.undefined
}
object CreateAssessmentReportRequest {
  
  inline def apply(assessmentId: UUID, name: AssessmentReportName): CreateAssessmentReportRequest = {
    val __obj = js.Dynamic.literal(assessmentId = assessmentId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAssessmentReportRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAssessmentReportRequest] (val x: Self) extends AnyVal {
    
    inline def setAssessmentId(value: UUID): Self = StObject.set(x, "assessmentId", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: AssessmentReportDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: AssessmentReportName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setQueryStatement(value: QueryStatement): Self = StObject.set(x, "queryStatement", value.asInstanceOf[js.Any])
    
    inline def setQueryStatementUndefined: Self = StObject.set(x, "queryStatement", js.undefined)
  }
}
