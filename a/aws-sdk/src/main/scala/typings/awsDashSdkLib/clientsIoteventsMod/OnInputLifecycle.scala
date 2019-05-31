package typings
package awsDashSdkLib.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnInputLifecycle extends js.Object {
  /**
    * Specifies the actions performed when the condition evaluates to TRUE.
    */
  var events: js.UndefOr[Events] = js.undefined
  /**
    * Specifies the actions performed and the next state entered when a condition evaluates to TRUE.
    */
  var transitionEvents: js.UndefOr[TransitionEvents] = js.undefined
}

object OnInputLifecycle {
  @scala.inline
  def apply(events: Events = null, transitionEvents: TransitionEvents = null): OnInputLifecycle = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events)
    if (transitionEvents != null) __obj.updateDynamic("transitionEvents")(transitionEvents)
    __obj.asInstanceOf[OnInputLifecycle]
  }
}

