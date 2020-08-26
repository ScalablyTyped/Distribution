package typings.abortController.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventAttributes extends js.Object {
  var onabort: js.Any = js.native
}

object EventAttributes {
  @scala.inline
  def apply(onabort: js.Any): EventAttributes = {
    val __obj = js.Dynamic.literal(onabort = onabort.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventAttributes]
  }
  @scala.inline
  implicit class EventAttributesOps[Self <: EventAttributes] (val x: Self) extends AnyVal {
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
    def setOnabort(value: js.Any): Self = this.set("onabort", value.asInstanceOf[js.Any])
  }
  
}

