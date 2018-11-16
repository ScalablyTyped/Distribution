package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.TableStyle")
@js.native
class TableStyle protected () extends js.Object {
  val Application: Application = js.native
  val BuiltIn: scala.Boolean = js.native
  val Creator: XlCreator = js.native
  var `Excel.TableStyle_typekey`: TableStyle = js.native
  val Name: java.lang.String = js.native
  val NameLocal: java.lang.String = js.native
  val Parent: js.Any = js.native
  var ShowAsAvailablePivotTableStyle: scala.Boolean = js.native
  var ShowAsAvailableSlicerStyle: scala.Boolean = js.native
  var ShowAsAvailableTableStyle: scala.Boolean = js.native
  @JSName("TableStyleElements")
  val TableStyleElements_Original: TableStyleElements = js.native
  val _Default: java.lang.String = js.native
  def Delete(): scala.Unit = js.native
  def Duplicate(): TableStyle = js.native
  def Duplicate(NewTableStyleName: java.lang.String): TableStyle = js.native
  def TableStyleElements(Index: XlTableStyleElementType): TableStyleElement = js.native
}

