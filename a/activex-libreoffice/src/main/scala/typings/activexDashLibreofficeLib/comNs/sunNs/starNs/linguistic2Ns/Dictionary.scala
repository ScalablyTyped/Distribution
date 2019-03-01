package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a dictionary used for spell checking and hyphenation.
  * @see com.sun.star.linguistic2.DictionaryList
  * @see com.sun.star.linguistic2.XSearchableDictionaryList
  * @since OOo 3.0.1
  */
trait Dictionary
  extends XSearchableDictionary
     with activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XStorable

object Dictionary {
  @scala.inline
  def apply(
    Count: scala.Double,
    DictionaryType: DictionaryType,
    Entries: activexDashInteropLib.SafeArray[XDictionaryEntry],
    Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    Location: java.lang.String,
    Name: java.lang.String,
    acquire: js.Function0[scala.Unit],
    add: js.Function3[java.lang.String, scala.Boolean, java.lang.String, scala.Boolean],
    addDictionaryEventListener: js.Function1[XDictionaryEventListener, scala.Boolean],
    addEntry: js.Function1[XDictionaryEntry, scala.Boolean],
    clear: js.Function0[scala.Unit],
    getCount: js.Function0[scala.Double],
    getDictionaryType: js.Function0[DictionaryType],
    getEntries: js.Function0[activexDashInteropLib.SafeArray[XDictionaryEntry]],
    getEntry: js.Function1[java.lang.String, XDictionaryEntry],
    getLocale: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    getLocation: js.Function0[java.lang.String],
    getName: js.Function0[java.lang.String],
    hasLocation: js.Function0[scala.Boolean],
    isActive: js.Function0[scala.Boolean],
    isFull: js.Function0[scala.Boolean],
    isReadonly: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    remove: js.Function1[java.lang.String, scala.Boolean],
    removeDictionaryEventListener: js.Function1[XDictionaryEventListener, scala.Boolean],
    searchSimilarEntries: js.Function1[java.lang.String, activexDashInteropLib.SafeArray[XDictionaryEntry]],
    setActive: js.Function1[scala.Boolean, scala.Unit],
    setLocale: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Unit],
    setName: js.Function1[java.lang.String, scala.Unit],
    store: js.Function0[scala.Unit],
    storeAsURL: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ],
    storeToURL: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ]
  ): Dictionary = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("DictionaryType")(DictionaryType)
    __obj.updateDynamic("Entries")(Entries)
    __obj.updateDynamic("Locale")(Locale)
    __obj.updateDynamic("Location")(Location)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("add")(add)
    __obj.updateDynamic("addDictionaryEventListener")(addDictionaryEventListener)
    __obj.updateDynamic("addEntry")(addEntry)
    __obj.updateDynamic("clear")(clear)
    __obj.updateDynamic("getCount")(getCount)
    __obj.updateDynamic("getDictionaryType")(getDictionaryType)
    __obj.updateDynamic("getEntries")(getEntries)
    __obj.updateDynamic("getEntry")(getEntry)
    __obj.updateDynamic("getLocale")(getLocale)
    __obj.updateDynamic("getLocation")(getLocation)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("hasLocation")(hasLocation)
    __obj.updateDynamic("isActive")(isActive)
    __obj.updateDynamic("isFull")(isFull)
    __obj.updateDynamic("isReadonly")(isReadonly)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("remove")(remove)
    __obj.updateDynamic("removeDictionaryEventListener")(removeDictionaryEventListener)
    __obj.updateDynamic("searchSimilarEntries")(searchSimilarEntries)
    __obj.updateDynamic("setActive")(setActive)
    __obj.updateDynamic("setLocale")(setLocale)
    __obj.updateDynamic("setName")(setName)
    __obj.updateDynamic("store")(store)
    __obj.updateDynamic("storeAsURL")(storeAsURL)
    __obj.updateDynamic("storeToURL")(storeToURL)
    __obj.asInstanceOf[Dictionary]
  }
}

