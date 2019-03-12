package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.ControlFormat")
@js.native
class ControlFormat protected () extends js.Object {
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  val Creator: XlCreator = js.native
  var DropDownLines: scala.Double = js.native
  var Enabled: scala.Boolean = js.native
  var `Excel.ControlFormat_typekey`: ControlFormat = js.native
  var LargeChange: scala.Double = js.native
  var LinkedCell: java.lang.String = js.native
  var ListCount: scala.Double = js.native
  var ListFillRange: java.lang.String = js.native
  var ListIndex: scala.Double = js.native
  var LockedText: scala.Boolean = js.native
  var Max: scala.Double = js.native
  var Min: scala.Double = js.native
  var MultiSelect: scala.Double = js.native
  val Parent: js.Any = js.native
  var PrintObject: scala.Boolean = js.native
  var SmallChange: scala.Double = js.native
  var Value: scala.Double = js.native
  var _Default: scala.Double = js.native
  def AddItem(Text: java.lang.String): scala.Unit = js.native
  def AddItem(Text: java.lang.String, Index: scala.Double): scala.Unit = js.native
  def List(): stdLib.SafeArray[java.lang.String] = js.native
  def List(Index: scala.Double): java.lang.String = js.native
  def RemoveAllItems(): scala.Unit = js.native
  def RemoveItem(Index: scala.Double): scala.Unit = js.native
  def RemoveItem(Index: scala.Double, Count: scala.Double): scala.Unit = js.native
}

