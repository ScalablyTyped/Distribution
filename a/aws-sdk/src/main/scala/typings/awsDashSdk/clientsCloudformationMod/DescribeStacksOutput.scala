package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStacksOutput extends js.Object {
  /**
    * If the output exceeds 1 MB in size, a string that identifies the next page of stacks. If no additional page exists, this value is null.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.NextToken] = js.undefined
  /**
    * A list of stack structures.
    */
  var Stacks: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.Stacks] = js.undefined
}

object DescribeStacksOutput {
  @scala.inline
  def apply(NextToken: NextToken = null, Stacks: Stacks = null): DescribeStacksOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Stacks != null) __obj.updateDynamic("Stacks")(Stacks)
    __obj.asInstanceOf[DescribeStacksOutput]
  }
}

