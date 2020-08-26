package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a font on a specific device.
  *
  * All values are in pixels within this device.
  */
@js.native
trait XFont extends XInterface {
  /**
    * returns the description of the font.
    *
    * The unit of measurement is pixels for the device.
    */
  val FontDescriptor: typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor = js.native
  /** returns additional information about the font. */
  val FontMetric: SimpleFontMetric = js.native
  /**
    * returns the width of the specified character.
    * @returns the character width measured in pixels for the device.
    */
  def getCharWidth(c: String): Double = js.native
  /**
    * returns the widths of the specified characters.
    * @returns a sequence of the widths of subsequent characters for this font.
    */
  def getCharWidths(nFirst: String, nLast: String): SafeArray[Double] = js.native
  /**
    * returns the description of the font.
    *
    * The unit of measurement is pixels for the device.
    */
  def getFontDescriptor(): typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor = js.native
  /** returns additional information about the font. */
  def getFontMetric(): SimpleFontMetric = js.native
  /** queries the kerning pair table. */
  def getKernPairs(
    Chars1: js.Array[SeqEquiv[String]],
    Chars2: js.Array[SeqEquiv[String]],
    Kerns: js.Array[SeqEquiv[Double]]
  ): Unit = js.native
  /**
    * returns the string width.
    * @returns the width of the specified string of characters measured in pixels for the device.
    */
  def getStringWidth(str: String): Double = js.native
  /**
    * returns the string and the character widths.
    * @param str the input string.
    * @param aDXArray receives the width of every single character measured in pixels for the device.
    * @returns the width of the specified string of characters measured in pixels for the device.
    */
  def getStringWidthArray(str: String, aDXArray: js.Array[SeqEquiv[Double]]): Double = js.native
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
    val __obj = js.Dynamic.literal(FontDescriptor = FontDescriptor.asInstanceOf[js.Any], FontMetric = FontMetric.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getCharWidth = js.Any.fromFunction1(getCharWidth), getCharWidths = js.Any.fromFunction2(getCharWidths), getFontDescriptor = js.Any.fromFunction0(getFontDescriptor), getFontMetric = js.Any.fromFunction0(getFontMetric), getKernPairs = js.Any.fromFunction3(getKernPairs), getStringWidth = js.Any.fromFunction1(getStringWidth), getStringWidthArray = js.Any.fromFunction2(getStringWidthArray), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XFont]
  }
  @scala.inline
  implicit class XFontOps[Self <: XFont] (val x: Self) extends AnyVal {
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
    def setFontDescriptor(value: FontDescriptor): Self = this.set("FontDescriptor", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontMetric(value: SimpleFontMetric): Self = this.set("FontMetric", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetCharWidth(value: String => Double): Self = this.set("getCharWidth", js.Any.fromFunction1(value))
    @scala.inline
    def setGetCharWidths(value: (String, String) => SafeArray[Double]): Self = this.set("getCharWidths", js.Any.fromFunction2(value))
    @scala.inline
    def setGetFontDescriptor(value: () => FontDescriptor): Self = this.set("getFontDescriptor", js.Any.fromFunction0(value))
    @scala.inline
    def setGetFontMetric(value: () => SimpleFontMetric): Self = this.set("getFontMetric", js.Any.fromFunction0(value))
    @scala.inline
    def setGetKernPairs(
      value: (js.Array[SeqEquiv[String]], js.Array[SeqEquiv[String]], js.Array[SeqEquiv[Double]]) => Unit
    ): Self = this.set("getKernPairs", js.Any.fromFunction3(value))
    @scala.inline
    def setGetStringWidth(value: String => Double): Self = this.set("getStringWidth", js.Any.fromFunction1(value))
    @scala.inline
    def setGetStringWidthArray(value: (String, js.Array[SeqEquiv[Double]]) => Double): Self = this.set("getStringWidthArray", js.Any.fromFunction2(value))
  }
  
}

