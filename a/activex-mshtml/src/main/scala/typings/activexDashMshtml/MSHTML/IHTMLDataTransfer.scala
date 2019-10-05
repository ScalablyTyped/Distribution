package typings.activexDashMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.IHTMLDataTransfer")
@js.native
class IHTMLDataTransfer protected () extends js.Object {
  var `MSHTML.IHTMLDataTransfer_typekey`: IHTMLDataTransfer = js.native
  var dropEffect: String = js.native
  var effectAllowed: String = js.native
  def clearData(format: String): Boolean = js.native
  def getData(format: String): js.Any = js.native
  def setData(format: String, data: js.Any): Boolean = js.native
}

