package typings.amapJsApi.AMap.LabelsLayer

import typings.amapJsApi.anon.Icon
import typings.amapJsApi.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventData extends js.Object {
  var data: Id = js.native
  var opts: Icon = js.native
}

object EventData {
  @scala.inline
  def apply(data: Id, opts: Icon): EventData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventData]
  }
  @scala.inline
  implicit class EventDataOps[Self <: EventData] (val x: Self) extends AnyVal {
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
    def setData(value: Id): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpts(value: Icon): Self = this.set("opts", value.asInstanceOf[js.Any])
  }
  
}

