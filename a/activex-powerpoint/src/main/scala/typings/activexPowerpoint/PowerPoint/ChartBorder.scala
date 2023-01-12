package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartBorder extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  var Color: Any
  
  var ColorIndex: Any
  
  val Creator: Double
  
  var LineStyle: Any
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.ChartBorder_typekey")
  var PowerPointDotChartBorder_typekey: ChartBorder
  
  var Weight: Any
}
object ChartBorder {
  
  inline def apply(
    Application: Application,
    Color: Any,
    ColorIndex: Any,
    Creator: Double,
    LineStyle: Any,
    Parent: Any,
    PowerPointDotChartBorder_typekey: ChartBorder,
    Weight: Any
  ): ChartBorder = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], LineStyle = LineStyle.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Weight = Weight.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ChartBorder_typekey")(PowerPointDotChartBorder_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartBorder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartBorder] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setColor(value: Any): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setColorIndex(value: Any): Self = StObject.set(x, "ColorIndex", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setLineStyle(value: Any): Self = StObject.set(x, "LineStyle", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotChartBorder_typekey(value: ChartBorder): Self = StObject.set(x, "PowerPoint.ChartBorder_typekey", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: Any): Self = StObject.set(x, "Weight", value.asInstanceOf[js.Any])
  }
}
