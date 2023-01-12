package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISubmitToHostEventHandler extends StObject {
  
  /* private */ @JSName("InfoPath.ISubmitToHostEventHandler_typekey")
  var InfoPathDotISubmitToHostEventHandler_typekey: ISubmitToHostEventHandler
  
  def SubmitToHostEventHandler(punkSender: Any, bstrAdapterName: String, pbstrErrorMessage: String): Double
}
object ISubmitToHostEventHandler {
  
  inline def apply(
    InfoPathDotISubmitToHostEventHandler_typekey: ISubmitToHostEventHandler,
    SubmitToHostEventHandler: (Any, String, String) => Double
  ): ISubmitToHostEventHandler = {
    val __obj = js.Dynamic.literal(SubmitToHostEventHandler = js.Any.fromFunction3(SubmitToHostEventHandler))
    __obj.updateDynamic("InfoPath.ISubmitToHostEventHandler_typekey")(InfoPathDotISubmitToHostEventHandler_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubmitToHostEventHandler]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISubmitToHostEventHandler] (val x: Self) extends AnyVal {
    
    inline def setInfoPathDotISubmitToHostEventHandler_typekey(value: ISubmitToHostEventHandler): Self = StObject.set(x, "InfoPath.ISubmitToHostEventHandler_typekey", value.asInstanceOf[js.Any])
    
    inline def setSubmitToHostEventHandler(value: (Any, String, String) => Double): Self = StObject.set(x, "SubmitToHostEventHandler", js.Any.fromFunction3(value))
  }
}
