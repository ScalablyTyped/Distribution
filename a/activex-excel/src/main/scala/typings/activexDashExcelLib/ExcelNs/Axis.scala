package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Axis")
@js.native
class Axis protected () extends js.Object {
  val Application: Application = js.native
  var AxisBetweenCategories: scala.Boolean = js.native
  val AxisGroup: XlAxisGroup = js.native
  val AxisTitle: AxisTitle = js.native
  var BaseUnit: XlTimeUnit = js.native
  var BaseUnitIsAuto: scala.Boolean = js.native
  val Border: Border = js.native
  var CategoryNames: activexDashInteropLib.SafeArray[java.lang.String] | Range = js.native
  var CategoryType: XlCategoryType = js.native
  val Creator: XlCreator = js.native
  var Crosses: XlAxisCrosses = js.native
  var CrossesAt: scala.Double = js.native
  var DisplayUnit: XlDisplayUnit = js.native
  var DisplayUnitCustom: scala.Double = js.native
  val DisplayUnitLabel: DisplayUnitLabel = js.native
  var `Excel.Axis_typekey`: Axis = js.native
  val Format: ChartFormat = js.native
  var HasDisplayUnitLabel: scala.Boolean = js.native
  var HasMajorGridlines: scala.Boolean = js.native
  var HasMinorGridlines: scala.Boolean = js.native
  var HasTitle: scala.Boolean = js.native
  val Height: scala.Double = js.native
  val Left: scala.Double = js.native
  var LogBase: scala.Double = js.native
  val MajorGridlines: Gridlines = js.native
  var MajorTickMark: XlTickMark = js.native
  var MajorUnit: scala.Double = js.native
  var MajorUnitIsAuto: scala.Boolean = js.native
  var MajorUnitScale: XlTimeUnit = js.native
  var MaximumScale: scala.Double = js.native
  var MaximumScaleIsAuto: scala.Boolean = js.native
  var MinimumScale: scala.Double = js.native
  var MinimumScaleIsAuto: scala.Boolean = js.native
  val MinorGridlines: Gridlines = js.native
  var MinorTickMark: XlTickMark = js.native
  var MinorUnit: scala.Double = js.native
  var MinorUnitIsAuto: scala.Boolean = js.native
  var MinorUnitScale: XlTimeUnit = js.native
  val Parent: js.Any = js.native
  var ReversePlotOrder: scala.Boolean = js.native
  var ScaleType: XlScaleType = js.native
  var TickLabelPosition: XlTickLabelPosition = js.native
  var TickLabelSpacing: scala.Double = js.native
  var TickLabelSpacingIsAuto: scala.Boolean = js.native
  val TickLabels: TickLabels = js.native
  var TickMarkSpacing: scala.Double = js.native
  val Top: scala.Double = js.native
  var Type: XlAxisType = js.native
  val Width: scala.Double = js.native
  def Delete(): js.Any = js.native
  def Select(): js.Any = js.native
}

