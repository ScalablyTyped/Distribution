package typings.activexLibreoffice.com_.sun.star.linguistic2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNamed
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interfaces enables the object to access personal dictionaries.
  *
  * Personal dictionaries are used to supply additional information for spell checking and hyphenation (see {@link
  * com.sun.star.linguistic2.XDictionaryEntry} ). Only active dictionaries with an appropriate language are used for that purpose. The entries of an
  * active, positive dictionary are words that are required to be recognized as correct during the spell checking process. Additionally, they will be used
  * for hyphenation. Entries of a negative dictionary are required to be recognized as negative words, for example, words that should not be used, during
  * SPELLCHECK. An entry in a negative dictionary may supply a proposal for a word to be used instead of the one being used.
  * @see com.sun.star.linguistic2.XDictionaryEvent
  * @see com.sun.star.container.XNamed
  */
@js.native
trait XDictionary extends XNamed {
  /** @returns the number of entries in the dictionary. */
  val Count: Double = js.native
  /**
    * returns the type of the dictionary.
    * @returns the type of the dictionary.
    * @see com.sun.star.linguistic2.DictionaryType
    */
  val DictionaryType: typings.activexLibreoffice.com_.sun.star.linguistic2.DictionaryType = js.native
  /**
    * This function should no longer be used since with the expansion of the maximum number of allowed entries the result may become unreasonable large!
    * @deprecated Deprecated
    * @returns a sequence with all the entries of the dictionary.
    * @see com.sun.star.linguistic2.XDictionaryEntry
    * @see com.sun.star.linguistic2.XSearchableDictionary
    */
  val Entries: SafeArray[XDictionaryEntry] = js.native
  /**
    * @returns the language of the dictionary.
    * @see com.sun.star.lang.Locale
    */
  var Locale: typings.activexLibreoffice.com_.sun.star.lang.Locale = js.native
  /**
    * is used to make an entry in the dictionary.
    *
    * If an entry already exists, the dictionary remains unchanged and `FALSE` will be returned.
    *
    * In positive dictionaries only positive entries can be made, and in negative ones only negative entries.
    * @param aWord the word to be added.
    * @param bIsNegative specifies whether the entry will be a negative one or not.
    * @param aRplcText in the case of a negative entry, this is the replacement text to be used when replacing aWord. Otherwise, it is undefined.
    * @returns `TRUE` if the entry was successfully added, `FALSE` otherwise.
    * @see com.sun.star.linguistic2.DictionaryType
    */
  def add(aWord: String, bIsNegative: Boolean, aRplcText: String): Boolean = js.native
  /**
    * adds an entry to the list of dictionary event listeners.
    *
    * On dictionary events, each entry in the listener list will be notified via a call to {@link
    * com.sun.star.linguistic2.XDictionaryEventListener.processDictionaryEvent()} .
    * @param xListener the entry to be made, that is, the object that wants notifications.
    * @returns `TRUE` if the entry was successfully made, `FALSE` otherwise. If {@link com.sun.star.lang.XEventListener.disposing()} was called before, it will
    * @see com.sun.star.linguistic2.XDictionary.removeDictionaryEventListener()
    * @see com.sun.star.linguistic2.XDictionaryEventListener
    */
  def addDictionaryEventListener(xListener: XDictionaryEventListener): Boolean = js.native
  /**
    * is used to add an entry to the dictionary.
    *
    * If an entry already exists, the dictionary remains unchanged and `FALSE` will be returned.
    *
    * In positive dictionaries only positive entries can be made, and in negative ones only negative entries.
    * @param xDicEntry the entry to be added.
    * @returns `TRUE` if the entry was successfully added `FALSE` otherwise.
    * @see com.sun.star.linguistic2.XDictionaryEntry
    * @see com.sun.star.linguistic2.DictionaryType
    */
  def addEntry(xDicEntry: XDictionaryEntry): Boolean = js.native
  /** removes all entries from the dictionary. */
  def clear(): Unit = js.native
  /** @returns the number of entries in the dictionary. */
  def getCount(): Double = js.native
  /**
    * returns the type of the dictionary.
    * @returns the type of the dictionary.
    * @see com.sun.star.linguistic2.DictionaryType
    */
  def getDictionaryType(): typings.activexLibreoffice.com_.sun.star.linguistic2.DictionaryType = js.native
  /**
    * This function should no longer be used since with the expansion of the maximum number of allowed entries the result may become unreasonable large!
    * @deprecated Deprecated
    * @returns a sequence with all the entries of the dictionary.
    * @see com.sun.star.linguistic2.XDictionaryEntry
    * @see com.sun.star.linguistic2.XSearchableDictionary
    */
  def getEntries(): SafeArray[XDictionaryEntry] = js.native
  /**
    * searches for an entry that matches the given word.
    * @param aWord the word to be looked for.
    * @returns the reference to the entry found. If no entry was found, it is NULL.
    * @see com.sun.star.linguistic2.XDictionaryEntry
    */
  def getEntry(aWord: String): XDictionaryEntry = js.native
  /**
    * @returns the language of the dictionary.
    * @see com.sun.star.lang.Locale
    */
  def getLocale(): Locale = js.native
  /** @returns `TRUE` if the dictionary is active, `FALSE` otherwise. */
  def isActive(): Boolean = js.native
  /** @returns `TRUE` if the dictionary is full and no further entry can be made, `FALSE` otherwise. */
  def isFull(): Boolean = js.native
  /**
    * removes an entry from the dictionary.
    * @param aWord the word matching the entry to be removed.
    * @returns `TRUE` if the entry was successfully removed, `FALSE` otherwise (especially if the entry was not found).
    */
  def remove(aWord: String): Boolean = js.native
  /**
    * removes an entry from the list of dictionary event listeners.
    * @param xListener the reference to the listening object to be removed.
    * @returns `TRUE` if the object to be removed was found and removed, `FALSE` if the object was not found in the list.
    * @see com.sun.star.linguistic2.XDictionary.addDictionaryEventListener()
    * @see com.sun.star.linguistic2.XDictionaryEventListener
    */
  def removeDictionaryEventListener(xListener: XDictionaryEventListener): Boolean = js.native
  /**
    * specifies whether the dictionary should be used or not .
    * @param bActivate `TRUE` if the dictionary should be used, `FALSE` otherwise.
    */
  def setActive(bActivate: Boolean): Unit = js.native
  /**
    * is used to set the language of the dictionary.
    * @param aLocale the new language of the dictionary.
    * @see com.sun.star.lang.Locale
    */
  def setLocale(aLocale: Locale): Unit = js.native
}

object XDictionary {
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
    setActive: Boolean => Unit,
    setLocale: Locale => Unit,
    setName: String => Unit
  ): XDictionary = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], DictionaryType = DictionaryType.asInstanceOf[js.Any], Entries = Entries.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), add = js.Any.fromFunction3(add), addDictionaryEventListener = js.Any.fromFunction1(addDictionaryEventListener), addEntry = js.Any.fromFunction1(addEntry), clear = js.Any.fromFunction0(clear), getCount = js.Any.fromFunction0(getCount), getDictionaryType = js.Any.fromFunction0(getDictionaryType), getEntries = js.Any.fromFunction0(getEntries), getEntry = js.Any.fromFunction1(getEntry), getLocale = js.Any.fromFunction0(getLocale), getName = js.Any.fromFunction0(getName), isActive = js.Any.fromFunction0(isActive), isFull = js.Any.fromFunction0(isFull), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction1(remove), removeDictionaryEventListener = js.Any.fromFunction1(removeDictionaryEventListener), setActive = js.Any.fromFunction1(setActive), setLocale = js.Any.fromFunction1(setLocale), setName = js.Any.fromFunction1(setName))
    __obj.asInstanceOf[XDictionary]
  }
  @scala.inline
  implicit class XDictionaryOps[Self <: XDictionary] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setDictionaryType(value: DictionaryType): Self = this.set("DictionaryType", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntries(value: SafeArray[XDictionaryEntry]): Self = this.set("Entries", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocale(value: Locale): Self = this.set("Locale", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdd(value: (String, Boolean, String) => Boolean): Self = this.set("add", js.Any.fromFunction3(value))
    @scala.inline
    def setAddDictionaryEventListener(value: XDictionaryEventListener => Boolean): Self = this.set("addDictionaryEventListener", js.Any.fromFunction1(value))
    @scala.inline
    def setAddEntry(value: XDictionaryEntry => Boolean): Self = this.set("addEntry", js.Any.fromFunction1(value))
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCount(value: () => Double): Self = this.set("getCount", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDictionaryType(value: () => DictionaryType): Self = this.set("getDictionaryType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetEntries(value: () => SafeArray[XDictionaryEntry]): Self = this.set("getEntries", js.Any.fromFunction0(value))
    @scala.inline
    def setGetEntry(value: String => XDictionaryEntry): Self = this.set("getEntry", js.Any.fromFunction1(value))
    @scala.inline
    def setGetLocale(value: () => Locale): Self = this.set("getLocale", js.Any.fromFunction0(value))
    @scala.inline
    def setIsActive(value: () => Boolean): Self = this.set("isActive", js.Any.fromFunction0(value))
    @scala.inline
    def setIsFull(value: () => Boolean): Self = this.set("isFull", js.Any.fromFunction0(value))
    @scala.inline
    def setRemove(value: String => Boolean): Self = this.set("remove", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveDictionaryEventListener(value: XDictionaryEventListener => Boolean): Self = this.set("removeDictionaryEventListener", js.Any.fromFunction1(value))
    @scala.inline
    def setSetActive(value: Boolean => Unit): Self = this.set("setActive", js.Any.fromFunction1(value))
    @scala.inline
    def setSetLocale(value: Locale => Unit): Self = this.set("setLocale", js.Any.fromFunction1(value))
  }
  
}

