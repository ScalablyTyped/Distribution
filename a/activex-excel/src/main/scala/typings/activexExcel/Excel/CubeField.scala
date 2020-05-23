package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CubeField extends js.Object {
  val AllItemsVisible: Boolean = js.native
  val Application: typings.activexExcel.Excel.Application = js.native
  var Caption: String = js.native
  val Creator: XlCreator = js.native
  val CubeFieldSubType: XlCubeFieldSubType = js.native
  val CubeFieldType: XlCubeFieldType = js.native
  var CurrentPageName: String = js.native
  var DragToColumn: Boolean = js.native
  var DragToData: Boolean = js.native
  var DragToHide: Boolean = js.native
  var DragToPage: Boolean = js.native
  var DragToRow: Boolean = js.native
  var EnableMultiplePageItems: Boolean = js.native
  @JSName("Excel.CubeField_typekey")
  var ExcelDotCubeField_typekey: CubeField = js.native
  var FlattenHierarchies: Boolean = js.native
  val HasMemberProperties: Boolean = js.native
  var HiddenLevels: Double = js.native
  var HierarchizeDistinct: Boolean = js.native
  var IncludeNewItemsInFilter: Boolean = js.native
  val IsDate: Boolean = js.native
  var LayoutForm: XlLayoutFormType = js.native
  var LayoutSubtotalLocation: XlSubtototalLocationType = js.native
  val Name: String = js.native
  var Orientation: XlPivotFieldOrientation = js.native
  val Parent: js.Any = js.native
  val PivotFields: typings.activexExcel.Excel.PivotFields = js.native
  var Position: Double = js.native
  var ShowInFieldList: Boolean = js.native
  val TreeviewControl: typings.activexExcel.Excel.TreeviewControl = js.native
  val Value: String = js.native
  val _Caption: String = js.native
  def AddMemberPropertyField(Property: String): Unit = js.native
  def AddMemberPropertyField(Property: String, PropertyOrder: Double): Unit = js.native
  def AddMemberPropertyField(Property: String, PropertyOrder: Double, PropertyDisplayedIn: XlPropertyDisplayedIn): Unit = js.native
  def ClearManualFilter(): Unit = js.native
  def CreatePivotFields(): Unit = js.native
  def Delete(): Unit = js.native
  def _AddMemberPropertyField(Property: String): Unit = js.native
  def _AddMemberPropertyField(Property: String, PropertyOrder: js.Any): Unit = js.native
}

