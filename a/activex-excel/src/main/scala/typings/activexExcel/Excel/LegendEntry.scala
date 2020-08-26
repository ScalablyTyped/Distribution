package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegendEntry extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  var AutoScaleFont: js.Any = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.LegendEntry_typekey")
  var ExcelDotLegendEntry_typekey: LegendEntry = js.native
  val Font: typings.activexExcel.Excel.Font = js.native
  val Format: ChartFormat = js.native
  val Height: Double = js.native
  val Index: Double = js.native
  val Left: Double = js.native
  val LegendKey: typings.activexExcel.Excel.LegendKey = js.native
  val Parent: js.Any = js.native
  val Top: Double = js.native
  val Width: Double = js.native
  def Delete(): js.Any = js.native
  def Select(): js.Any = js.native
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
  @scala.inline
  implicit class LegendEntryOps[Self <: LegendEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoScaleFont(value: js.Any): Self = this.set("AutoScaleFont", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: XlCreator): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: () => js.Any): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setExcelDotLegendEntry_typekey(value: LegendEntry): Self = this.set("Excel.LegendEntry_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setFont(value: Font): Self = this.set("Font", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: ChartFormat): Self = this.set("Format", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("Height", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("Index", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: Double): Self = this.set("Left", value.asInstanceOf[js.Any])
    @scala.inline
    def setLegendKey(value: LegendKey): Self = this.set("LegendKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelect(value: () => js.Any): Self = this.set("Select", js.Any.fromFunction0(value))
    @scala.inline
    def setTop(value: Double): Self = this.set("Top", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("Width", value.asInstanceOf[js.Any])
  }
  
}

