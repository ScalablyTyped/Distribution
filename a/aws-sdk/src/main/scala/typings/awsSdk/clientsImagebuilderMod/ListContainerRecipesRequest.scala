package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListContainerRecipesRequest extends StObject {
  
  /**
    * Use the following filters to streamline results:    containerType     name     parentImage     platform   
    */
  var filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The maximum items to return in a request.
    */
  var maxResults: js.UndefOr[RestrictedInteger] = js.undefined
  
  /**
    * A token to specify where to start paginating. This is the NextToken from a previously truncated response.
    */
  var nextToken: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Returns container recipes belonging to the specified owner, that have been shared with you. You can omit this field to return container recipes belonging to your account.
    */
  var owner: js.UndefOr[Ownership] = js.undefined
}
object ListContainerRecipesRequest {
  
  inline def apply(): ListContainerRecipesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListContainerRecipesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListContainerRecipesRequest] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setMaxResults(value: RestrictedInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NonEmptyString): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setOwner(value: Ownership): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
