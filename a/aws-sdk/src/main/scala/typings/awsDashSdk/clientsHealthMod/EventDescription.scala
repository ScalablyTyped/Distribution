package typings.awsDashSdk.clientsHealthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventDescription extends js.Object {
  /**
    * The most recent description of the event.
    */
  var latestDescription: js.UndefOr[eventDescription] = js.native
}

object EventDescription {
  @scala.inline
  def apply(latestDescription: eventDescription = null): EventDescription = {
    val __obj = js.Dynamic.literal()
    if (latestDescription != null) __obj.updateDynamic("latestDescription")(latestDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventDescription]
  }
}

