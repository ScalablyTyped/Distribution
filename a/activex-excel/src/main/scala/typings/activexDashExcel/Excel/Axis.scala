package typings.activexDashExcel.Excel

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Axis")
@js.native
class Axis protected () extends js.Object {
  val Application: typings.activexDashExcel.Excel.Application = js.native
  var AxisBetweenCategories: Boolean = js.native
  val AxisGroup: XlAxisGroup = js.native
  val AxisTitle: typings.activexDashExcel.Excel.AxisTitle = js.native
  var BaseUnit: XlTimeUnit = js.native
  var BaseUnitIsAuto: Boolean = js.native
  val Border: typings.activexDashExcel.Excel.Border = js.native
  var CategoryNames: SafeArray[String] | Range = js.native
  var CategoryType: XlCategoryType = js.native
  val Creator: XlCreator = js.native
  var Crosses: XlAxisCrosses = js.native
  var CrossesAt: Double = js.native
  var DisplayUnit: XlDisplayUnit = js.native
  var DisplayUnitCustom: Double = js.native
  val DisplayUnitLabel: typings.activexDashExcel.Excel.DisplayUnitLabel = js.native
  var `Excel.Axis_typekey`: Axis = js.native
  val Format: ChartFormat = js.native
  var HasDisplayUnitLabel: Boolean = js.native
  var HasMajorGridlines: Boolean = js.native
  var HasMinorGridlines: Boolean = js.native
  var HasTitle: Boolean = js.native
  val Height: Double = js.native
  val Left: Double = js.native
  var LogBase: Double = js.native
  val MajorGridlines: Gridlines = js.native
  var MajorTickMark: XlTickMark = js.native
  var MajorUnit: Double = js.native
  var MajorUnitIsAuto: Boolean = js.native
  var MajorUnitScale: XlTimeUnit = js.native
  var MaximumScale: Double = js.native
  var MaximumScaleIsAuto: Boolean = js.native
  var MinimumScale: Double = js.native
  var MinimumScaleIsAuto: Boolean = js.native
  val MinorGridlines: Gridlines = js.native
  var MinorTickMark: XlTickMark = js.native
  var MinorUnit: Double = js.native
  var MinorUnitIsAuto: Boolean = js.native
  var MinorUnitScale: XlTimeUnit = js.native
  val Parent: js.Any = js.native
  var ReversePlotOrder: Boolean = js.native
  var ScaleType: XlScaleType = js.native
  var TickLabelPosition: XlTickLabelPosition = js.native
  var TickLabelSpacing: Double = js.native
  var TickLabelSpacingIsAuto: Boolean = js.native
  val TickLabels: typings.activexDashExcel.Excel.TickLabels = js.native
  var TickMarkSpacing: Double = js.native
  val Top: Double = js.native
  var Type: XlAxisType = js.native
  val Width: Double = js.native
  def Delete(): js.Any = js.native
  def Select(): js.Any = js.native
}

