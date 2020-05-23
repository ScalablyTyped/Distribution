package typings.activexMsforms.MSForms

import typings.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Label extends js.Object {
  var Accelerator: String
  var AutoSize: Boolean
  var BackColor: Double
  var BackStyle: fmBackStyle
  var BorderColor: Double
  var BorderStyle: fmBorderStyle
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
  @JSName("MSForms.Label_typekey")
  var MSFormsDotLabel_typekey: Label
  var MouseIcon: StdPicture
  var MousePointer: fmMousePointer
  var Picture: StdPicture
  var PicturePosition: fmPicturePosition
  var SpecialEffect: fmSpecialEffect
  var TextAlign: fmTextAlign
  var WordWrap: Boolean
  val _Font_Reserved: NewFont
  var _Value: String
}

object Label {
  @scala.inline
  def apply(
    Accelerator: String,
    AutoSize: Boolean,
    BackColor: Double,
    BackStyle: fmBackStyle,
    BorderColor: Double,
    BorderStyle: fmBorderStyle,
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
    MSFormsDotLabel_typekey: Label,
    MouseIcon: StdPicture,
    MousePointer: fmMousePointer,
    Picture: StdPicture,
    PicturePosition: fmPicturePosition,
    SpecialEffect: fmSpecialEffect,
    TextAlign: fmTextAlign,
    WordWrap: Boolean,
    _Font_Reserved: NewFont,
    _Value: String
  ): Label = {
    val __obj = js.Dynamic.literal(Accelerator = Accelerator.asInstanceOf[js.Any], AutoSize = AutoSize.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BackStyle = BackStyle.asInstanceOf[js.Any], BorderColor = BorderColor.asInstanceOf[js.Any], BorderStyle = BorderStyle.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], FontBold = FontBold.asInstanceOf[js.Any], FontItalic = FontItalic.asInstanceOf[js.Any], FontName = FontName.asInstanceOf[js.Any], FontSize = FontSize.asInstanceOf[js.Any], FontStrikethru = FontStrikethru.asInstanceOf[js.Any], FontUnderline = FontUnderline.asInstanceOf[js.Any], FontWeight = FontWeight.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], Picture = Picture.asInstanceOf[js.Any], PicturePosition = PicturePosition.asInstanceOf[js.Any], SpecialEffect = SpecialEffect.asInstanceOf[js.Any], TextAlign = TextAlign.asInstanceOf[js.Any], WordWrap = WordWrap.asInstanceOf[js.Any], _Font_Reserved = _Font_Reserved.asInstanceOf[js.Any], _Value = _Value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.Label_typekey")(MSFormsDotLabel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
}

