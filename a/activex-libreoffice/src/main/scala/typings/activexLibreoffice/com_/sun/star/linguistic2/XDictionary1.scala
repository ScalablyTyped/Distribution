package typings.activexLibreoffice.com_.sun.star.linguistic2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNamed
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
@js.native
trait XDictionary1 extends XNamed {
  val Count: Double = js.native
  val DictionaryType: typings.activexLibreoffice.com_.sun.star.linguistic2.DictionaryType = js.native
  val Entries: SafeArray[XDictionaryEntry] = js.native
  var Language: Double = js.native
  def add(aWord: String, bIsNegative: Boolean, aRplcText: String): Boolean = js.native
  def addDictionaryEventListener(xListener: XDictionaryEventListener): Boolean = js.native
  def addEntry(xDicEntry: XDictionaryEntry): Boolean = js.native
  def clear(): Unit = js.native
  def getCount(): Double = js.native
  def getDictionaryType(): typings.activexLibreoffice.com_.sun.star.linguistic2.DictionaryType = js.native
  def getEntries(): SafeArray[XDictionaryEntry] = js.native
  def getEntry(aWord: String): XDictionaryEntry = js.native
  def getLanguage(): Double = js.native
  def isActive(): Boolean = js.native
  def isFull(): Boolean = js.native
  def remove(aWord: String): Boolean = js.native
  def removeDictionaryEventListener(xListener: XDictionaryEventListener): Boolean = js.native
  def setActive(bActivate: Boolean): Unit = js.native
  def setLanguage(nLang: Double): Unit = js.native
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
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], DictionaryType = DictionaryType.asInstanceOf[js.Any], Entries = Entries.asInstanceOf[js.Any], Language = Language.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), add = js.Any.fromFunction3(add), addDictionaryEventListener = js.Any.fromFunction1(addDictionaryEventListener), addEntry = js.Any.fromFunction1(addEntry), clear = js.Any.fromFunction0(clear), getCount = js.Any.fromFunction0(getCount), getDictionaryType = js.Any.fromFunction0(getDictionaryType), getEntries = js.Any.fromFunction0(getEntries), getEntry = js.Any.fromFunction1(getEntry), getLanguage = js.Any.fromFunction0(getLanguage), getName = js.Any.fromFunction0(getName), isActive = js.Any.fromFunction0(isActive), isFull = js.Any.fromFunction0(isFull), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction1(remove), removeDictionaryEventListener = js.Any.fromFunction1(removeDictionaryEventListener), setActive = js.Any.fromFunction1(setActive), setLanguage = js.Any.fromFunction1(setLanguage), setName = js.Any.fromFunction1(setName))
    __obj.asInstanceOf[XDictionary1]
  }
  @scala.inline
  implicit class XDictionary1Ops[Self <: XDictionary1] (val x: Self) extends AnyVal {
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
    def setLanguage(value: Double): Self = this.set("Language", value.asInstanceOf[js.Any])
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
    def setGetLanguage(value: () => Double): Self = this.set("getLanguage", js.Any.fromFunction0(value))
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
    def setSetLanguage(value: Double => Unit): Self = this.set("setLanguage", js.Any.fromFunction1(value))
  }
  
}

