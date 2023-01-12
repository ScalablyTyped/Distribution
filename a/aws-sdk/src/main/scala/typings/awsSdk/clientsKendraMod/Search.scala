package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Search extends StObject {
  
  /**
    * Determines whether the field is returned in the query response. The default is true.
    */
  var Displayable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates that the field can be used to create search facets, a count of results for each value in the field. The default is false .
    */
  var Facetable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines whether the field is used in the search. If the Searchable field is true, you can use relevance tuning to manually tune how Amazon Kendra weights the field in the search. The default is true for string fields and false for number and date fields.
    */
  var Searchable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines whether the field can be used to sort the results of a query. If you specify sorting on a field that does not have Sortable set to true, Amazon Kendra returns an exception. The default is false.
    */
  var Sortable: js.UndefOr[Boolean] = js.undefined
}
object Search {
  
  inline def apply(): Search = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Search]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Search] (val x: Self) extends AnyVal {
    
    inline def setDisplayable(value: Boolean): Self = StObject.set(x, "Displayable", value.asInstanceOf[js.Any])
    
    inline def setDisplayableUndefined: Self = StObject.set(x, "Displayable", js.undefined)
    
    inline def setFacetable(value: Boolean): Self = StObject.set(x, "Facetable", value.asInstanceOf[js.Any])
    
    inline def setFacetableUndefined: Self = StObject.set(x, "Facetable", js.undefined)
    
    inline def setSearchable(value: Boolean): Self = StObject.set(x, "Searchable", value.asInstanceOf[js.Any])
    
    inline def setSearchableUndefined: Self = StObject.set(x, "Searchable", js.undefined)
    
    inline def setSortable(value: Boolean): Self = StObject.set(x, "Sortable", value.asInstanceOf[js.Any])
    
    inline def setSortableUndefined: Self = StObject.set(x, "Sortable", js.undefined)
  }
}
