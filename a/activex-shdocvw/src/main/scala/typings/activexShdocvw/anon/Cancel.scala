package typings.activexShdocvw.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cancel extends js.Object {
  var Cancel: Boolean = js.native
  val Frame: js.Any = js.native
  val StatusCode: js.Any = js.native
  val URL: js.Any = js.native
  val pDisp: js.Any = js.native
}

object Cancel {
  @scala.inline
  def apply(Cancel: Boolean, Frame: js.Any, StatusCode: js.Any, URL: js.Any, pDisp: js.Any): Cancel = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Frame = Frame.asInstanceOf[js.Any], StatusCode = StatusCode.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], pDisp = pDisp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancel]
  }
  @scala.inline
  implicit class CancelOps[Self <: Cancel] (val x: Self) extends AnyVal {
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
    def setCancel(value: Boolean): Self = this.set("Cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrame(value: js.Any): Self = this.set("Frame", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusCode(value: js.Any): Self = this.set("StatusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setURL(value: js.Any): Self = this.set("URL", value.asInstanceOf[js.Any])
    @scala.inline
    def setPDisp(value: js.Any): Self = this.set("pDisp", value.asInstanceOf[js.Any])
  }
  
}

