package typings.awsSdk.clientsCodestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForProjectRequest extends StObject {
  
  /**
    * The ID of the project to get tags for.
    */
  var id: ProjectId
  
  /**
    * Reserved for future use.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * Reserved for future use.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListTagsForProjectRequest {
  
  inline def apply(id: ProjectId): ListTagsForProjectRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForProjectRequest]
  }
  
  extension [Self <: ListTagsForProjectRequest](x: Self) {
    
    inline def setId(value: ProjectId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
