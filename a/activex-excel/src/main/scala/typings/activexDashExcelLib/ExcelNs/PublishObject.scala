package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.PublishObject")
@js.native
class PublishObject protected () extends js.Object {
  val Application: Application = js.native
  var AutoRepublish: scala.Boolean = js.native
  val Creator: XlCreator = js.native
  val DivID: java.lang.String = js.native
  var `Excel.PublishObject_typekey`: PublishObject = js.native
  var Filename: java.lang.String = js.native
  var HtmlType: XlHtmlType = js.native
  val Parent: js.Any = js.native
  val Sheet: java.lang.String = js.native
  val Source: java.lang.String = js.native
  val SourceType: XlSourceType = js.native
  var Title: java.lang.String = js.native
  def Delete(): scala.Unit = js.native
  def Publish(): scala.Unit = js.native
  def Publish(Create: scala.Boolean): scala.Unit = js.native
}

