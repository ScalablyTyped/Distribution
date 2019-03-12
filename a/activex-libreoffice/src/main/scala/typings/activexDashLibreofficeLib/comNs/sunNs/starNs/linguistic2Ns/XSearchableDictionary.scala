package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interfaces allows to retrieve suggestions for spell checking from a dictionary. */
trait XSearchableDictionary extends XDictionary {
  /**
    * search for similar entries in the dictionary.
    * @param aWord the word to find similar written entries for.
    * @returns the list of similar entries found.
    * @see com.sun.star.linguistic2.XDictionaryEntry
    * @see com.sun.star.linguistic2.XSearchableDictionaryList
    * @since OOo 3.0.1
    */
  def searchSimilarEntries(aWord: java.lang.String): stdLib.SafeArray[XDictionaryEntry]
}

object XSearchableDictionary {
  @scala.inline
  def apply(
    Count: scala.Double,
    DictionaryType: DictionaryType,
    Entries: stdLib.SafeArray[XDictionaryEntry],
    Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
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
    getName: () => java.lang.String,
    isActive: () => scala.Boolean,
    isFull: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    remove: java.lang.String => scala.Boolean,
    removeDictionaryEventListener: XDictionaryEventListener => scala.Boolean,
    searchSimilarEntries: java.lang.String => stdLib.SafeArray[XDictionaryEntry],
    setActive: scala.Boolean => scala.Unit,
    setLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => scala.Unit,
    setName: java.lang.String => scala.Unit
  ): XSearchableDictionary = {
    val __obj = js.Dynamic.literal(Count = Count, DictionaryType = DictionaryType, Entries = Entries, Locale = Locale, Name = Name, acquire = js.Any.fromFunction0(acquire), add = js.Any.fromFunction3(add), addDictionaryEventListener = js.Any.fromFunction1(addDictionaryEventListener), addEntry = js.Any.fromFunction1(addEntry), clear = js.Any.fromFunction0(clear), getCount = js.Any.fromFunction0(getCount), getDictionaryType = js.Any.fromFunction0(getDictionaryType), getEntries = js.Any.fromFunction0(getEntries), getEntry = js.Any.fromFunction1(getEntry), getLocale = js.Any.fromFunction0(getLocale), getName = js.Any.fromFunction0(getName), isActive = js.Any.fromFunction0(isActive), isFull = js.Any.fromFunction0(isFull), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction1(remove), removeDictionaryEventListener = js.Any.fromFunction1(removeDictionaryEventListener), searchSimilarEntries = js.Any.fromFunction1(searchSimilarEntries), setActive = js.Any.fromFunction1(setActive), setLocale = js.Any.fromFunction1(setLocale), setName = js.Any.fromFunction1(setName))
  
    __obj.asInstanceOf[XSearchableDictionary]
  }
}

