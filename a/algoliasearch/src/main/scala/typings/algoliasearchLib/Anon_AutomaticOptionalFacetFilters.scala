package typings
package algoliasearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutomaticOptionalFacetFilters extends js.Object {
  /**
    * Names of facets to which automatic filtering must be applied;
    * they must match the facet name of a facet value placeholder in the query pattern.
    */
  var automaticFacetFilters: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Same as automaticFacetFilters, but for optionalFacetFilters.
    * The same syntax as query parameters can be used to specify a score: facetName<score=1>.
    */
  var automaticOptionalFacetFilters: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * When a string, it replaces the entire query string.
    * When an object, describes incremental edits to be made to the query string.
    */
  var query: js.UndefOr[java.lang.String | Anon_Remove] = js.undefined
}

