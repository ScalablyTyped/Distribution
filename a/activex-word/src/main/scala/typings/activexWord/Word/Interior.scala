package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Interior extends StObject {
  
  val Application: Any
  
  var Color: Any
  
  var ColorIndex: Any
  
  val Creator: Double
  
  var InvertIfNegative: Any
  
  val Parent: Any
  
  var Pattern: Any
  
  var PatternColor: Any
  
  var PatternColorIndex: Any
  
  /* private */ @JSName("Word.Interior_typekey")
  var WordDotInterior_typekey: Interior
}
object Interior {
  
  inline def apply(
    Application: Any,
    Color: Any,
    ColorIndex: Any,
    Creator: Double,
    InvertIfNegative: Any,
    Parent: Any,
    Pattern: Any,
    PatternColor: Any,
    PatternColorIndex: Any,
    WordDotInterior_typekey: Interior
  ): Interior = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], InvertIfNegative = InvertIfNegative.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], PatternColor = PatternColor.asInstanceOf[js.Any], PatternColorIndex = PatternColorIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Interior_typekey")(WordDotInterior_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interior]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Interior] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setColor(value: Any): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setColorIndex(value: Any): Self = StObject.set(x, "ColorIndex", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setInvertIfNegative(value: Any): Self = StObject.set(x, "InvertIfNegative", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: Any): Self = StObject.set(x, "Pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternColor(value: Any): Self = StObject.set(x, "PatternColor", value.asInstanceOf[js.Any])
    
    inline def setPatternColorIndex(value: Any): Self = StObject.set(x, "PatternColorIndex", value.asInstanceOf[js.Any])
    
    inline def setWordDotInterior_typekey(value: Interior): Self = StObject.set(x, "Word.Interior_typekey", value.asInstanceOf[js.Any])
  }
}
