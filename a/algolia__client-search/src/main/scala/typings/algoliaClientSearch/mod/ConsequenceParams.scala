package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsequenceParams extends js.Object {
  
  /**
    * Names of facets to which automatic filtering must be applied; they must match the facet name of a facet value placeholder in the query pattern.
    */
  val automaticFacetFilters: js.UndefOr[js.Array[AutomaticFacetFilter | String]] = js.native
  
  /**
    * Same syntax as automaticFacetFilters, but the engine treats the filters as optional.
    * Behaves like optionalFilters.
    */
  val automaticOptionalFacetFilters: js.UndefOr[js.Array[AutomaticFacetFilter]] = js.native
  
  /**
    * When providing a string, it replaces the entire query string.
    * When providing an object, it describes incremental edits to be made to the query string (but you can’t do both).
    */
  val query: js.UndefOr[ConsequenceQuery | String] = js.native
}
object ConsequenceParams {
  
  @scala.inline
  def apply(): ConsequenceParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsequenceParams]
  }
  
  @scala.inline
  implicit class ConsequenceParamsOps[Self <: ConsequenceParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutomaticFacetFiltersVarargs(value: (AutomaticFacetFilter | String)*): Self = this.set("automaticFacetFilters", js.Array(value :_*))
    
    @scala.inline
    def setAutomaticFacetFilters(value: js.Array[AutomaticFacetFilter | String]): Self = this.set("automaticFacetFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomaticFacetFilters: Self = this.set("automaticFacetFilters", js.undefined)
    
    @scala.inline
    def setAutomaticOptionalFacetFiltersVarargs(value: AutomaticFacetFilter*): Self = this.set("automaticOptionalFacetFilters", js.Array(value :_*))
    
    @scala.inline
    def setAutomaticOptionalFacetFilters(value: js.Array[AutomaticFacetFilter]): Self = this.set("automaticOptionalFacetFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomaticOptionalFacetFilters: Self = this.set("automaticOptionalFacetFilters", js.undefined)
    
    @scala.inline
    def setQuery(value: ConsequenceQuery | String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
  }
}
