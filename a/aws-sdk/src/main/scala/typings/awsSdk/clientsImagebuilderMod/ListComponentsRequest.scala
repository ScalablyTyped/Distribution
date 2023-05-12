package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListComponentsRequest extends StObject {
  
  /**
    * Returns the list of components for the specified name.
    */
  var byName: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Use the following filters to streamline results:    description     name     platform     supportedOsVersion     type     version   
    */
  var filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The maximum items to return in a request.
    */
  var maxResults: js.UndefOr[RestrictedInteger] = js.undefined
  
  /**
    * A token to specify where to start paginating. This is the NextToken from a previously truncated response.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * Filters results based on the type of owner for the component. By default, this request returns a list of components that your account owns. To see results for other types of owners, you can specify components that Amazon manages, third party components, or components that other accounts have shared with you.
    */
  var owner: js.UndefOr[Ownership] = js.undefined
}
object ListComponentsRequest {
  
  inline def apply(): ListComponentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListComponentsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListComponentsRequest] (val x: Self) extends AnyVal {
    
    inline def setByName(value: Boolean): Self = StObject.set(x, "byName", value.asInstanceOf[js.Any])
    
    inline def setByNameUndefined: Self = StObject.set(x, "byName", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setMaxResults(value: RestrictedInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setOwner(value: Ownership): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
