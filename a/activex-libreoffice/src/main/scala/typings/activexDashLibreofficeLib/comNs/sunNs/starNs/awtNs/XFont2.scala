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
    acquire: () => scala.Unit,
    getCharWidth: java.lang.String => scala.Double,
    getCharWidths: (java.lang.String, java.lang.String) => stdLib.SafeArray[scala.Double],
    getFontDescriptor: () => FontDescriptor,
    getFontMetric: () => SimpleFontMetric,
    getKernPairs: (js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]], js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]], js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]]) => scala.Unit,
    getStringWidth: java.lang.String => scala.Double,
    getStringWidthArray: (java.lang.String, js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]]) => scala.Double,
    hasGlyphs: java.lang.String => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XFont2 = {
    val __obj = js.Dynamic.literal(FontDescriptor = FontDescriptor, FontMetric = FontMetric, acquire = js.Any.fromFunction0(acquire), getCharWidth = js.Any.fromFunction1(getCharWidth), getCharWidths = js.Any.fromFunction2(getCharWidths), getFontDescriptor = js.Any.fromFunction0(getFontDescriptor), getFontMetric = js.Any.fromFunction0(getFontMetric), getKernPairs = js.Any.fromFunction3(getKernPairs), getStringWidth = js.Any.fromFunction1(getStringWidth), getStringWidthArray = js.Any.fromFunction2(getStringWidthArray), hasGlyphs = js.Any.fromFunction1(hasGlyphs), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XFont2]
  }
}

