package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMsoInterior extends StObject {
  
  val Application: js.Any
  
  var Color: js.Any
  
  var ColorIndex: js.Any
  
  val Creator: Double
  
  var InvertIfNegative: js.Any
  
  @JSName("Office.IMsoInterior_typekey")
  var OfficeDotIMsoInterior_typekey: IMsoInterior
  
  val Parent: js.Any
  
  var Pattern: js.Any
  
  var PatternColor: js.Any
  
  var PatternColorIndex: js.Any
}
object IMsoInterior {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Color: js.Any,
    ColorIndex: js.Any,
    Creator: Double,
    InvertIfNegative: js.Any,
    OfficeDotIMsoInterior_typekey: IMsoInterior,
    Parent: js.Any,
    Pattern: js.Any,
    PatternColor: js.Any,
    PatternColorIndex: js.Any
  ): IMsoInterior = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], InvertIfNegative = InvertIfNegative.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], PatternColor = PatternColor.asInstanceOf[js.Any], PatternColorIndex = PatternColorIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.IMsoInterior_typekey")(OfficeDotIMsoInterior_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMsoInterior]
  }
  
  @scala.inline
  implicit class IMsoInteriorMutableBuilder[Self <: IMsoInterior] (val x: Self) extends AnyVal {
    
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
    def setOfficeDotIMsoInterior_typekey(value: IMsoInterior): Self = StObject.set(x, "Office.IMsoInterior_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPattern(value: js.Any): Self = StObject.set(x, "Pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternColor(value: js.Any): Self = StObject.set(x, "PatternColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternColorIndex(value: js.Any): Self = StObject.set(x, "PatternColorIndex", value.asInstanceOf[js.Any])
  }
}
