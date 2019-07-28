package typings.activexDashLibreoffice.comNs.sunNs.starNs.linguistic2Ns

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows searching for an entry in all dictionaries of the dictionary-list.
  *
  * Only active dictionaries of a suitable language will be searched for the entry. The language is suitable if it is the same as the dictionary's
  * language or the dictionary may hold entries of all languages.
  * @see com.sun.star.linguistic2.XDictionaryList
  */
trait XSearchableDictionaryList extends XDictionaryList {
  /**
    * looks for an entry for a given word in the list of dictionaries.
    * @param aWord the word (entry) to be looked for.
    * @param aLocale the language of the word to be looked for.
    * @param bSearchPosDics `TRUE` if only positive dictionaries should be searched. `FALSE` if only negative dictionaries should be searched.
    * @param bSpellEntry `TRUE` if entries for purposes of spell checking are required. `FALSE` if only entries for hyphenation purposes are required.
    * @returns the dictionary entry that was found, `NULL` otherwise.
    */
  def queryDictionaryEntry(aWord: String, aLocale: Locale, bSearchPosDics: Boolean, bSpellEntry: Boolean): XDictionaryEntry
}

object XSearchableDictionaryList {
  @scala.inline
  def apply(
    Count: Double,
    Dictionaries: SafeArray[XDictionary],
    acquire: () => Unit,
    addDictionary: XDictionary => Boolean,
    addDictionaryListEventListener: (XDictionaryListEventListener, Boolean) => Boolean,
    beginCollectEvents: () => Double,
    createDictionary: (String, Locale, DictionaryType, String) => XDictionary,
    endCollectEvents: () => Double,
    flushEvents: () => Double,
    getCount: () => Double,
    getDictionaries: () => SafeArray[XDictionary],
    getDictionaryByName: String => XDictionary,
    queryDictionaryEntry: (String, Locale, Boolean, Boolean) => XDictionaryEntry,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeDictionary: XDictionary => Boolean,
    removeDictionaryListEventListener: XDictionaryListEventListener => Boolean
  ): XSearchableDictionaryList = {
    val __obj = js.Dynamic.literal(Count = Count, Dictionaries = Dictionaries, acquire = js.Any.fromFunction0(acquire), addDictionary = js.Any.fromFunction1(addDictionary), addDictionaryListEventListener = js.Any.fromFunction2(addDictionaryListEventListener), beginCollectEvents = js.Any.fromFunction0(beginCollectEvents), createDictionary = js.Any.fromFunction4(createDictionary), endCollectEvents = js.Any.fromFunction0(endCollectEvents), flushEvents = js.Any.fromFunction0(flushEvents), getCount = js.Any.fromFunction0(getCount), getDictionaries = js.Any.fromFunction0(getDictionaries), getDictionaryByName = js.Any.fromFunction1(getDictionaryByName), queryDictionaryEntry = js.Any.fromFunction4(queryDictionaryEntry), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeDictionary = js.Any.fromFunction1(removeDictionary), removeDictionaryListEventListener = js.Any.fromFunction1(removeDictionaryListEventListener))
  
    __obj.asInstanceOf[XSearchableDictionaryList]
  }
}

