package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a font on a specific device.
  *
  * All values are in pixels within this device.
  */
trait XFont extends XInterface {
  /**
    * returns the description of the font.
    *
    * The unit of measurement is pixels for the device.
    */
  val FontDescriptor: typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.FontDescriptor
  /** returns additional information about the font. */
  val FontMetric: SimpleFontMetric
  /**
    * returns the width of the specified character.
    * @returns the character width measured in pixels for the device.
    */
  def getCharWidth(c: String): Double
  /**
    * returns the widths of the specified characters.
    * @returns a sequence of the widths of subsequent characters for this font.
    */
  def getCharWidths(nFirst: String, nLast: String): SafeArray[Double]
  /**
    * returns the description of the font.
    *
    * The unit of measurement is pixels for the device.
    */
  def getFontDescriptor(): typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.FontDescriptor
  /** returns additional information about the font. */
  def getFontMetric(): SimpleFontMetric
  /** queries the kerning pair table. */
  def getKernPairs(
    Chars1: js.Array[SeqEquiv[String]],
    Chars2: js.Array[SeqEquiv[String]],
    Kerns: js.Array[SeqEquiv[Double]]
  ): Unit
  /**
    * returns the string width.
    * @returns the width of the specified string of characters measured in pixels for the device.
    */
  def getStringWidth(str: String): Double
  /**
    * returns the string and the character widths.
    * @param str the input string.
    * @param aDXArray receives the width of every single character measured in pixels for the device.
    * @returns the width of the specified string of characters measured in pixels for the device.
    */
  def getStringWidthArray(str: String, aDXArray: js.Array[SeqEquiv[Double]]): Double
}

object XFont {
  @scala.inline
  def apply(
    FontDescriptor: FontDescriptor,
    FontMetric: SimpleFontMetric,
    acquire: () => Unit,
    getCharWidth: String => Double,
    getCharWidths: (String, String) => SafeArray[Double],
    getFontDescriptor: () => FontDescriptor,
    getFontMetric: () => SimpleFontMetric,
    getKernPairs: (js.Array[SeqEquiv[String]], js.Array[SeqEquiv[String]], js.Array[SeqEquiv[Double]]) => Unit,
    getStringWidth: String => Double,
    getStringWidthArray: (String, js.Array[SeqEquiv[Double]]) => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFont = {
    val __obj = js.Dynamic.literal(FontDescriptor = FontDescriptor, FontMetric = FontMetric, acquire = js.Any.fromFunction0(acquire), getCharWidth = js.Any.fromFunction1(getCharWidth), getCharWidths = js.Any.fromFunction2(getCharWidths), getFontDescriptor = js.Any.fromFunction0(getFontDescriptor), getFontMetric = js.Any.fromFunction0(getFontMetric), getKernPairs = js.Any.fromFunction3(getKernPairs), getStringWidth = js.Any.fromFunction1(getStringWidth), getStringWidthArray = js.Any.fromFunction2(getStringWidthArray), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XFont]
  }
}

