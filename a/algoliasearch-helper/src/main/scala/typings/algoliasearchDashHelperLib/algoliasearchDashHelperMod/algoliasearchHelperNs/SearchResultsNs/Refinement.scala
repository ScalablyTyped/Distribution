package typings
package algoliasearchDashHelperLib.algoliasearchDashHelperMod.algoliasearchHelperNs.SearchResultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Refinement extends js.Object {
  var attributeName: java.lang.String
  var count: scala.Double
  var exhaustive: scala.Boolean
  var name: java.lang.String
  var numericValue: scala.Double
  var operator: java.lang.String
  var `type`: algoliasearchDashHelperLib.algoliasearchDashHelperLibStrings.numeric | algoliasearchDashHelperLib.algoliasearchDashHelperLibStrings.facet | algoliasearchDashHelperLib.algoliasearchDashHelperLibStrings.exclude | algoliasearchDashHelperLib.algoliasearchDashHelperLibStrings.disjunctive | algoliasearchDashHelperLib.algoliasearchDashHelperLibStrings.hierarchical
}

object Refinement {
  @scala.inline
  def apply(
    attributeName: java.lang.String,
    count: scala.Double,
    exhaustive: scala.Boolean,
    name: java.lang.String,
    numericValue: scala.Double,
    operator: java.lang.String,
    `type`: algoliasearchDashHelperLib.algoliasearchDashHelperLibStrings.numeric | algoliasearchDashHelperLib.algoliasearchDashHelperLibStrings.facet | algoliasearchDashHelperLib.algoliasearchDashHelperLibStrings.exclude | algoliasearchDashHelperLib.algoliasearchDashHelperLibStrings.disjunctive | algoliasearchDashHelperLib.algoliasearchDashHelperLibStrings.hierarchical
  ): Refinement = {
    val __obj = js.Dynamic.literal(attributeName = attributeName, count = count, exhaustive = exhaustive, name = name, numericValue = numericValue, operator = operator)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Refinement]
  }
}

