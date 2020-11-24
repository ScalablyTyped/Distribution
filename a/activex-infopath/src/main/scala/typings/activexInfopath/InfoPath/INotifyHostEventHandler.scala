package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INotifyHostEventHandler extends js.Object {
  
  @JSName("InfoPath.INotifyHostEventHandler_typekey")
  var InfoPathDotINotifyHostEventHandler_typekey: INotifyHostEventHandler = js.native
  
  def NotifyHostEventHandler(punkSender: js.Any, bstrNotification: String): Unit = js.native
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
  
  @scala.inline
  implicit class INotifyHostEventHandlerOps[Self <: INotifyHostEventHandler] (val x: Self) extends AnyVal {
    
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
    def setInfoPathDotINotifyHostEventHandler_typekey(value: INotifyHostEventHandler): Self = this.set("InfoPath.INotifyHostEventHandler_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotifyHostEventHandler(value: (js.Any, String) => Unit): Self = this.set("NotifyHostEventHandler", js.Any.fromFunction2(value))
  }
}
