package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasGradient extends js.Object {
  @JSName("MSHTML.CanvasGradient_typekey")
  var MSHTMLDotCanvasGradient_typekey: CanvasGradient = js.native
  def addColorStop(offset: Double, color: String): Unit = js.native
}

object CanvasGradient {
  @scala.inline
  def apply(MSHTMLDotCanvasGradient_typekey: CanvasGradient, addColorStop: (Double, String) => Unit): CanvasGradient = {
    val __obj = js.Dynamic.literal(addColorStop = js.Any.fromFunction2(addColorStop))
    __obj.updateDynamic("MSHTML.CanvasGradient_typekey")(MSHTMLDotCanvasGradient_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasGradient]
  }
  @scala.inline
  implicit class CanvasGradientOps[Self <: CanvasGradient] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotCanvasGradient_typekey(value: CanvasGradient): Self = this.set("MSHTML.CanvasGradient_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddColorStop(value: (Double, String) => Unit): Self = this.set("addColorStop", js.Any.fromFunction2(value))
  }
  
}

