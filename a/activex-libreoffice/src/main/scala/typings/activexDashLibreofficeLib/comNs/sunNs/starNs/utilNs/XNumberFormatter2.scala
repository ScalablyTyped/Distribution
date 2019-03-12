package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a unified interface for the {@link NumberFormatter} service to implement.
  * @since LibreOffice 4.0
  */
trait XNumberFormatter2
  extends XNumberFormatter
     with XNumberFormatPreviewer

object XNumberFormatter2 {
  @scala.inline
  def apply(
    NumberFormatsSupplier: XNumberFormatsSupplier,
    acquire: () => scala.Unit,
    attachNumberFormatsSupplier: XNumberFormatsSupplier => scala.Unit,
    convertNumberToPreviewString: (java.lang.String, scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Boolean) => java.lang.String,
    convertNumberToString: (scala.Double, scala.Double) => java.lang.String,
    convertStringToNumber: (scala.Double, java.lang.String) => scala.Double,
    detectNumberFormat: (scala.Double, java.lang.String) => scala.Double,
    formatString: (scala.Double, java.lang.String) => java.lang.String,
    getInputString: (scala.Double, scala.Double) => java.lang.String,
    getNumberFormatsSupplier: () => XNumberFormatsSupplier,
    queryColorForNumber: (scala.Double, scala.Double, Color) => Color,
    queryColorForString: (scala.Double, java.lang.String, Color) => Color,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    queryPreviewColorForNumber: (java.lang.String, scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Boolean, Color) => Color,
    release: () => scala.Unit
  ): XNumberFormatter2 = {
    val __obj = js.Dynamic.literal(NumberFormatsSupplier = NumberFormatsSupplier, acquire = js.Any.fromFunction0(acquire), attachNumberFormatsSupplier = js.Any.fromFunction1(attachNumberFormatsSupplier), convertNumberToPreviewString = js.Any.fromFunction4(convertNumberToPreviewString), convertNumberToString = js.Any.fromFunction2(convertNumberToString), convertStringToNumber = js.Any.fromFunction2(convertStringToNumber), detectNumberFormat = js.Any.fromFunction2(detectNumberFormat), formatString = js.Any.fromFunction2(formatString), getInputString = js.Any.fromFunction2(getInputString), getNumberFormatsSupplier = js.Any.fromFunction0(getNumberFormatsSupplier), queryColorForNumber = js.Any.fromFunction3(queryColorForNumber), queryColorForString = js.Any.fromFunction3(queryColorForString), queryInterface = js.Any.fromFunction1(queryInterface), queryPreviewColorForNumber = js.Any.fromFunction5(queryPreviewColorForNumber), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XNumberFormatter2]
  }
}

