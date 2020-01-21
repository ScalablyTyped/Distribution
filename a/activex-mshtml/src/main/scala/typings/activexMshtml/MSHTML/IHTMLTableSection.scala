package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.IHTMLTableSection")
@js.native
class IHTMLTableSection protected () extends js.Object {
  @JSName("MSHTML.IHTMLTableSection_typekey")
  var MSHTMLDotIHTMLTableSection_typekey: IHTMLTableSection = js.native
  var align: String = js.native
  var bgColor: js.Any = js.native
  @JSName("rows")
  val rows_Original: IHTMLElementCollection = js.native
  var vAlign: String = js.native
  /** @param index [index=-1] */
  def deleteRow(): Unit = js.native
  def deleteRow(index: Double): Unit = js.native
  /** @param index [index=-1] */
  def insertRow(): js.Any = js.native
  def insertRow(index: Double): js.Any = js.native
  def rows(): js.Any = js.native
  def rows(name: js.Any): js.Any = js.native
  def rows(name: js.Any, index: js.Any): js.Any = js.native
}

