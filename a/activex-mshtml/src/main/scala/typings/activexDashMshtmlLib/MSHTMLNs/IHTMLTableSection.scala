package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.IHTMLTableSection")
@js.native
class IHTMLTableSection protected () extends js.Object {
  var `MSHTML.IHTMLTableSection_typekey`: IHTMLTableSection = js.native
  var align: java.lang.String = js.native
  var bgColor: js.Any = js.native
  @JSName("rows")
  val rows_Original: IHTMLElementCollection = js.native
  var vAlign: java.lang.String = js.native
  /** @param index [index=-1] */
  def deleteRow(): scala.Unit = js.native
  def deleteRow(index: scala.Double): scala.Unit = js.native
  /** @param index [index=-1] */
  def insertRow(): js.Any = js.native
  def insertRow(index: scala.Double): js.Any = js.native
  def rows(): js.Any = js.native
  def rows(name: js.Any): js.Any = js.native
  def rows(name: js.Any, index: js.Any): js.Any = js.native
}

