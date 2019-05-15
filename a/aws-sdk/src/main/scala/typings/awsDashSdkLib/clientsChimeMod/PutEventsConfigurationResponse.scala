package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutEventsConfigurationResponse extends js.Object {
  var EventsConfiguration: js.UndefOr[EventsConfiguration] = js.undefined
}

object PutEventsConfigurationResponse {
  @scala.inline
  def apply(EventsConfiguration: EventsConfiguration = null): PutEventsConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (EventsConfiguration != null) __obj.updateDynamic("EventsConfiguration")(EventsConfiguration)
    __obj.asInstanceOf[PutEventsConfigurationResponse]
  }
}

