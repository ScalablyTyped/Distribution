package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartArea extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  var AutoScaleFont: js.Any
  
  val Border: ChartBorder
  
  def Clear(): js.Any
  
  def ClearContents(): js.Any
  
  def ClearFormats(): js.Any
  
  def Copy(): js.Any
  
  val Creator: Double
  
  val Fill: ChartFillFormat
  
  val Font: ChartFont
  
  val Format: ChartFormat
  
  var Height: Double
  
  val Interior: typings.activexPowerpoint.PowerPoint.Interior
  
  var Left: Double
  
  val Name: String
  
  val Parent: js.Any
  
  /* private */ @JSName("PowerPoint.ChartArea_typekey")
  var PowerPointDotChartArea_typekey: ChartArea
  
  def Select(): js.Any
  
  var Shadow: Boolean
  
  var Top: Double
  
  var Width: Double
}
object ChartArea {
  
  inline def apply(
    Application: Application,
    AutoScaleFont: js.Any,
    Border: ChartBorder,
    Clear: () => js.Any,
    ClearContents: () => js.Any,
    ClearFormats: () => js.Any,
    Copy: () => js.Any,
    Creator: Double,
    Fill: ChartFillFormat,
    Font: ChartFont,
    Format: ChartFormat,
    Height: Double,
    Interior: Interior,
    Left: Double,
    Name: String,
    Parent: js.Any,
    PowerPointDotChartArea_typekey: ChartArea,
    Select: () => js.Any,
    Shadow: Boolean,
    Top: Double,
    Width: Double
  ): ChartArea = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoScaleFont = AutoScaleFont.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Clear = js.Any.fromFunction0(Clear), ClearContents = js.Any.fromFunction0(ClearContents), ClearFormats = js.Any.fromFunction0(ClearFormats), Copy = js.Any.fromFunction0(Copy), Creator = Creator.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Shadow = Shadow.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ChartArea_typekey")(PowerPointDotChartArea_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartArea]
  }
  
  extension [Self <: ChartArea](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setAutoScaleFont(value: js.Any): Self = StObject.set(x, "AutoScaleFont", value.asInstanceOf[js.Any])
    
    inline def setBorder(value: ChartBorder): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    inline def setClear(value: () => js.Any): Self = StObject.set(x, "Clear", js.Any.fromFunction0(value))
    
    inline def setClearContents(value: () => js.Any): Self = StObject.set(x, "ClearContents", js.Any.fromFunction0(value))
    
    inline def setClearFormats(value: () => js.Any): Self = StObject.set(x, "ClearFormats", js.Any.fromFunction0(value))
    
    inline def setCopy(value: () => js.Any): Self = StObject.set(x, "Copy", js.Any.fromFunction0(value))
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setFill(value: ChartFillFormat): Self = StObject.set(x, "Fill", value.asInstanceOf[js.Any])
    
    inline def setFont(value: ChartFont): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: ChartFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setInterior(value: Interior): Self = StObject.set(x, "Interior", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotChartArea_typekey(value: ChartArea): Self = StObject.set(x, "PowerPoint.ChartArea_typekey", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: () => js.Any): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
    
    inline def setShadow(value: Boolean): Self = StObject.set(x, "Shadow", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
