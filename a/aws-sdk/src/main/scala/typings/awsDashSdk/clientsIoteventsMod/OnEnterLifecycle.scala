package typings.awsDashSdk.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnEnterLifecycle extends js.Object {
  /**
    * Specifies the actions that are performed when the state is entered and the "condition" is TRUE.
    */
  var events: js.UndefOr[Events] = js.native
}

object OnEnterLifecycle {
  @scala.inline
  def apply(events: Events = null): OnEnterLifecycle = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnEnterLifecycle]
  }
}

