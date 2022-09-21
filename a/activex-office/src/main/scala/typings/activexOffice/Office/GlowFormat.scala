package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlowFormat extends StObject {
  
  val Application: Any
  
  val Color: ColorFormat
  
  val Creator: Double
  
  /* private */ @JSName("Office.GlowFormat_typekey")
  var OfficeDotGlowFormat_typekey: GlowFormat
  
  var Radius: Double
  
  var Transparency: Double
}
object GlowFormat {
  
  inline def apply(
    Application: Any,
    Color: ColorFormat,
    Creator: Double,
    OfficeDotGlowFormat_typekey: GlowFormat,
    Radius: Double,
    Transparency: Double
  ): GlowFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Radius = Radius.asInstanceOf[js.Any], Transparency = Transparency.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.GlowFormat_typekey")(OfficeDotGlowFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlowFormat]
  }
  
  extension [Self <: GlowFormat](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setColor(value: ColorFormat): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotGlowFormat_typekey(value: GlowFormat): Self = StObject.set(x, "Office.GlowFormat_typekey", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "Radius", value.asInstanceOf[js.Any])
    
    inline def setTransparency(value: Double): Self = StObject.set(x, "Transparency", value.asInstanceOf[js.Any])
  }
}
