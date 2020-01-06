package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStackInstanceOutput extends js.Object {
  /**
    * The stack instance that matches the specified request parameters.
    */
  var StackInstance: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.StackInstance] = js.native
}

object DescribeStackInstanceOutput {
  @scala.inline
  def apply(StackInstance: StackInstance = null): DescribeStackInstanceOutput = {
    val __obj = js.Dynamic.literal()
    if (StackInstance != null) __obj.updateDynamic("StackInstance")(StackInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStackInstanceOutput]
  }
}

