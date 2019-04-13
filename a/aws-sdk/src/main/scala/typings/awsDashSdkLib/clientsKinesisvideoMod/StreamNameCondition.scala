package typings
package awsDashSdkLib.clientsKinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamNameCondition extends js.Object {
  /**
    * A comparison operator. Currently, you can specify only the BEGINS_WITH operator, which finds streams whose names start with a given prefix.
    */
  var ComparisonOperator: js.UndefOr[ComparisonOperator] = js.undefined
  /**
    * A value to compare.
    */
  var ComparisonValue: js.UndefOr[StreamName] = js.undefined
}

object StreamNameCondition {
  @scala.inline
  def apply(ComparisonOperator: ComparisonOperator = null, ComparisonValue: StreamName = null): StreamNameCondition = {
    val __obj = js.Dynamic.literal()
    if (ComparisonOperator != null) __obj.updateDynamic("ComparisonOperator")(ComparisonOperator.asInstanceOf[js.Any])
    if (ComparisonValue != null) __obj.updateDynamic("ComparisonValue")(ComparisonValue)
    __obj.asInstanceOf[StreamNameCondition]
  }
}

