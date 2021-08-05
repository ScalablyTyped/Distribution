package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Interior extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  var Color: js.Any
  
  var ColorIndex: js.Any
  
  val Creator: Double
  
  var InvertIfNegative: js.Any
  
  val Parent: js.Any
  
  var Pattern: js.Any
  
  var PatternColor: js.Any
  
  var PatternColorIndex: js.Any
  
  /* private */ @JSName("PowerPoint.Interior_typekey")
  var PowerPointDotInterior_typekey: Interior
}
object Interior {
  
  inline def apply(
    Application: Application,
    Color: js.Any,
    ColorIndex: js.Any,
    Creator: Double,
    InvertIfNegative: js.Any,
    Parent: js.Any,
    Pattern: js.Any,
    PatternColor: js.Any,
    PatternColorIndex: js.Any,
    PowerPointDotInterior_typekey: Interior
  ): Interior = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], InvertIfNegative = InvertIfNegative.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], PatternColor = PatternColor.asInstanceOf[js.Any], PatternColorIndex = PatternColorIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Interior_typekey")(PowerPointDotInterior_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interior]
  }
  
  extension [Self <: Interior](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setColor(value: js.Any): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setColorIndex(value: js.Any): Self = StObject.set(x, "ColorIndex", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setInvertIfNegative(value: js.Any): Self = StObject.set(x, "InvertIfNegative", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: js.Any): Self = StObject.set(x, "Pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternColor(value: js.Any): Self = StObject.set(x, "PatternColor", value.asInstanceOf[js.Any])
    
    inline def setPatternColorIndex(value: js.Any): Self = StObject.set(x, "PatternColorIndex", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotInterior_typekey(value: Interior): Self = StObject.set(x, "PowerPoint.Interior_typekey", value.asInstanceOf[js.Any])
  }
}
