package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GradientStop extends StObject {
  
  val Application: Any
  
  val Color: ColorFormat
  
  val Creator: Double
  
  /* private */ @JSName("Office.GradientStop_typekey")
  var OfficeDotGradientStop_typekey: GradientStop
  
  var Position: Double
  
  var Transparency: Double
}
object GradientStop {
  
  inline def apply(
    Application: Any,
    Color: ColorFormat,
    Creator: Double,
    OfficeDotGradientStop_typekey: GradientStop,
    Position: Double,
    Transparency: Double
  ): GradientStop = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Transparency = Transparency.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.GradientStop_typekey")(OfficeDotGradientStop_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradientStop]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GradientStop] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setColor(value: ColorFormat): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotGradientStop_typekey(value: GradientStop): Self = StObject.set(x, "Office.GradientStop_typekey", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setTransparency(value: Double): Self = StObject.set(x, "Transparency", value.asInstanceOf[js.Any])
  }
}
