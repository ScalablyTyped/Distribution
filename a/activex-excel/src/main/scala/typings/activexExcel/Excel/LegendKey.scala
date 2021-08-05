package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegendKey extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  val Border: typings.activexExcel.Excel.Border
  
  def ClearFormats(): js.Any
  
  val Creator: XlCreator
  
  def Delete(): js.Any
  
  /* private */ @JSName("Excel.LegendKey_typekey")
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
  
  def Select(): js.Any
  
  var Shadow: Boolean
  
  var Smooth: Boolean
  
  val Top: Double
  
  val Width: Double
}
object LegendKey {
  
  inline def apply(
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
  
  extension [Self <: LegendKey](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBorder(value: Border): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    inline def setClearFormats(value: () => js.Any): Self = StObject.set(x, "ClearFormats", js.Any.fromFunction0(value))
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => js.Any): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setExcelDotLegendKey_typekey(value: LegendKey): Self = StObject.set(x, "Excel.LegendKey_typekey", value.asInstanceOf[js.Any])
    
    inline def setFill(value: ChartFillFormat): Self = StObject.set(x, "Fill", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: ChartFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setInterior(value: Interior): Self = StObject.set(x, "Interior", value.asInstanceOf[js.Any])
    
    inline def setInvertIfNegative(value: Boolean): Self = StObject.set(x, "InvertIfNegative", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    inline def setMarkerBackgroundColor(value: Double): Self = StObject.set(x, "MarkerBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setMarkerBackgroundColorIndex(value: XlColorIndex): Self = StObject.set(x, "MarkerBackgroundColorIndex", value.asInstanceOf[js.Any])
    
    inline def setMarkerForegroundColor(value: Double): Self = StObject.set(x, "MarkerForegroundColor", value.asInstanceOf[js.Any])
    
    inline def setMarkerForegroundColorIndex(value: XlColorIndex): Self = StObject.set(x, "MarkerForegroundColorIndex", value.asInstanceOf[js.Any])
    
    inline def setMarkerSize(value: Double): Self = StObject.set(x, "MarkerSize", value.asInstanceOf[js.Any])
    
    inline def setMarkerStyle(value: XlMarkerStyle): Self = StObject.set(x, "MarkerStyle", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPictureType(value: Double): Self = StObject.set(x, "PictureType", value.asInstanceOf[js.Any])
    
    inline def setPictureUnit(value: Double): Self = StObject.set(x, "PictureUnit", value.asInstanceOf[js.Any])
    
    inline def setPictureUnit2(value: Double): Self = StObject.set(x, "PictureUnit2", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: () => js.Any): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
    
    inline def setShadow(value: Boolean): Self = StObject.set(x, "Shadow", value.asInstanceOf[js.Any])
    
    inline def setSmooth(value: Boolean): Self = StObject.set(x, "Smooth", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
