package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStackResourcesOutput extends js.Object {
  /**
    * A list of StackResource structures.
    */
  var StackResources: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.StackResources] = js.native
}

object DescribeStackResourcesOutput {
  @scala.inline
  def apply(StackResources: StackResources = null): DescribeStackResourcesOutput = {
    val __obj = js.Dynamic.literal()
    if (StackResources != null) __obj.updateDynamic("StackResources")(StackResources.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStackResourcesOutput]
  }
}

