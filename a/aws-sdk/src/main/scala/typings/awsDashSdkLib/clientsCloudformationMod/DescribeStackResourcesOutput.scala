package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStackResourcesOutput extends js.Object {
  /**
    * A list of StackResource structures.
    */
  var StackResources: js.UndefOr[StackResources] = js.undefined
}

object DescribeStackResourcesOutput {
  @scala.inline
  def apply(StackResources: StackResources = null): DescribeStackResourcesOutput = {
    val __obj = js.Dynamic.literal()
    if (StackResources != null) __obj.updateDynamic("StackResources")(StackResources)
    __obj.asInstanceOf[DescribeStackResourcesOutput]
  }
}

