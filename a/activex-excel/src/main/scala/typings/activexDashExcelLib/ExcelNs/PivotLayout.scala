package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.PivotLayout")
@js.native
class PivotLayout protected () extends js.Object {
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  val Creator: XlCreator = js.native
  @JSName("CubeFields")
  val CubeFields_Original: CubeFields = js.native
  var `Excel.PivotLayout_typekey`: PivotLayout = js.native
  var InnerDetail: java.lang.String = js.native
  val Parent: js.Any = js.native
  val PivotCache: activexDashExcelLib.ExcelNs.PivotCache = js.native
  val PivotTable: activexDashExcelLib.ExcelNs.PivotTable = js.native
  def AddFields(): scala.Unit = js.native
  def AddFields(RowFields: js.Any): scala.Unit = js.native
  def AddFields(RowFields: js.Any, ColumnFields: js.Any): scala.Unit = js.native
  def AddFields(RowFields: js.Any, ColumnFields: js.Any, PageFields: js.Any): scala.Unit = js.native
  def AddFields(RowFields: js.Any, ColumnFields: js.Any, PageFields: js.Any, AppendField: js.Any): scala.Unit = js.native
  def ColumnFields(): js.Any = js.native
  def ColumnFields(Index: js.Any): js.Any = js.native
  def CubeFields(Index: java.lang.String): CubeField = js.native
  def CubeFields(Index: scala.Double): CubeField = js.native
  def DataFields(): js.Any = js.native
  def DataFields(Index: js.Any): js.Any = js.native
  def HiddenFields(): js.Any = js.native
  def HiddenFields(Index: js.Any): js.Any = js.native
  def PageFields(): js.Any = js.native
  def PageFields(Index: js.Any): js.Any = js.native
  def PivotFields(): js.Any = js.native
  def PivotFields(Index: js.Any): js.Any = js.native
  def RowFields(): js.Any = js.native
  def RowFields(Index: js.Any): js.Any = js.native
  def VisibleFields(): js.Any = js.native
  def VisibleFields(Index: js.Any): js.Any = js.native
}

