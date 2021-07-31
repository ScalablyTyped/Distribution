package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndnoteOptions extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  var Location: WdEndnoteLocation
  
  var NumberStyle: WdNoteNumberStyle
  
  var NumberingRule: WdNumberingRule
  
  val Parent: js.Any
  
  var StartingNumber: Double
  
  @JSName("Word.EndnoteOptions_typekey")
  var WordDotEndnoteOptions_typekey: EndnoteOptions
}
object EndnoteOptions {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Location: WdEndnoteLocation,
    NumberStyle: WdNoteNumberStyle,
    NumberingRule: WdNumberingRule,
    Parent: js.Any,
    StartingNumber: Double,
    WordDotEndnoteOptions_typekey: EndnoteOptions
  ): EndnoteOptions = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], NumberStyle = NumberStyle.asInstanceOf[js.Any], NumberingRule = NumberingRule.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], StartingNumber = StartingNumber.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.EndnoteOptions_typekey")(WordDotEndnoteOptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndnoteOptions]
  }
  
  @scala.inline
  implicit class EndnoteOptionsMutableBuilder[Self <: EndnoteOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: WdEndnoteLocation): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberStyle(value: WdNoteNumberStyle): Self = StObject.set(x, "NumberStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberingRule(value: WdNumberingRule): Self = StObject.set(x, "NumberingRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartingNumber(value: Double): Self = StObject.set(x, "StartingNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotEndnoteOptions_typekey(value: EndnoteOptions): Self = StObject.set(x, "Word.EndnoteOptions_typekey", value.asInstanceOf[js.Any])
  }
}
