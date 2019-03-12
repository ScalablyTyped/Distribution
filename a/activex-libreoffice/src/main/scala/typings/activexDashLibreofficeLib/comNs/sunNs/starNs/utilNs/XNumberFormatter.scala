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
    acquire: () => scala.Unit,
    attachNumberFormatsSupplier: XNumberFormatsSupplier => scala.Unit,
    convertNumberToString: (scala.Double, scala.Double) => java.lang.String,
    convertStringToNumber: (scala.Double, java.lang.String) => scala.Double,
    detectNumberFormat: (scala.Double, java.lang.String) => scala.Double,
    formatString: (scala.Double, java.lang.String) => java.lang.String,
    getInputString: (scala.Double, scala.Double) => java.lang.String,
    getNumberFormatsSupplier: () => XNumberFormatsSupplier,
    queryColorForNumber: (scala.Double, scala.Double, Color) => Color,
    queryColorForString: (scala.Double, java.lang.String, Color) => Color,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XNumberFormatter = {
    val __obj = js.Dynamic.literal(NumberFormatsSupplier = NumberFormatsSupplier, acquire = js.Any.fromFunction0(acquire), attachNumberFormatsSupplier = js.Any.fromFunction1(attachNumberFormatsSupplier), convertNumberToString = js.Any.fromFunction2(convertNumberToString), convertStringToNumber = js.Any.fromFunction2(convertStringToNumber), detectNumberFormat = js.Any.fromFunction2(detectNumberFormat), formatString = js.Any.fromFunction2(formatString), getInputString = js.Any.fromFunction2(getInputString), getNumberFormatsSupplier = js.Any.fromFunction0(getNumberFormatsSupplier), queryColorForNumber = js.Any.fromFunction3(queryColorForNumber), queryColorForString = js.Any.fromFunction3(queryColorForString), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XNumberFormatter]
  }
}

