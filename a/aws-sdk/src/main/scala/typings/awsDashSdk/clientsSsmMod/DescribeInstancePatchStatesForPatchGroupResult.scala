package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeInstancePatchStatesForPatchGroupResult extends js.Object {
  /**
    * The high-level patch state for the requested instances. 
    */
  var InstancePatchStates: js.UndefOr[InstancePatchStatesList] = js.undefined
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.undefined
}

object DescribeInstancePatchStatesForPatchGroupResult {
  @scala.inline
  def apply(InstancePatchStates: InstancePatchStatesList = null, NextToken: NextToken = null): DescribeInstancePatchStatesForPatchGroupResult = {
    val __obj = js.Dynamic.literal()
    if (InstancePatchStates != null) __obj.updateDynamic("InstancePatchStates")(InstancePatchStates)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeInstancePatchStatesForPatchGroupResult]
  }
}

