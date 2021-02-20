package typings.activexLibreoffice.com_.sun.star.linguistic2

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.frame.XStorable
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a dictionary used for spell checking and hyphenation.
  * @see com.sun.star.linguistic2.DictionaryList
  * @see com.sun.star.linguistic2.XSearchableDictionaryList
  * @since OOo 3.0.1
  */
@js.native
trait Dictionary
  extends XSearchableDictionary
     with XStorable
object Dictionary {
  
  @scala.inline
  def apply(
    Count: Double,
    DictionaryType: DictionaryType,
    Entries: SafeArray[XDictionaryEntry],
    Locale: Locale,
    Location: String,
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
    getLocation: () => String,
    getName: () => String,
    hasLocation: () => Boolean,
    isActive: () => Boolean,
    isFull: () => Boolean,
    isReadonly: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    remove: String => Boolean,
    removeDictionaryEventListener: XDictionaryEventListener => Boolean,
    searchSimilarEntries: String => SafeArray[XDictionaryEntry],
    setActive: Boolean => Unit,
    setLocale: Locale => Unit,
    setName: String => Unit,
    store: () => Unit,
    storeAsURL: (String, SeqEquiv[PropertyValue]) => Unit,
    storeToURL: (String, SeqEquiv[PropertyValue]) => Unit
  ): Dictionary = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], DictionaryType = DictionaryType.asInstanceOf[js.Any], Entries = Entries.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), add = js.Any.fromFunction3(add), addDictionaryEventListener = js.Any.fromFunction1(addDictionaryEventListener), addEntry = js.Any.fromFunction1(addEntry), clear = js.Any.fromFunction0(clear), getCount = js.Any.fromFunction0(getCount), getDictionaryType = js.Any.fromFunction0(getDictionaryType), getEntries = js.Any.fromFunction0(getEntries), getEntry = js.Any.fromFunction1(getEntry), getLocale = js.Any.fromFunction0(getLocale), getLocation = js.Any.fromFunction0(getLocation), getName = js.Any.fromFunction0(getName), hasLocation = js.Any.fromFunction0(hasLocation), isActive = js.Any.fromFunction0(isActive), isFull = js.Any.fromFunction0(isFull), isReadonly = js.Any.fromFunction0(isReadonly), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction1(remove), removeDictionaryEventListener = js.Any.fromFunction1(removeDictionaryEventListener), searchSimilarEntries = js.Any.fromFunction1(searchSimilarEntries), setActive = js.Any.fromFunction1(setActive), setLocale = js.Any.fromFunction1(setLocale), setName = js.Any.fromFunction1(setName), store = js.Any.fromFunction0(store), storeAsURL = js.Any.fromFunction2(storeAsURL), storeToURL = js.Any.fromFunction2(storeToURL))
    __obj.asInstanceOf[Dictionary]
  }
}
