package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISubmitToHostEventHandler extends js.Object {
  
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
  implicit class ISubmitToHostEventHandlerOps[Self <: ISubmitToHostEventHandler] (val x: Self) extends AnyVal {
    
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
    def setInfoPathDotISubmitToHostEventHandler_typekey(value: ISubmitToHostEventHandler): Self = this.set("InfoPath.ISubmitToHostEventHandler_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitToHostEventHandler(value: (js.Any, String, String) => Double): Self = this.set("SubmitToHostEventHandler", js.Any.fromFunction3(value))
  }
}
