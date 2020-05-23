package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Font extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  var AutoRotateNumbers: MsoTriState
  var BaselineOffset: Double
  var Bold: MsoTriState
  val Color: ColorFormat
  val Embeddable: MsoTriState
  val Embedded: MsoTriState
  var Emboss: MsoTriState
  var Italic: MsoTriState
  var Name: String
  var NameAscii: String
  var NameComplexScript: String
  var NameFarEast: String
  var NameOther: String
  val Parent: js.Any
  @JSName("PowerPoint.Font_typekey")
  var PowerPointDotFont_typekey: Font
  var Shadow: MsoTriState
  var Size: Double
  var Subscript: MsoTriState
  var Superscript: MsoTriState
  var Underline: MsoTriState
}

object Font {
  @scala.inline
  def apply(
    Application: Application,
    AutoRotateNumbers: MsoTriState,
    BaselineOffset: Double,
    Bold: MsoTriState,
    Color: ColorFormat,
    Embeddable: MsoTriState,
    Embedded: MsoTriState,
    Emboss: MsoTriState,
    Italic: MsoTriState,
    Name: String,
    NameAscii: String,
    NameComplexScript: String,
    NameFarEast: String,
    NameOther: String,
    Parent: js.Any,
    PowerPointDotFont_typekey: Font,
    Shadow: MsoTriState,
    Size: Double,
    Subscript: MsoTriState,
    Superscript: MsoTriState,
    Underline: MsoTriState
  ): Font = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoRotateNumbers = AutoRotateNumbers.asInstanceOf[js.Any], BaselineOffset = BaselineOffset.asInstanceOf[js.Any], Bold = Bold.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], Embeddable = Embeddable.asInstanceOf[js.Any], Embedded = Embedded.asInstanceOf[js.Any], Emboss = Emboss.asInstanceOf[js.Any], Italic = Italic.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NameAscii = NameAscii.asInstanceOf[js.Any], NameComplexScript = NameComplexScript.asInstanceOf[js.Any], NameFarEast = NameFarEast.asInstanceOf[js.Any], NameOther = NameOther.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Shadow = Shadow.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Subscript = Subscript.asInstanceOf[js.Any], Superscript = Superscript.asInstanceOf[js.Any], Underline = Underline.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Font_typekey")(PowerPointDotFont_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
}

