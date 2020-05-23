package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLPopup extends js.Object {
  @JSName("MSHTML.HTMLPopup_typekey")
  var MSHTMLDotHTMLPopup_typekey: HTMLPopup
  val constructor: js.Any
  val document: IHTMLDocument
  val isOpen: Boolean
  def Hide(): Unit
  def Show(x: Double, y: Double, w: Double, h: Double, pElement: js.Any): Unit
}

object HTMLPopup {
  @scala.inline
  def apply(
    Hide: () => Unit,
    MSHTMLDotHTMLPopup_typekey: HTMLPopup,
    Show: (Double, Double, Double, Double, js.Any) => Unit,
    constructor: js.Any,
    document: IHTMLDocument,
    isOpen: Boolean
  ): HTMLPopup = {
    val __obj = js.Dynamic.literal(Hide = js.Any.fromFunction0(Hide), Show = js.Any.fromFunction5(Show), constructor = constructor.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLPopup_typekey")(MSHTMLDotHTMLPopup_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLPopup]
  }
}

