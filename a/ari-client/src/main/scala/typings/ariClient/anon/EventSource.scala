package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventSource extends js.Object {
  var applicationName: String = js.native
  var eventSource: String | js.Array[String] = js.native
}

object EventSource {
  @scala.inline
  def apply(applicationName: String, eventSource: String | js.Array[String]): EventSource = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSource]
  }
  @scala.inline
  implicit class EventSourceOps[Self <: EventSource] (val x: Self) extends AnyVal {
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
    def setApplicationName(value: String): Self = this.set("applicationName", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventSourceVarargs(value: String*): Self = this.set("eventSource", js.Array(value :_*))
    @scala.inline
    def setEventSource(value: String | js.Array[String]): Self = this.set("eventSource", value.asInstanceOf[js.Any])
  }
  
}

