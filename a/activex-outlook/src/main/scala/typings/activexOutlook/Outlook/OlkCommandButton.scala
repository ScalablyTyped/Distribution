package typings.activexOutlook.Outlook

import typings.activexStdole.stdole.StdFont
import typings.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OlkCommandButton extends js.Object {
  var Accelerator: String
  var AutoSize: Boolean
  var Caption: String
  var DisplayDropArrow: Boolean
  var Enabled: Boolean
  val Font: StdFont
  var MouseIcon: StdPicture
  var MousePointer: OlMousePointer
  @JSName("Outlook.OlkCommandButton_typekey")
  var OutlookDotOlkCommandButton_typekey: OlkCommandButton
  var Picture: StdPicture
  var PictureAlignment: OlPictureAlignment
  var TextAlign: OlTextAlign
  var WordWrap: Boolean
}

object OlkCommandButton {
  @scala.inline
  def apply(
    Accelerator: String,
    AutoSize: Boolean,
    Caption: String,
    DisplayDropArrow: Boolean,
    Enabled: Boolean,
    Font: StdFont,
    MouseIcon: StdPicture,
    MousePointer: OlMousePointer,
    OutlookDotOlkCommandButton_typekey: OlkCommandButton,
    Picture: StdPicture,
    PictureAlignment: OlPictureAlignment,
    TextAlign: OlTextAlign,
    WordWrap: Boolean
  ): OlkCommandButton = {
    val __obj = js.Dynamic.literal(Accelerator = Accelerator.asInstanceOf[js.Any], AutoSize = AutoSize.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], DisplayDropArrow = DisplayDropArrow.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], Picture = Picture.asInstanceOf[js.Any], PictureAlignment = PictureAlignment.asInstanceOf[js.Any], TextAlign = TextAlign.asInstanceOf[js.Any], WordWrap = WordWrap.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OlkCommandButton_typekey")(OutlookDotOlkCommandButton_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlkCommandButton]
  }
}

