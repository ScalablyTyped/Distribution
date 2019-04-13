package typings
package awsDashSdkLib.clientsHealthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventDescription extends js.Object {
  /**
    * The most recent description of the event.
    */
  var latestDescription: js.UndefOr[eventDescription] = js.undefined
}

object EventDescription {
  @scala.inline
  def apply(latestDescription: eventDescription = null): EventDescription = {
    val __obj = js.Dynamic.literal()
    if (latestDescription != null) __obj.updateDynamic("latestDescription")(latestDescription)
    __obj.asInstanceOf[EventDescription]
  }
}

