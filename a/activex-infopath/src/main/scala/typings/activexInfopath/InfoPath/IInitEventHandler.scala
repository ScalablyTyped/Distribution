package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInitEventHandler extends js.Object {
  @JSName("InfoPath.IInitEventHandler_typekey")
  var InfoPathDotIInitEventHandler_typekey: IInitEventHandler
  def InitEventHandler(punkSender: js.Any, pDocument: _XDocument, pROMode: XdReadOnlyViewMode): Unit
}

object IInitEventHandler {
  @scala.inline
  def apply(
    InfoPathDotIInitEventHandler_typekey: IInitEventHandler,
    InitEventHandler: (js.Any, _XDocument, XdReadOnlyViewMode) => Unit
  ): IInitEventHandler = {
    val __obj = js.Dynamic.literal(InitEventHandler = js.Any.fromFunction3(InitEventHandler))
    __obj.updateDynamic("InfoPath.IInitEventHandler_typekey")(InfoPathDotIInitEventHandler_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInitEventHandler]
  }
}

