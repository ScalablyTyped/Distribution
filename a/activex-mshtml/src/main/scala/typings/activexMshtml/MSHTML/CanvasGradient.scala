package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasGradient extends js.Object {
  @JSName("MSHTML.CanvasGradient_typekey")
  var MSHTMLDotCanvasGradient_typekey: CanvasGradient
  def addColorStop(offset: Double, color: String): Unit
}

object CanvasGradient {
  @scala.inline
  def apply(MSHTMLDotCanvasGradient_typekey: CanvasGradient, addColorStop: (Double, String) => Unit): CanvasGradient = {
    val __obj = js.Dynamic.literal(addColorStop = js.Any.fromFunction2(addColorStop))
    __obj.updateDynamic("MSHTML.CanvasGradient_typekey")(MSHTMLDotCanvasGradient_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasGradient]
  }
}

