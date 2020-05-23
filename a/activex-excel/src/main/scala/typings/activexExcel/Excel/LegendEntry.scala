package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendEntry extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  var AutoScaleFont: js.Any
  val Creator: XlCreator
  @JSName("Excel.LegendEntry_typekey")
  var ExcelDotLegendEntry_typekey: LegendEntry
  val Font: typings.activexExcel.Excel.Font
  val Format: ChartFormat
  val Height: Double
  val Index: Double
  val Left: Double
  val LegendKey: typings.activexExcel.Excel.LegendKey
  val Parent: js.Any
  val Top: Double
  val Width: Double
  def Delete(): js.Any
  def Select(): js.Any
}

object LegendEntry {
  @scala.inline
  def apply(
    Application: Application,
    AutoScaleFont: js.Any,
    Creator: XlCreator,
    Delete: () => js.Any,
    ExcelDotLegendEntry_typekey: LegendEntry,
    Font: Font,
    Format: ChartFormat,
    Height: Double,
    Index: Double,
    Left: Double,
    LegendKey: LegendKey,
    Parent: js.Any,
    Select: () => js.Any,
    Top: Double,
    Width: Double
  ): LegendEntry = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoScaleFont = AutoScaleFont.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Font = Font.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], LegendKey = LegendKey.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Top = Top.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.LegendEntry_typekey")(ExcelDotLegendEntry_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendEntry]
  }
}

