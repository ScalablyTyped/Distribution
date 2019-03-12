package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a container of number formats. */
trait NumberFormats
  extends XNumberFormats
     with XNumberFormatTypes

object NumberFormats {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    addNew: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale) => scala.Double,
    addNewConverted: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale) => scala.Double,
    generateFormat: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Boolean, scala.Boolean, scala.Double, scala.Double) => java.lang.String,
    getByKey: scala.Double => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    getFormatForLocale: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale) => scala.Double,
    getFormatIndex: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale) => scala.Double,
    getStandardFormat: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale) => scala.Double,
    getStandardIndex: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => scala.Double,
    isTypeCompatible: (scala.Double, scala.Double) => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    queryKey: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Boolean) => scala.Double,
    queryKeys: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Boolean) => stdLib.SafeArray[scala.Double],
    release: () => scala.Unit,
    removeByKey: scala.Double => scala.Unit
  ): NumberFormats = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addNew = js.Any.fromFunction2(addNew), addNewConverted = js.Any.fromFunction3(addNewConverted), generateFormat = js.Any.fromFunction6(generateFormat), getByKey = js.Any.fromFunction1(getByKey), getFormatForLocale = js.Any.fromFunction2(getFormatForLocale), getFormatIndex = js.Any.fromFunction2(getFormatIndex), getStandardFormat = js.Any.fromFunction2(getStandardFormat), getStandardIndex = js.Any.fromFunction1(getStandardIndex), isTypeCompatible = js.Any.fromFunction2(isTypeCompatible), queryInterface = js.Any.fromFunction1(queryInterface), queryKey = js.Any.fromFunction3(queryKey), queryKeys = js.Any.fromFunction3(queryKeys), release = js.Any.fromFunction0(release), removeByKey = js.Any.fromFunction1(removeByKey))
  
    __obj.asInstanceOf[NumberFormats]
  }
}

