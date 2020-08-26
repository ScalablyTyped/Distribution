package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICanvasGradient extends js.Object {
  @JSName("MSHTML.ICanvasGradient_typekey")
  var MSHTMLDotICanvasGradient_typekey: ICanvasGradient = js.native
  def addColorStop(offset: Double, color: String): Unit = js.native
}

object ICanvasGradient {
  @scala.inline
  def apply(MSHTMLDotICanvasGradient_typekey: ICanvasGradient, addColorStop: (Double, String) => Unit): ICanvasGradient = {
    val __obj = js.Dynamic.literal(addColorStop = js.Any.fromFunction2(addColorStop))
    __obj.updateDynamic("MSHTML.ICanvasGradient_typekey")(MSHTMLDotICanvasGradient_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICanvasGradient]
  }
  @scala.inline
  implicit class ICanvasGradientOps[Self <: ICanvasGradient] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotICanvasGradient_typekey(value: ICanvasGradient): Self = this.set("MSHTML.ICanvasGradient_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddColorStop(value: (Double, String) => Unit): Self = this.set("addColorStop", js.Any.fromFunction2(value))
  }
  
}

