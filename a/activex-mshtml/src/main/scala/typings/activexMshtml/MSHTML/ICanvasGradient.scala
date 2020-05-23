package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICanvasGradient extends js.Object {
  @JSName("MSHTML.ICanvasGradient_typekey")
  var MSHTMLDotICanvasGradient_typekey: ICanvasGradient
  def addColorStop(offset: Double, color: String): Unit
}

object ICanvasGradient {
  @scala.inline
  def apply(MSHTMLDotICanvasGradient_typekey: ICanvasGradient, addColorStop: (Double, String) => Unit): ICanvasGradient = {
    val __obj = js.Dynamic.literal(addColorStop = js.Any.fromFunction2(addColorStop))
    __obj.updateDynamic("MSHTML.ICanvasGradient_typekey")(MSHTMLDotICanvasGradient_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICanvasGradient]
  }
}

