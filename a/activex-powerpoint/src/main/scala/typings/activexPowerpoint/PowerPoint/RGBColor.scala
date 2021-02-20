package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoRGBType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RGBColor extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.RGBColor_typekey")
  var PowerPointDotRGBColor_typekey: RGBColor = js.native
  
  var RGB: MsoRGBType = js.native
}
object RGBColor {
  
  @scala.inline
  def apply(Application: Application, Parent: js.Any, PowerPointDotRGBColor_typekey: RGBColor, RGB: MsoRGBType): RGBColor = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RGB = RGB.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.RGBColor_typekey")(PowerPointDotRGBColor_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RGBColor]
  }
  
  @scala.inline
  implicit class RGBColorMutableBuilder[Self <: RGBColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotRGBColor_typekey(value: RGBColor): Self = StObject.set(x, "PowerPoint.RGBColor_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRGB(value: MsoRGBType): Self = StObject.set(x, "RGB", value.asInstanceOf[js.Any])
  }
}
