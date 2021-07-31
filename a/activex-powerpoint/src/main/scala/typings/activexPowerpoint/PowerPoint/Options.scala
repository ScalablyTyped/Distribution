package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var DisplayPasteOptions: MsoTriState
  
  var DoNotPromptForConvert: MsoTriState
  
  @JSName("PowerPoint.Options_typekey")
  var PowerPointDotOptions_typekey: Options
  
  var ShowCoauthoringMergeChanges: Boolean
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
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayPasteOptions(value: MsoTriState): Self = StObject.set(x, "DisplayPasteOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoNotPromptForConvert(value: MsoTriState): Self = StObject.set(x, "DoNotPromptForConvert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotOptions_typekey(value: Options): Self = StObject.set(x, "PowerPoint.Options_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCoauthoringMergeChanges(value: Boolean): Self = StObject.set(x, "ShowCoauthoringMergeChanges", value.asInstanceOf[js.Any])
  }
}
