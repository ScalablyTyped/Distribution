package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Comment")
@js.native
class Comment protected () extends js.Object {
  val Application: Application = js.native
  val Author: java.lang.String = js.native
  val Creator: XlCreator = js.native
  var `Excel.Comment_typekey`: Comment = js.native
  val Parent: js.Any = js.native
  val Shape: Shape = js.native
  var Visible: scala.Boolean = js.native
  def Delete(): scala.Unit = js.native
  def Next(): Comment = js.native
  def Previous(): Comment = js.native
  def Text(): java.lang.String = js.native
  def Text(Text: java.lang.String): java.lang.String = js.native
  def Text(Text: java.lang.String, Start: scala.Double): java.lang.String = js.native
  def Text(Text: java.lang.String, Start: scala.Double, Overwrite: scala.Boolean): java.lang.String = js.native
}

