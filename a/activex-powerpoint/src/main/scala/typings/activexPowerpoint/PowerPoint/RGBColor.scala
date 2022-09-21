package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoRGBType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RGBColor extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.RGBColor_typekey")
  var PowerPointDotRGBColor_typekey: RGBColor
  
  var RGB: MsoRGBType
}
object RGBColor {
  
  inline def apply(Application: Application, Parent: Any, PowerPointDotRGBColor_typekey: RGBColor, RGB: MsoRGBType): RGBColor = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RGB = RGB.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.RGBColor_typekey")(PowerPointDotRGBColor_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RGBColor]
  }
  
  extension [Self <: RGBColor](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotRGBColor_typekey(value: RGBColor): Self = StObject.set(x, "PowerPoint.RGBColor_typekey", value.asInstanceOf[js.Any])
    
    inline def setRGB(value: MsoRGBType): Self = StObject.set(x, "RGB", value.asInstanceOf[js.Any])
  }
}
