package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a font on a specific device.
  *
  * All values are in pixels within this device.
  */
trait XFont
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the description of the font.
    *
    * The unit of measurement is pixels for the device.
    */
  val FontDescriptor: FontDescriptor
  /** returns additional information about the font. */
  val FontMetric: SimpleFontMetric
  /**
    * returns the width of the specified character.
    * @returns the character width measured in pixels for the device.
    */
  def getCharWidth(c: java.lang.String): scala.Double
  /**
    * returns the widths of the specified characters.
    * @returns a sequence of the widths of subsequent characters for this font.
    */
  def getCharWidths(nFirst: java.lang.String, nLast: java.lang.String): activexDashInteropLib.SafeArray[scala.Double]
  /**
    * returns the description of the font.
    *
    * The unit of measurement is pixels for the device.
    */
  def getFontDescriptor(): FontDescriptor
  /** returns additional information about the font. */
  def getFontMetric(): SimpleFontMetric
  /** queries the kerning pair table. */
  def getKernPairs(
    Chars1: js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]],
    Chars2: js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]],
    Kerns: js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]]
  ): scala.Unit
  /**
    * returns the string width.
    * @returns the width of the specified string of characters measured in pixels for the device.
    */
  def getStringWidth(str: java.lang.String): scala.Double
  /**
    * returns the string and the character widths.
    * @param str the input string.
    * @param aDXArray receives the width of every single character measured in pixels for the device.
    * @returns the width of the specified string of characters measured in pixels for the device.
    */
  def getStringWidthArray(
    str: java.lang.String,
    aDXArray: js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]]
  ): scala.Double
}

object XFont {
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
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XFont = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("FontDescriptor")(FontDescriptor)
    __obj.updateDynamic("FontMetric")(FontMetric)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getCharWidth")(getCharWidth)
    __obj.updateDynamic("getCharWidths")(getCharWidths)
    __obj.updateDynamic("getFontDescriptor")(getFontDescriptor)
    __obj.updateDynamic("getFontMetric")(getFontMetric)
    __obj.updateDynamic("getKernPairs")(getKernPairs)
    __obj.updateDynamic("getStringWidth")(getStringWidth)
    __obj.updateDynamic("getStringWidthArray")(getStringWidthArray)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XFont]
  }
}

