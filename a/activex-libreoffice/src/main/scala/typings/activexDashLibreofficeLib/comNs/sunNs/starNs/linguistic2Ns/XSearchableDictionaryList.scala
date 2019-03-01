package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows searching for an entry in all dictionaries of the dictionary-list.
  *
  * Only active dictionaries of a suitable language will be searched for the entry. The language is suitable if it is the same as the dictionary's
  * language or the dictionary may hold entries of all languages.
  * @see com.sun.star.linguistic2.XDictionaryList
  */
trait XSearchableDictionaryList extends XDictionaryList {
  /**
    * looks for an entry for a given word in the list of dictionaries.
    * @param aWord the word (entry) to be looked for.
    * @param aLocale the language of the word to be looked for.
    * @param bSearchPosDics `TRUE` if only positive dictionaries should be searched. `FALSE` if only negative dictionaries should be searched.
    * @param bSpellEntry `TRUE` if entries for purposes of spell checking are required. `FALSE` if only entries for hyphenation purposes are required.
    * @returns the dictionary entry that was found, `NULL` otherwise.
    */
  def queryDictionaryEntry(
    aWord: java.lang.String,
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    bSearchPosDics: scala.Boolean,
    bSpellEntry: scala.Boolean
  ): XDictionaryEntry
}

object XSearchableDictionaryList {
  @scala.inline
  def apply(
    Count: scala.Double,
    Dictionaries: activexDashInteropLib.SafeArray[XDictionary],
    acquire: js.Function0[scala.Unit],
    addDictionary: js.Function1[XDictionary, scala.Boolean],
    addDictionaryListEventListener: js.Function2[XDictionaryListEventListener, scala.Boolean, scala.Boolean],
    beginCollectEvents: js.Function0[scala.Double],
    createDictionary: js.Function4[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      DictionaryType, 
      java.lang.String, 
      XDictionary
    ],
    endCollectEvents: js.Function0[scala.Double],
    flushEvents: js.Function0[scala.Double],
    getCount: js.Function0[scala.Double],
    getDictionaries: js.Function0[activexDashInteropLib.SafeArray[XDictionary]],
    getDictionaryByName: js.Function1[java.lang.String, XDictionary],
    queryDictionaryEntry: js.Function4[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Boolean, 
      scala.Boolean, 
      XDictionaryEntry
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeDictionary: js.Function1[XDictionary, scala.Boolean],
    removeDictionaryListEventListener: js.Function1[XDictionaryListEventListener, scala.Boolean]
  ): XSearchableDictionaryList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("Dictionaries")(Dictionaries)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addDictionary")(addDictionary)
    __obj.updateDynamic("addDictionaryListEventListener")(addDictionaryListEventListener)
    __obj.updateDynamic("beginCollectEvents")(beginCollectEvents)
    __obj.updateDynamic("createDictionary")(createDictionary)
    __obj.updateDynamic("endCollectEvents")(endCollectEvents)
    __obj.updateDynamic("flushEvents")(flushEvents)
    __obj.updateDynamic("getCount")(getCount)
    __obj.updateDynamic("getDictionaries")(getDictionaries)
    __obj.updateDynamic("getDictionaryByName")(getDictionaryByName)
    __obj.updateDynamic("queryDictionaryEntry")(queryDictionaryEntry)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeDictionary")(removeDictionary)
    __obj.updateDynamic("removeDictionaryListEventListener")(removeDictionaryListEventListener)
    __obj.asInstanceOf[XSearchableDictionaryList]
  }
}

