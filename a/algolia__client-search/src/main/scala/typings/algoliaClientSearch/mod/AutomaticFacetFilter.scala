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
  def apply(
    facet: String,
    disjunctive: js.UndefOr[Boolean] = js.undefined,
    score: js.UndefOr[Double] = js.undefined
  ): AutomaticFacetFilter = {
    val __obj = js.Dynamic.literal(facet = facet.asInstanceOf[js.Any])
    if (!js.isUndefined(disjunctive)) __obj.updateDynamic("disjunctive")(disjunctive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(score)) __obj.updateDynamic("score")(score.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutomaticFacetFilter]
  }
}

