package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventTarget extends js.Object {
  @JSName("MSHTML.IEventTarget_typekey")
  var MSHTMLDotIEventTarget_typekey: IEventTarget
  def addEventListener(`type`: String, listener: js.Any, useCapture: Boolean): Unit
  def dispatchEvent(evt: IDOMEvent): Boolean
  def removeEventListener(`type`: String, listener: js.Any, useCapture: Boolean): Unit
}

object IEventTarget {
  @scala.inline
  def apply(
    MSHTMLDotIEventTarget_typekey: IEventTarget,
    addEventListener: (String, js.Any, Boolean) => Unit,
    dispatchEvent: IDOMEvent => Boolean,
    removeEventListener: (String, js.Any, Boolean) => Unit
  ): IEventTarget = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction3(addEventListener), dispatchEvent = js.Any.fromFunction1(dispatchEvent), removeEventListener = js.Any.fromFunction3(removeEventListener))
    __obj.updateDynamic("MSHTML.IEventTarget_typekey")(MSHTMLDotIEventTarget_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventTarget]
  }
}

