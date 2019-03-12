package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  extends XConversionDictionary
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XFlushable
     with XConversionPropertyType

object ConversionDictionary {
  @scala.inline
  def apply(
    ConversionType: scala.Double,
    Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    Name: java.lang.String,
    acquire: () => scala.Unit,
    addEntry: (java.lang.String, java.lang.String) => scala.Unit,
    addFlushListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XFlushListener => scala.Unit,
    clear: () => scala.Unit,
    flush: () => scala.Unit,
    getConversionEntries: ConversionDirection => stdLib.SafeArray[java.lang.String],
    getConversionType: () => scala.Double,
    getConversions: (java.lang.String, scala.Double, scala.Double, ConversionDirection, scala.Double) => stdLib.SafeArray[java.lang.String],
    getLocale: () => activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    getMaxCharCount: ConversionDirection => scala.Double,
    getName: () => java.lang.String,
    getPropertyType: (java.lang.String, java.lang.String) => scala.Double,
    isActive: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEntry: (java.lang.String, java.lang.String) => scala.Unit,
    removeFlushListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XFlushListener => scala.Unit,
    setActive: scala.Boolean => scala.Unit,
    setPropertyType: (java.lang.String, java.lang.String, scala.Double) => scala.Unit
  ): ConversionDictionary = {
    val __obj = js.Dynamic.literal(ConversionType = ConversionType, Locale = Locale, Name = Name, acquire = js.Any.fromFunction0(acquire), addEntry = js.Any.fromFunction2(addEntry), addFlushListener = js.Any.fromFunction1(addFlushListener), clear = js.Any.fromFunction0(clear), flush = js.Any.fromFunction0(flush), getConversionEntries = js.Any.fromFunction1(getConversionEntries), getConversionType = js.Any.fromFunction0(getConversionType), getConversions = js.Any.fromFunction5(getConversions), getLocale = js.Any.fromFunction0(getLocale), getMaxCharCount = js.Any.fromFunction1(getMaxCharCount), getName = js.Any.fromFunction0(getName), getPropertyType = js.Any.fromFunction2(getPropertyType), isActive = js.Any.fromFunction0(isActive), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEntry = js.Any.fromFunction2(removeEntry), removeFlushListener = js.Any.fromFunction1(removeFlushListener), setActive = js.Any.fromFunction1(setActive), setPropertyType = js.Any.fromFunction3(setPropertyType))
  
    __obj.asInstanceOf[ConversionDictionary]
  }
}

