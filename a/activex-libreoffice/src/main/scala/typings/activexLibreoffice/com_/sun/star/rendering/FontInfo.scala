package typings.activexLibreoffice.com_.sun.star.rendering

import typings.activexLibreoffice.com_.sun.star.util.TriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This structure provides information about a specific font.
  * @since OOo 2.0
  */
@js.native
trait FontInfo extends js.Object {
  
  /**
    * The name of the font family.
    *
    * The family name is the one normally associated to a font, such as Times New Roman, Thorndale, Andale or Arial.
    *
    * Note: outlined fonts are now specified with "outline" as part of the family name.
    */
  var FamilyName: String = js.native
  
  /**
    * The PANOSE font classification.
    *
    * TODO: Document semantics in {@link Panose.idl}
    */
  var FontDescription: Panose = js.native
  
  /**
    * Specifies whether the font is a symbol font.
    *
    * If yes, text written in this symbol font does not have a specified meaning.
    */
  var IsSymbolFont: TriState = js.native
  
  /**
    * Set to true, if the font is usable for vertical text output.
    *
    * Vertical fonts have subtle differences to horizontal ones, e.g. rotated or differently shaped glyphs, or special rotated versions of normally upright
    * glyphs (e.g. brackets).
    */
  var IsVertical: TriState = js.native
  
  /**
    * The name of the specific font style within its family.
    *
    * For example, oblique, italic, or narrow.
    */
  var StyleName: String = js.native
  
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
  var UnicodeRanges0: Double = js.native
  
  var UnicodeRanges1: Double = js.native
  
  var UnicodeRanges2: Double = js.native
  
  var UnicodeRanges3: Double = js.native
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
  
  @scala.inline
  implicit class FontInfoOps[Self <: FontInfo] (val x: Self) extends AnyVal {
    
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
    def setFamilyName(value: String): Self = this.set("FamilyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontDescription(value: Panose): Self = this.set("FontDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSymbolFont(value: TriState): Self = this.set("IsSymbolFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVertical(value: TriState): Self = this.set("IsVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleName(value: String): Self = this.set("StyleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnicodeRanges0(value: Double): Self = this.set("UnicodeRanges0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnicodeRanges1(value: Double): Self = this.set("UnicodeRanges1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnicodeRanges2(value: Double): Self = this.set("UnicodeRanges2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnicodeRanges3(value: Double): Self = this.set("UnicodeRanges3", value.asInstanceOf[js.Any])
  }
}
