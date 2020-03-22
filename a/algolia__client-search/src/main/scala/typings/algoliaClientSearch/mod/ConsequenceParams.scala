package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsequenceParams extends js.Object {
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
  @scala.inline
  def apply(
    automaticFacetFilters: js.Array[AutomaticFacetFilter | String] = null,
    automaticOptionalFacetFilters: js.Array[AutomaticFacetFilter] = null,
    query: ConsequenceQuery | String = null
  ): ConsequenceParams = {
    val __obj = js.Dynamic.literal()
    if (automaticFacetFilters != null) __obj.updateDynamic("automaticFacetFilters")(automaticFacetFilters.asInstanceOf[js.Any])
    if (automaticOptionalFacetFilters != null) __obj.updateDynamic("automaticOptionalFacetFilters")(automaticOptionalFacetFilters.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsequenceParams]
  }
}

