package typings.activexInfopath.anon

import typings.activexInfopath.InfoPath.Window
import typings.activexInfopath.InfoPath._XDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PWindow extends js.Object {
  val pDocument: _XDocument = js.native
  val pWindow: Window = js.native
}

object PWindow {
  @scala.inline
  def apply(pDocument: _XDocument, pWindow: Window): PWindow = {
    val __obj = js.Dynamic.literal(pDocument = pDocument.asInstanceOf[js.Any], pWindow = pWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[PWindow]
  }
  @scala.inline
  implicit class PWindowOps[Self <: PWindow] (val x: Self) extends AnyVal {
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
    def setPDocument(value: _XDocument): Self = this.set("pDocument", value.asInstanceOf[js.Any])
    @scala.inline
    def setPWindow(value: Window): Self = this.set("pWindow", value.asInstanceOf[js.Any])
  }
  
}

