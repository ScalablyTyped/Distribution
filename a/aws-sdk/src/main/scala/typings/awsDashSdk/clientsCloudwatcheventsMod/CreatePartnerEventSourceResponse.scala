package typings.awsDashSdk.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePartnerEventSourceResponse extends js.Object {
  /**
    * The ARN of the partner event source.
    */
  var EventSourceArn: js.UndefOr[String] = js.native
}

object CreatePartnerEventSourceResponse {
  @scala.inline
  def apply(EventSourceArn: String = null): CreatePartnerEventSourceResponse = {
    val __obj = js.Dynamic.literal()
    if (EventSourceArn != null) __obj.updateDynamic("EventSourceArn")(EventSourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePartnerEventSourceResponse]
  }
}

