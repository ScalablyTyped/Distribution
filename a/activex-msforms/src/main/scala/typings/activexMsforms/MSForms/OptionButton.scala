package typings.activexMsforms.MSForms

import typings.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionButton extends js.Object {
  var Accelerator: String
  var Alignment: fmAlignment
  var AutoSize: Boolean
  var BackColor: Double
  var BackStyle: fmBackStyle
  var BordersSuppress: Boolean
  var Caption: String
  val DisplayStyle: fmDisplayStyle
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
  var GroupName: String
  var Locked: Boolean
  @JSName("MSForms.OptionButton_typekey")
  var MSFormsDotOptionButton_typekey: OptionButton
  var MouseIcon: StdPicture
  var MousePointer: fmMousePointer
  var MultiSelect: fmMultiSelect
  var Picture: StdPicture
  var PicturePosition: fmPicturePosition
  var SpecialEffect: fmButtonEffect
  var TextAlign: fmTextAlign
  var TripleState: Boolean
  val Valid: Boolean
  var Value: js.Any
  var WordWrap: Boolean
  val _Font_Reserved: NewFont
}

object OptionButton {
  @scala.inline
  def apply(
    Accelerator: String,
    Alignment: fmAlignment,
    AutoSize: Boolean,
    BackColor: Double,
    BackStyle: fmBackStyle,
    BordersSuppress: Boolean,
    Caption: String,
    DisplayStyle: fmDisplayStyle,
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
    GroupName: String,
    Locked: Boolean,
    MSFormsDotOptionButton_typekey: OptionButton,
    MouseIcon: StdPicture,
    MousePointer: fmMousePointer,
    MultiSelect: fmMultiSelect,
    Picture: StdPicture,
    PicturePosition: fmPicturePosition,
    SpecialEffect: fmButtonEffect,
    TextAlign: fmTextAlign,
    TripleState: Boolean,
    Valid: Boolean,
    Value: js.Any,
    WordWrap: Boolean,
    _Font_Reserved: NewFont
  ): OptionButton = {
    val __obj = js.Dynamic.literal(Accelerator = Accelerator.asInstanceOf[js.Any], Alignment = Alignment.asInstanceOf[js.Any], AutoSize = AutoSize.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BackStyle = BackStyle.asInstanceOf[js.Any], BordersSuppress = BordersSuppress.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], DisplayStyle = DisplayStyle.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], FontBold = FontBold.asInstanceOf[js.Any], FontItalic = FontItalic.asInstanceOf[js.Any], FontName = FontName.asInstanceOf[js.Any], FontSize = FontSize.asInstanceOf[js.Any], FontStrikethru = FontStrikethru.asInstanceOf[js.Any], FontUnderline = FontUnderline.asInstanceOf[js.Any], FontWeight = FontWeight.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], GroupName = GroupName.asInstanceOf[js.Any], Locked = Locked.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], MultiSelect = MultiSelect.asInstanceOf[js.Any], Picture = Picture.asInstanceOf[js.Any], PicturePosition = PicturePosition.asInstanceOf[js.Any], SpecialEffect = SpecialEffect.asInstanceOf[js.Any], TextAlign = TextAlign.asInstanceOf[js.Any], TripleState = TripleState.asInstanceOf[js.Any], Valid = Valid.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], WordWrap = WordWrap.asInstanceOf[js.Any], _Font_Reserved = _Font_Reserved.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.OptionButton_typekey")(MSFormsDotOptionButton_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionButton]
  }
}

