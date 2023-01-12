package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImagesRequest extends StObject {
  
  /**
    * Requests a list of images with a specific recipe name.
    */
  var byName: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Use the following filters to streamline results:    name     osVersion     platform     type     version   
    */
  var filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * Includes deprecated images in the response list.
    */
  var includeDeprecated: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * The maximum items to return in a request.
    */
  var maxResults: js.UndefOr[RestrictedInteger] = js.undefined
  
  /**
    * A token to specify where to start paginating. This is the NextToken from a previously truncated response.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The owner defines which images you want to list. By default, this request will only show images owned by your account. You can use this field to specify if you want to view images owned by yourself, by Amazon, or those images that have been shared with you by other customers.
    */
  var owner: js.UndefOr[Ownership] = js.undefined
}
object ListImagesRequest {
  
  inline def apply(): ListImagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImagesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListImagesRequest] (val x: Self) extends AnyVal {
    
    inline def setByName(value: Boolean): Self = StObject.set(x, "byName", value.asInstanceOf[js.Any])
    
    inline def setByNameUndefined: Self = StObject.set(x, "byName", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setIncludeDeprecated(value: NullableBoolean): Self = StObject.set(x, "includeDeprecated", value.asInstanceOf[js.Any])
    
    inline def setIncludeDeprecatedUndefined: Self = StObject.set(x, "includeDeprecated", js.undefined)
    
    inline def setMaxResults(value: RestrictedInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setOwner(value: Ownership): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
