package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a number formatter. */
trait XNumberFormatter
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the attached {@link XNumberFormatsSupplier} . */
  val NumberFormatsSupplier: XNumberFormatsSupplier
  /**
    * attaches an {@link XNumberFormatsSupplier} to this {@link NumberFormatter} .
    *
    * This {@link NumberFormatter} will only use the {@link NumberFormats} specified in the attached {@link XNumberFormatsSupplier} . Without an attached
    * {@link XNumberFormatsSupplier} , no formatting is possible.
    */
  def attachNumberFormatsSupplier(xSupplier: XNumberFormatsSupplier): scala.Unit
  /** converts a number into a string. */
  def convertNumberToString(nKey: scala.Double, fValue: scala.Double): java.lang.String
  /**
    * converts a string which contains a formatted number into a number.
    *
    * If this is a text format, the string will not be converted.
    */
  def convertStringToNumber(nKey: scala.Double, aString: java.lang.String): scala.Double
  /** detects the number format in a string which contains a formatted number. */
  def detectNumberFormat(nKey: scala.Double, aString: java.lang.String): scala.Double
  /** converts a string into another string. */
  def formatString(nKey: scala.Double, aString: java.lang.String): java.lang.String
  /**
    * converts a number into a string with the specified format.
    *
    * This string can always be converted back to a number using the same format.
    */
  def getInputString(nKey: scala.Double, fValue: scala.Double): java.lang.String
  /** @returns the attached {@link XNumberFormatsSupplier} . */
  def getNumberFormatsSupplier(): XNumberFormatsSupplier
  /** @returns the color which is specified for the given value in the number format, which is otherwise the value of **aDefaultColor** . */
  def queryColorForNumber(nKey: scala.Double, fValue: scala.Double, aDefaultColor: Color): Color
  /** @returns the color which is specified for the given string in the number format, which is otherwise the value of **aDefaultColor** . */
  def queryColorForString(nKey: scala.Double, aString: java.lang.String, aDefaultColor: Color): Color
}

object XNumberFormatter {
  @scala.inline
  def apply(
    NumberFormatsSupplier: XNumberFormatsSupplier,
    acquire: js.Function0[scala.Unit],
    attachNumberFormatsSupplier: js.Function1[XNumberFormatsSupplier, scala.Unit],
    convertNumberToString: js.Function2[scala.Double, scala.Double, java.lang.String],
    convertStringToNumber: js.Function2[scala.Double, java.lang.String, scala.Double],
    detectNumberFormat: js.Function2[scala.Double, java.lang.String, scala.Double],
    formatString: js.Function2[scala.Double, java.lang.String, java.lang.String],
    getInputString: js.Function2[scala.Double, scala.Double, java.lang.String],
    getNumberFormatsSupplier: js.Function0[XNumberFormatsSupplier],
    queryColorForNumber: js.Function3[scala.Double, scala.Double, Color, Color],
    queryColorForString: js.Function3[scala.Double, java.lang.String, Color, Color],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XNumberFormatter = {
    val __obj = js.Dynamic.literal(NumberFormatsSupplier = NumberFormatsSupplier, acquire = acquire, attachNumberFormatsSupplier = attachNumberFormatsSupplier, convertNumberToString = convertNumberToString, convertStringToNumber = convertStringToNumber, detectNumberFormat = detectNumberFormat, formatString = formatString, getInputString = getInputString, getNumberFormatsSupplier = getNumberFormatsSupplier, queryColorForNumber = queryColorForNumber, queryColorForString = queryColorForString, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XNumberFormatter]
  }
}

