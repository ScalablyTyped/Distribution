package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartBorder extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  var Color: js.Any
  
  var ColorIndex: js.Any
  
  val Creator: Double
  
  var LineStyle: js.Any
  
  val Parent: js.Any
  
  /* private */ @JSName("PowerPoint.ChartBorder_typekey")
  var PowerPointDotChartBorder_typekey: ChartBorder
  
  var Weight: js.Any
}
object ChartBorder {
  
  inline def apply(
    Application: Application,
    Color: js.Any,
    ColorIndex: js.Any,
    Creator: Double,
    LineStyle: js.Any,
    Parent: js.Any,
    PowerPointDotChartBorder_typekey: ChartBorder,
    Weight: js.Any
  ): ChartBorder = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], LineStyle = LineStyle.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Weight = Weight.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ChartBorder_typekey")(PowerPointDotChartBorder_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartBorder]
  }
  
  extension [Self <: ChartBorder](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setColor(value: js.Any): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setColorIndex(value: js.Any): Self = StObject.set(x, "ColorIndex", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setLineStyle(value: js.Any): Self = StObject.set(x, "LineStyle", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotChartBorder_typekey(value: ChartBorder): Self = StObject.set(x, "PowerPoint.ChartBorder_typekey", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: js.Any): Self = StObject.set(x, "Weight", value.asInstanceOf[js.Any])
  }
}
