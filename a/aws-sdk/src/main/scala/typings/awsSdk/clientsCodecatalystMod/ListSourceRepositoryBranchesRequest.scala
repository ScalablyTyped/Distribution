package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSourceRepositoryBranchesRequest extends StObject {
  
  /**
    * The maximum number of results to show in a single call to this API. If the number of results is larger than the number you specified, the response will include a NextToken element, which you can use to obtain additional results.
    */
  var maxResults: js.UndefOr[ListSourceRepositoryBranchesRequestMaxResultsInteger] = js.undefined
  
  /**
    * A token returned from a call to this API to indicate the next batch of results to return, if any.
    */
  var nextToken: js.UndefOr[ListSourceRepositoryBranchesRequestNextTokenString] = js.undefined
  
  /**
    * The name of the project in the space.
    */
  var projectName: NameString
  
  /**
    * The name of the source repository.
    */
  var sourceRepositoryName: SourceRepositoryNameString
  
  /**
    * The name of the space.
    */
  var spaceName: NameString
}
object ListSourceRepositoryBranchesRequest {
  
  inline def apply(projectName: NameString, sourceRepositoryName: SourceRepositoryNameString, spaceName: NameString): ListSourceRepositoryBranchesRequest = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any], sourceRepositoryName = sourceRepositoryName.asInstanceOf[js.Any], spaceName = spaceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSourceRepositoryBranchesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSourceRepositoryBranchesRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: ListSourceRepositoryBranchesRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: ListSourceRepositoryBranchesRequestNextTokenString): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setProjectName(value: NameString): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    inline def setSourceRepositoryName(value: SourceRepositoryNameString): Self = StObject.set(x, "sourceRepositoryName", value.asInstanceOf[js.Any])
    
    inline def setSpaceName(value: NameString): Self = StObject.set(x, "spaceName", value.asInstanceOf[js.Any])
  }
}
