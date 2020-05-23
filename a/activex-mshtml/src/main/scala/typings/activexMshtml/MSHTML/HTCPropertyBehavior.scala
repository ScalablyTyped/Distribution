package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTCPropertyBehavior extends js.Object {
  @JSName("MSHTML.HTCPropertyBehavior_typekey")
  var MSHTMLDotHTCPropertyBehavior_typekey: HTCPropertyBehavior
  var value: js.Any
  def fireChange(): Unit
}

object HTCPropertyBehavior {
  @scala.inline
  def apply(MSHTMLDotHTCPropertyBehavior_typekey: HTCPropertyBehavior, fireChange: () => Unit, value: js.Any): HTCPropertyBehavior = {
    val __obj = js.Dynamic.literal(fireChange = js.Any.fromFunction0(fireChange), value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTCPropertyBehavior_typekey")(MSHTMLDotHTCPropertyBehavior_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTCPropertyBehavior]
  }
}

