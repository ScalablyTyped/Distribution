package typings.activexMsforms.MSForms

import typings.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandButton extends js.Object {
  var Accelerator: String
  var AutoSize: Boolean
  var BackColor: Double
  var BackStyle: fmBackStyle
  var Caption: String
  var Enabled: Boolean
  var Font: NewFont
  var FontBold: Boolean
  var FontItalic: Boolean
  var FontName: String
  var FontSize: Double
  var FontStrikethru: Boolean
  var FontUnderline: Boolean
  var FontWeight: Double
  var ForeColor: Double
  var Locked: Boolean
  @JSName("MSForms.CommandButton_typekey")
  var MSFormsDotCommandButton_typekey: CommandButton
  var MouseIcon: StdPicture
  var MousePointer: fmMousePointer
  var Picture: StdPicture
  var PicturePosition: fmPicturePosition
  var TakeFocusOnClick: Boolean
  var Value: Boolean
  var WordWrap: Boolean
  val _Font_Reserved: NewFont
}

object CommandButton {
  @scala.inline
  def apply(
    Accelerator: String,
    AutoSize: Boolean,
    BackColor: Double,
    BackStyle: fmBackStyle,
    Caption: String,
    Enabled: Boolean,
    Font: NewFont,
    FontBold: Boolean,
    FontItalic: Boolean,
    FontName: String,
    FontSize: Double,
    FontStrikethru: Boolean,
    FontUnderline: Boolean,
    FontWeight: Double,
    ForeColor: Double,
    Locked: Boolean,
    MSFormsDotCommandButton_typekey: CommandButton,
    MouseIcon: StdPicture,
    MousePointer: fmMousePointer,
    Picture: StdPicture,
    PicturePosition: fmPicturePosition,
    TakeFocusOnClick: Boolean,
    Value: Boolean,
    WordWrap: Boolean,
    _Font_Reserved: NewFont
  ): CommandButton = {
    val __obj = js.Dynamic.literal(Accelerator = Accelerator.asInstanceOf[js.Any], AutoSize = AutoSize.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BackStyle = BackStyle.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], FontBold = FontBold.asInstanceOf[js.Any], FontItalic = FontItalic.asInstanceOf[js.Any], FontName = FontName.asInstanceOf[js.Any], FontSize = FontSize.asInstanceOf[js.Any], FontStrikethru = FontStrikethru.asInstanceOf[js.Any], FontUnderline = FontUnderline.asInstanceOf[js.Any], FontWeight = FontWeight.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], Locked = Locked.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], Picture = Picture.asInstanceOf[js.Any], PicturePosition = PicturePosition.asInstanceOf[js.Any], TakeFocusOnClick = TakeFocusOnClick.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], WordWrap = WordWrap.asInstanceOf[js.Any], _Font_Reserved = _Font_Reserved.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.CommandButton_typekey")(MSFormsDotCommandButton_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandButton]
  }
}

