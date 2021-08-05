package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInitEventHandler extends StObject {
  
  /* private */ @JSName("InfoPath.IInitEventHandler_typekey")
  var InfoPathDotIInitEventHandler_typekey: IInitEventHandler
  
  def InitEventHandler(punkSender: js.Any, pDocument: _XDocument, pROMode: XdReadOnlyViewMode): Unit
}
object IInitEventHandler {
  
  inline def apply(
    InfoPathDotIInitEventHandler_typekey: IInitEventHandler,
    InitEventHandler: (js.Any, _XDocument, XdReadOnlyViewMode) => Unit
  ): IInitEventHandler = {
    val __obj = js.Dynamic.literal(InitEventHandler = js.Any.fromFunction3(InitEventHandler))
    __obj.updateDynamic("InfoPath.IInitEventHandler_typekey")(InfoPathDotIInitEventHandler_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInitEventHandler]
  }
  
  extension [Self <: IInitEventHandler](x: Self) {
    
    inline def setInfoPathDotIInitEventHandler_typekey(value: IInitEventHandler): Self = StObject.set(x, "InfoPath.IInitEventHandler_typekey", value.asInstanceOf[js.Any])
    
    inline def setInitEventHandler(value: (js.Any, _XDocument, XdReadOnlyViewMode) => Unit): Self = StObject.set(x, "InitEventHandler", js.Any.fromFunction3(value))
  }
}
