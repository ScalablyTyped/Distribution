package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a container of number formats. */
trait NumberFormats
  extends StObject
     with XNumberFormats
     with XNumberFormatTypes
object NumberFormats {
  
  inline def apply(
    acquire: () => Unit,
    addNew: (String, Locale) => Double,
    addNewConverted: (String, Locale, Locale) => Double,
    generateFormat: (Double, Locale, Boolean, Boolean, Double, Double) => String,
    getByKey: Double => XPropertySet,
    getFormatForLocale: (Double, Locale) => Double,
    getFormatIndex: (Double, Locale) => Double,
    getStandardFormat: (Double, Locale) => Double,
    getStandardIndex: Locale => Double,
    isTypeCompatible: (Double, Double) => Boolean,
    queryInterface: `type` => Any,
    queryKey: (String, Locale, Boolean) => Double,
    queryKeys: (Double, Locale, Boolean) => SafeArray[Double],
    release: () => Unit,
    removeByKey: Double => Unit
  ): NumberFormats = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addNew = js.Any.fromFunction2(addNew), addNewConverted = js.Any.fromFunction3(addNewConverted), generateFormat = js.Any.fromFunction6(generateFormat), getByKey = js.Any.fromFunction1(getByKey), getFormatForLocale = js.Any.fromFunction2(getFormatForLocale), getFormatIndex = js.Any.fromFunction2(getFormatIndex), getStandardFormat = js.Any.fromFunction2(getStandardFormat), getStandardIndex = js.Any.fromFunction1(getStandardIndex), isTypeCompatible = js.Any.fromFunction2(isTypeCompatible), queryInterface = js.Any.fromFunction1(queryInterface), queryKey = js.Any.fromFunction3(queryKey), queryKeys = js.Any.fromFunction3(queryKeys), release = js.Any.fromFunction0(release), removeByKey = js.Any.fromFunction1(removeByKey))
    __obj.asInstanceOf[NumberFormats]
  }
}
