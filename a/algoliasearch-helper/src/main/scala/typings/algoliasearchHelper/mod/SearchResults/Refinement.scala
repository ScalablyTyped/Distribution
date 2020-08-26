package typings.algoliasearchHelper.mod.SearchResults

import typings.algoliasearchHelper.algoliasearchHelperStrings.disjunctive
import typings.algoliasearchHelper.algoliasearchHelperStrings.exclude
import typings.algoliasearchHelper.algoliasearchHelperStrings.facet
import typings.algoliasearchHelper.algoliasearchHelperStrings.hierarchical
import typings.algoliasearchHelper.algoliasearchHelperStrings.numeric
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Refinement extends js.Object {
  var attributeName: String = js.native
  var count: Double = js.native
  var exhaustive: Boolean = js.native
  var name: String = js.native
  var numericValue: Double = js.native
  var operator: String = js.native
  var `type`: numeric | facet | exclude | disjunctive | hierarchical = js.native
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
  @scala.inline
  implicit class RefinementOps[Self <: Refinement] (val x: Self) extends AnyVal {
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
    def setAttributeName(value: String): Self = this.set("attributeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setExhaustive(value: Boolean): Self = this.set("exhaustive", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumericValue(value: Double): Self = this.set("numericValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperator(value: String): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: numeric | facet | exclude | disjunctive | hierarchical): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

