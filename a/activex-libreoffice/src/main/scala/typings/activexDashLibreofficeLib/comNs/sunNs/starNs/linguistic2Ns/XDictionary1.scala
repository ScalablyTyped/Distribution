package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
trait XDictionary1
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNamed {
  val Count: scala.Double
  val DictionaryType: activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.DictionaryType
  val Entries: stdLib.SafeArray[XDictionaryEntry]
  var Language: scala.Double
  def add(aWord: java.lang.String, bIsNegative: scala.Boolean, aRplcText: java.lang.String): scala.Boolean
  def addDictionaryEventListener(xListener: XDictionaryEventListener): scala.Boolean
  def addEntry(xDicEntry: XDictionaryEntry): scala.Boolean
  def clear(): scala.Unit
  def getCount(): scala.Double
  def getDictionaryType(): DictionaryType
  def getEntries(): stdLib.SafeArray[XDictionaryEntry]
  def getEntry(aWord: java.lang.String): XDictionaryEntry
  def getLanguage(): scala.Double
  def isActive(): scala.Boolean
  def isFull(): scala.Boolean
  def remove(aWord: java.lang.String): scala.Boolean
  def removeDictionaryEventListener(xListener: XDictionaryEventListener): scala.Boolean
  def setActive(bActivate: scala.Boolean): scala.Unit
  def setLanguage(nLang: scala.Double): scala.Unit
}

object XDictionary1 {
  @scala.inline
  def apply(
    Count: scala.Double,
    DictionaryType: DictionaryType,
    Entries: stdLib.SafeArray[XDictionaryEntry],
    Language: scala.Double,
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
    getLanguage: () => scala.Double,
    getName: () => java.lang.String,
    isActive: () => scala.Boolean,
    isFull: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    remove: java.lang.String => scala.Boolean,
    removeDictionaryEventListener: XDictionaryEventListener => scala.Boolean,
    setActive: scala.Boolean => scala.Unit,
    setLanguage: scala.Double => scala.Unit,
    setName: java.lang.String => scala.Unit
  ): XDictionary1 = {
    val __obj = js.Dynamic.literal(Count = Count, DictionaryType = DictionaryType, Entries = Entries, Language = Language, Name = Name, acquire = js.Any.fromFunction0(acquire), add = js.Any.fromFunction3(add), addDictionaryEventListener = js.Any.fromFunction1(addDictionaryEventListener), addEntry = js.Any.fromFunction1(addEntry), clear = js.Any.fromFunction0(clear), getCount = js.Any.fromFunction0(getCount), getDictionaryType = js.Any.fromFunction0(getDictionaryType), getEntries = js.Any.fromFunction0(getEntries), getEntry = js.Any.fromFunction1(getEntry), getLanguage = js.Any.fromFunction0(getLanguage), getName = js.Any.fromFunction0(getName), isActive = js.Any.fromFunction0(isActive), isFull = js.Any.fromFunction0(isFull), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction1(remove), removeDictionaryEventListener = js.Any.fromFunction1(removeDictionaryEventListener), setActive = js.Any.fromFunction1(setActive), setLanguage = js.Any.fromFunction1(setLanguage), setName = js.Any.fromFunction1(setName))
  
    __obj.asInstanceOf[XDictionary1]
  }
}

