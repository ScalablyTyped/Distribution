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
    acquire: js.Function0[scala.Unit],
    attachNumberFormatsSupplier: js.Function1[XNumberFormatsSupplier, scala.Unit],
    convertNumberToPreviewString: js.Function4[
      java.lang.String, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Boolean, 
      java.lang.String
    ],
    convertNumberToString: js.Function2[scala.Double, scala.Double, java.lang.String],
    convertStringToNumber: js.Function2[scala.Double, java.lang.String, scala.Double],
    detectNumberFormat: js.Function2[scala.Double, java.lang.String, scala.Double],
    formatString: js.Function2[scala.Double, java.lang.String, java.lang.String],
    getInputString: js.Function2[scala.Double, scala.Double, java.lang.String],
    getNumberFormatsSupplier: js.Function0[XNumberFormatsSupplier],
    queryColorForNumber: js.Function3[scala.Double, scala.Double, Color, Color],
    queryColorForString: js.Function3[scala.Double, java.lang.String, Color, Color],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    queryPreviewColorForNumber: js.Function5[
      java.lang.String, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Boolean, 
      Color, 
      Color
    ],
    release: js.Function0[scala.Unit]
  ): XNumberFormatter2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("NumberFormatsSupplier")(NumberFormatsSupplier)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("attachNumberFormatsSupplier")(attachNumberFormatsSupplier)
    __obj.updateDynamic("convertNumberToPreviewString")(convertNumberToPreviewString)
    __obj.updateDynamic("convertNumberToString")(convertNumberToString)
    __obj.updateDynamic("convertStringToNumber")(convertStringToNumber)
    __obj.updateDynamic("detectNumberFormat")(detectNumberFormat)
    __obj.updateDynamic("formatString")(formatString)
    __obj.updateDynamic("getInputString")(getInputString)
    __obj.updateDynamic("getNumberFormatsSupplier")(getNumberFormatsSupplier)
    __obj.updateDynamic("queryColorForNumber")(queryColorForNumber)
    __obj.updateDynamic("queryColorForString")(queryColorForString)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("queryPreviewColorForNumber")(queryPreviewColorForNumber)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XNumberFormatter2]
  }
}

