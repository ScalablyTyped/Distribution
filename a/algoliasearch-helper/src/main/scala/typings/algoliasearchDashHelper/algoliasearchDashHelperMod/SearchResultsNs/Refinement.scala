package typings.algoliasearchDashHelper.algoliasearchDashHelperMod.SearchResultsNs

import typings.algoliasearchDashHelper.algoliasearchDashHelperStrings.disjunctive
import typings.algoliasearchDashHelper.algoliasearchDashHelperStrings.exclude
import typings.algoliasearchDashHelper.algoliasearchDashHelperStrings.facet
import typings.algoliasearchDashHelper.algoliasearchDashHelperStrings.hierarchical
import typings.algoliasearchDashHelper.algoliasearchDashHelperStrings.numeric
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Refinement extends js.Object {
  var attributeName: String
  var count: Double
  var exhaustive: Boolean
  var name: String
  var numericValue: Double
  var operator: String
  var `type`: numeric | facet | exclude | disjunctive | hierarchical
}

object Refinement {
  @scala.inline
  def apply(
    attributeName: String,
    count: Double,
    exhaustive: Boolean,
    name: String,
    numericValue: Double,
    operator: String,
    `type`: numeric | facet | exclude | disjunctive | hierarchical
  ): Refinement = {
    val __obj = js.Dynamic.literal(attributeName = attributeName, count = count, exhaustive = exhaustive, name = name, numericValue = numericValue, operator = operator)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Refinement]
  }
}

