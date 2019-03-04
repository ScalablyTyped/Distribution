package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * extends the {@link XFont} interface and provides additional information for a font.
  * @since OOo 3.0
  */
trait XFont2 extends XFont {
  /**
    * checks whether or not this font has all the glyphs for the text specified by aText.
    * @param aText The specified text for which glyphs are needed.
    * @returns Returns whether or not this font has all the glyphs for the specified text.
    */
  def hasGlyphs(aText: java.lang.String): scala.Boolean
}

object XFont2 {
  @scala.inline
  def apply(
    FontDescriptor: FontDescriptor,
    FontMetric: SimpleFontMetric,
    acquire: js.Function0[scala.Unit],
    getCharWidth: js.Function1[java.lang.String, scala.Double],
    getCharWidths: js.Function2[java.lang.String, java.lang.String, activexDashInteropLib.SafeArray[scala.Double]],
    getFontDescriptor: js.Function0[FontDescriptor],
    getFontMetric: js.Function0[SimpleFontMetric],
    getKernPairs: js.Function3[
      js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]], 
      js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]], 
      js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], 
      scala.Unit
    ],
    getStringWidth: js.Function1[java.lang.String, scala.Double],
    getStringWidthArray: js.Function2[
      java.lang.String, 
      js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], 
      scala.Double
    ],
    hasGlyphs: js.Function1[java.lang.String, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XFont2 = {
    val __obj = js.Dynamic.literal(FontDescriptor = FontDescriptor, FontMetric = FontMetric, acquire = acquire, getCharWidth = getCharWidth, getCharWidths = getCharWidths, getFontDescriptor = getFontDescriptor, getFontMetric = getFontMetric, getKernPairs = getKernPairs, getStringWidth = getStringWidth, getStringWidthArray = getStringWidthArray, hasGlyphs = hasGlyphs, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XFont2]
  }
}

