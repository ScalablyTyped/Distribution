package typings.activexShdocvw.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusBar extends js.Object {
  val StatusBar: Boolean = js.native
}

object StatusBar {
  @scala.inline
  def apply(StatusBar: Boolean): StatusBar = {
    val __obj = js.Dynamic.literal(StatusBar = StatusBar.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusBar]
  }
  @scala.inline
  implicit class StatusBarOps[Self <: StatusBar] (val x: Self) extends AnyVal {
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
    def setStatusBar(value: Boolean): Self = this.set("StatusBar", value.asInstanceOf[js.Any])
  }
  
}

