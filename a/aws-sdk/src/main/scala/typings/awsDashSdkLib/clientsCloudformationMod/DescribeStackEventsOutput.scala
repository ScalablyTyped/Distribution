package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStackEventsOutput extends js.Object {
  /**
    * If the output exceeds 1 MB in size, a string that identifies the next page of events. If no additional page exists, this value is null.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * A list of StackEvents structures.
    */
  var StackEvents: js.UndefOr[StackEvents] = js.undefined
}

object DescribeStackEventsOutput {
  @scala.inline
  def apply(NextToken: NextToken = null, StackEvents: StackEvents = null): DescribeStackEventsOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (StackEvents != null) __obj.updateDynamic("StackEvents")(StackEvents)
    __obj.asInstanceOf[DescribeStackEventsOutput]
  }
}

