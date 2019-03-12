package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to multiple {@link NumberFormats} .
  *
  * The number formats are managed by their unique key in the document.
  */
trait XNumberFormats
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * adds a new number format to the list, using a format string.
    * @param aFormat the string representation of the number format
    * @param nLocale the locale for the number format
    * @returns the key for new number format
    * @throws com::sun::star::util::MalformedNumberFormatException if incorrect number format is specified
    */
  def addNew(aFormat: java.lang.String, nLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): scala.Double
  /**
    * adds a new number format to the list, using a format string in a different locale than the desired locale of the resulting number format.
    * @param aFormat the key for the number format
    * @param nLocale the original locale for the number format
    * @param nNewLocale the new locale for the number format to be converted
    * @returns the key for added number format
    * @throws com::sun::star::util::MalformedNumberFormatException if incorrect number format is specified
    */
  def addNewConverted(
    aFormat: java.lang.String,
    nLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    nNewLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  ): scala.Double
  /**
    * generates a format string from several parameters without creating an actual number format.
    * @param nBaseKey the key for the number format to be used as base format
    * @param nLocale the locale for the number format
    * @param bThousands the thousands separator is shown or not
    * @param bRed show negative number in red colored if `TRUE`
    * @param nDecimals how many digits are shown after the decimal point
    * @param nLeading how many number of leading zeros are shown
    * @returns the string representation for the number format
    */
  def generateFormat(
    nBaseKey: scala.Double,
    nLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    bThousands: scala.Boolean,
    bRed: scala.Boolean,
    nDecimals: scala.Double,
    nLeading: scala.Double
  ): java.lang.String
  /**
    * @param nKey the key for the format
    * @returns a readonly {@link NumberFormatProperties} .
    */
  def getByKey(nKey: scala.Double): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /**
    * finds a number format by its format string and returns its key.
    * @param aFormat the string representation of the number format
    * @param nLocale the locale for number formats to find
    * @param bScan reserved for future use and should be set to false
    * @returns the key for the format if found, otherwise -1.
    */
  def queryKey(
    aFormat: java.lang.String,
    nLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    bScan: scala.Boolean
  ): scala.Double
  /**
    * @param nType the type of number formats to return. Must be one of the {@link NumberFormat} constants.
    * @param nLocale the locale of number formats to return.
    * @param bCreate `TRUE` : create new entries if no formats for the selected language exist ; `FALSE` : return an empty list if no formats for the selected
    * @returns a sequence of the keys of all number formats with the specified type and language.
    */
  def queryKeys(
    nType: scala.Double,
    nLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    bCreate: scala.Boolean
  ): stdLib.SafeArray[scala.Double]
  /**
    * removes a number format from the list.
    * @param nKey the key for the numberformat
    */
  def removeByKey(nKey: scala.Double): scala.Unit
}

object XNumberFormats {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    addNew: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale) => scala.Double,
    addNewConverted: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale) => scala.Double,
    generateFormat: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Boolean, scala.Boolean, scala.Double, scala.Double) => java.lang.String,
    getByKey: scala.Double => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    queryKey: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Boolean) => scala.Double,
    queryKeys: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Boolean) => stdLib.SafeArray[scala.Double],
    release: () => scala.Unit,
    removeByKey: scala.Double => scala.Unit
  ): XNumberFormats = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addNew = js.Any.fromFunction2(addNew), addNewConverted = js.Any.fromFunction3(addNewConverted), generateFormat = js.Any.fromFunction6(generateFormat), getByKey = js.Any.fromFunction1(getByKey), queryInterface = js.Any.fromFunction1(queryInterface), queryKey = js.Any.fromFunction3(queryKey), queryKeys = js.Any.fromFunction3(queryKeys), release = js.Any.fromFunction0(release), removeByKey = js.Any.fromFunction1(removeByKey))
  
    __obj.asInstanceOf[XNumberFormats]
  }
}

