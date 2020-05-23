package typings.activexMshtml.global.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.IEventTarget")
@js.native
class IEventTarget protected ()
  extends typings.activexMshtml.MSHTML.IEventTarget {
  /* CompleteClass */
  @JSName("MSHTML.IEventTarget_typekey")
  override var MSHTMLDotIEventTarget_typekey: typings.activexMshtml.MSHTML.IEventTarget = js.native
  /* CompleteClass */
  override def addEventListener(`type`: String, listener: js.Any, useCapture: Boolean): Unit = js.native
  /* CompleteClass */
  override def dispatchEvent(evt: typings.activexMshtml.MSHTML.IDOMEvent): Boolean = js.native
  /* CompleteClass */
  override def removeEventListener(`type`: String, listener: js.Any, useCapture: Boolean): Unit = js.native
}

