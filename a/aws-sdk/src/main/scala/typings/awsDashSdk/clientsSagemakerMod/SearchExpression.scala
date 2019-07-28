package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchExpression extends js.Object {
  /**
    * A list of filter objects.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  /**
    * A list of nested filter objects.
    */
  var NestedFilters: js.UndefOr[NestedFiltersList] = js.undefined
  /**
    * A Boolean operator used to evaluate the search expression. If you want every conditional statement in all lists to be satisfied for the entire search expression to be true, specify And. If only a single conditional statement needs to be true for the entire search expression to be true, specify Or. The default value is And.
    */
  var Operator: js.UndefOr[BooleanOperator] = js.undefined
  /**
    * A list of search expression objects.
    */
  var SubExpressions: js.UndefOr[SearchExpressionList] = js.undefined
}

object SearchExpression {
  @scala.inline
  def apply(
    Filters: FilterList = null,
    NestedFilters: NestedFiltersList = null,
    Operator: BooleanOperator = null,
    SubExpressions: SearchExpressionList = null
  ): SearchExpression = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (NestedFilters != null) __obj.updateDynamic("NestedFilters")(NestedFilters)
    if (Operator != null) __obj.updateDynamic("Operator")(Operator.asInstanceOf[js.Any])
    if (SubExpressions != null) __obj.updateDynamic("SubExpressions")(SubExpressions)
    __obj.asInstanceOf[SearchExpression]
  }
}

