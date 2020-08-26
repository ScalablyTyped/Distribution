package typings.activexLibreoffice.com_.sun.star.i18n

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface provides Text Conversion service.
  *
  * It is derived from {@link com.sun.star.i18n.XTextConversion} and provides a new conversion function containing position map (offset) between original
  * and converted string.
  * @since OOo 2.0
  */
@js.native
trait XExtendedTextConversion extends XTextConversion {
  /**
    * The functionality of this method is same as {@link com.sun.star.i18n.XTextConversion.getConversion()} , except an additional output parameter rOffset.
    * @param aText See {@link com.sun.star.i18n.XTextConversion.getConversion()}
    * @param nStartPos See {@link com.sun.star.i18n.XTextConversion.getConversion()}
    * @param nLength See {@link com.sun.star.i18n.XTextConversion.getConversion()}
    * @param aLocale See {@link com.sun.star.i18n.XTextConversion.getConversion()}
    * @param nTextConversionType See {@link com.sun.star.i18n.XTextConversion.getConversion()}
    * @param nTextConversionOptions See {@link com.sun.star.i18n.XTextConversion.getConversion()}
    * @param rOffset To find the grapheme of input string corresponding to the grapheme of output string, rOffset provides the offset array whose index is the
    */
  def getConversionWithOffset(
    aText: String,
    nStartPos: Double,
    nLength: Double,
    aLocale: Locale,
    nTextConversionType: Double,
    nTextConversionOptions: Double,
    rOffset: js.Array[SeqEquiv[Double]]
  ): String = js.native
}

object XExtendedTextConversion {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getConversion: (String, Double, Double, Locale, Double, Double) => String,
    getConversionWithOffset: (String, Double, Double, Locale, Double, Double, js.Array[SeqEquiv[Double]]) => String,
    getConversions: (String, Double, Double, Locale, Double, Double) => TextConversionResult,
    interactiveConversion: (Locale, Double, Double) => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XExtendedTextConversion = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getConversion = js.Any.fromFunction6(getConversion), getConversionWithOffset = js.Any.fromFunction7(getConversionWithOffset), getConversions = js.Any.fromFunction6(getConversions), interactiveConversion = js.Any.fromFunction3(interactiveConversion), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XExtendedTextConversion]
  }
  @scala.inline
  implicit class XExtendedTextConversionOps[Self <: XExtendedTextConversion] (val x: Self) extends AnyVal {
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
    def setGetConversionWithOffset(value: (String, Double, Double, Locale, Double, Double, js.Array[SeqEquiv[Double]]) => String): Self = this.set("getConversionWithOffset", js.Any.fromFunction7(value))
  }
  
}

