package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotLayout extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  @JSName("CubeFields")
  val CubeFields_Original: CubeFields = js.native
  @JSName("Excel.PivotLayout_typekey")
  var ExcelDotPivotLayout_typekey: PivotLayout = js.native
  var InnerDetail: String = js.native
  val Parent: js.Any = js.native
  val PivotCache: typings.activexExcel.Excel.PivotCache = js.native
  val PivotTable: typings.activexExcel.Excel.PivotTable = js.native
  def AddFields(): Unit = js.native
  def AddFields(RowFields: js.Any): Unit = js.native
  def AddFields(RowFields: js.Any, ColumnFields: js.Any): Unit = js.native
  def AddFields(RowFields: js.Any, ColumnFields: js.Any, PageFields: js.Any): Unit = js.native
  def AddFields(RowFields: js.Any, ColumnFields: js.Any, PageFields: js.Any, AppendField: js.Any): Unit = js.native
  def ColumnFields(): js.Any = js.native
  def ColumnFields(Index: js.Any): js.Any = js.native
  def CubeFields(Index: String): CubeField = js.native
  def CubeFields(Index: Double): CubeField = js.native
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

