package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStackEventsInput extends js.Object {
  /**
    * A string that identifies the next page of events that you want to retrieve.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.NextToken] = js.undefined
  /**
    * The name or the unique stack ID that is associated with the stack, which are not always interchangeable:   Running stacks: You can specify either the stack's name or its unique stack ID.   Deleted stacks: You must specify the unique stack ID.   Default: There is no default value.
    */
  var StackName: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.StackName] = js.undefined
}

object DescribeStackEventsInput {
  @scala.inline
  def apply(NextToken: NextToken = null, StackName: StackName = null): DescribeStackEventsInput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (StackName != null) __obj.updateDynamic("StackName")(StackName)
    __obj.asInstanceOf[DescribeStackEventsInput]
  }
}

