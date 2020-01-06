package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEventsConfigurationResponse extends js.Object {
  /**
    * The events configuration details.
    */
  var EventsConfiguration: js.UndefOr[typings.awsDashSdk.clientsChimeMod.EventsConfiguration] = js.native
}

object GetEventsConfigurationResponse {
  @scala.inline
  def apply(EventsConfiguration: EventsConfiguration = null): GetEventsConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (EventsConfiguration != null) __obj.updateDynamic("EventsConfiguration")(EventsConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEventsConfigurationResponse]
  }
}

