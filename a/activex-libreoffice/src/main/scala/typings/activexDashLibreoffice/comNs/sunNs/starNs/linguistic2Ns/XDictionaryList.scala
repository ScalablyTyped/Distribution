package typings.activexDashLibreoffice.comNs.sunNs.starNs.linguistic2Ns

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used to manage and maintain a list of dictionaries.
  *
  * A dictionary-list may be given to a spell checker or hyphenator service implementation on their creation in order to supply a set of dictionaries and
  * additional information to be used for those purposes.
  * @see com.sun.star.linguistic2.XDictionary
  * @see com.sun.star.uno.XInterface
  */
trait XDictionaryList extends XInterface {
  /** @returns the number of dictionaries in the list. */
  val Count: Double
  /**
    * @returns a sequence with an entry for every dictionary in the list.
    * @see com.sun.star.linguistic2.XDictionary
    */
  val Dictionaries: SafeArray[XDictionary]
  /**
    * adds a dictionary to the list.
    *
    * Additionally, the dictionary-list will add itself to the list of dictionary event listeners of that dictionary.
    * @param xDictionary the dictionary to be added.
    * @returns `TRUE` if the dictionary was added successfully, `FALSE` otherwise.
    * @see com.sun.star.linguistic2.XDictionary
    */
  def addDictionary(xDictionary: XDictionary): Boolean
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
  def addDictionaryListEventListener(xListener: XDictionaryListEventListener, bReceiveVerbose: Boolean): Boolean
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
  def beginCollectEvents(): Double
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
  def createDictionary(aName: String, aLocale: Locale, eDicType: DictionaryType, aURL: String): XDictionary
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
  def endCollectEvents(): Double
  /**
    * notifies the listeners of all buffered events and then clears that buffer.
    * @returns the current request level for event buffering.
    * @see com.sun.star.linguistic2.XDictionaryListEvent
    * @see com.sun.star.linguistic2.XDictionaryListEventListener
    * @see com.sun.star.linguistic2.XDictionaryList.beginCollectEvents()
    * @see com.sun.star.linguistic2.XDictionaryList.endCollectEvents()
    */
  def flushEvents(): Double
  /** @returns the number of dictionaries in the list. */
  def getCount(): Double
  /**
    * @returns a sequence with an entry for every dictionary in the list.
    * @see com.sun.star.linguistic2.XDictionary
    */
  def getDictionaries(): SafeArray[XDictionary]
  /**
    * searches the list for a dictionary with a given name.
    * @param aDictionaryName specifies the name of the dictionary to look for.
    * @returns the {@link XDictionary} with the specified name. If no such dictionary exists, `NULL` will be returned.
    * @see com.sun.star.linguistic2.XDictionary
    */
  def getDictionaryByName(aDictionaryName: String): XDictionary
  /**
    * removes a single dictionary from the list.
    *
    * If the dictionary is still active, it will be deactivated first. The dictionary-list will remove itself from the list of dictionary event listeners of
    * the dictionary.
    * @param xDictionary dictionary to be removed from the list of dictionaries.
    * @returns `TRUE` if the dictionary was removed successfully, `FALSE` otherwise.
    * @see com.sun.star.linguistic2.XDictionary
    */
  def removeDictionary(xDictionary: XDictionary): Boolean
  /**
    * removes an entry from the list of dictionary-list event listeners.
    * @param xListener the object to be removed from the listener list.
    * @returns `TRUE` if the object to be removed was found and removed, `FALSE` otherwise.
    * @see com.sun.star.linguistic2.XDictionaryListEventListener
    * @see com.sun.star.linguistic2.XDictionaryListEvent
    */
  def removeDictionaryListEventListener(xListener: XDictionaryListEventListener): Boolean
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
    val __obj = js.Dynamic.literal(Count = Count, Dictionaries = Dictionaries, acquire = js.Any.fromFunction0(acquire), addDictionary = js.Any.fromFunction1(addDictionary), addDictionaryListEventListener = js.Any.fromFunction2(addDictionaryListEventListener), beginCollectEvents = js.Any.fromFunction0(beginCollectEvents), createDictionary = js.Any.fromFunction4(createDictionary), endCollectEvents = js.Any.fromFunction0(endCollectEvents), flushEvents = js.Any.fromFunction0(flushEvents), getCount = js.Any.fromFunction0(getCount), getDictionaries = js.Any.fromFunction0(getDictionaries), getDictionaryByName = js.Any.fromFunction1(getDictionaryByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeDictionary = js.Any.fromFunction1(removeDictionary), removeDictionaryListEventListener = js.Any.fromFunction1(removeDictionaryListEventListener))
  
    __obj.asInstanceOf[XDictionaryList]
  }
}

