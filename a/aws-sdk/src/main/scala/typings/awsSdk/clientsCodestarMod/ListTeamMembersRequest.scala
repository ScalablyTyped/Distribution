package typings.awsSdk.clientsCodestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTeamMembersRequest extends StObject {
  
  /**
    * The maximum number of team members you want returned in a response.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The continuation token for the next set of results, if the results cannot be returned in one response.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The ID of the project for which you want to list team members.
    */
  var projectId: ProjectId
}
object ListTeamMembersRequest {
  
  inline def apply(projectId: ProjectId): ListTeamMembersRequest = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTeamMembersRequest]
  }
  
  extension [Self <: ListTeamMembersRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setProjectId(value: ProjectId): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
  }
}
