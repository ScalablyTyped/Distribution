package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Legend extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  var AutoScaleFont: js.Any
  
  val Border: typings.activexExcel.Excel.Border
  
  def Clear(): js.Any
  
  val Creator: XlCreator
  
  def Delete(): js.Any
  
  @JSName("Excel.Legend_typekey")
  var ExcelDotLegend_typekey: Legend
  
  val Fill: ChartFillFormat
  
  val Font: typings.activexExcel.Excel.Font
  
  val Format: ChartFormat
  
  var Height: Double
  
  var IncludeInLayout: Boolean
  
  val Interior: typings.activexExcel.Excel.Interior
  
  var Left: Double
  
  def LegendEntries(Index: Double): LegendEntry
  @JSName("LegendEntries")
  var LegendEntries_Original: LegendEntries & (js.Function1[/* Index */ Double, LegendEntry])
  
  val Name: String
  
  val Parent: js.Any
  
  var Position: XlLegendPosition
  
  def Select(): js.Any
  
  var Shadow: Boolean
  
  var Top: Double
  
  var Width: Double
}
object Legend {
  
  @scala.inline
  def apply(
    Application: Application,
    AutoScaleFont: js.Any,
    Border: Border,
    Clear: () => js.Any,
    Creator: XlCreator,
    Delete: () => js.Any,
    ExcelDotLegend_typekey: Legend,
    Fill: ChartFillFormat,
    Font: Font,
    Format: ChartFormat,
    Height: Double,
    IncludeInLayout: Boolean,
    Interior: Interior,
    Left: Double,
    LegendEntries: LegendEntries & (js.Function1[/* Index */ Double, LegendEntry]),
    Name: String,
    Parent: js.Any,
    Position: XlLegendPosition,
    Select: () => js.Any,
    Shadow: Boolean,
    Top: Double,
    Width: Double
  ): Legend = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoScaleFont = AutoScaleFont.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Clear = js.Any.fromFunction0(Clear), Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Fill = Fill.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], IncludeInLayout = IncludeInLayout.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], LegendEntries = LegendEntries.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Shadow = Shadow.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Legend_typekey")(ExcelDotLegend_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Legend]
  }
  
  @scala.inline
  implicit class LegendMutableBuilder[Self <: Legend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScaleFont(value: js.Any): Self = StObject.set(x, "AutoScaleFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorder(value: Border): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClear(value: () => js.Any): Self = StObject.set(x, "Clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => js.Any): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExcelDotLegend_typekey(value: Legend): Self = StObject.set(x, "Excel.Legend_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFill(value: ChartFillFormat): Self = StObject.set(x, "Fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont(value: Font): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: ChartFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeInLayout(value: Boolean): Self = StObject.set(x, "IncludeInLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterior(value: Interior): Self = StObject.set(x, "Interior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendEntries(value: LegendEntries & (js.Function1[/* Index */ Double, LegendEntry])): Self = StObject.set(x, "LegendEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: XlLegendPosition): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: () => js.Any): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShadow(value: Boolean): Self = StObject.set(x, "Shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
