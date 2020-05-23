package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
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
}

