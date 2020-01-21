package typings.algoliasearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutomaticFacetFilters extends js.Object {
  /**
    * Names of facets to which automatic filtering must be applied;
    * they must match the facet name of a facet value placeholder in the query pattern.
    */
  var automaticFacetFilters: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Same as automaticFacetFilters, but for optionalFacetFilters.
    * The same syntax as query parameters can be used to specify a score: facetName<score=1>.
    */
  var automaticOptionalFacetFilters: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * When a string, it replaces the entire query string.
    * When an object, describes incremental edits to be made to the query string.
    */
  var query: js.UndefOr[String | AnonRemove] = js.undefined
}

object AnonAutomaticFacetFilters {
  @scala.inline
  def apply(
    automaticFacetFilters: js.Array[String] = null,
    automaticOptionalFacetFilters: js.Array[String] = null,
    query: String | AnonRemove = null
  ): AnonAutomaticFacetFilters = {
    val __obj = js.Dynamic.literal()
    if (automaticFacetFilters != null) __obj.updateDynamic("automaticFacetFilters")(automaticFacetFilters.asInstanceOf[js.Any])
    if (automaticOptionalFacetFilters != null) __obj.updateDynamic("automaticOptionalFacetFilters")(automaticOptionalFacetFilters.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutomaticFacetFilters]
  }
}

