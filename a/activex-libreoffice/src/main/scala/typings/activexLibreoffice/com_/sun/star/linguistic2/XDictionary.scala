package typings.activexLibreoffice.com_.sun.star.linguistic2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNamed
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait XDictionary
  extends StObject
     with XNamed {
  
  /** @returns the number of entries in the dictionary. */
  val Count: Double
  
  /**
    * returns the type of the dictionary.
    * @returns the type of the dictionary.
    * @see com.sun.star.linguistic2.DictionaryType
    */
  val DictionaryType: typings.activexLibreoffice.com_.sun.star.linguistic2.DictionaryType
  
  /**
    * This function should no longer be used since with the expansion of the maximum number of allowed entries the result may become unreasonable large!
    * @deprecated Deprecated
    * @returns a sequence with all the entries of the dictionary.
    * @see com.sun.star.linguistic2.XDictionaryEntry
    * @see com.sun.star.linguistic2.XSearchableDictionary
    */
  val Entries: SafeArray[XDictionaryEntry]
  
  /**
    * @returns the language of the dictionary.
    * @see com.sun.star.lang.Locale
    */
  var Locale: typings.activexLibreoffice.com_.sun.star.lang.Locale
  
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
  def add(aWord: String, bIsNegative: Boolean, aRplcText: String): Boolean
  
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
  def addDictionaryEventListener(xListener: XDictionaryEventListener): Boolean
  
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
  def addEntry(xDicEntry: XDictionaryEntry): Boolean
  
  /** removes all entries from the dictionary. */
  def clear(): Unit
  
  /** @returns the number of entries in the dictionary. */
  def getCount(): Double
  
  /**
    * returns the type of the dictionary.
    * @returns the type of the dictionary.
    * @see com.sun.star.linguistic2.DictionaryType
    */
  def getDictionaryType(): typings.activexLibreoffice.com_.sun.star.linguistic2.DictionaryType
  
  /**
    * This function should no longer be used since with the expansion of the maximum number of allowed entries the result may become unreasonable large!
    * @deprecated Deprecated
    * @returns a sequence with all the entries of the dictionary.
    * @see com.sun.star.linguistic2.XDictionaryEntry
    * @see com.sun.star.linguistic2.XSearchableDictionary
    */
  def getEntries(): SafeArray[XDictionaryEntry]
  
  /**
    * searches for an entry that matches the given word.
    * @param aWord the word to be looked for.
    * @returns the reference to the entry found. If no entry was found, it is NULL.
    * @see com.sun.star.linguistic2.XDictionaryEntry
    */
  def getEntry(aWord: String): XDictionaryEntry
  
  /**
    * @returns the language of the dictionary.
    * @see com.sun.star.lang.Locale
    */
  def getLocale(): Locale
  
  /** @returns `TRUE` if the dictionary is active, `FALSE` otherwise. */
  def isActive(): Boolean
  
  /** @returns `TRUE` if the dictionary is full and no further entry can be made, `FALSE` otherwise. */
  def isFull(): Boolean
  
  /**
    * removes an entry from the dictionary.
    * @param aWord the word matching the entry to be removed.
    * @returns `TRUE` if the entry was successfully removed, `FALSE` otherwise (especially if the entry was not found).
    */
  def remove(aWord: String): Boolean
  
  /**
    * removes an entry from the list of dictionary event listeners.
    * @param xListener the reference to the listening object to be removed.
    * @returns `TRUE` if the object to be removed was found and removed, `FALSE` if the object was not found in the list.
    * @see com.sun.star.linguistic2.XDictionary.addDictionaryEventListener()
    * @see com.sun.star.linguistic2.XDictionaryEventListener
    */
  def removeDictionaryEventListener(xListener: XDictionaryEventListener): Boolean
  
  /**
    * specifies whether the dictionary should be used or not .
    * @param bActivate `TRUE` if the dictionary should be used, `FALSE` otherwise.
    */
  def setActive(bActivate: Boolean): Unit
  
  /**
    * is used to set the language of the dictionary.
    * @param aLocale the new language of the dictionary.
    * @see com.sun.star.lang.Locale
    */
  def setLocale(aLocale: Locale): Unit
}
object XDictionary {
  
  inline def apply(
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
    queryInterface: `type` => Any,
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
  
  extension [Self <: XDictionary](x: Self) {
    
    inline def setAdd(value: (String, Boolean, String) => Boolean): Self = StObject.set(x, "add", js.Any.fromFunction3(value))
    
    inline def setAddDictionaryEventListener(value: XDictionaryEventListener => Boolean): Self = StObject.set(x, "addDictionaryEventListener", js.Any.fromFunction1(value))
    
    inline def setAddEntry(value: XDictionaryEntry => Boolean): Self = StObject.set(x, "addEntry", js.Any.fromFunction1(value))
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setDictionaryType(value: DictionaryType): Self = StObject.set(x, "DictionaryType", value.asInstanceOf[js.Any])
    
    inline def setEntries(value: SafeArray[XDictionaryEntry]): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
    
    inline def setGetCount(value: () => Double): Self = StObject.set(x, "getCount", js.Any.fromFunction0(value))
    
    inline def setGetDictionaryType(value: () => DictionaryType): Self = StObject.set(x, "getDictionaryType", js.Any.fromFunction0(value))
    
    inline def setGetEntries(value: () => SafeArray[XDictionaryEntry]): Self = StObject.set(x, "getEntries", js.Any.fromFunction0(value))
    
    inline def setGetEntry(value: String => XDictionaryEntry): Self = StObject.set(x, "getEntry", js.Any.fromFunction1(value))
    
    inline def setGetLocale(value: () => Locale): Self = StObject.set(x, "getLocale", js.Any.fromFunction0(value))
    
    inline def setIsActive(value: () => Boolean): Self = StObject.set(x, "isActive", js.Any.fromFunction0(value))
    
    inline def setIsFull(value: () => Boolean): Self = StObject.set(x, "isFull", js.Any.fromFunction0(value))
    
    inline def setLocale(value: Locale): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: String => Boolean): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setRemoveDictionaryEventListener(value: XDictionaryEventListener => Boolean): Self = StObject.set(x, "removeDictionaryEventListener", js.Any.fromFunction1(value))
    
    inline def setSetActive(value: Boolean => Unit): Self = StObject.set(x, "setActive", js.Any.fromFunction1(value))
    
    inline def setSetLocale(value: Locale => Unit): Self = StObject.set(x, "setLocale", js.Any.fromFunction1(value))
  }
}
