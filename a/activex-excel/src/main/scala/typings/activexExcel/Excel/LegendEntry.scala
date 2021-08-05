package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegendEntry extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  var AutoScaleFont: js.Any
  
  val Creator: XlCreator
  
  def Delete(): js.Any
  
  /* private */ @JSName("Excel.LegendEntry_typekey")
  var ExcelDotLegendEntry_typekey: LegendEntry
  
  val Font: typings.activexExcel.Excel.Font
  
  val Format: ChartFormat
  
  val Height: Double
  
  val Index: Double
  
  val Left: Double
  
  val LegendKey: typings.activexExcel.Excel.LegendKey
  
  val Parent: js.Any
  
  def Select(): js.Any
  
  val Top: Double
  
  val Width: Double
}
object LegendEntry {
  
  inline def apply(
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
  
  extension [Self <: LegendEntry](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setAutoScaleFont(value: js.Any): Self = StObject.set(x, "AutoScaleFont", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => js.Any): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setExcelDotLegendEntry_typekey(value: LegendEntry): Self = StObject.set(x, "Excel.LegendEntry_typekey", value.asInstanceOf[js.Any])
    
    inline def setFont(value: Font): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: ChartFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    inline def setLegendKey(value: LegendKey): Self = StObject.set(x, "LegendKey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: () => js.Any): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
    
    inline def setTop(value: Double): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
