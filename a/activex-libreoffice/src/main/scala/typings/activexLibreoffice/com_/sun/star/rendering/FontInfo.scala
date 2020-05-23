package typings.activexLibreoffice.com_.sun.star.rendering

import typings.activexLibreoffice.com_.sun.star.util.TriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure provides information about a specific font.
  * @since OOo 2.0
  */
trait FontInfo extends js.Object {
  /**
    * The name of the font family.
    *
    * The family name is the one normally associated to a font, such as Times New Roman, Thorndale, Andale or Arial.
    *
    * Note: outlined fonts are now specified with "outline" as part of the family name.
    */
  var FamilyName: String
  /**
    * The PANOSE font classification.
    *
    * TODO: Document semantics in {@link Panose.idl}
    */
  var FontDescription: Panose
  /**
    * Specifies whether the font is a symbol font.
    *
    * If yes, text written in this symbol font does not have a specified meaning.
    */
  var IsSymbolFont: TriState
  /**
    * Set to true, if the font is usable for vertical text output.
    *
    * Vertical fonts have subtle differences to horizontal ones, e.g. rotated or differently shaped glyphs, or special rotated versions of normally upright
    * glyphs (e.g. brackets).
    */
  var IsVertical: TriState
  /**
    * The name of the specific font style within its family.
    *
    * For example, oblique, italic, or narrow.
    */
  var StyleName: String
  /**
    * This value specifies which Unicode ranges are supported by this font.
    *
    * This is to be interpreted as a split-up 128-bit value, see [Adobe's OpenType specification]{@link
    * url="http://partners.adobe.com/asn/tech/type/opentype/os2.jsp#ur"} for the specific meaning of each bit. UnicodeRanges0 contains the least significant
    * bits, UnicodeRanges3 the most significant ones.
    *
    * const int128 UNICODE_RANGE_BASIC_LATIN = 1; const int128 UNICODE_RANGE_LATIN_SUPPLEMENT = 2; const int128 UNICODE_RANGE_LATIN_EXTENDED_A = 4; const
    * int128 UNICODE_RANGE_LATIN_EXTENDED_B = 4; ... const int128 UNICODE_RANGE_MASK_LATIN = 1; const int128 UNICODE_RANGE_MASK_CJK = (31<<48) + (3<<55) +
    * (1<<59); const int128 UNICODE_RANGE_MASK_CTL = (1<<11) + (1<<13) + (0x3FFF<<15) + (0x0FFF<<70);
    */
  var UnicodeRanges0: Double
  var UnicodeRanges1: Double
  var UnicodeRanges2: Double
  var UnicodeRanges3: Double
}

object FontInfo {
  @scala.inline
  def apply(
    FamilyName: String,
    FontDescription: Panose,
    IsSymbolFont: TriState,
    IsVertical: TriState,
    StyleName: String,
    UnicodeRanges0: Double,
    UnicodeRanges1: Double,
    UnicodeRanges2: Double,
    UnicodeRanges3: Double
  ): FontInfo = {
    val __obj = js.Dynamic.literal(FamilyName = FamilyName.asInstanceOf[js.Any], FontDescription = FontDescription.asInstanceOf[js.Any], IsSymbolFont = IsSymbolFont.asInstanceOf[js.Any], IsVertical = IsVertical.asInstanceOf[js.Any], StyleName = StyleName.asInstanceOf[js.Any], UnicodeRanges0 = UnicodeRanges0.asInstanceOf[js.Any], UnicodeRanges1 = UnicodeRanges1.asInstanceOf[js.Any], UnicodeRanges2 = UnicodeRanges2.asInstanceOf[js.Any], UnicodeRanges3 = UnicodeRanges3.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontInfo]
  }
}

