package typings.activexOutlook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewView extends js.Object {
  val View: typings.activexOutlook.Outlook.View = js.native
}

object ViewView {
  @scala.inline
  def apply(View: typings.activexOutlook.Outlook.View): ViewView = {
    val __obj = js.Dynamic.literal(View = View.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewView]
  }
  @scala.inline
  implicit class ViewViewOps[Self <: ViewView] (val x: Self) extends AnyVal {
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
    def setView(value: typings.activexOutlook.Outlook.View): Self = this.set("View", value.asInstanceOf[js.Any])
  }
  
}

