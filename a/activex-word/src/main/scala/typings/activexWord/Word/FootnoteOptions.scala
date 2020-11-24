package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FootnoteOptions extends js.Object {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  var Location: WdFootnoteLocation = js.native
  
  var NumberStyle: WdNoteNumberStyle = js.native
  
  var NumberingRule: WdNumberingRule = js.native
  
  val Parent: js.Any = js.native
  
  var StartingNumber: Double = js.native
  
  @JSName("Word.FootnoteOptions_typekey")
  var WordDotFootnoteOptions_typekey: FootnoteOptions = js.native
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
  implicit class FootnoteOptionsOps[Self <: FootnoteOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: WdFootnoteLocation): Self = this.set("Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberStyle(value: WdNoteNumberStyle): Self = this.set("NumberStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberingRule(value: WdNumberingRule): Self = this.set("NumberingRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartingNumber(value: Double): Self = this.set("StartingNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotFootnoteOptions_typekey(value: FootnoteOptions): Self = this.set("Word.FootnoteOptions_typekey", value.asInstanceOf[js.Any])
  }
}
