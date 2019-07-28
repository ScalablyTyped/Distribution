package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComplianceStringFilter extends js.Object {
  /**
    * The name of the filter.
    */
  var Key: js.UndefOr[ComplianceStringFilterKey] = js.undefined
  /**
    * The type of comparison that should be performed for the value: Equal, NotEqual, BeginWith, LessThan, or GreaterThan.
    */
  var Type: js.UndefOr[ComplianceQueryOperatorType] = js.undefined
  /**
    * The value for which to search.
    */
  var Values: js.UndefOr[ComplianceStringFilterValueList] = js.undefined
}

object ComplianceStringFilter {
  @scala.inline
  def apply(
    Key: ComplianceStringFilterKey = null,
    Type: ComplianceQueryOperatorType = null,
    Values: ComplianceStringFilterValueList = null
  ): ComplianceStringFilter = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (Values != null) __obj.updateDynamic("Values")(Values)
    __obj.asInstanceOf[ComplianceStringFilter]
  }
}

