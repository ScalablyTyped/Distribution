package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to multiple {@link NumberFormats} .
  *
  * The number formats are managed by their unique key in the document.
  */
trait XNumberFormats
  extends StObject
     with XInterface {
  
  /**
    * adds a new number format to the list, using a format string.
    * @param aFormat the string representation of the number format
    * @param nLocale the locale for the number format
    * @returns the key for new number format
    * @throws com::sun::star::util::MalformedNumberFormatException if incorrect number format is specified
    */
  def addNew(aFormat: String, nLocale: Locale): Double
  
  /**
    * adds a new number format to the list, using a format string in a different locale than the desired locale of the resulting number format.
    * @param aFormat the key for the number format
    * @param nLocale the original locale for the number format
    * @param nNewLocale the new locale for the number format to be converted
    * @returns the key for added number format
    * @throws com::sun::star::util::MalformedNumberFormatException if incorrect number format is specified
    */
  def addNewConverted(aFormat: String, nLocale: Locale, nNewLocale: Locale): Double
  
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
    nBaseKey: Double,
    nLocale: Locale,
    bThousands: Boolean,
    bRed: Boolean,
    nDecimals: Double,
    nLeading: Double
  ): String
  
  /**
    * @param nKey the key for the format
    * @returns a readonly {@link NumberFormatProperties} .
    */
  def getByKey(nKey: Double): XPropertySet
  
  /**
    * finds a number format by its format string and returns its key.
    * @param aFormat the string representation of the number format
    * @param nLocale the locale for number formats to find
    * @param bScan reserved for future use and should be set to false
    * @returns the key for the format if found, otherwise -1.
    */
  def queryKey(aFormat: String, nLocale: Locale, bScan: Boolean): Double
  
  /**
    * @param nType the type of number formats to return. Must be one of the {@link NumberFormat} constants.
    * @param nLocale the locale of number formats to return.
    * @param bCreate `TRUE` : create new entries if no formats for the selected language exist ; `FALSE` : return an empty list if no formats for the selected
    * @returns a sequence of the keys of all number formats with the specified type and language.
    */
  def queryKeys(nType: Double, nLocale: Locale, bCreate: Boolean): SafeArray[Double]
  
  /**
    * removes a number format from the list.
    * @param nKey the key for the numberformat
    */
  def removeByKey(nKey: Double): Unit
}
object XNumberFormats {
  
  inline def apply(
    acquire: () => Unit,
    addNew: (String, Locale) => Double,
    addNewConverted: (String, Locale, Locale) => Double,
    generateFormat: (Double, Locale, Boolean, Boolean, Double, Double) => String,
    getByKey: Double => XPropertySet,
    queryInterface: `type` => Any,
    queryKey: (String, Locale, Boolean) => Double,
    queryKeys: (Double, Locale, Boolean) => SafeArray[Double],
    release: () => Unit,
    removeByKey: Double => Unit
  ): XNumberFormats = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addNew = js.Any.fromFunction2(addNew), addNewConverted = js.Any.fromFunction3(addNewConverted), generateFormat = js.Any.fromFunction6(generateFormat), getByKey = js.Any.fromFunction1(getByKey), queryInterface = js.Any.fromFunction1(queryInterface), queryKey = js.Any.fromFunction3(queryKey), queryKeys = js.Any.fromFunction3(queryKeys), release = js.Any.fromFunction0(release), removeByKey = js.Any.fromFunction1(removeByKey))
    __obj.asInstanceOf[XNumberFormats]
  }
  
  extension [Self <: XNumberFormats](x: Self) {
    
    inline def setAddNew(value: (String, Locale) => Double): Self = StObject.set(x, "addNew", js.Any.fromFunction2(value))
    
    inline def setAddNewConverted(value: (String, Locale, Locale) => Double): Self = StObject.set(x, "addNewConverted", js.Any.fromFunction3(value))
    
    inline def setGenerateFormat(value: (Double, Locale, Boolean, Boolean, Double, Double) => String): Self = StObject.set(x, "generateFormat", js.Any.fromFunction6(value))
    
    inline def setGetByKey(value: Double => XPropertySet): Self = StObject.set(x, "getByKey", js.Any.fromFunction1(value))
    
    inline def setQueryKey(value: (String, Locale, Boolean) => Double): Self = StObject.set(x, "queryKey", js.Any.fromFunction3(value))
    
    inline def setQueryKeys(value: (Double, Locale, Boolean) => SafeArray[Double]): Self = StObject.set(x, "queryKeys", js.Any.fromFunction3(value))
    
    inline def setRemoveByKey(value: Double => Unit): Self = StObject.set(x, "removeByKey", js.Any.fromFunction1(value))
  }
}
