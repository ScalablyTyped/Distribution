package typings.activexLibreoffice.com_.sun.star.linguistic2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.util.XFlushListener
import typings.activexLibreoffice.com_.sun.star.util.XFlushable
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a dictionary used in a conversion dictionary list.
  *
  * Specific implementations may put some restrictions for the dictionary or it's entries. Namely usually the order for the string pairs within a single
  * entry will be defined.
  * @see com.sun.star.linguistic2.ConversionDictionaryList
  * @see com.sun.star.linguistic2.HangulHanjaConversionDictionary
  * @see com.sun.star.linguistic2.XConversionDictionary
  * @see com.sun.star.linguistic2.XConversionPropertyType
  * @since OOo 1.1.2
  */
trait ConversionDictionary
  extends StObject
     with XConversionDictionary
     with XFlushable
     with XConversionPropertyType
object ConversionDictionary {
  
  inline def apply(
    ConversionType: Double,
    Locale: Locale,
    Name: String,
    acquire: () => Unit,
    addEntry: (String, String) => Unit,
    addFlushListener: XFlushListener => Unit,
    clear: () => Unit,
    flush: () => Unit,
    getConversionEntries: ConversionDirection => SafeArray[String],
    getConversionType: () => Double,
    getConversions: (String, Double, Double, ConversionDirection, Double) => SafeArray[String],
    getLocale: () => Locale,
    getMaxCharCount: ConversionDirection => Double,
    getName: () => String,
    getPropertyType: (String, String) => Double,
    isActive: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEntry: (String, String) => Unit,
    removeFlushListener: XFlushListener => Unit,
    setActive: Boolean => Unit,
    setPropertyType: (String, String, Double) => Unit
  ): ConversionDictionary = {
    val __obj = js.Dynamic.literal(ConversionType = ConversionType.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEntry = js.Any.fromFunction2(addEntry), addFlushListener = js.Any.fromFunction1(addFlushListener), clear = js.Any.fromFunction0(clear), flush = js.Any.fromFunction0(flush), getConversionEntries = js.Any.fromFunction1(getConversionEntries), getConversionType = js.Any.fromFunction0(getConversionType), getConversions = js.Any.fromFunction5(getConversions), getLocale = js.Any.fromFunction0(getLocale), getMaxCharCount = js.Any.fromFunction1(getMaxCharCount), getName = js.Any.fromFunction0(getName), getPropertyType = js.Any.fromFunction2(getPropertyType), isActive = js.Any.fromFunction0(isActive), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEntry = js.Any.fromFunction2(removeEntry), removeFlushListener = js.Any.fromFunction1(removeFlushListener), setActive = js.Any.fromFunction1(setActive), setPropertyType = js.Any.fromFunction3(setPropertyType))
    __obj.asInstanceOf[ConversionDictionary]
  }
}
