package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shading extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  var BackgroundPatternColor: WdColor
  
  var BackgroundPatternColorIndex: WdColorIndex
  
  val Creator: Double
  
  var ForegroundPatternColor: WdColor
  
  var ForegroundPatternColorIndex: WdColorIndex
  
  val Parent: js.Any
  
  var Texture: WdTextureIndex
  
  @JSName("Word.Shading_typekey")
  var WordDotShading_typekey: Shading
}
object Shading {
  
  @scala.inline
  def apply(
    Application: Application,
    BackgroundPatternColor: WdColor,
    BackgroundPatternColorIndex: WdColorIndex,
    Creator: Double,
    ForegroundPatternColor: WdColor,
    ForegroundPatternColorIndex: WdColorIndex,
    Parent: js.Any,
    Texture: WdTextureIndex,
    WordDotShading_typekey: Shading
  ): Shading = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BackgroundPatternColor = BackgroundPatternColor.asInstanceOf[js.Any], BackgroundPatternColorIndex = BackgroundPatternColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], ForegroundPatternColor = ForegroundPatternColor.asInstanceOf[js.Any], ForegroundPatternColorIndex = ForegroundPatternColorIndex.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Texture = Texture.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Shading_typekey")(WordDotShading_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shading]
  }
  
  @scala.inline
  implicit class ShadingMutableBuilder[Self <: Shading] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundPatternColor(value: WdColor): Self = StObject.set(x, "BackgroundPatternColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundPatternColorIndex(value: WdColorIndex): Self = StObject.set(x, "BackgroundPatternColorIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForegroundPatternColor(value: WdColor): Self = StObject.set(x, "ForegroundPatternColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForegroundPatternColorIndex(value: WdColorIndex): Self = StObject.set(x, "ForegroundPatternColorIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTexture(value: WdTextureIndex): Self = StObject.set(x, "Texture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotShading_typekey(value: Shading): Self = StObject.set(x, "Word.Shading_typekey", value.asInstanceOf[js.Any])
  }
}
