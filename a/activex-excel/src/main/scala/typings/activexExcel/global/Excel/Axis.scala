package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.Range
import typings.activexExcel.Excel.XlAxisCrosses
import typings.activexExcel.Excel.XlAxisGroup
import typings.activexExcel.Excel.XlAxisType
import typings.activexExcel.Excel.XlCategoryType
import typings.activexExcel.Excel.XlCreator
import typings.activexExcel.Excel.XlDisplayUnit
import typings.activexExcel.Excel.XlScaleType
import typings.activexExcel.Excel.XlTickLabelPosition
import typings.activexExcel.Excel.XlTickMark
import typings.activexExcel.Excel.XlTimeUnit
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.Axis")
@js.native
class Axis protected ()
  extends StObject
     with typings.activexExcel.Excel.Axis {
  
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  var AxisBetweenCategories: Boolean = js.native
  
  /* CompleteClass */
  override val AxisGroup: XlAxisGroup = js.native
  
  /* CompleteClass */
  override val AxisTitle: typings.activexExcel.Excel.AxisTitle = js.native
  
  /* CompleteClass */
  var BaseUnit: XlTimeUnit = js.native
  
  /* CompleteClass */
  var BaseUnitIsAuto: Boolean = js.native
  
  /* CompleteClass */
  override val Border: typings.activexExcel.Excel.Border = js.native
  
  /* CompleteClass */
  var CategoryNames: SafeArray[String] | Range = js.native
  
  /* CompleteClass */
  var CategoryType: XlCategoryType = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  var Crosses: XlAxisCrosses = js.native
  
  /* CompleteClass */
  var CrossesAt: Double = js.native
  
  /* CompleteClass */
  override def Delete(): js.Any = js.native
  
  /* CompleteClass */
  var DisplayUnit: XlDisplayUnit = js.native
  
  /* CompleteClass */
  var DisplayUnitCustom: Double = js.native
  
  /* CompleteClass */
  override val DisplayUnitLabel: typings.activexExcel.Excel.DisplayUnitLabel = js.native
  
  /* CompleteClass */
  @JSName("Excel.Axis_typekey")
  var ExcelDotAxis_typekey: typings.activexExcel.Excel.Axis = js.native
  
  /* CompleteClass */
  override val Format: typings.activexExcel.Excel.ChartFormat = js.native
  
  /* CompleteClass */
  var HasDisplayUnitLabel: Boolean = js.native
  
  /* CompleteClass */
  var HasMajorGridlines: Boolean = js.native
  
  /* CompleteClass */
  var HasMinorGridlines: Boolean = js.native
  
  /* CompleteClass */
  var HasTitle: Boolean = js.native
  
  /* CompleteClass */
  override val Height: Double = js.native
  
  /* CompleteClass */
  override val Left: Double = js.native
  
  /* CompleteClass */
  var LogBase: Double = js.native
  
  /* CompleteClass */
  override val MajorGridlines: typings.activexExcel.Excel.Gridlines = js.native
  
  /* CompleteClass */
  var MajorTickMark: XlTickMark = js.native
  
  /* CompleteClass */
  var MajorUnit: Double = js.native
  
  /* CompleteClass */
  var MajorUnitIsAuto: Boolean = js.native
  
  /* CompleteClass */
  var MajorUnitScale: XlTimeUnit = js.native
  
  /* CompleteClass */
  var MaximumScale: Double = js.native
  
  /* CompleteClass */
  var MaximumScaleIsAuto: Boolean = js.native
  
  /* CompleteClass */
  var MinimumScale: Double = js.native
  
  /* CompleteClass */
  var MinimumScaleIsAuto: Boolean = js.native
  
  /* CompleteClass */
  override val MinorGridlines: typings.activexExcel.Excel.Gridlines = js.native
  
  /* CompleteClass */
  var MinorTickMark: XlTickMark = js.native
  
  /* CompleteClass */
  var MinorUnit: Double = js.native
  
  /* CompleteClass */
  var MinorUnitIsAuto: Boolean = js.native
  
  /* CompleteClass */
  var MinorUnitScale: XlTimeUnit = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  var ReversePlotOrder: Boolean = js.native
  
  /* CompleteClass */
  var ScaleType: XlScaleType = js.native
  
  /* CompleteClass */
  override def Select(): js.Any = js.native
  
  /* CompleteClass */
  var TickLabelPosition: XlTickLabelPosition = js.native
  
  /* CompleteClass */
  var TickLabelSpacing: Double = js.native
  
  /* CompleteClass */
  var TickLabelSpacingIsAuto: Boolean = js.native
  
  /* CompleteClass */
  override val TickLabels: typings.activexExcel.Excel.TickLabels = js.native
  
  /* CompleteClass */
  var TickMarkSpacing: Double = js.native
  
  /* CompleteClass */
  override val Top: Double = js.native
  
  /* CompleteClass */
  var Type: XlAxisType = js.native
  
  /* CompleteClass */
  override val Width: Double = js.native
}
