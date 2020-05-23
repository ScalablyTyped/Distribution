package typings.activexLibreoffice.com_.sun.star.awt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes the characteristics of a font.
  *
  * For example, this can be used to select a font.
  */
trait FontDescriptor extends js.Object {
  /**
    * specifies the character set which is supported by the font.
    *
    * Use one value out of the constant group {@link com.sun.star.awt.CharSet} .
    */
  var CharSet: Double
  /**
    * specifies the character width.
    *
    * Depending on the specified width, a font that supports this width may be selected.
    *
    * The value is expressed as a percentage.
    */
  var CharacterWidth: Double
  /**
    * specifies the general style of the font.
    *
    * Use one value out of the constant group {@link com.sun.star.awt.FontFamily} .
    */
  var Family: Double
  /** specifies the height of the font in the measure of the destination. */
  var Height: Double
  /** For requesting, it specifies if there is a kerning table available. For selecting, it specifies if the kerning table is to be used. */
  var Kerning: Boolean
  /** specifies the exact name of the font. */
  var Name: String
  /**
    * specifies the rotation of the font.
    *
    * The unit of measure is degrees; 0 is the baseline.
    */
  var Orientation: Double
  /**
    * specifies the pitch of the font.
    *
    * Use one value out of the constant group {@link com.sun.star.awt.FontPitch} .
    */
  var Pitch: Double
  /** specifies the slant of the font. */
  var Slant: FontSlant
  /**
    * specifies the kind of strikeout.
    *
    * Use one value out of the constant group {@link com.sun.star.awt.FontStrikeout} .
    */
  var Strikeout: Double
  /** specifies the style name of the font. */
  var StyleName: String
  /**
    * specifies the technology of the font representation.
    *
    * One or more values out of the constant group {@link com.sun.star.awt.FontType} can be combined by an arithmetical or-operation.
    */
  var Type: Double
  /**
    * specifies the kind of underlining.
    *
    * Use one value out of the constant group {@link com.sun.star.awt.FontUnderline} .
    */
  var Underline: Double
  /**
    * specifies the thickness of the line.
    *
    * Depending on the specified weight, a font that supports this thickness may be selected.
    *
    * The value is expressed as a percentage.
    */
  var Weight: Double
  /** specifies the width of the font in the measure of the destination. */
  var Width: Double
  /**
    * specifies if only words get underlined.
    *
    * `TRUE` means that only non-space characters get underlined, `FALSE` means that the spacing also gets underlined.
    *
    * This property is only valid if the property {@link com.sun.star.awt.FontDescriptor.Underline} is not {@link FontUnderline.NONE} .
    */
  var WordLineMode: Boolean
}

object FontDescriptor {
  @scala.inline
  def apply(
    CharSet: Double,
    CharacterWidth: Double,
    Family: Double,
    Height: Double,
    Kerning: Boolean,
    Name: String,
    Orientation: Double,
    Pitch: Double,
    Slant: FontSlant,
    Strikeout: Double,
    StyleName: String,
    Type: Double,
    Underline: Double,
    Weight: Double,
    Width: Double,
    WordLineMode: Boolean
  ): FontDescriptor = {
    val __obj = js.Dynamic.literal(CharSet = CharSet.asInstanceOf[js.Any], CharacterWidth = CharacterWidth.asInstanceOf[js.Any], Family = Family.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Kerning = Kerning.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], Pitch = Pitch.asInstanceOf[js.Any], Slant = Slant.asInstanceOf[js.Any], Strikeout = Strikeout.asInstanceOf[js.Any], StyleName = StyleName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Underline = Underline.asInstanceOf[js.Any], Weight = Weight.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], WordLineMode = WordLineMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontDescriptor]
  }
}

