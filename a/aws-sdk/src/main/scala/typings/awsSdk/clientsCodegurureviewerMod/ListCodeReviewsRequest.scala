package typings.awsSdk.clientsCodegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCodeReviewsRequest extends StObject {
  
  /**
    * The maximum number of results that are returned per call. The default is 100.
    */
  var MaxResults: js.UndefOr[ListCodeReviewsMaxResults] = js.undefined
  
  /**
    * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.NextToken] = js.undefined
  
  /**
    * List of provider types for filtering that needs to be applied before displaying the result. For example, providerTypes=[GitHub] lists code reviews from GitHub.
    */
  var ProviderTypes: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.ProviderTypes] = js.undefined
  
  /**
    * List of repository names for filtering that needs to be applied before displaying the result.
    */
  var RepositoryNames: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.RepositoryNames] = js.undefined
  
  /**
    * List of states for filtering that needs to be applied before displaying the result. For example, states=[Pending] lists code reviews in the Pending state. The valid code review states are:    Completed: The code review is complete.    Pending: The code review started and has not completed or failed.    Failed: The code review failed.    Deleting: The code review is being deleted.  
    */
  var States: js.UndefOr[JobStates] = js.undefined
  
  /**
    * The type of code reviews to list in the response.
    */
  var Type: typings.awsSdk.clientsCodegurureviewerMod.Type
}
object ListCodeReviewsRequest {
  
  inline def apply(Type: Type): ListCodeReviewsRequest = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCodeReviewsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListCodeReviewsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: ListCodeReviewsMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setProviderTypes(value: ProviderTypes): Self = StObject.set(x, "ProviderTypes", value.asInstanceOf[js.Any])
    
    inline def setProviderTypesUndefined: Self = StObject.set(x, "ProviderTypes", js.undefined)
    
    inline def setProviderTypesVarargs(value: ProviderType*): Self = StObject.set(x, "ProviderTypes", js.Array(value*))
    
    inline def setRepositoryNames(value: RepositoryNames): Self = StObject.set(x, "RepositoryNames", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNamesUndefined: Self = StObject.set(x, "RepositoryNames", js.undefined)
    
    inline def setRepositoryNamesVarargs(value: Name*): Self = StObject.set(x, "RepositoryNames", js.Array(value*))
    
    inline def setStates(value: JobStates): Self = StObject.set(x, "States", value.asInstanceOf[js.Any])
    
    inline def setStatesUndefined: Self = StObject.set(x, "States", js.undefined)
    
    inline def setStatesVarargs(value: JobState*): Self = StObject.set(x, "States", js.Array(value*))
    
    inline def setType(value: Type): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
