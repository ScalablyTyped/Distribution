package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEventsConfigurationResponse extends js.Object {
  /**
    * The events configuration details.
    */
  var EventsConfiguration: js.UndefOr[EventsConfiguration] = js.undefined
}

object GetEventsConfigurationResponse {
  @scala.inline
  def apply(EventsConfiguration: EventsConfiguration = null): GetEventsConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (EventsConfiguration != null) __obj.updateDynamic("EventsConfiguration")(EventsConfiguration)
    __obj.asInstanceOf[GetEventsConfigurationResponse]
  }
}

