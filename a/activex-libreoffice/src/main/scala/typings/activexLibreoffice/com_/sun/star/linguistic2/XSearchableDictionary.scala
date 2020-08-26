package typings.activexLibreoffice.com_.sun.star.linguistic2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interfaces allows to retrieve suggestions for spell checking from a dictionary. */
@js.native
trait XSearchableDictionary extends XDictionary {
  /**
    * search for similar entries in the dictionary.
    * @param aWord the word to find similar written entries for.
    * @returns the list of similar entries found.
    * @see com.sun.star.linguistic2.XDictionaryEntry
    * @see com.sun.star.linguistic2.XSearchableDictionaryList
    * @since OOo 3.0.1
    */
  def searchSimilarEntries(aWord: String): SafeArray[XDictionaryEntry] = js.native
}

object XSearchableDictionary {
  @scala.inline
  def apply(
    Count: Double,
    DictionaryType: DictionaryType,
    Entries: SafeArray[XDictionaryEntry],
    Locale: Locale,
    Name: String,
    acquire: () => Unit,
    add: (String, Boolean, String) => Boolean,
    addDictionaryEventListener: XDictionaryEventListener => Boolean,
    addEntry: XDictionaryEntry => Boolean,
    clear: () => Unit,
    getCount: () => Double,
    getDictionaryType: () => DictionaryType,
    getEntries: () => SafeArray[XDictionaryEntry],
    getEntry: String => XDictionaryEntry,
    getLocale: () => Locale,
    getName: () => String,
    isActive: () => Boolean,
    isFull: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    remove: String => Boolean,
    removeDictionaryEventListener: XDictionaryEventListener => Boolean,
    searchSimilarEntries: String => SafeArray[XDictionaryEntry],
    setActive: Boolean => Unit,
    setLocale: Locale => Unit,
    setName: String => Unit
  ): XSearchableDictionary = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], DictionaryType = DictionaryType.asInstanceOf[js.Any], Entries = Entries.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), add = js.Any.fromFunction3(add), addDictionaryEventListener = js.Any.fromFunction1(addDictionaryEventListener), addEntry = js.Any.fromFunction1(addEntry), clear = js.Any.fromFunction0(clear), getCount = js.Any.fromFunction0(getCount), getDictionaryType = js.Any.fromFunction0(getDictionaryType), getEntries = js.Any.fromFunction0(getEntries), getEntry = js.Any.fromFunction1(getEntry), getLocale = js.Any.fromFunction0(getLocale), getName = js.Any.fromFunction0(getName), isActive = js.Any.fromFunction0(isActive), isFull = js.Any.fromFunction0(isFull), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction1(remove), removeDictionaryEventListener = js.Any.fromFunction1(removeDictionaryEventListener), searchSimilarEntries = js.Any.fromFunction1(searchSimilarEntries), setActive = js.Any.fromFunction1(setActive), setLocale = js.Any.fromFunction1(setLocale), setName = js.Any.fromFunction1(setName))
    __obj.asInstanceOf[XSearchableDictionary]
  }
  @scala.inline
  implicit class XSearchableDictionaryOps[Self <: XSearchableDictionary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSearchSimilarEntries(value: String => SafeArray[XDictionaryEntry]): Self = this.set("searchSimilarEntries", js.Any.fromFunction1(value))
  }
  
}

