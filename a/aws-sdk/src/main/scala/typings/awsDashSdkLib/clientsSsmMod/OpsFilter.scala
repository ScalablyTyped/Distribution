package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpsFilter extends js.Object {
  /**
    * The name of the filter.
    */
  var Key: OpsFilterKey
  /**
    * The type of filter.
    */
  var Type: js.UndefOr[OpsFilterOperatorType] = js.undefined
  /**
    * The filter value.
    */
  var Values: OpsFilterValueList
}

object OpsFilter {
  @scala.inline
  def apply(Key: OpsFilterKey, Values: OpsFilterValueList, Type: OpsFilterOperatorType = null): OpsFilter = {
    val __obj = js.Dynamic.literal(Key = Key, Values = Values)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpsFilter]
  }
}

