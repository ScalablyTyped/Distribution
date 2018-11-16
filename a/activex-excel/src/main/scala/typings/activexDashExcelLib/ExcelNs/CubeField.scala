package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.CubeField")
@js.native
class CubeField protected () extends js.Object {
  val AllItemsVisible: scala.Boolean = js.native
  val Application: Application = js.native
  var Caption: java.lang.String = js.native
  val Creator: XlCreator = js.native
  val CubeFieldSubType: XlCubeFieldSubType = js.native
  val CubeFieldType: XlCubeFieldType = js.native
  var CurrentPageName: java.lang.String = js.native
  var DragToColumn: scala.Boolean = js.native
  var DragToData: scala.Boolean = js.native
  var DragToHide: scala.Boolean = js.native
  var DragToPage: scala.Boolean = js.native
  var DragToRow: scala.Boolean = js.native
  var EnableMultiplePageItems: scala.Boolean = js.native
  var `Excel.CubeField_typekey`: CubeField = js.native
  var FlattenHierarchies: scala.Boolean = js.native
  val HasMemberProperties: scala.Boolean = js.native
  var HiddenLevels: scala.Double = js.native
  var HierarchizeDistinct: scala.Boolean = js.native
  var IncludeNewItemsInFilter: scala.Boolean = js.native
  val IsDate: scala.Boolean = js.native
  var LayoutForm: XlLayoutFormType = js.native
  var LayoutSubtotalLocation: XlSubtototalLocationType = js.native
  val Name: java.lang.String = js.native
  var Orientation: XlPivotFieldOrientation = js.native
  val Parent: js.Any = js.native
  val PivotFields: PivotFields = js.native
  var Position: scala.Double = js.native
  var ShowInFieldList: scala.Boolean = js.native
  val TreeviewControl: TreeviewControl = js.native
  val Value: java.lang.String = js.native
  val _Caption: java.lang.String = js.native
  def AddMemberPropertyField(Property: java.lang.String): scala.Unit = js.native
  def AddMemberPropertyField(Property: java.lang.String, PropertyOrder: scala.Double): scala.Unit = js.native
  def AddMemberPropertyField(
    Property: java.lang.String,
    PropertyOrder: scala.Double,
    PropertyDisplayedIn: XlPropertyDisplayedIn
  ): scala.Unit = js.native
  def ClearManualFilter(): scala.Unit = js.native
  def CreatePivotFields(): scala.Unit = js.native
  def Delete(): scala.Unit = js.native
  def _AddMemberPropertyField(Property: java.lang.String): scala.Unit = js.native
  def _AddMemberPropertyField(Property: java.lang.String, PropertyOrder: js.Any): scala.Unit = js.native
}

