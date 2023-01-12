package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INotifyHostEventHandler extends StObject {
  
  /* private */ @JSName("InfoPath.INotifyHostEventHandler_typekey")
  var InfoPathDotINotifyHostEventHandler_typekey: INotifyHostEventHandler
  
  def NotifyHostEventHandler(punkSender: Any, bstrNotification: String): Unit
}
object INotifyHostEventHandler {
  
  inline def apply(
    InfoPathDotINotifyHostEventHandler_typekey: INotifyHostEventHandler,
    NotifyHostEventHandler: (Any, String) => Unit
  ): INotifyHostEventHandler = {
    val __obj = js.Dynamic.literal(NotifyHostEventHandler = js.Any.fromFunction2(NotifyHostEventHandler))
    __obj.updateDynamic("InfoPath.INotifyHostEventHandler_typekey")(InfoPathDotINotifyHostEventHandler_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotifyHostEventHandler]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: INotifyHostEventHandler] (val x: Self) extends AnyVal {
    
    inline def setInfoPathDotINotifyHostEventHandler_typekey(value: INotifyHostEventHandler): Self = StObject.set(x, "InfoPath.INotifyHostEventHandler_typekey", value.asInstanceOf[js.Any])
    
    inline def setNotifyHostEventHandler(value: (Any, String) => Unit): Self = StObject.set(x, "NotifyHostEventHandler", js.Any.fromFunction2(value))
  }
}
