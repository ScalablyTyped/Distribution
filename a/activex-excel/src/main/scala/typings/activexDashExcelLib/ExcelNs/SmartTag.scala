package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.SmartTag")
@js.native
class SmartTag protected () extends js.Object {
  val Application: Application = js.native
  val Creator: XlCreator = js.native
  val DownloadURL: java.lang.String = js.native
  var `Excel.SmartTag_typekey`: SmartTag = js.native
  val Name: java.lang.String = js.native
  val Parent: js.Any = js.native
  @JSName("Properties")
  val Properties_Original: CustomProperties = js.native
  @JSName("Range")
  val Range_Original: Range = js.native
  @JSName("SmartTagActions")
  val SmartTagActions_Original: SmartTagActions = js.native
  val XML: java.lang.String = js.native
  val _Default: java.lang.String = js.native
  def Delete(): scala.Unit = js.native
  def Properties(Index: java.lang.String): CustomProperty = js.native
  def Properties(Index: scala.Double): CustomProperty = js.native
  def Range(Address: java.lang.String): Range = js.native
  def Range(RowIndex: scala.Double): Range = js.native
  def Range(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def SmartTagActions(Index: js.Any): SmartTagAction = js.native
}

