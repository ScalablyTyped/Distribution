package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface provides information for creating "Table of Index"
  *
  * It is derived from {@link com.sun.star.i18n.XIndexEntrySupplier} and provides following additional functionalities.
  *
  * Provide supported language/locale list.Provide supported algorithm list.Provide phonetic entry support for CJK language.Provide method to compare
  * index entry.
  * @since OOo 1.1.2
  */
trait XExtendedIndexEntrySupplier extends XIndexEntrySupplier {
  /** Returns locale list for which the {@link IndexEntrySupplier} provides service. */
  val LocaleList: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale]
  /**
    * Compares index entries
    *
    * Note that loadAlgorithm should be called before calling this function.
    * @param aIndexEntry1
    * @param aIndexEntry2 Index entries to be compared
    * @param aPhoneticEntry1
    * @param aPhoneticEntry2 Phonetic entries to be compared
    * @param aLocale1
    * @param aLocale2 Language attribute for index and phonetic entry. ;  aLocale and the locale in loadAlgorithm may be different. In the case they are diffe
    */
  def compareIndexEntry(
    aIndexEntry1: java.lang.String,
    aPhoneticEntry1: java.lang.String,
    aLocale1: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    aIndexEntry2: java.lang.String,
    aPhoneticEntry2: java.lang.String,
    aLocale2: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  ): scala.Double
  /** Returns index algorithm list for specific locale */
  def getAlgorithmList(aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): stdLib.SafeArray[java.lang.String]
  /**
    * Returns index key.
    *
    * Note that loadAlgorithm should be called before calling this function.
    * @param aIndexEntry Index entry
    * @param aPhoneticEntry Phonetic entry
    * @param aLocale Language attribute for index and phonetic entry. ;  aLocale and the locale in loadAlgorithm may be different. In the case they are differ
    */
  def getIndexKey(
    aIndexEntry: java.lang.String,
    aPhoneticEntry: java.lang.String,
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  ): java.lang.String
  /** Returns locale list for which the {@link IndexEntrySupplier} provides service. */
  def getLocaleList(): stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale]
  /** Returns phonetic candidate for index entry for the locale. */
  def getPhoneticCandidate(aIndexEntry: java.lang.String, aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): java.lang.String
  /**
    * Loads index algorithm for the locale.
    * @param aLocale The locale.
    * @param aIndexAlgorithm Index algorithm to be loaded.
    * @param nCollatorOptions Sorting option of {@link com.sun.star.i18n.CollatorOptions} for comparing index entries
    * @returns `TRUE` if algorithm successfully loaded, `FALSE` else.
    */
  def loadAlgorithm(
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    aIndexAlgorithm: java.lang.String,
    nCollatorOptions: scala.Double
  ): scala.Boolean
  /** Checks if Phonetic Entry should be used for the locale. */
  def usePhoneticEntry(aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): scala.Boolean
}

object XExtendedIndexEntrySupplier {
  @scala.inline
  def apply(
    LocaleList: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    acquire: () => scala.Unit,
    compareIndexEntry: (java.lang.String, java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, java.lang.String, java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale) => scala.Double,
    getAlgorithmList: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => stdLib.SafeArray[java.lang.String],
    getIndexCharacter: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, java.lang.String) => java.lang.String,
    getIndexFollowPageWord: (scala.Boolean, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale) => java.lang.String,
    getIndexKey: (java.lang.String, java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale) => java.lang.String,
    getLocaleList: () => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    getPhoneticCandidate: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale) => java.lang.String,
    loadAlgorithm: (activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, java.lang.String, scala.Double) => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    usePhoneticEntry: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => scala.Boolean
  ): XExtendedIndexEntrySupplier = {
    val __obj = js.Dynamic.literal(LocaleList = LocaleList, acquire = js.Any.fromFunction0(acquire), compareIndexEntry = js.Any.fromFunction6(compareIndexEntry), getAlgorithmList = js.Any.fromFunction1(getAlgorithmList), getIndexCharacter = js.Any.fromFunction3(getIndexCharacter), getIndexFollowPageWord = js.Any.fromFunction2(getIndexFollowPageWord), getIndexKey = js.Any.fromFunction3(getIndexKey), getLocaleList = js.Any.fromFunction0(getLocaleList), getPhoneticCandidate = js.Any.fromFunction2(getPhoneticCandidate), loadAlgorithm = js.Any.fromFunction3(loadAlgorithm), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), usePhoneticEntry = js.Any.fromFunction1(usePhoneticEntry))
  
    __obj.asInstanceOf[XExtendedIndexEntrySupplier]
  }
}

