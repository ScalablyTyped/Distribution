package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Interior extends StObject {
  
  val Application: js.Any = js.native
  
  var Color: js.Any = js.native
  
  var ColorIndex: js.Any = js.native
  
  val Creator: Double = js.native
  
  var InvertIfNegative: js.Any = js.native
  
  val Parent: js.Any = js.native
  
  var Pattern: js.Any = js.native
  
  var PatternColor: js.Any = js.native
  
  var PatternColorIndex: js.Any = js.native
  
  @JSName("Word.Interior_typekey")
  var WordDotInterior_typekey: Interior = js.native
}
object Interior {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Color: js.Any,
    ColorIndex: js.Any,
    Creator: Double,
    InvertIfNegative: js.Any,
    Parent: js.Any,
    Pattern: js.Any,
    PatternColor: js.Any,
    PatternColorIndex: js.Any,
    WordDotInterior_typekey: Interior
  ): Interior = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], InvertIfNegative = InvertIfNegative.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], PatternColor = PatternColor.asInstanceOf[js.Any], PatternColorIndex = PatternColorIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Interior_typekey")(WordDotInterior_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interior]
  }
  
  @scala.inline
  implicit class InteriorMutableBuilder[Self <: Interior] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: js.Any): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorIndex(value: js.Any): Self = StObject.set(x, "ColorIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvertIfNegative(value: js.Any): Self = StObject.set(x, "InvertIfNegative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPattern(value: js.Any): Self = StObject.set(x, "Pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternColor(value: js.Any): Self = StObject.set(x, "PatternColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternColorIndex(value: js.Any): Self = StObject.set(x, "PatternColorIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotInterior_typekey(value: Interior): Self = StObject.set(x, "Word.Interior_typekey", value.asInstanceOf[js.Any])
  }
}
