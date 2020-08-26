package typings.activexLibreoffice.com_.sun.star.rendering

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metrics global to the font, i.e. not specific to single glyphs. The font height is defined as ascent+descent+internalLeading, and therefore not
  * explicitly included here.
  *
  * Please note that when querying {@link FontMetrics} from an {@link XCanvasFont} interface, all values here are given relative to the font cell size.
  * That means, the referenceCharWidth and/or ascent+descent+internalLeading will approximately (rounded to integer device resolution, or exactly, if
  * fractional font rendering is enabled) match the referenceAdvancement/cellSize members of the {@link FontRequest} for which the {@link XCanvasFont} was
  * queried. Please be aware that the values returned in this structure only map one-to-one to device pixel, if the combined rendering transformation for
  * text output equals the identity transformation. Otherwise, the text output (and thus the resulting metrics) will be subject to that transformation.
  * Depending on the underlying font technology, actual device output might be off by up to one device pixel from the transformed metrics.
  * @since OOo 2.0
  */
@js.native
trait FontMetrics extends js.Object {
  var Ascent: Double = js.native
  var Descent: Double = js.native
  /**
    * Extra space outside the font cells.
    *
    * It should not contain ink marks and is typically used by the font designer to modify the line distance.
    */
  var ExternalLeading: Double = js.native
  var InternalLeading: Double = js.native
  /**
    * This value specifies the reference character width of the font.
    *
    * It's roughly equivalent to the average width of all characters, and if one needs a font with double character width, the referenceCharSize should be
    * doubled.
    */
  var ReferenceCharSize: Double = js.native
  /** Specifies the offset to be added to the baseline when striking through the text. */
  var StrikeThroughOffset: Double = js.native
  /** Specifies the offset to be added to the baseline when drawing underlined text. */
  var UnderlineOffset: Double = js.native
}

object FontMetrics {
  @scala.inline
  def apply(
    Ascent: Double,
    Descent: Double,
    ExternalLeading: Double,
    InternalLeading: Double,
    ReferenceCharSize: Double,
    StrikeThroughOffset: Double,
    UnderlineOffset: Double
  ): FontMetrics = {
    val __obj = js.Dynamic.literal(Ascent = Ascent.asInstanceOf[js.Any], Descent = Descent.asInstanceOf[js.Any], ExternalLeading = ExternalLeading.asInstanceOf[js.Any], InternalLeading = InternalLeading.asInstanceOf[js.Any], ReferenceCharSize = ReferenceCharSize.asInstanceOf[js.Any], StrikeThroughOffset = StrikeThroughOffset.asInstanceOf[js.Any], UnderlineOffset = UnderlineOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontMetrics]
  }
  @scala.inline
  implicit class FontMetricsOps[Self <: FontMetrics] (val x: Self) extends AnyVal {
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
    def setAscent(value: Double): Self = this.set("Ascent", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescent(value: Double): Self = this.set("Descent", value.asInstanceOf[js.Any])
    @scala.inline
    def setExternalLeading(value: Double): Self = this.set("ExternalLeading", value.asInstanceOf[js.Any])
    @scala.inline
    def setInternalLeading(value: Double): Self = this.set("InternalLeading", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferenceCharSize(value: Double): Self = this.set("ReferenceCharSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrikeThroughOffset(value: Double): Self = this.set("StrikeThroughOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnderlineOffset(value: Double): Self = this.set("UnderlineOffset", value.asInstanceOf[js.Any])
  }
  
}

