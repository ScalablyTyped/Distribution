package typings.algoliasearchHelper.mod.SearchResults

import typings.algoliasearchHelper.algoliasearchHelperStrings.disjunctive
import typings.algoliasearchHelper.algoliasearchHelperStrings.exclude
import typings.algoliasearchHelper.algoliasearchHelperStrings.facet
import typings.algoliasearchHelper.algoliasearchHelperStrings.hierarchical
import typings.algoliasearchHelper.algoliasearchHelperStrings.numeric
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
    val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], exhaustive = exhaustive.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], numericValue = numericValue.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Refinement]
  }
}

