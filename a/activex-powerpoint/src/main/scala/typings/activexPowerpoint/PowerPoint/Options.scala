package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var DisplayPasteOptions: MsoTriState = js.native
  
  var DoNotPromptForConvert: MsoTriState = js.native
  
  @JSName("PowerPoint.Options_typekey")
  var PowerPointDotOptions_typekey: Options = js.native
  
  var ShowCoauthoringMergeChanges: Boolean = js.native
}
object Options {
  
  @scala.inline
  def apply(
    DisplayPasteOptions: MsoTriState,
    DoNotPromptForConvert: MsoTriState,
    PowerPointDotOptions_typekey: Options,
    ShowCoauthoringMergeChanges: Boolean
  ): Options = {
    val __obj = js.Dynamic.literal(DisplayPasteOptions = DisplayPasteOptions.asInstanceOf[js.Any], DoNotPromptForConvert = DoNotPromptForConvert.asInstanceOf[js.Any], ShowCoauthoringMergeChanges = ShowCoauthoringMergeChanges.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Options_typekey")(PowerPointDotOptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setDisplayPasteOptions(value: MsoTriState): Self = this.set("DisplayPasteOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoNotPromptForConvert(value: MsoTriState): Self = this.set("DoNotPromptForConvert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotOptions_typekey(value: Options): Self = this.set("PowerPoint.Options_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCoauthoringMergeChanges(value: Boolean): Self = this.set("ShowCoauthoringMergeChanges", value.asInstanceOf[js.Any])
  }
}
