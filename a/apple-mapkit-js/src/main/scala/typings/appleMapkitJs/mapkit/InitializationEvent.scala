package typings.appleMapkitJs.mapkit

import typings.appleMapkitJs.appleMapkitJsStrings.Initialized
import typings.appleMapkitJs.appleMapkitJsStrings.Refreshed
import typings.appleMapkitJs.appleMapkitJsStrings.Unauthorized
import typings.appleMapkitJs.appleMapkitJsStrings.`Too Many Requests`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitializationEvent extends js.Object {
  var status: Initialized | Refreshed | Unauthorized | (`Too Many Requests`) = js.native
}

object InitializationEvent {
  @scala.inline
  def apply(status: Initialized | Refreshed | Unauthorized | (`Too Many Requests`)): InitializationEvent = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitializationEvent]
  }
  @scala.inline
  implicit class InitializationEventOps[Self <: InitializationEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStatus(value: Initialized | Refreshed | Unauthorized | (`Too Many Requests`)): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

