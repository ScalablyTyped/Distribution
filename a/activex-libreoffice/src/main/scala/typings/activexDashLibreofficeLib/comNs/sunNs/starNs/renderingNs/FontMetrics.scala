package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs

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
trait FontMetrics extends js.Object {
  var Ascent: scala.Double
  var Descent: scala.Double
  /**
    * Extra space outside the font cells.
    *
    * It should not contain ink marks and is typically used by the font designer to modify the line distance.
    */
  var ExternalLeading: scala.Double
  var InternalLeading: scala.Double
  /**
    * This value specifies the reference character width of the font.
    *
    * It's roughly equivalent to the average width of all characters, and if one needs a font with double character width, the referenceCharSize should be
    * doubled.
    */
  var ReferenceCharSize: scala.Double
  /** Specifies the offset to be added to the baseline when striking through the text. */
  var StrikeThroughOffset: scala.Double
  /** Specifies the offset to be added to the baseline when drawing underlined text. */
  var UnderlineOffset: scala.Double
}

object FontMetrics {
  @scala.inline
  def apply(
    Ascent: scala.Double,
    Descent: scala.Double,
    ExternalLeading: scala.Double,
    InternalLeading: scala.Double,
    ReferenceCharSize: scala.Double,
    StrikeThroughOffset: scala.Double,
    UnderlineOffset: scala.Double
  ): FontMetrics = {
    val __obj = js.Dynamic.literal(Ascent = Ascent, Descent = Descent, ExternalLeading = ExternalLeading, InternalLeading = InternalLeading, ReferenceCharSize = ReferenceCharSize, StrikeThroughOffset = StrikeThroughOffset, UnderlineOffset = UnderlineOffset)
  
    __obj.asInstanceOf[FontMetrics]
  }
}

