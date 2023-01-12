package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.anon.FacetOrdering
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
  val automaticOptionalFacetFilters: js.UndefOr[js.Array[AutomaticFacetFilter | String]] = js.undefined
  
  /**
    * When providing a string, it replaces the entire query string.
    * When providing an object, it describes incremental edits to be made to the query string (but you can’t do both).
    */
  val query: js.UndefOr[ConsequenceQuery | String] = js.undefined
  
  /**
    * Content defining how the search interface should be rendered.
    * A default value for this can be set via settings
    */
  val renderingContent: js.UndefOr[FacetOrdering] = js.undefined
}
object ConsequenceParams {
  
  inline def apply(): ConsequenceParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsequenceParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConsequenceParams] (val x: Self) extends AnyVal {
    
    inline def setAutomaticFacetFilters(value: js.Array[AutomaticFacetFilter | String]): Self = StObject.set(x, "automaticFacetFilters", value.asInstanceOf[js.Any])
    
    inline def setAutomaticFacetFiltersUndefined: Self = StObject.set(x, "automaticFacetFilters", js.undefined)
    
    inline def setAutomaticFacetFiltersVarargs(value: (AutomaticFacetFilter | String)*): Self = StObject.set(x, "automaticFacetFilters", js.Array(value*))
    
    inline def setAutomaticOptionalFacetFilters(value: js.Array[AutomaticFacetFilter | String]): Self = StObject.set(x, "automaticOptionalFacetFilters", value.asInstanceOf[js.Any])
    
    inline def setAutomaticOptionalFacetFiltersUndefined: Self = StObject.set(x, "automaticOptionalFacetFilters", js.undefined)
    
    inline def setAutomaticOptionalFacetFiltersVarargs(value: (AutomaticFacetFilter | String)*): Self = StObject.set(x, "automaticOptionalFacetFilters", js.Array(value*))
    
    inline def setQuery(value: ConsequenceQuery | String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setRenderingContent(value: FacetOrdering): Self = StObject.set(x, "renderingContent", value.asInstanceOf[js.Any])
    
    inline def setRenderingContentUndefined: Self = StObject.set(x, "renderingContent", js.undefined)
  }
}
