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
  def searchSimilarEntries(aWord: java.lang.String): activexDashInteropLib.SafeArray[XDictionaryEntry]
}

object XSearchableDictionary {
  @scala.inline
  def apply(
    Count: scala.Double,
    DictionaryType: DictionaryType,
    Entries: activexDashInteropLib.SafeArray[XDictionaryEntry],
    Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    Name: java.lang.String,
    acquire: js.Function0[scala.Unit],
    add: js.Function3[java.lang.String, scala.Boolean, java.lang.String, scala.Boolean],
    addDictionaryEventListener: js.Function1[XDictionaryEventListener, scala.Boolean],
    addEntry: js.Function1[XDictionaryEntry, scala.Boolean],
    clear: js.Function0[scala.Unit],
    getCount: js.Function0[scala.Double],
    getDictionaryType: js.Function0[DictionaryType],
    getEntries: js.Function0[activexDashInteropLib.SafeArray[XDictionaryEntry]],
    getEntry: js.Function1[java.lang.String, XDictionaryEntry],
    getLocale: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    getName: js.Function0[java.lang.String],
    isActive: js.Function0[scala.Boolean],
    isFull: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    remove: js.Function1[java.lang.String, scala.Boolean],
    removeDictionaryEventListener: js.Function1[XDictionaryEventListener, scala.Boolean],
    searchSimilarEntries: js.Function1[java.lang.String, activexDashInteropLib.SafeArray[XDictionaryEntry]],
    setActive: js.Function1[scala.Boolean, scala.Unit],
    setLocale: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Unit],
    setName: js.Function1[java.lang.String, scala.Unit]
  ): XSearchableDictionary = {
    val __obj = js.Dynamic.literal(Count = Count, DictionaryType = DictionaryType, Entries = Entries, Locale = Locale, Name = Name, acquire = acquire, add = add, addDictionaryEventListener = addDictionaryEventListener, addEntry = addEntry, clear = clear, getCount = getCount, getDictionaryType = getDictionaryType, getEntries = getEntries, getEntry = getEntry, getLocale = getLocale, getName = getName, isActive = isActive, isFull = isFull, queryInterface = queryInterface, release = release, remove = remove, removeDictionaryEventListener = removeDictionaryEventListener, searchSimilarEntries = searchSimilarEntries, setActive = setActive, setLocale = setLocale, setName = setName)
  
    __obj.asInstanceOf[XSearchableDictionary]
  }
}

