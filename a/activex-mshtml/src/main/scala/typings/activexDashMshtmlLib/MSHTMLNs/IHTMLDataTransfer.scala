package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.IHTMLDataTransfer")
@js.native
class IHTMLDataTransfer protected () extends js.Object {
  var `MSHTML.IHTMLDataTransfer_typekey`: IHTMLDataTransfer = js.native
  var dropEffect: java.lang.String = js.native
  var effectAllowed: java.lang.String = js.native
  def clearData(format: java.lang.String): scala.Boolean = js.native
  def getData(format: java.lang.String): js.Any = js.native
  def setData(format: java.lang.String, data: js.Any): scala.Boolean = js.native
}

