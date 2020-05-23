package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendKey extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  val Border: typings.activexExcel.Excel.Border
  val Creator: XlCreator
  @JSName("Excel.LegendKey_typekey")
  var ExcelDotLegendKey_typekey: LegendKey
  val Fill: ChartFillFormat
  val Format: ChartFormat
  val Height: Double
  val Interior: typings.activexExcel.Excel.Interior
  var InvertIfNegative: Boolean
  val Left: Double
  var MarkerBackgroundColor: Double
  var MarkerBackgroundColorIndex: XlColorIndex
  var MarkerForegroundColor: Double
  var MarkerForegroundColorIndex: XlColorIndex
  var MarkerSize: Double
  var MarkerStyle: XlMarkerStyle
  val Parent: js.Any
  var PictureType: Double
  var PictureUnit: Double
  var PictureUnit2: Double
  var Shadow: Boolean
  var Smooth: Boolean
  val Top: Double
  val Width: Double
  def ClearFormats(): js.Any
  def Delete(): js.Any
  def Select(): js.Any
}

object LegendKey {
  @scala.inline
  def apply(
    Application: Application,
    Border: Border,
    ClearFormats: () => js.Any,
    Creator: XlCreator,
    Delete: () => js.Any,
    ExcelDotLegendKey_typekey: LegendKey,
    Fill: ChartFillFormat,
    Format: ChartFormat,
    Height: Double,
    Interior: Interior,
    InvertIfNegative: Boolean,
    Left: Double,
    MarkerBackgroundColor: Double,
    MarkerBackgroundColorIndex: XlColorIndex,
    MarkerForegroundColor: Double,
    MarkerForegroundColorIndex: XlColorIndex,
    MarkerSize: Double,
    MarkerStyle: XlMarkerStyle,
    Parent: js.Any,
    PictureType: Double,
    PictureUnit: Double,
    PictureUnit2: Double,
    Select: () => js.Any,
    Shadow: Boolean,
    Smooth: Boolean,
    Top: Double,
    Width: Double
  ): LegendKey = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], ClearFormats = js.Any.fromFunction0(ClearFormats), Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Fill = Fill.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], InvertIfNegative = InvertIfNegative.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], MarkerBackgroundColor = MarkerBackgroundColor.asInstanceOf[js.Any], MarkerBackgroundColorIndex = MarkerBackgroundColorIndex.asInstanceOf[js.Any], MarkerForegroundColor = MarkerForegroundColor.asInstanceOf[js.Any], MarkerForegroundColorIndex = MarkerForegroundColorIndex.asInstanceOf[js.Any], MarkerSize = MarkerSize.asInstanceOf[js.Any], MarkerStyle = MarkerStyle.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PictureType = PictureType.asInstanceOf[js.Any], PictureUnit = PictureUnit.asInstanceOf[js.Any], PictureUnit2 = PictureUnit2.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Shadow = Shadow.asInstanceOf[js.Any], Smooth = Smooth.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.LegendKey_typekey")(ExcelDotLegendKey_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendKey]
  }
}

