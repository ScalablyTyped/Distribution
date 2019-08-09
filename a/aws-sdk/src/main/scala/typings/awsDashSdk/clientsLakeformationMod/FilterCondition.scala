package typings.awsDashSdk.clientsLakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterCondition extends js.Object {
  /**
    * The comparison operator used in the filter condition.
    */
  var ComparisonOperator: js.UndefOr[typings.awsDashSdk.clientsLakeformationMod.ComparisonOperator] = js.undefined
  /**
    * The field to filter in the filter condition.
    */
  var Field: js.UndefOr[FieldNameString] = js.undefined
  /**
    * A string with values used in evaluating the filter condition.
    */
  var StringValueList: js.UndefOr[typings.awsDashSdk.clientsLakeformationMod.StringValueList] = js.undefined
}

object FilterCondition {
  @scala.inline
  def apply(
    ComparisonOperator: ComparisonOperator = null,
    Field: FieldNameString = null,
    StringValueList: StringValueList = null
  ): FilterCondition = {
    val __obj = js.Dynamic.literal()
    if (ComparisonOperator != null) __obj.updateDynamic("ComparisonOperator")(ComparisonOperator.asInstanceOf[js.Any])
    if (Field != null) __obj.updateDynamic("Field")(Field.asInstanceOf[js.Any])
    if (StringValueList != null) __obj.updateDynamic("StringValueList")(StringValueList)
    __obj.asInstanceOf[FilterCondition]
  }
}

