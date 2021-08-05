package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsequenceParams extends StObject {
  
  /**
    * Names of facets to which automatic filtering must be applied; they must match the facet name of a facet value placeholder in the query pattern.
    */
  val automaticFacetFilters: js.UndefOr[js.Array[AutomaticFacetFilter | String]] = js.undefined
  
  /**
    * Same syntax as automaticFacetFilters, but the engine treats the filters as optional.
    * Behaves like optionalFilters.
    */
  val automaticOptionalFacetFilters: js.UndefOr[js.Array[AutomaticFacetFilter]] = js.undefined
  
  /**
    * When providing a string, it replaces the entire query string.
    * When providing an object, it describes incremental edits to be made to the query string (but you can’t do both).
    */
  val query: js.UndefOr[ConsequenceQuery | String] = js.undefined
}
object ConsequenceParams {
  
  inline def apply(): ConsequenceParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsequenceParams]
  }
  
  extension [Self <: ConsequenceParams](x: Self) {
    
    inline def setAutomaticFacetFilters(value: js.Array[AutomaticFacetFilter | String]): Self = StObject.set(x, "automaticFacetFilters", value.asInstanceOf[js.Any])
    
    inline def setAutomaticFacetFiltersUndefined: Self = StObject.set(x, "automaticFacetFilters", js.undefined)
    
    inline def setAutomaticFacetFiltersVarargs(value: (AutomaticFacetFilter | String)*): Self = StObject.set(x, "automaticFacetFilters", js.Array(value :_*))
    
    inline def setAutomaticOptionalFacetFilters(value: js.Array[AutomaticFacetFilter]): Self = StObject.set(x, "automaticOptionalFacetFilters", value.asInstanceOf[js.Any])
    
    inline def setAutomaticOptionalFacetFiltersUndefined: Self = StObject.set(x, "automaticOptionalFacetFilters", js.undefined)
    
    inline def setAutomaticOptionalFacetFiltersVarargs(value: AutomaticFacetFilter*): Self = StObject.set(x, "automaticOptionalFacetFilters", js.Array(value :_*))
    
    inline def setQuery(value: ConsequenceQuery | String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
