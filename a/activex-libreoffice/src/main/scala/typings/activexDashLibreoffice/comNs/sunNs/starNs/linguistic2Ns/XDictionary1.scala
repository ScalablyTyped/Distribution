package typings.activexDashLibreoffice.comNs.sunNs.starNs.linguistic2Ns

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNamed
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
trait XDictionary1 extends XNamed {
  val Count: Double
  val DictionaryType: typings.activexDashLibreoffice.comNs.sunNs.starNs.linguistic2Ns.DictionaryType
  val Entries: SafeArray[XDictionaryEntry]
  var Language: Double
  def add(aWord: String, bIsNegative: Boolean, aRplcText: String): Boolean
  def addDictionaryEventListener(xListener: XDictionaryEventListener): Boolean
  def addEntry(xDicEntry: XDictionaryEntry): Boolean
  def clear(): Unit
  def getCount(): Double
  def getDictionaryType(): typings.activexDashLibreoffice.comNs.sunNs.starNs.linguistic2Ns.DictionaryType
  def getEntries(): SafeArray[XDictionaryEntry]
  def getEntry(aWord: String): XDictionaryEntry
  def getLanguage(): Double
  def isActive(): Boolean
  def isFull(): Boolean
  def remove(aWord: String): Boolean
  def removeDictionaryEventListener(xListener: XDictionaryEventListener): Boolean
  def setActive(bActivate: Boolean): Unit
  def setLanguage(nLang: Double): Unit
}

object XDictionary1 {
  @scala.inline
  def apply(
    Count: Double,
    DictionaryType: DictionaryType,
    Entries: SafeArray[XDictionaryEntry],
    Language: Double,
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
    getLanguage: () => Double,
    getName: () => String,
    isActive: () => Boolean,
    isFull: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    remove: String => Boolean,
    removeDictionaryEventListener: XDictionaryEventListener => Boolean,
    setActive: Boolean => Unit,
    setLanguage: Double => Unit,
    setName: String => Unit
  ): XDictionary1 = {
    val __obj = js.Dynamic.literal(Count = Count, DictionaryType = DictionaryType, Entries = Entries, Language = Language, Name = Name, acquire = js.Any.fromFunction0(acquire), add = js.Any.fromFunction3(add), addDictionaryEventListener = js.Any.fromFunction1(addDictionaryEventListener), addEntry = js.Any.fromFunction1(addEntry), clear = js.Any.fromFunction0(clear), getCount = js.Any.fromFunction0(getCount), getDictionaryType = js.Any.fromFunction0(getDictionaryType), getEntries = js.Any.fromFunction0(getEntries), getEntry = js.Any.fromFunction1(getEntry), getLanguage = js.Any.fromFunction0(getLanguage), getName = js.Any.fromFunction0(getName), isActive = js.Any.fromFunction0(isActive), isFull = js.Any.fromFunction0(isFull), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction1(remove), removeDictionaryEventListener = js.Any.fromFunction1(removeDictionaryEventListener), setActive = js.Any.fromFunction1(setActive), setLanguage = js.Any.fromFunction1(setLanguage), setName = js.Any.fromFunction1(setName))
  
    __obj.asInstanceOf[XDictionary1]
  }
}

