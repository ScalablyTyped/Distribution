package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlowFormat extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Color: ColorFormat
  
  val Creator: Double
  
  val Parent: js.Any
  
  var Radius: Double
  
  var Transparency: Double
  
  @JSName("Word.GlowFormat_typekey")
  var WordDotGlowFormat_typekey: GlowFormat
}
object GlowFormat {
  
  @scala.inline
  def apply(
    Application: Application,
    Color: ColorFormat,
    Creator: Double,
    Parent: js.Any,
    Radius: Double,
    Transparency: Double,
    WordDotGlowFormat_typekey: GlowFormat
  ): GlowFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Radius = Radius.asInstanceOf[js.Any], Transparency = Transparency.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.GlowFormat_typekey")(WordDotGlowFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlowFormat]
  }
  
  @scala.inline
  implicit class GlowFormatMutableBuilder[Self <: GlowFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: ColorFormat): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "Radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparency(value: Double): Self = StObject.set(x, "Transparency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotGlowFormat_typekey(value: GlowFormat): Self = StObject.set(x, "Word.GlowFormat_typekey", value.asInstanceOf[js.Any])
  }
}
