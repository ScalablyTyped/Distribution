package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStackResourceOutput extends js.Object {
  /**
    * A StackResourceDetail structure containing the description of the specified resource in the specified stack.
    */
  var StackResourceDetail: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.StackResourceDetail] = js.undefined
}

object DescribeStackResourceOutput {
  @scala.inline
  def apply(StackResourceDetail: StackResourceDetail = null): DescribeStackResourceOutput = {
    val __obj = js.Dynamic.literal()
    if (StackResourceDetail != null) __obj.updateDynamic("StackResourceDetail")(StackResourceDetail)
    __obj.asInstanceOf[DescribeStackResourceOutput]
  }
}

