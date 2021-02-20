package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GradientStop extends StObject {
  
  val Application: js.Any = js.native
  
  val Color: ColorFormat = js.native
  
  val Creator: Double = js.native
  
  @JSName("Office.GradientStop_typekey")
  var OfficeDotGradientStop_typekey: GradientStop = js.native
  
  var Position: Double = js.native
  
  var Transparency: Double = js.native
}
object GradientStop {
  
  @scala.inline
  def apply(
    Application: js.Any,
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
  implicit class GradientStopMutableBuilder[Self <: GradientStop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: ColorFormat): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotGradientStop_typekey(value: GradientStop): Self = StObject.set(x, "Office.GradientStop_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparency(value: Double): Self = StObject.set(x, "Transparency", value.asInstanceOf[js.Any])
  }
}
