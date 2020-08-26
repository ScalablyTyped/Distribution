package typings.activexLibreoffice.com_.sun.star.rendering

import typings.activexLibreoffice.com_.sun.star.lang.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure contains all information necessary to describe a font to be queried from {@link XCanvas} .
  *
  * Note: Outline fonts are to be requested as a special family, set {@link FontInfo.FamilyName} appropriately. Emboss/relief must be emulated by upper
  * layers.
  *
  * Leave the {@link FontInfo.FamilyName} and {@link FontInfo.StyleName} empty, if font selection should only happen via the PANOSE description.
  * @since OOo 2.0
  */
@js.native
trait FontRequest extends js.Object {
  /**
    * The size of the font in **device** coordinate space.
    *
    * This value corresponds to the font height in Western scripts, but is independent of the writing direction (see FontRequest::IsVertical below). That
    * means, the value specified here is always measured orthogonal to the text advancement (height for horizontal writing, and width for vertical writing).
    *
    * When this value is negative, its absolute value is taken as the character size of the font. If this value is positive, it's taken as the cell size of
    * the font.
    *
    * This member and the referenceAdvancement member are mutually exclusive, one of them has to be set to 0 (which means don't care).
    *
    * For distorted fonts, the render transformation must be used. That is, the size specified here corresponds to device pixel only if the combined render
    * transformation during text output equals the identity transform. This also applies to all query methods, for both {@link XCanvasFont} and {@link
    * XTextLayout} .
    */
  var CellSize: Double = js.native
  /**
    * The description of the font.
    *
    * This member contains the description of the font as returned by the font listing methods.
    */
  var FontDescription: FontInfo = js.native
  /**
    * The locale this font should be able to render.
    *
    * This member supplements the FontInfo::UnicodeRange0 entry with a specific locale; this is e.g. important when selecting between traditional and
    * simplified Chinese is necessary (since the letters have the same Unicode ranges and character values).
    */
  var Locale: typings.activexLibreoffice.com_.sun.star.lang.Locale = js.native
  /**
    * This value specifies the size of the font in the writing direction (i.e. width for horizontal writing, and height for vertical writing).
    *
    * It is equivalent to the referenceCharSize of the {@link FontMetrics} structure.
    *
    * This member and the cellSize member are mutually exclusive, one of them has to be set to 0 (which means don't care). For distorted fonts, the font
    * matrix must be used.
    */
  var ReferenceAdvancement: Double = js.native
}

object FontRequest {
  @scala.inline
  def apply(CellSize: Double, FontDescription: FontInfo, Locale: Locale, ReferenceAdvancement: Double): FontRequest = {
    val __obj = js.Dynamic.literal(CellSize = CellSize.asInstanceOf[js.Any], FontDescription = FontDescription.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], ReferenceAdvancement = ReferenceAdvancement.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontRequest]
  }
  @scala.inline
  implicit class FontRequestOps[Self <: FontRequest] (val x: Self) extends AnyVal {
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
    def setCellSize(value: Double): Self = this.set("CellSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontDescription(value: FontInfo): Self = this.set("FontDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocale(value: Locale): Self = this.set("Locale", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferenceAdvancement(value: Double): Self = this.set("ReferenceAdvancement", value.asInstanceOf[js.Any])
  }
  
}

