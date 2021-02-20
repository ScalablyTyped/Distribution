package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISubmitToHostEventHandler extends StObject {
  
  @JSName("InfoPath.ISubmitToHostEventHandler_typekey")
  var InfoPathDotISubmitToHostEventHandler_typekey: ISubmitToHostEventHandler = js.native
  
  def SubmitToHostEventHandler(punkSender: js.Any, bstrAdapterName: String, pbstrErrorMessage: String): Double = js.native
}
object ISubmitToHostEventHandler {
  
  @scala.inline
  def apply(
    InfoPathDotISubmitToHostEventHandler_typekey: ISubmitToHostEventHandler,
    SubmitToHostEventHandler: (js.Any, String, String) => Double
  ): ISubmitToHostEventHandler = {
    val __obj = js.Dynamic.literal(SubmitToHostEventHandler = js.Any.fromFunction3(SubmitToHostEventHandler))
    __obj.updateDynamic("InfoPath.ISubmitToHostEventHandler_typekey")(InfoPathDotISubmitToHostEventHandler_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubmitToHostEventHandler]
  }
  
  @scala.inline
  implicit class ISubmitToHostEventHandlerMutableBuilder[Self <: ISubmitToHostEventHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfoPathDotISubmitToHostEventHandler_typekey(value: ISubmitToHostEventHandler): Self = StObject.set(x, "InfoPath.ISubmitToHostEventHandler_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitToHostEventHandler(value: (js.Any, String, String) => Double): Self = StObject.set(x, "SubmitToHostEventHandler", js.Any.fromFunction3(value))
  }
}
