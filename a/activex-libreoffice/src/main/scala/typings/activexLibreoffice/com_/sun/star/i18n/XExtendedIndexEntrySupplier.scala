package typings.activexLibreoffice.com_.sun.star.i18n

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.std.SafeArray
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
@js.native
trait XExtendedIndexEntrySupplier extends XIndexEntrySupplier {
  /** Returns locale list for which the {@link IndexEntrySupplier} provides service. */
  val LocaleList: SafeArray[Locale] = js.native
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
    aIndexEntry1: String,
    aPhoneticEntry1: String,
    aLocale1: Locale,
    aIndexEntry2: String,
    aPhoneticEntry2: String,
    aLocale2: Locale
  ): Double = js.native
  /** Returns index algorithm list for specific locale */
  def getAlgorithmList(aLocale: Locale): SafeArray[String] = js.native
  /**
    * Returns index key.
    *
    * Note that loadAlgorithm should be called before calling this function.
    * @param aIndexEntry Index entry
    * @param aPhoneticEntry Phonetic entry
    * @param aLocale Language attribute for index and phonetic entry. ;  aLocale and the locale in loadAlgorithm may be different. In the case they are differ
    */
  def getIndexKey(aIndexEntry: String, aPhoneticEntry: String, aLocale: Locale): String = js.native
  /** Returns locale list for which the {@link IndexEntrySupplier} provides service. */
  def getLocaleList(): SafeArray[Locale] = js.native
  /** Returns phonetic candidate for index entry for the locale. */
  def getPhoneticCandidate(aIndexEntry: String, aLocale: Locale): String = js.native
  /**
    * Loads index algorithm for the locale.
    * @param aLocale The locale.
    * @param aIndexAlgorithm Index algorithm to be loaded.
    * @param nCollatorOptions Sorting option of {@link com.sun.star.i18n.CollatorOptions} for comparing index entries
    * @returns `TRUE` if algorithm successfully loaded, `FALSE` else.
    */
  def loadAlgorithm(aLocale: Locale, aIndexAlgorithm: String, nCollatorOptions: Double): Boolean = js.native
  /** Checks if Phonetic Entry should be used for the locale. */
  def usePhoneticEntry(aLocale: Locale): Boolean = js.native
}

object XExtendedIndexEntrySupplier {
  @scala.inline
  def apply(
    LocaleList: SafeArray[Locale],
    acquire: () => Unit,
    compareIndexEntry: (String, String, Locale, String, String, Locale) => Double,
    getAlgorithmList: Locale => SafeArray[String],
    getIndexCharacter: (String, Locale, String) => String,
    getIndexFollowPageWord: (Boolean, Locale) => String,
    getIndexKey: (String, String, Locale) => String,
    getLocaleList: () => SafeArray[Locale],
    getPhoneticCandidate: (String, Locale) => String,
    loadAlgorithm: (Locale, String, Double) => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    usePhoneticEntry: Locale => Boolean
  ): XExtendedIndexEntrySupplier = {
    val __obj = js.Dynamic.literal(LocaleList = LocaleList.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), compareIndexEntry = js.Any.fromFunction6(compareIndexEntry), getAlgorithmList = js.Any.fromFunction1(getAlgorithmList), getIndexCharacter = js.Any.fromFunction3(getIndexCharacter), getIndexFollowPageWord = js.Any.fromFunction2(getIndexFollowPageWord), getIndexKey = js.Any.fromFunction3(getIndexKey), getLocaleList = js.Any.fromFunction0(getLocaleList), getPhoneticCandidate = js.Any.fromFunction2(getPhoneticCandidate), loadAlgorithm = js.Any.fromFunction3(loadAlgorithm), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), usePhoneticEntry = js.Any.fromFunction1(usePhoneticEntry))
    __obj.asInstanceOf[XExtendedIndexEntrySupplier]
  }
  @scala.inline
  implicit class XExtendedIndexEntrySupplierOps[Self <: XExtendedIndexEntrySupplier] (val x: Self) extends AnyVal {
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
    def setLocaleList(value: SafeArray[Locale]): Self = this.set("LocaleList", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompareIndexEntry(value: (String, String, Locale, String, String, Locale) => Double): Self = this.set("compareIndexEntry", js.Any.fromFunction6(value))
    @scala.inline
    def setGetAlgorithmList(value: Locale => SafeArray[String]): Self = this.set("getAlgorithmList", js.Any.fromFunction1(value))
    @scala.inline
    def setGetIndexKey(value: (String, String, Locale) => String): Self = this.set("getIndexKey", js.Any.fromFunction3(value))
    @scala.inline
    def setGetLocaleList(value: () => SafeArray[Locale]): Self = this.set("getLocaleList", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPhoneticCandidate(value: (String, Locale) => String): Self = this.set("getPhoneticCandidate", js.Any.fromFunction2(value))
    @scala.inline
    def setLoadAlgorithm(value: (Locale, String, Double) => Boolean): Self = this.set("loadAlgorithm", js.Any.fromFunction3(value))
    @scala.inline
    def setUsePhoneticEntry(value: Locale => Boolean): Self = this.set("usePhoneticEntry", js.Any.fromFunction1(value))
  }
  
}

