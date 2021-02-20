package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoColorType
import typings.activexOffice.Office.MsoRGBType
import typings.activexOffice.Office.MsoThemeColorIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorFormat extends StObject {
  
  val Application: js.Any = js.native
  
  var Brightness: Double = js.native
  
  val Creator: Double = js.native
  
  var ObjectThemeColor: MsoThemeColorIndex = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.ColorFormat_typekey")
  var PowerPointDotColorFormat_typekey: ColorFormat = js.native
  
  var RGB: MsoRGBType = js.native
  
  var SchemeColor: PpColorSchemeIndex = js.native
  
  var TintAndShade: Double = js.native
  
  val Type: MsoColorType = js.native
}
object ColorFormat {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Brightness: Double,
    Creator: Double,
    ObjectThemeColor: MsoThemeColorIndex,
    Parent: js.Any,
    PowerPointDotColorFormat_typekey: ColorFormat,
    RGB: MsoRGBType,
    SchemeColor: PpColorSchemeIndex,
    TintAndShade: Double,
    Type: MsoColorType
  ): ColorFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Brightness = Brightness.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], ObjectThemeColor = ObjectThemeColor.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RGB = RGB.asInstanceOf[js.Any], SchemeColor = SchemeColor.asInstanceOf[js.Any], TintAndShade = TintAndShade.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ColorFormat_typekey")(PowerPointDotColorFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorFormat]
  }
  
  @scala.inline
  implicit class ColorFormatMutableBuilder[Self <: ColorFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrightness(value: Double): Self = StObject.set(x, "Brightness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectThemeColor(value: MsoThemeColorIndex): Self = StObject.set(x, "ObjectThemeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotColorFormat_typekey(value: ColorFormat): Self = StObject.set(x, "PowerPoint.ColorFormat_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRGB(value: MsoRGBType): Self = StObject.set(x, "RGB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemeColor(value: PpColorSchemeIndex): Self = StObject.set(x, "SchemeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTintAndShade(value: Double): Self = StObject.set(x, "TintAndShade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MsoColorType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
