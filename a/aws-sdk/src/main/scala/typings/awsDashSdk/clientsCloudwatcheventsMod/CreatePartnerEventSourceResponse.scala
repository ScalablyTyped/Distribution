package typings.awsDashSdk.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePartnerEventSourceResponse extends js.Object {
  /**
    * The ARN of the partner event source.
    */
  var EventSourceArn: js.UndefOr[String] = js.undefined
}

object CreatePartnerEventSourceResponse {
  @scala.inline
  def apply(EventSourceArn: String = null): CreatePartnerEventSourceResponse = {
    val __obj = js.Dynamic.literal()
    if (EventSourceArn != null) __obj.updateDynamic("EventSourceArn")(EventSourceArn)
    __obj.asInstanceOf[CreatePartnerEventSourceResponse]
  }
}

