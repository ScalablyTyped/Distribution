package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTCDefaultDispatch extends js.Object {
  @JSName("MSHTML.HTCDefaultDispatch_typekey")
  var MSHTMLDotHTCDefaultDispatch_typekey: HTCDefaultDispatch
  val defaults: js.Any
  val document: js.Any
  val element: IHTMLElement
  def CreateEventObject(): IHTMLEventObj
}

object HTCDefaultDispatch {
  @scala.inline
  def apply(
    CreateEventObject: () => IHTMLEventObj,
    MSHTMLDotHTCDefaultDispatch_typekey: HTCDefaultDispatch,
    defaults: js.Any,
    document: js.Any,
    element: IHTMLElement
  ): HTCDefaultDispatch = {
    val __obj = js.Dynamic.literal(CreateEventObject = js.Any.fromFunction0(CreateEventObject), defaults = defaults.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTCDefaultDispatch_typekey")(MSHTMLDotHTCDefaultDispatch_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTCDefaultDispatch]
  }
}

