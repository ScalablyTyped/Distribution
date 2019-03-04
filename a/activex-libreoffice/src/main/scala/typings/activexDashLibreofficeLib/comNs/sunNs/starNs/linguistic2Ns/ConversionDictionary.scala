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
    acquire: js.Function0[scala.Unit],
    addEntry: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    addFlushListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XFlushListener, scala.Unit],
    clear: js.Function0[scala.Unit],
    flush: js.Function0[scala.Unit],
    getConversionEntries: js.Function1[ConversionDirection, activexDashInteropLib.SafeArray[java.lang.String]],
    getConversionType: js.Function0[scala.Double],
    getConversions: js.Function5[
      java.lang.String, 
      scala.Double, 
      scala.Double, 
      ConversionDirection, 
      scala.Double, 
      activexDashInteropLib.SafeArray[java.lang.String]
    ],
    getLocale: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    getMaxCharCount: js.Function1[ConversionDirection, scala.Double],
    getName: js.Function0[java.lang.String],
    getPropertyType: js.Function2[java.lang.String, java.lang.String, scala.Double],
    isActive: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEntry: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    removeFlushListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XFlushListener, scala.Unit],
    setActive: js.Function1[scala.Boolean, scala.Unit],
    setPropertyType: js.Function3[java.lang.String, java.lang.String, scala.Double, scala.Unit]
  ): ConversionDictionary = {
    val __obj = js.Dynamic.literal(ConversionType = ConversionType, Locale = Locale, Name = Name, acquire = acquire, addEntry = addEntry, addFlushListener = addFlushListener, clear = clear, flush = flush, getConversionEntries = getConversionEntries, getConversionType = getConversionType, getConversions = getConversions, getLocale = getLocale, getMaxCharCount = getMaxCharCount, getName = getName, getPropertyType = getPropertyType, isActive = isActive, queryInterface = queryInterface, release = release, removeEntry = removeEntry, removeFlushListener = removeFlushListener, setActive = setActive, setPropertyType = setPropertyType)
  
    __obj.asInstanceOf[ConversionDictionary]
  }
}

