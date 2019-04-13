package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeInstancePatchStatesResult extends js.Object {
  /**
    * The high-level patch state for the requested instances.
    */
  var InstancePatchStates: js.UndefOr[InstancePatchStateList] = js.undefined
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeInstancePatchStatesResult {
  @scala.inline
  def apply(InstancePatchStates: InstancePatchStateList = null, NextToken: NextToken = null): DescribeInstancePatchStatesResult = {
    val __obj = js.Dynamic.literal()
    if (InstancePatchStates != null) __obj.updateDynamic("InstancePatchStates")(InstancePatchStates)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeInstancePatchStatesResult]
  }
}

