package typings.activexExcel.Excel

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Axis extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  var AxisBetweenCategories: Boolean
  val AxisGroup: XlAxisGroup
  val AxisTitle: typings.activexExcel.Excel.AxisTitle
  var BaseUnit: XlTimeUnit
  var BaseUnitIsAuto: Boolean
  val Border: typings.activexExcel.Excel.Border
  var CategoryNames: SafeArray[String] | Range
  var CategoryType: XlCategoryType
  val Creator: XlCreator
  var Crosses: XlAxisCrosses
  var CrossesAt: Double
  var DisplayUnit: XlDisplayUnit
  var DisplayUnitCustom: Double
  val DisplayUnitLabel: typings.activexExcel.Excel.DisplayUnitLabel
  @JSName("Excel.Axis_typekey")
  var ExcelDotAxis_typekey: Axis
  val Format: ChartFormat
  var HasDisplayUnitLabel: Boolean
  var HasMajorGridlines: Boolean
  var HasMinorGridlines: Boolean
  var HasTitle: Boolean
  val Height: Double
  val Left: Double
  var LogBase: Double
  val MajorGridlines: Gridlines
  var MajorTickMark: XlTickMark
  var MajorUnit: Double
  var MajorUnitIsAuto: Boolean
  var MajorUnitScale: XlTimeUnit
  var MaximumScale: Double
  var MaximumScaleIsAuto: Boolean
  var MinimumScale: Double
  var MinimumScaleIsAuto: Boolean
  val MinorGridlines: Gridlines
  var MinorTickMark: XlTickMark
  var MinorUnit: Double
  var MinorUnitIsAuto: Boolean
  var MinorUnitScale: XlTimeUnit
  val Parent: js.Any
  var ReversePlotOrder: Boolean
  var ScaleType: XlScaleType
  var TickLabelPosition: XlTickLabelPosition
  var TickLabelSpacing: Double
  var TickLabelSpacingIsAuto: Boolean
  val TickLabels: typings.activexExcel.Excel.TickLabels
  var TickMarkSpacing: Double
  val Top: Double
  var Type: XlAxisType
  val Width: Double
  def Delete(): js.Any
  def Select(): js.Any
}

object Axis {
  @scala.inline
  def apply(
    Application: Application,
    AxisBetweenCategories: Boolean,
    AxisGroup: XlAxisGroup,
    AxisTitle: AxisTitle,
    BaseUnit: XlTimeUnit,
    BaseUnitIsAuto: Boolean,
    Border: Border,
    CategoryNames: SafeArray[String] | Range,
    CategoryType: XlCategoryType,
    Creator: XlCreator,
    Crosses: XlAxisCrosses,
    CrossesAt: Double,
    Delete: () => js.Any,
    DisplayUnit: XlDisplayUnit,
    DisplayUnitCustom: Double,
    DisplayUnitLabel: DisplayUnitLabel,
    ExcelDotAxis_typekey: Axis,
    Format: ChartFormat,
    HasDisplayUnitLabel: Boolean,
    HasMajorGridlines: Boolean,
    HasMinorGridlines: Boolean,
    HasTitle: Boolean,
    Height: Double,
    Left: Double,
    LogBase: Double,
    MajorGridlines: Gridlines,
    MajorTickMark: XlTickMark,
    MajorUnit: Double,
    MajorUnitIsAuto: Boolean,
    MajorUnitScale: XlTimeUnit,
    MaximumScale: Double,
    MaximumScaleIsAuto: Boolean,
    MinimumScale: Double,
    MinimumScaleIsAuto: Boolean,
    MinorGridlines: Gridlines,
    MinorTickMark: XlTickMark,
    MinorUnit: Double,
    MinorUnitIsAuto: Boolean,
    MinorUnitScale: XlTimeUnit,
    Parent: js.Any,
    ReversePlotOrder: Boolean,
    ScaleType: XlScaleType,
    Select: () => js.Any,
    TickLabelPosition: XlTickLabelPosition,
    TickLabelSpacing: Double,
    TickLabelSpacingIsAuto: Boolean,
    TickLabels: TickLabels,
    TickMarkSpacing: Double,
    Top: Double,
    Type: XlAxisType,
    Width: Double
  ): Axis = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AxisBetweenCategories = AxisBetweenCategories.asInstanceOf[js.Any], AxisGroup = AxisGroup.asInstanceOf[js.Any], AxisTitle = AxisTitle.asInstanceOf[js.Any], BaseUnit = BaseUnit.asInstanceOf[js.Any], BaseUnitIsAuto = BaseUnitIsAuto.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], CategoryNames = CategoryNames.asInstanceOf[js.Any], CategoryType = CategoryType.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Crosses = Crosses.asInstanceOf[js.Any], CrossesAt = CrossesAt.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), DisplayUnit = DisplayUnit.asInstanceOf[js.Any], DisplayUnitCustom = DisplayUnitCustom.asInstanceOf[js.Any], DisplayUnitLabel = DisplayUnitLabel.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], HasDisplayUnitLabel = HasDisplayUnitLabel.asInstanceOf[js.Any], HasMajorGridlines = HasMajorGridlines.asInstanceOf[js.Any], HasMinorGridlines = HasMinorGridlines.asInstanceOf[js.Any], HasTitle = HasTitle.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], LogBase = LogBase.asInstanceOf[js.Any], MajorGridlines = MajorGridlines.asInstanceOf[js.Any], MajorTickMark = MajorTickMark.asInstanceOf[js.Any], MajorUnit = MajorUnit.asInstanceOf[js.Any], MajorUnitIsAuto = MajorUnitIsAuto.asInstanceOf[js.Any], MajorUnitScale = MajorUnitScale.asInstanceOf[js.Any], MaximumScale = MaximumScale.asInstanceOf[js.Any], MaximumScaleIsAuto = MaximumScaleIsAuto.asInstanceOf[js.Any], MinimumScale = MinimumScale.asInstanceOf[js.Any], MinimumScaleIsAuto = MinimumScaleIsAuto.asInstanceOf[js.Any], MinorGridlines = MinorGridlines.asInstanceOf[js.Any], MinorTickMark = MinorTickMark.asInstanceOf[js.Any], MinorUnit = MinorUnit.asInstanceOf[js.Any], MinorUnitIsAuto = MinorUnitIsAuto.asInstanceOf[js.Any], MinorUnitScale = MinorUnitScale.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ReversePlotOrder = ReversePlotOrder.asInstanceOf[js.Any], ScaleType = ScaleType.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), TickLabelPosition = TickLabelPosition.asInstanceOf[js.Any], TickLabelSpacing = TickLabelSpacing.asInstanceOf[js.Any], TickLabelSpacingIsAuto = TickLabelSpacingIsAuto.asInstanceOf[js.Any], TickLabels = TickLabels.asInstanceOf[js.Any], TickMarkSpacing = TickMarkSpacing.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Axis_typekey")(ExcelDotAxis_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Axis]
  }
}

