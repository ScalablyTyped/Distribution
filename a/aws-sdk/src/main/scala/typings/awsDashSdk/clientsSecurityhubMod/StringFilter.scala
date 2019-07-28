package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringFilter extends js.Object {
  /**
    * The condition to be applied to a string value when querying for findings. 
    */
  var Comparison: js.UndefOr[StringFilterComparison] = js.undefined
  /**
    * The string filter value.
    */
  var Value: js.UndefOr[NonEmptyString] = js.undefined
}

object StringFilter {
  @scala.inline
  def apply(Comparison: StringFilterComparison = null, Value: NonEmptyString = null): StringFilter = {
    val __obj = js.Dynamic.literal()
    if (Comparison != null) __obj.updateDynamic("Comparison")(Comparison.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[StringFilter]
  }
}

