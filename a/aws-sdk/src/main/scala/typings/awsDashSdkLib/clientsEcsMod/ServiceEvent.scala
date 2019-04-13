package typings
package awsDashSdkLib.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceEvent extends js.Object {
  /**
    * The Unix timestamp for when the event was triggered.
    */
  var createdAt: js.UndefOr[Timestamp] = js.undefined
  /**
    * The ID string of the event.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The event message.
    */
  var message: js.UndefOr[String] = js.undefined
}

object ServiceEvent {
  @scala.inline
  def apply(createdAt: Timestamp = null, id: String = null, message: String = null): ServiceEvent = {
    val __obj = js.Dynamic.literal()
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (id != null) __obj.updateDynamic("id")(id)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[ServiceEvent]
  }
}

