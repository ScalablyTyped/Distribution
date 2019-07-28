package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventsMessage extends js.Object {
  /**
    * A list of events. Each element in the list contains detailed information about one event.
    */
  var Events: js.UndefOr[EventList] = js.undefined
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.undefined
}

object EventsMessage {
  @scala.inline
  def apply(Events: EventList = null, Marker: String = null): EventsMessage = {
    val __obj = js.Dynamic.literal()
    if (Events != null) __obj.updateDynamic("Events")(Events)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[EventsMessage]
  }
}

