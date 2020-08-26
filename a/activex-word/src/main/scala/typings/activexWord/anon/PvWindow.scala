package typings.activexWord.anon

import typings.activexWord.Word.ProtectedViewWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PvWindow extends js.Object {
  val PvWindow: ProtectedViewWindow = js.native
}

object PvWindow {
  @scala.inline
  def apply(PvWindow: ProtectedViewWindow): PvWindow = {
    val __obj = js.Dynamic.literal(PvWindow = PvWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[PvWindow]
  }
  @scala.inline
  implicit class PvWindowOps[Self <: PvWindow] (val x: Self) extends AnyVal {
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
    def setPvWindow(value: ProtectedViewWindow): Self = this.set("PvWindow", value.asInstanceOf[js.Any])
  }
  
}

