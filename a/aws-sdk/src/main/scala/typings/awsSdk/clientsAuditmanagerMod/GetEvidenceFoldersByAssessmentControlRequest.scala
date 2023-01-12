package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEvidenceFoldersByAssessmentControlRequest extends StObject {
  
  /**
    *  The identifier for the assessment. 
    */
  var assessmentId: UUID
  
  /**
    *  The identifier for the control. 
    */
  var controlId: UUID
  
  /**
    *  The identifier for the control set. 
    */
  var controlSetId: ControlSetId
  
  /**
    *  Represents the maximum number of results on a page or for an API request call. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    *  The pagination token that's used to fetch the next set of results. 
    */
  var nextToken: js.UndefOr[Token] = js.undefined
}
object GetEvidenceFoldersByAssessmentControlRequest {
  
  inline def apply(assessmentId: UUID, controlId: UUID, controlSetId: ControlSetId): GetEvidenceFoldersByAssessmentControlRequest = {
    val __obj = js.Dynamic.literal(assessmentId = assessmentId.asInstanceOf[js.Any], controlId = controlId.asInstanceOf[js.Any], controlSetId = controlSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEvidenceFoldersByAssessmentControlRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetEvidenceFoldersByAssessmentControlRequest] (val x: Self) extends AnyVal {
    
    inline def setAssessmentId(value: UUID): Self = StObject.set(x, "assessmentId", value.asInstanceOf[js.Any])
    
    inline def setControlId(value: UUID): Self = StObject.set(x, "controlId", value.asInstanceOf[js.Any])
    
    inline def setControlSetId(value: ControlSetId): Self = StObject.set(x, "controlSetId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
