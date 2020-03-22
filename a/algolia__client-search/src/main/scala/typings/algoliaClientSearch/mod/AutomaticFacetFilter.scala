package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutomaticFacetFilter extends js.Object {
  /**
    * Whether the filter is disjunctive (true) or conjunctive (false).
    */
  val disjunctive: js.UndefOr[Boolean] = js.undefined
  /**
    * Attribute to filter on. This must match a facet placeholder in the rule’s pattern.
    */
  val facet: String
  /**
    * Score for the filter. Typically used for optional or disjunctive filters.
    */
  val score: js.UndefOr[Double] = js.undefined
}

object AutomaticFacetFilter {
  @scala.inline
  def apply(facet: String, disjunctive: js.UndefOr[Boolean] = js.undefined, score: Int | Double = null): AutomaticFacetFilter = {
    val __obj = js.Dynamic.literal(facet = facet.asInstanceOf[js.Any])
    if (!js.isUndefined(disjunctive)) __obj.updateDynamic("disjunctive")(disjunctive.asInstanceOf[js.Any])
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutomaticFacetFilter]
  }
}

