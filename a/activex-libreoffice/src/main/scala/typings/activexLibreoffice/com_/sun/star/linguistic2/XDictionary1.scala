package typings.activexLibreoffice.com_.sun.star.linguistic2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNamed
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class XDictionary1MutableBuilder[Self <: XDictionary1] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (String, Boolean, String) => Boolean): Self = StObject.set(x, "add", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAddDictionaryEventListener(value: XDictionaryEventListener => Boolean): Self = StObject.set(x, "addDictionaryEventListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddEntry(value: XDictionaryEntry => Boolean): Self = StObject.set(x, "addEntry", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDictionaryType(value: DictionaryType): Self = StObject.set(x, "DictionaryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntries(value: SafeArray[XDictionaryEntry]): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCount(value: () => Double): Self = StObject.set(x, "getCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDictionaryType(value: () => DictionaryType): Self = StObject.set(x, "getDictionaryType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEntries(value: () => SafeArray[XDictionaryEntry]): Self = StObject.set(x, "getEntries", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEntry(value: String => XDictionaryEntry): Self = StObject.set(x, "getEntry", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLanguage(value: () => Double): Self = StObject.set(x, "getLanguage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsActive(value: () => Boolean): Self = StObject.set(x, "isActive", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsFull(value: () => Boolean): Self = StObject.set(x, "isFull", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLanguage(value: Double): Self = StObject.set(x, "Language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: String => Boolean): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveDictionaryEventListener(value: XDictionaryEventListener => Boolean): Self = StObject.set(x, "removeDictionaryEventListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetActive(value: Boolean => Unit): Self = StObject.set(x, "setActive", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLanguage(value: Double => Unit): Self = StObject.set(x, "setLanguage", js.Any.fromFunction1(value))
  }
}
