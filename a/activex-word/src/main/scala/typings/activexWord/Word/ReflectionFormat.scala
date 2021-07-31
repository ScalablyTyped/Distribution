package typings.activexWord.Word

import typings.activexOffice.Office.MsoReflectionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReflectionFormat extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  var Blur: Double
  
  val Creator: Double
  
  var Offset: Double
  
  val Parent: js.Any
  
  var Size: Double
  
  var Transparency: Double
  
  var Type: MsoReflectionType
  
  @JSName("Word.ReflectionFormat_typekey")
  var WordDotReflectionFormat_typekey: ReflectionFormat
}
object ReflectionFormat {
  
  @scala.inline
  def apply(
    Application: Application,
    Blur: Double,
    Creator: Double,
    Offset: Double,
    Parent: js.Any,
    Size: Double,
    Transparency: Double,
    Type: MsoReflectionType,
    WordDotReflectionFormat_typekey: ReflectionFormat
  ): ReflectionFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Blur = Blur.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Offset = Offset.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Transparency = Transparency.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ReflectionFormat_typekey")(WordDotReflectionFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReflectionFormat]
  }
  
  @scala.inline
  implicit class ReflectionFormatMutableBuilder[Self <: ReflectionFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlur(value: Double): Self = StObject.set(x, "Blur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "Offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparency(value: Double): Self = StObject.set(x, "Transparency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MsoReflectionType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotReflectionFormat_typekey(value: ReflectionFormat): Self = StObject.set(x, "Word.ReflectionFormat_typekey", value.asInstanceOf[js.Any])
  }
}
