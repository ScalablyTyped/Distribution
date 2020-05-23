package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubmitToHostEventHandler extends js.Object {
  @JSName("InfoPath.ISubmitToHostEventHandler_typekey")
  var InfoPathDotISubmitToHostEventHandler_typekey: ISubmitToHostEventHandler
  def SubmitToHostEventHandler(punkSender: js.Any, bstrAdapterName: String, pbstrErrorMessage: String): Double
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
}

