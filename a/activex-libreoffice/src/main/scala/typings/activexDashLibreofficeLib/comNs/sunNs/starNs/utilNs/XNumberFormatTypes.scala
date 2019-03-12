package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents functions to get specific, predefined number formats. */
trait XNumberFormatTypes
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * @param nKey index of the old number format
    * @param nLocale the locale to which the number format is converted
    * @returns the index of the converted number format if successful, the old index if the number format could not be converted.
    */
  def getFormatForLocale(nKey: scala.Double, nLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): scala.Double
  /**
    * @param nIndex the index of the wanted number format within the formats for the given locale. One of the {@link com.sun.star.i18n.NumberFormatIndex} cons
    * @param nLocale the locale for which the key is requested.
    * @returns the key of a built-in format for a locale:
    */
  def getFormatIndex(nIndex: scala.Double, nLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): scala.Double
  /**
    * @param nType the type of the number format. Must be one of the {@link NumberFormat} constants.
    * @param nLocale the locale for which the number format is requested.
    * @returns the key of the standard format within a specified type for a given locale.
    */
  def getStandardFormat(nType: scala.Double, nLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): scala.Double
  /** @returns the key of the standard format for a locale. */
  def getStandardIndex(nLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): scala.Double
  /** verifies if one type of number format is compatible with another type. */
  def isTypeCompatible(nOldType: scala.Double, nNewType: scala.Double): scala.Boolean
}

object XNumberFormatTypes {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    getFormatForLocale: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale) => scala.Double,
    getFormatIndex: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale) => scala.Double,
    getStandardFormat: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale) => scala.Double,
    getStandardIndex: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => scala.Double,
    isTypeCompatible: (scala.Double, scala.Double) => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XNumberFormatTypes = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getFormatForLocale = js.Any.fromFunction2(getFormatForLocale), getFormatIndex = js.Any.fromFunction2(getFormatIndex), getStandardFormat = js.Any.fromFunction2(getStandardFormat), getStandardIndex = js.Any.fromFunction1(getStandardIndex), isTypeCompatible = js.Any.fromFunction2(isTypeCompatible), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XNumberFormatTypes]
  }
}

