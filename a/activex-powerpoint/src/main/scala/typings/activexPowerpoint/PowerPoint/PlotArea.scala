package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotArea extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  val Border: ChartBorder
  
  def ClearFormats(): js.Any
  
  val Creator: Double
  
  val Fill: ChartFillFormat
  
  val Format: ChartFormat
  
  var Height: Double
  
  var InsideHeight: Double
  
  var InsideLeft: Double
  
  var InsideTop: Double
  
  var InsideWidth: Double
  
  val Interior: typings.activexPowerpoint.PowerPoint.Interior
  
  var Left: Double
  
  val Name: String
  
  val Parent: js.Any
  
  var Position: XlChartElementPosition
  
  /* private */ @JSName("PowerPoint.PlotArea_typekey")
  var PowerPointDotPlotArea_typekey: PlotArea
  
  def Select(): js.Any
  
  var Top: Double
  
  var Width: Double
}
object PlotArea {
  
  inline def apply(
    Application: Application,
    Border: ChartBorder,
    ClearFormats: () => js.Any,
    Creator: Double,
    Fill: ChartFillFormat,
    Format: ChartFormat,
    Height: Double,
    InsideHeight: Double,
    InsideLeft: Double,
    InsideTop: Double,
    InsideWidth: Double,
    Interior: Interior,
    Left: Double,
    Name: String,
    Parent: js.Any,
    Position: XlChartElementPosition,
    PowerPointDotPlotArea_typekey: PlotArea,
    Select: () => js.Any,
    Top: Double,
    Width: Double
  ): PlotArea = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], ClearFormats = js.Any.fromFunction0(ClearFormats), Creator = Creator.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], InsideHeight = InsideHeight.asInstanceOf[js.Any], InsideLeft = InsideLeft.asInstanceOf[js.Any], InsideTop = InsideTop.asInstanceOf[js.Any], InsideWidth = InsideWidth.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Top = Top.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.PlotArea_typekey")(PowerPointDotPlotArea_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotArea]
  }
  
  extension [Self <: PlotArea](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBorder(value: ChartBorder): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    inline def setClearFormats(value: () => js.Any): Self = StObject.set(x, "ClearFormats", js.Any.fromFunction0(value))
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setFill(value: ChartFillFormat): Self = StObject.set(x, "Fill", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: ChartFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setInsideHeight(value: Double): Self = StObject.set(x, "InsideHeight", value.asInstanceOf[js.Any])
    
    inline def setInsideLeft(value: Double): Self = StObject.set(x, "InsideLeft", value.asInstanceOf[js.Any])
    
    inline def setInsideTop(value: Double): Self = StObject.set(x, "InsideTop", value.asInstanceOf[js.Any])
    
    inline def setInsideWidth(value: Double): Self = StObject.set(x, "InsideWidth", value.asInstanceOf[js.Any])
    
    inline def setInterior(value: Interior): Self = StObject.set(x, "Interior", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: XlChartElementPosition): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotPlotArea_typekey(value: PlotArea): Self = StObject.set(x, "PowerPoint.PlotArea_typekey", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: () => js.Any): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
    
    inline def setTop(value: Double): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
