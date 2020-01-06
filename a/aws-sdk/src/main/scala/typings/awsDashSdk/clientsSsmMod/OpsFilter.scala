package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpsFilter extends js.Object {
  /**
    * The name of the filter.
    */
  var Key: OpsFilterKey = js.native
  /**
    * The type of filter.
    */
  var Type: js.UndefOr[OpsFilterOperatorType] = js.native
  /**
    * The filter value.
    */
  var Values: OpsFilterValueList = js.native
}

object OpsFilter {
  @scala.inline
  def apply(Key: OpsFilterKey, Values: OpsFilterValueList, Type: OpsFilterOperatorType = null): OpsFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpsFilter]
  }
}

