package typings
package awsDashSdkLib.clientsEventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateEventBusResponse extends js.Object {
  /**
    * The ARN of the new event bus.
    */
  var EventBusArn: js.UndefOr[String] = js.undefined
}

object CreateEventBusResponse {
  @scala.inline
  def apply(EventBusArn: String = null): CreateEventBusResponse = {
    val __obj = js.Dynamic.literal()
    if (EventBusArn != null) __obj.updateDynamic("EventBusArn")(EventBusArn)
    __obj.asInstanceOf[CreateEventBusResponse]
  }
}

