package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStackSetOutput extends js.Object {
  /**
    * The specified stack set.
    */
  var StackSet: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.StackSet] = js.undefined
}

object DescribeStackSetOutput {
  @scala.inline
  def apply(StackSet: StackSet = null): DescribeStackSetOutput = {
    val __obj = js.Dynamic.literal()
    if (StackSet != null) __obj.updateDynamic("StackSet")(StackSet)
    __obj.asInstanceOf[DescribeStackSetOutput]
  }
}

