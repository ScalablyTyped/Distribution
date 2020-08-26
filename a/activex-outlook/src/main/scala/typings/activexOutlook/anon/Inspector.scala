package typings.activexOutlook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Inspector extends js.Object {
  val Inspector: typings.activexOutlook.Outlook.Inspector = js.native
}

object Inspector {
  @scala.inline
  def apply(Inspector: typings.activexOutlook.Outlook.Inspector): Inspector = {
    val __obj = js.Dynamic.literal(Inspector = Inspector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inspector]
  }
  @scala.inline
  implicit class InspectorOps[Self <: Inspector] (val x: Self) extends AnyVal {
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
    def setInspector(value: typings.activexOutlook.Outlook.Inspector): Self = this.set("Inspector", value.asInstanceOf[js.Any])
  }
  
}

