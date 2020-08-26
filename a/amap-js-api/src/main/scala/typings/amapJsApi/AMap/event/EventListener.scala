package typings.amapJsApi.AMap.event

import typings.amapJsApi.amapJsApiNumbers.`0`
import typings.amapJsApi.amapJsApiNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventListener[T /* <: `0` | `1` */] extends js.Object {
  var `type`: T = js.native
}

object EventListener {
  @scala.inline
  def apply[/* <: typings.amapJsApi.amapJsApiNumbers.`0` | typings.amapJsApi.amapJsApiNumbers.`1` */ T](`type`: T): EventListener[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventListener[T]]
  }
  @scala.inline
  implicit class EventListenerOps[Self <: EventListener[_], /* <: typings.amapJsApi.amapJsApiNumbers.`0` | typings.amapJsApi.amapJsApiNumbers.`1` */ T] (val x: Self with EventListener[T]) extends AnyVal {
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
    def setType(value: T): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

