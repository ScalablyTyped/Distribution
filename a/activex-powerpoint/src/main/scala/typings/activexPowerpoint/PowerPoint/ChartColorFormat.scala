package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartColorFormat extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  val Creator: Double
  
  val Parent: js.Any
  
  /* private */ @JSName("PowerPoint.ChartColorFormat_typekey")
  var PowerPointDotChartColorFormat_typekey: ChartColorFormat
  
  val RGB: Double
  
  var SchemeColor: Double
  
  val Type: Double
  
  val _Default: Double
}
object ChartColorFormat {
  
  inline def apply(
    Application: Application,
    Creator: Double,
    Parent: js.Any,
    PowerPointDotChartColorFormat_typekey: ChartColorFormat,
    RGB: Double,
    SchemeColor: Double,
    Type: Double,
    _Default: Double
  ): ChartColorFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RGB = RGB.asInstanceOf[js.Any], SchemeColor = SchemeColor.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], _Default = _Default.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ChartColorFormat_typekey")(PowerPointDotChartColorFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartColorFormat]
  }
  
  extension [Self <: ChartColorFormat](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotChartColorFormat_typekey(value: ChartColorFormat): Self = StObject.set(x, "PowerPoint.ChartColorFormat_typekey", value.asInstanceOf[js.Any])
    
    inline def setRGB(value: Double): Self = StObject.set(x, "RGB", value.asInstanceOf[js.Any])
    
    inline def setSchemeColor(value: Double): Self = StObject.set(x, "SchemeColor", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def set_Default(value: Double): Self = StObject.set(x, "_Default", value.asInstanceOf[js.Any])
  }
}
