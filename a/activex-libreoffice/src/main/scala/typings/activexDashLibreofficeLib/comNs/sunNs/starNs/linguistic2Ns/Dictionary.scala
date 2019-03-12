package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a dictionary used for spell checking and hyphenation.
  * @see com.sun.star.linguistic2.DictionaryList
  * @see com.sun.star.linguistic2.XSearchableDictionaryList
  * @since OOo 3.0.1
  */
trait Dictionary
  extends XSearchableDictionary
     with activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XStorable

object Dictionary {
  @scala.inline
  def apply(
    Count: scala.Double,
    DictionaryType: DictionaryType,
    Entries: stdLib.SafeArray[XDictionaryEntry],
    Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    Location: java.lang.String,
    Name: java.lang.String,
    acquire: () => scala.Unit,
    add: (java.lang.String, scala.Boolean, java.lang.String) => scala.Boolean,
    addDictionaryEventListener: XDictionaryEventListener => scala.Boolean,
    addEntry: XDictionaryEntry => scala.Boolean,
    clear: () => scala.Unit,
    getCount: () => scala.Double,
    getDictionaryType: () => DictionaryType,
    getEntries: () => stdLib.SafeArray[XDictionaryEntry],
    getEntry: java.lang.String => XDictionaryEntry,
    getLocale: () => activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    getLocation: () => java.lang.String,
    getName: () => java.lang.String,
    hasLocation: () => scala.Boolean,
    isActive: () => scala.Boolean,
    isFull: () => scala.Boolean,
    isReadonly: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    remove: java.lang.String => scala.Boolean,
    removeDictionaryEventListener: XDictionaryEventListener => scala.Boolean,
    searchSimilarEntries: java.lang.String => stdLib.SafeArray[XDictionaryEntry],
    setActive: scala.Boolean => scala.Unit,
    setLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => scala.Unit,
    setName: java.lang.String => scala.Unit,
    store: () => scala.Unit,
    storeAsURL: (java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]) => scala.Unit,
    storeToURL: (java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]) => scala.Unit
  ): Dictionary = {
    val __obj = js.Dynamic.literal(Count = Count, DictionaryType = DictionaryType, Entries = Entries, Locale = Locale, Location = Location, Name = Name, acquire = js.Any.fromFunction0(acquire), add = js.Any.fromFunction3(add), addDictionaryEventListener = js.Any.fromFunction1(addDictionaryEventListener), addEntry = js.Any.fromFunction1(addEntry), clear = js.Any.fromFunction0(clear), getCount = js.Any.fromFunction0(getCount), getDictionaryType = js.Any.fromFunction0(getDictionaryType), getEntries = js.Any.fromFunction0(getEntries), getEntry = js.Any.fromFunction1(getEntry), getLocale = js.Any.fromFunction0(getLocale), getLocation = js.Any.fromFunction0(getLocation), getName = js.Any.fromFunction0(getName), hasLocation = js.Any.fromFunction0(hasLocation), isActive = js.Any.fromFunction0(isActive), isFull = js.Any.fromFunction0(isFull), isReadonly = js.Any.fromFunction0(isReadonly), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction1(remove), removeDictionaryEventListener = js.Any.fromFunction1(removeDictionaryEventListener), searchSimilarEntries = js.Any.fromFunction1(searchSimilarEntries), setActive = js.Any.fromFunction1(setActive), setLocale = js.Any.fromFunction1(setLocale), setName = js.Any.fromFunction1(setName), store = js.Any.fromFunction0(store), storeAsURL = js.Any.fromFunction2(storeAsURL), storeToURL = js.Any.fromFunction2(storeToURL))
  
    __obj.asInstanceOf[Dictionary]
  }
}

