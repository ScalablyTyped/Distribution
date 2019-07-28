package typings.awsDashSdk.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEventBusRequest extends js.Object {
  /**
    * The name of the event bus to show details for. If you omit this, the default event bus is displayed.
    */
  var Name: js.UndefOr[EventBusName] = js.undefined
}

object DescribeEventBusRequest {
  @scala.inline
  def apply(Name: EventBusName = null): DescribeEventBusRequest = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[DescribeEventBusRequest]
  }
}

