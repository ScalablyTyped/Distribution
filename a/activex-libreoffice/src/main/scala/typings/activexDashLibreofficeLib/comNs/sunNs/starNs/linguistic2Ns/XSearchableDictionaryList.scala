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

