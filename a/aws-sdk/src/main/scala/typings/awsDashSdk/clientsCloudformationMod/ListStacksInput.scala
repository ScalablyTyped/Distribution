package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListStacksInput extends js.Object {
  /**
    * A string that identifies the next page of stacks that you want to retrieve.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.NextToken] = js.undefined
  /**
    * Stack status to use as a filter. Specify one or more stack status codes to list only stacks with the specified status codes. For a complete list of stack status codes, see the StackStatus parameter of the Stack data type.
    */
  var StackStatusFilter: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.StackStatusFilter] = js.undefined
}

object ListStacksInput {
  @scala.inline
  def apply(NextToken: NextToken = null, StackStatusFilter: StackStatusFilter = null): ListStacksInput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (StackStatusFilter != null) __obj.updateDynamic("StackStatusFilter")(StackStatusFilter)
    __obj.asInstanceOf[ListStacksInput]
  }
}

