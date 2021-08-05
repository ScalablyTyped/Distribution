package typings.activexLibreoffice.com_.sun.star.i18n

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface provides information for creating "Table of Index"
  *
  * It is derived from {@link com.sun.star.i18n.XIndexEntrySupplier} and provides following additional functionalities.
  *
  * Provide supported language/locale list.Provide supported algorithm list.Provide phonetic entry support for CJK language.Provide method to compare
  * index entry.
  * @since OOo 1.1.2
  */
trait XExtendedIndexEntrySupplier
  extends StObject
     with XIndexEntrySupplier {
  
  /** Returns locale list for which the {@link IndexEntrySupplier} provides service. */
  val LocaleList: SafeArray[Locale]
  
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
  ): Double
  
  /** Returns index algorithm list for specific locale */
  def getAlgorithmList(aLocale: Locale): SafeArray[String]
  
  /**
    * Returns index key.
    *
    * Note that loadAlgorithm should be called before calling this function.
    * @param aIndexEntry Index entry
    * @param aPhoneticEntry Phonetic entry
    * @param aLocale Language attribute for index and phonetic entry. ;  aLocale and the locale in loadAlgorithm may be different. In the case they are differ
    */
  def getIndexKey(aIndexEntry: String, aPhoneticEntry: String, aLocale: Locale): String
  
  /** Returns locale list for which the {@link IndexEntrySupplier} provides service. */
  def getLocaleList(): SafeArray[Locale]
  
  /** Returns phonetic candidate for index entry for the locale. */
  def getPhoneticCandidate(aIndexEntry: String, aLocale: Locale): String
  
  /**
    * Loads index algorithm for the locale.
    * @param aLocale The locale.
    * @param aIndexAlgorithm Index algorithm to be loaded.
    * @param nCollatorOptions Sorting option of {@link com.sun.star.i18n.CollatorOptions} for comparing index entries
    * @returns `TRUE` if algorithm successfully loaded, `FALSE` else.
    */
  def loadAlgorithm(aLocale: Locale, aIndexAlgorithm: String, nCollatorOptions: Double): Boolean
  
  /** Checks if Phonetic Entry should be used for the locale. */
  def usePhoneticEntry(aLocale: Locale): Boolean
}
object XExtendedIndexEntrySupplier {
  
  inline def apply(
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
  
  extension [Self <: XExtendedIndexEntrySupplier](x: Self) {
    
    inline def setCompareIndexEntry(value: (String, String, Locale, String, String, Locale) => Double): Self = StObject.set(x, "compareIndexEntry", js.Any.fromFunction6(value))
    
    inline def setGetAlgorithmList(value: Locale => SafeArray[String]): Self = StObject.set(x, "getAlgorithmList", js.Any.fromFunction1(value))
    
    inline def setGetIndexKey(value: (String, String, Locale) => String): Self = StObject.set(x, "getIndexKey", js.Any.fromFunction3(value))
    
    inline def setGetLocaleList(value: () => SafeArray[Locale]): Self = StObject.set(x, "getLocaleList", js.Any.fromFunction0(value))
    
    inline def setGetPhoneticCandidate(value: (String, Locale) => String): Self = StObject.set(x, "getPhoneticCandidate", js.Any.fromFunction2(value))
    
    inline def setLoadAlgorithm(value: (Locale, String, Double) => Boolean): Self = StObject.set(x, "loadAlgorithm", js.Any.fromFunction3(value))
    
    inline def setLocaleList(value: SafeArray[Locale]): Self = StObject.set(x, "LocaleList", value.asInstanceOf[js.Any])
    
    inline def setUsePhoneticEntry(value: Locale => Boolean): Self = StObject.set(x, "usePhoneticEntry", js.Any.fromFunction1(value))
  }
}
