package typings.activexLibreoffice.com_.sun.star.linguistic2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is used to manage and maintain a list of dictionaries.
  *
  * A dictionary-list may be given to a spell checker or hyphenator service implementation on their creation in order to supply a set of dictionaries and
  * additional information to be used for those purposes.
  * @see com.sun.star.linguistic2.XDictionary
  * @see com.sun.star.uno.XInterface
  */
@js.native
trait XDictionaryList extends XInterface {
  
  /** @returns the number of dictionaries in the list. */
  val Count: Double = js.native
  
  /**
    * @returns a sequence with an entry for every dictionary in the list.
    * @see com.sun.star.linguistic2.XDictionary
    */
  val Dictionaries: SafeArray[XDictionary] = js.native
  
  /**
    * adds a dictionary to the list.
    *
    * Additionally, the dictionary-list will add itself to the list of dictionary event listeners of that dictionary.
    * @param xDictionary the dictionary to be added.
    * @returns `TRUE` if the dictionary was added successfully, `FALSE` otherwise.
    * @see com.sun.star.linguistic2.XDictionary
    */
  def addDictionary(xDictionary: XDictionary): Boolean = js.native
  
  /**
    * adds an entry to the list of dictionary-list event listeners.
    *
    * On dictionary-list events, each entry in the listener list will be notified via a call to {@link
    * com.sun.star.linguistic2.XDictionaryListEventListener.processDictionaryListEvent()} .
    * @param xListener the object to be notified of dictionary-list events.
    * @param bReceiveVerbose `TRUE` if the listener requires more detailed event notification than usual.
    * @returns `TRUE` if the entry was made, `FALSE` otherwise. If {@link com.sun.star.lang.XEventListener.disposing()} was called before, it will always fail.
    * @see com.sun.star.linguistic2.XDictionaryListEventListener
    * @see com.sun.star.linguistic2.XDictionaryListEvent
    */
  def addDictionaryListEventListener(xListener: XDictionaryListEventListener, bReceiveVerbose: Boolean): Boolean = js.native
  
  /**
    * increases request level for event buffering by one.
    *
    * The request level for event buffering is an integer counter that is initially set to 0. As long as the request level is not 0, events will be buffered
    * until the next flushing of the buffer.
    * @returns the current request level for event buffering.
    * @see com.sun.star.linguistic2.XDictionaryListEvent
    * @see com.sun.star.linguistic2.XDictionaryListEventListener
    * @see com.sun.star.linguistic2.XDictionaryList.endCollectEvents()
    * @see com.sun.star.linguistic2.XDictionaryList.flushEvents()
    */
  def beginCollectEvents(): Double = js.native
  
  /**
    * creates a new dictionary.
    * @param aName is the name of the dictionary (should be unique).
    * @param aLocale defines the language of the dictionary. Use an empty aLocale for dictionaries which may contain entries of all languages.
    * @param eDicType specifies the type of the dictionary.
    * @param aURL is the URL of the location where the dictionary is persistent, if the XStorable interface is supported. It may be empty, which means the dic
    * @returns an empty dictionary with the given name, language and type. `NULL` on failure.
    * @see com.sun.star.linguistic2.XDictionary
    * @see com.sun.star.lang.Locale
    * @see com.sun.star.linguistic2.DictionaryType
    */
  def createDictionary(aName: String, aLocale: Locale, eDicType: DictionaryType, aURL: String): XDictionary = js.native
  
  /**
    * flushes the event buffer and decreases the request level for event buffering by one.
    *
    * There should be one matching endCollectEvents call for every beginCollectEvents call. Usually you will group these around some code where you do not
    * wish to get notified of every single event.
    * @returns the current request level for event buffering.
    * @see com.sun.star.linguistic2.XDictionaryListEvent
    * @see com.sun.star.linguistic2.XDictionaryListEventListener
    * @see com.sun.star.linguistic2.XDictionaryList.beginCollectEvents()
    * @see com.sun.star.linguistic2.XDictionaryList.flushEvents()
    */
  def endCollectEvents(): Double = js.native
  
  /**
    * notifies the listeners of all buffered events and then clears that buffer.
    * @returns the current request level for event buffering.
    * @see com.sun.star.linguistic2.XDictionaryListEvent
    * @see com.sun.star.linguistic2.XDictionaryListEventListener
    * @see com.sun.star.linguistic2.XDictionaryList.beginCollectEvents()
    * @see com.sun.star.linguistic2.XDictionaryList.endCollectEvents()
    */
  def flushEvents(): Double = js.native
  
  /** @returns the number of dictionaries in the list. */
  def getCount(): Double = js.native
  
  /**
    * @returns a sequence with an entry for every dictionary in the list.
    * @see com.sun.star.linguistic2.XDictionary
    */
  def getDictionaries(): SafeArray[XDictionary] = js.native
  
  /**
    * searches the list for a dictionary with a given name.
    * @param aDictionaryName specifies the name of the dictionary to look for.
    * @returns the {@link XDictionary} with the specified name. If no such dictionary exists, `NULL` will be returned.
    * @see com.sun.star.linguistic2.XDictionary
    */
  def getDictionaryByName(aDictionaryName: String): XDictionary = js.native
  
  /**
    * removes a single dictionary from the list.
    *
    * If the dictionary is still active, it will be deactivated first. The dictionary-list will remove itself from the list of dictionary event listeners of
    * the dictionary.
    * @param xDictionary dictionary to be removed from the list of dictionaries.
    * @returns `TRUE` if the dictionary was removed successfully, `FALSE` otherwise.
    * @see com.sun.star.linguistic2.XDictionary
    */
  def removeDictionary(xDictionary: XDictionary): Boolean = js.native
  
  /**
    * removes an entry from the list of dictionary-list event listeners.
    * @param xListener the object to be removed from the listener list.
    * @returns `TRUE` if the object to be removed was found and removed, `FALSE` otherwise.
    * @see com.sun.star.linguistic2.XDictionaryListEventListener
    * @see com.sun.star.linguistic2.XDictionaryListEvent
    */
  def removeDictionaryListEventListener(xListener: XDictionaryListEventListener): Boolean = js.native
}
object XDictionaryList {
  
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
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeDictionary: XDictionary => Boolean,
    removeDictionaryListEventListener: XDictionaryListEventListener => Boolean
  ): XDictionaryList = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Dictionaries = Dictionaries.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addDictionary = js.Any.fromFunction1(addDictionary), addDictionaryListEventListener = js.Any.fromFunction2(addDictionaryListEventListener), beginCollectEvents = js.Any.fromFunction0(beginCollectEvents), createDictionary = js.Any.fromFunction4(createDictionary), endCollectEvents = js.Any.fromFunction0(endCollectEvents), flushEvents = js.Any.fromFunction0(flushEvents), getCount = js.Any.fromFunction0(getCount), getDictionaries = js.Any.fromFunction0(getDictionaries), getDictionaryByName = js.Any.fromFunction1(getDictionaryByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeDictionary = js.Any.fromFunction1(removeDictionary), removeDictionaryListEventListener = js.Any.fromFunction1(removeDictionaryListEventListener))
    __obj.asInstanceOf[XDictionaryList]
  }
  
  @scala.inline
  implicit class XDictionaryListOps[Self <: XDictionaryList] (val x: Self) extends AnyVal {
    
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
    def setDictionaries(value: SafeArray[XDictionary]): Self = this.set("Dictionaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddDictionary(value: XDictionary => Boolean): Self = this.set("addDictionary", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddDictionaryListEventListener(value: (XDictionaryListEventListener, Boolean) => Boolean): Self = this.set("addDictionaryListEventListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeginCollectEvents(value: () => Double): Self = this.set("beginCollectEvents", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateDictionary(value: (String, Locale, DictionaryType, String) => XDictionary): Self = this.set("createDictionary", js.Any.fromFunction4(value))
    
    @scala.inline
    def setEndCollectEvents(value: () => Double): Self = this.set("endCollectEvents", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFlushEvents(value: () => Double): Self = this.set("flushEvents", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCount(value: () => Double): Self = this.set("getCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDictionaries(value: () => SafeArray[XDictionary]): Self = this.set("getDictionaries", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDictionaryByName(value: String => XDictionary): Self = this.set("getDictionaryByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveDictionary(value: XDictionary => Boolean): Self = this.set("removeDictionary", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveDictionaryListEventListener(value: XDictionaryListEventListener => Boolean): Self = this.set("removeDictionaryListEventListener", js.Any.fromFunction1(value))
  }
}
