package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogEvent extends js.Object {
  /**
    * The timestamp when the database log event was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.undefined
  /**
    * The message of the database log event.
    */
  var message: js.UndefOr[String] = js.undefined
}

object LogEvent {
  @scala.inline
  def apply(createdAt: IsoDate = null, message: String = null): LogEvent = {
    val __obj = js.Dynamic.literal()
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[LogEvent]
  }
}

