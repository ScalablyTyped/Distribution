package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FootnoteOptions extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  var Location: WdFootnoteLocation
  
  var NumberStyle: WdNoteNumberStyle
  
  var NumberingRule: WdNumberingRule
  
  val Parent: js.Any
  
  var StartingNumber: Double
  
  @JSName("Word.FootnoteOptions_typekey")
  var WordDotFootnoteOptions_typekey: FootnoteOptions
}
object FootnoteOptions {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Location: WdFootnoteLocation,
    NumberStyle: WdNoteNumberStyle,
    NumberingRule: WdNumberingRule,
    Parent: js.Any,
    StartingNumber: Double,
    WordDotFootnoteOptions_typekey: FootnoteOptions
  ): FootnoteOptions = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], NumberStyle = NumberStyle.asInstanceOf[js.Any], NumberingRule = NumberingRule.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], StartingNumber = StartingNumber.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.FootnoteOptions_typekey")(WordDotFootnoteOptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FootnoteOptions]
  }
  
  @scala.inline
  implicit class FootnoteOptionsMutableBuilder[Self <: FootnoteOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: WdFootnoteLocation): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberStyle(value: WdNoteNumberStyle): Self = StObject.set(x, "NumberStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberingRule(value: WdNumberingRule): Self = StObject.set(x, "NumberingRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartingNumber(value: Double): Self = StObject.set(x, "StartingNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotFootnoteOptions_typekey(value: FootnoteOptions): Self = StObject.set(x, "Word.FootnoteOptions_typekey", value.asInstanceOf[js.Any])
  }
}
