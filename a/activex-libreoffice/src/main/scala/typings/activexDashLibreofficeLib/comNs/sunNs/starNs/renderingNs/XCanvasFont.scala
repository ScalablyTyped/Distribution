package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface provides access to a specific, XCanvas-dependent font incarnation. This font is not universally usable, but belongs to the {@link
  * XCanvas} it was queried from.
  */
trait XCanvasFont
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Query the list of available font sizes.
    *
    * This method queries the list of available font sizes (in device units) for this font. For scalable fonts that are not restricted to discrete sizes,
    * this list is **empty** , meaning that every size is possible. Fonts that **do** restrict the device size to certain discrete values, setting an
    * overall transformation that scales the {@link FontRequest.CellSize} to something not contained in the list returned by this method can lead to visible
    * disturbances.
    */
  val AvailableSizes: activexDashInteropLib.SafeArray[scala.Double]
  /** Query the list of additional font properties. */
  val ExtraFontProperties: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /**
    * Query metric information about the font, that is generic to all its glyphs.
    *
    * Note that the metric values in the returned result are in the font coordinate system, i.e. relative to the corresponding size of this font. That is,
    * when this font was created with a cell size of 20 units, the metrics returned are calculated relative to this size.
    */
  val FontMetrics: FontMetrics
  /** Query the {@link FontRequest} that was used to generate this object. */
  val FontRequest: FontRequest
  /**
    * Create a text layout interface.
    *
    * Create a text layout interface for the given string, using this font to generate the glyphs from.
    * @param aText The text to layout.
    * @param nDirection Main text direction for the string specified. The main text direction is e.g. important for characters that are not strong, i.e. that
    * @param nRandomSeed Optional random seed for OpenType glyph variations.
    */
  def createTextLayout(aText: StringContext, nDirection: scala.Double, nRandomSeed: scala.Double): XTextLayout
  /**
    * Query the list of available font sizes.
    *
    * This method queries the list of available font sizes (in device units) for this font. For scalable fonts that are not restricted to discrete sizes,
    * this list is **empty** , meaning that every size is possible. Fonts that **do** restrict the device size to certain discrete values, setting an
    * overall transformation that scales the {@link FontRequest.CellSize} to something not contained in the list returned by this method can lead to visible
    * disturbances.
    */
  def getAvailableSizes(): activexDashInteropLib.SafeArray[scala.Double]
  /** Query the list of additional font properties. */
  def getExtraFontProperties(): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /**
    * Query metric information about the font, that is generic to all its glyphs.
    *
    * Note that the metric values in the returned result are in the font coordinate system, i.e. relative to the corresponding size of this font. That is,
    * when this font was created with a cell size of 20 units, the metrics returned are calculated relative to this size.
    */
  def getFontMetrics(): FontMetrics
  /** Query the {@link FontRequest} that was used to generate this object. */
  def getFontRequest(): FontRequest
}

object XCanvasFont {
  @scala.inline
  def apply(
    AvailableSizes: activexDashInteropLib.SafeArray[scala.Double],
    ExtraFontProperties: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    FontMetrics: FontMetrics,
    FontRequest: FontRequest,
    acquire: js.Function0[scala.Unit],
    createTextLayout: js.Function3[StringContext, scala.Double, scala.Double, XTextLayout],
    getAvailableSizes: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    getExtraFontProperties: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ],
    getFontMetrics: js.Function0[FontMetrics],
    getFontRequest: js.Function0[FontRequest],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XCanvasFont = {
    val __obj = js.Dynamic.literal(AvailableSizes = AvailableSizes, ExtraFontProperties = ExtraFontProperties, FontMetrics = FontMetrics, FontRequest = FontRequest, acquire = acquire, createTextLayout = createTextLayout, getAvailableSizes = getAvailableSizes, getExtraFontProperties = getExtraFontProperties, getFontMetrics = getFontMetrics, getFontRequest = getFontRequest, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XCanvasFont]
  }
}

