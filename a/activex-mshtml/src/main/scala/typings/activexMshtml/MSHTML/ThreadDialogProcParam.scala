package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreadDialogProcParam extends js.Object {
  @JSName("MSHTML.ThreadDialogProcParam_typekey")
  var MSHTMLDotThreadDialogProcParam_typekey: ThreadDialogProcParam
  val document: js.Any
  val moniker: js.Any
  val optionString: js.Any
  val parameters: js.Any
}

object ThreadDialogProcParam {
  @scala.inline
  def apply(
    MSHTMLDotThreadDialogProcParam_typekey: ThreadDialogProcParam,
    document: js.Any,
    moniker: js.Any,
    optionString: js.Any,
    parameters: js.Any
  ): ThreadDialogProcParam = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], moniker = moniker.asInstanceOf[js.Any], optionString = optionString.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ThreadDialogProcParam_typekey")(MSHTMLDotThreadDialogProcParam_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreadDialogProcParam]
  }
}

