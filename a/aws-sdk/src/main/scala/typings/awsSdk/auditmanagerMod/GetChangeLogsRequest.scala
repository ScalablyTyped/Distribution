package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetChangeLogsRequest extends StObject {
  
  /**
    * The unique identifier for the assessment. 
    */
  var assessmentId: UUID
  
  /**
    *  The unique identifier for the control. 
    */
  var controlId: js.UndefOr[UUID] = js.undefined
  
  /**
    *  The unique identifier for the control set. 
    */
  var controlSetId: js.UndefOr[ControlSetId] = js.undefined
  
  /**
    * Represents the maximum number of results on a page or for an API request call. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    *  The pagination token that's used to fetch the next set of results. 
    */
  var nextToken: js.UndefOr[Token] = js.undefined
}
object GetChangeLogsRequest {
  
  inline def apply(assessmentId: UUID): GetChangeLogsRequest = {
    val __obj = js.Dynamic.literal(assessmentId = assessmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetChangeLogsRequest]
  }
  
  extension [Self <: GetChangeLogsRequest](x: Self) {
    
    inline def setAssessmentId(value: UUID): Self = StObject.set(x, "assessmentId", value.asInstanceOf[js.Any])
    
    inline def setControlId(value: UUID): Self = StObject.set(x, "controlId", value.asInstanceOf[js.Any])
    
    inline def setControlIdUndefined: Self = StObject.set(x, "controlId", js.undefined)
    
    inline def setControlSetId(value: ControlSetId): Self = StObject.set(x, "controlSetId", value.asInstanceOf[js.Any])
    
    inline def setControlSetIdUndefined: Self = StObject.set(x, "controlSetId", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
