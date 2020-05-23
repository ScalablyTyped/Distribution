package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotifyHostEventHandler extends js.Object {
  @JSName("InfoPath.INotifyHostEventHandler_typekey")
  var InfoPathDotINotifyHostEventHandler_typekey: INotifyHostEventHandler
  def NotifyHostEventHandler(punkSender: js.Any, bstrNotification: String): Unit
}

object INotifyHostEventHandler {
  @scala.inline
  def apply(
    InfoPathDotINotifyHostEventHandler_typekey: INotifyHostEventHandler,
    NotifyHostEventHandler: (js.Any, String) => Unit
  ): INotifyHostEventHandler = {
    val __obj = js.Dynamic.literal(NotifyHostEventHandler = js.Any.fromFunction2(NotifyHostEventHandler))
    __obj.updateDynamic("InfoPath.INotifyHostEventHandler_typekey")(InfoPathDotINotifyHostEventHandler_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotifyHostEventHandler]
  }
}

