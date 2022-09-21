package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReflectionFormat extends StObject {
  
  val Application: Any
  
  var Blur: Double
  
  val Creator: Double
  
  /* private */ @JSName("Office.ReflectionFormat_typekey")
  var OfficeDotReflectionFormat_typekey: ReflectionFormat
  
  var Offset: Double
  
  var Size: Double
  
  var Transparency: Double
  
  var Type: MsoReflectionType
}
object ReflectionFormat {
  
  inline def apply(
    Application: Any,
    Blur: Double,
    Creator: Double,
    OfficeDotReflectionFormat_typekey: ReflectionFormat,
    Offset: Double,
    Size: Double,
    Transparency: Double,
    Type: MsoReflectionType
  ): ReflectionFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Blur = Blur.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Offset = Offset.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Transparency = Transparency.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.ReflectionFormat_typekey")(OfficeDotReflectionFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReflectionFormat]
  }
  
  extension [Self <: ReflectionFormat](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBlur(value: Double): Self = StObject.set(x, "Blur", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotReflectionFormat_typekey(value: ReflectionFormat): Self = StObject.set(x, "Office.ReflectionFormat_typekey", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "Offset", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setTransparency(value: Double): Self = StObject.set(x, "Transparency", value.asInstanceOf[js.Any])
    
    inline def setType(value: MsoReflectionType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
