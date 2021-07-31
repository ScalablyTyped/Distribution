package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInitEventHandler extends StObject {
  
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
  
  @scala.inline
  implicit class IInitEventHandlerMutableBuilder[Self <: IInitEventHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfoPathDotIInitEventHandler_typekey(value: IInitEventHandler): Self = StObject.set(x, "InfoPath.IInitEventHandler_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitEventHandler(value: (js.Any, _XDocument, XdReadOnlyViewMode) => Unit): Self = StObject.set(x, "InitEventHandler", js.Any.fromFunction3(value))
  }
}
