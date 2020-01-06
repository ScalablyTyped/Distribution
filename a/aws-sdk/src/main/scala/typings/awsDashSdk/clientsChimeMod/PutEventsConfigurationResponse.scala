package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutEventsConfigurationResponse extends js.Object {
  var EventsConfiguration: js.UndefOr[typings.awsDashSdk.clientsChimeMod.EventsConfiguration] = js.native
}

object PutEventsConfigurationResponse {
  @scala.inline
  def apply(EventsConfiguration: EventsConfiguration = null): PutEventsConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (EventsConfiguration != null) __obj.updateDynamic("EventsConfiguration")(EventsConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEventsConfigurationResponse]
  }
}

