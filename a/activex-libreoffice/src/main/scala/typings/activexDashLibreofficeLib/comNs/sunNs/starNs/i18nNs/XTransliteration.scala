package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Character conversions like case folding or Hiragana to Katakana.
  *
  * {@link Transliteration} is a character to character conversion but it is not always a one to one mapping between characters. {@link Transliteration}
  * modules are primarily used by collation, and search and replace modules to perform approximate search. It can also be used to format the numbers in
  * different numbering systems.
  *
  * In order to select transliteration modules for different purposes, they are classified with attributes of {@link TransliterationType} .
  *
  * For Western languages there would be three transliteration modules available to compare two mixed case strings: upper to lower, lower to upper, and
  * ignore case.
  *
  * A typical calling sequence of transliteration is  1. {@link getAvailableModules()} 2. {@link loadModulesByImplNames()} 3. {@link equals()} or another
  * one is  1. {@link loadModule()} 2. {@link transliterate()}
  */
trait XTransliteration
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Unique ASCII name to identify a module. This name is used to get its localized name for menus, dialogs etc. The behavior is undefined for {@link
    * TransliterationType.CASCADE} modules.
    */
  val Name: java.lang.String
  /**
    * Return the attribute(s) associated with this transliteration object, as defined in {@link TransliterationType} . The value is determined by the
    * transliteration modules. For example, for UPPERCASE_LOWERCASE, a ONE_TO_ONE is returned, for IGNORE_CASE, IGNORE is returned.
    */
  val Type: scala.Double
  /**
    * Compare 2 strings as per this transliteration. It translates both strings before comparing them.
    * @returns 1 if the first string is greater than the second string ;  0 if the first string is equal to the second string ;  -1 if the first string is less
    */
  def compareString(aStr1: java.lang.String, aStr2: java.lang.String): scala.Double
  /**
    * Compare 2 substrings as per this transliteration. It translates both substrings before comparing them.
    * @param aStr1 First string.
    * @param nOff1 Offset (from 0) of the first substring.
    * @param nLen1 Length (from offset) of the first substring.
    * @param aStr2 Second string.
    * @param nOff2 Offset (from 0) of the second substring.
    * @param nLen2 Length (from offset) of the second substring.
    * @returns 1 if the first substring is greater than the second substring ;  0 if the first substring is equal to the second substring ;  -1 if the first sub
    */
  def compareSubstring(
    aStr1: java.lang.String,
    nOff1: scala.Double,
    nLen1: scala.Double,
    aStr2: java.lang.String,
    nOff2: scala.Double,
    nLen2: scala.Double
  ): scala.Double
  /**
    * Match two substrings and find if they are equivalent as per this transliteration.
    *
    * This method can be called if the object has {@link TransliterationType} IGNORE attribute.
    *
    * Returns the number of matched code points in any case, even if strings are not equal, for example: ;  equals( "a", 0, 1, nMatch1, "aaa", 0, 3, nMatch2
    * ) ;  returns `FALSE` and nMatch:=1 and nMatch2:=1 ;  equals( "aab", 0, 3, nMatch1, "aaa", 0, 3, nMatch2 ) ;  returns `FALSE` and nMatch:=2 and
    * nMatch2:=2 ;
    * @param aStr1 First string to match.
    * @param nPos1 Start position within aStr1.
    * @param nCount1 Number of code points to use of aStr1.
    * @param rMatch1 Returns number of matched code points in aStr1.
    * @param aStr2 Second string to match.
    * @param nPos2 Start position within aStr2.
    * @param nCount2 Number of code points to use of aStr2.
    * @param rMatch2 Returns number of matched code points in aStr2.
    * @returns `TRUE` if the substrings are equal per this transliteration ; `FALSE` else.
    */
  def equals(
    aStr1: java.lang.String,
    nPos1: scala.Double,
    nCount1: scala.Double,
    rMatch1: js.Array[scala.Double],
    aStr2: java.lang.String,
    nPos2: scala.Double,
    nCount2: scala.Double,
    rMatch2: js.Array[scala.Double]
  ): scala.Boolean
  /** @deprecated DeprecatedFor internal use, this method is supported to get the "transliteration", which equals() is based on. */
  def folding(
    aInStr: java.lang.String,
    nStartPos: scala.Double,
    nCount: scala.Double,
    rOffset: js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]]
  ): java.lang.String
  /**
    * List the available transliteration modules for a given locale. It can be filtered based on its type.
    * @param nType A bitmask field of values defined in {@link TransliterationType}
    * @param aLocale The locale for which the modules are requested.
    */
  def getAvailableModules(aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, nType: scala.Double): activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * Unique ASCII name to identify a module. This name is used to get its localized name for menus, dialogs etc. The behavior is undefined for {@link
    * TransliterationType.CASCADE} modules.
    */
  def getName(): java.lang.String
  /**
    * Return the attribute(s) associated with this transliteration object, as defined in {@link TransliterationType} . The value is determined by the
    * transliteration modules. For example, for UPPERCASE_LOWERCASE, a ONE_TO_ONE is returned, for IGNORE_CASE, IGNORE is returned.
    */
  def getType(): scala.Double
  /** Load instance of predefined module - old style method. */
  def loadModule(
    eModType: TransliterationModules,
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  ): scala.Unit
  /**
    * Load instance of UNO registered module.
    *
    * Each transliteration module is registered under a different service name. The convention for the service name is
    * com.sun.star.i18n.Transliteration.l10n.{implName}. The {implName} is a unique name used to identify a module. The implName is used to get a localized
    * name for the transliteration module. The implName is used in locale data to list the available transliteration modules for the locale. There are some
    * transliteration modules that are always available. The names of those modules are listed as enum TransliterationModules names. For modules not listed
    * there it is possible to load them directly by their implName.
    * @param aImplName The module's {implName} under which it is registered with com.sun.star.i18n.Transliteration.l10n.{implName}.
    * @param aLocale The locale for which the module is requested.
    */
  def loadModuleByImplName(aImplName: java.lang.String, aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): scala.Unit
  /** Load a sequence of instances of predefined modules - supersedes method {@link XTransliteration.loadModule()} . */
  def loadModuleNew(
    aModType: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[TransliterationModulesNew],
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  ): scala.Unit
  /**
    * Load a sequence of instances of transliteration modules. Output of one module is fed as input to the next module in the sequence. The object created
    * by this call has {@link TransliterationType} CASCADE and IGNORE types.
    * @param aImplNameList Only IGNORE type modules can be specified.
    * @param aLocale The locale for which the modules are requested.
    */
  def loadModulesByImplNames(
    aImplNameList: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String],
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  ): scala.Unit
  /**
    * Transliterate a substring. This method can be called if the object doesn't have {@link TransliterationType} IGNORE attribute.
    * @param aInStr The input string.
    * @param nStartPos Start position within aInStr from where transliteration starts.
    * @param nCount Number of code points to be transliterated.
    * @param rOffset To find the grapheme of input string corresponding to the grapheme of output string, rOffset provides the offset array whose index is the
    */
  def transliterate(
    aInStr: java.lang.String,
    nStartPos: scala.Double,
    nCount: scala.Double,
    rOffset: js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]]
  ): java.lang.String
  /**
    * Transliterate one set of characters to another.
    *
    * This method is intended for getting corresponding ranges and can be called if the object has {@link TransliterationType} IGNORE attribute.
    *
    * For example: generic CASE_IGNORE transliterateRange( "a", "i" ) returns {"A","I","a","i"}, transliterateRange( "a", "a" ) returns {"A","A","a","a"}.
    *
    * Use this transliteration to create regular expressions like [a-i]  -  > [A-Ia-i].
    * @returns String sequence containing corresponding transliterated pairs of characters to represent a range.
    */
  def transliterateRange(aStr1: java.lang.String, aStr2: java.lang.String): activexDashInteropLib.SafeArray[java.lang.String]
}

object XTransliteration {
  @scala.inline
  def apply(
    Name: java.lang.String,
    Type: scala.Double,
    acquire: js.Function0[scala.Unit],
    compareString: js.Function2[java.lang.String, java.lang.String, scala.Double],
    compareSubstring: js.Function6[
      java.lang.String, 
      scala.Double, 
      scala.Double, 
      java.lang.String, 
      scala.Double, 
      scala.Double, 
      scala.Double
    ],
    equals: js.Function8[
      java.lang.String, 
      scala.Double, 
      scala.Double, 
      js.Array[scala.Double], 
      java.lang.String, 
      scala.Double, 
      scala.Double, 
      js.Array[scala.Double], 
      scala.Boolean
    ],
    folding: js.Function4[
      java.lang.String, 
      scala.Double, 
      scala.Double, 
      js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], 
      java.lang.String
    ],
    getAvailableModules: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Double, 
      activexDashInteropLib.SafeArray[java.lang.String]
    ],
    getName: js.Function0[java.lang.String],
    getType: js.Function0[scala.Double],
    loadModule: js.Function2[
      TransliterationModules, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Unit
    ],
    loadModuleByImplName: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Unit
    ],
    loadModuleNew: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[TransliterationModulesNew], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Unit
    ],
    loadModulesByImplNames: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    transliterate: js.Function4[
      java.lang.String, 
      scala.Double, 
      scala.Double, 
      js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], 
      java.lang.String
    ],
    transliterateRange: js.Function2[
      java.lang.String, 
      java.lang.String, 
      activexDashInteropLib.SafeArray[java.lang.String]
    ]
  ): XTransliteration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("compareString")(compareString)
    __obj.updateDynamic("compareSubstring")(compareSubstring)
    __obj.updateDynamic("equals")(equals)
    __obj.updateDynamic("folding")(folding)
    __obj.updateDynamic("getAvailableModules")(getAvailableModules)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("loadModule")(loadModule)
    __obj.updateDynamic("loadModuleByImplName")(loadModuleByImplName)
    __obj.updateDynamic("loadModuleNew")(loadModuleNew)
    __obj.updateDynamic("loadModulesByImplNames")(loadModulesByImplNames)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("transliterate")(transliterate)
    __obj.updateDynamic("transliterateRange")(transliterateRange)
    __obj.asInstanceOf[XTransliteration]
  }
}

