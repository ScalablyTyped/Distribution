package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface allows for spell checking.
  *
  * It is possible to simply check if a word, in a specified language, is correct or additionally, if it was misspelled, some proposals how it might be
  * correctly written.
  * @see com.sun.star.linguistic2.XSupportedLocales
  */
trait XSpellChecker extends XSupportedLocales {
  /**
    * checks if a word is spelled correctly in a given language.
    * @param aWord the word to be checked.
    * @param aLocale the Locale (language) to be used. If the Locale is empty, the word is spelled correctly by definition.  If **aLocale** is not supported a
    * @param aProperties provides property values to be used for this function call only. It is usually empty in order to use the default values supplied with
    * @returns `TRUE` if the word is spelled correctly using the specified language, `FALSE` otherwise.
    * @see com.sun.star.lang.Locale
    */
  def isValid(
    aWord: java.lang.String,
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    aProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues
  ): scala.Boolean
  /**
    * This method checks if a word is spelled correctly in a given language.
    * @param aWord the word to be checked.
    * @param aLocale the language to be used.  If the language is not supported an IllegalArgumentException exception is raised.
    * @param aProperties provides property values to be used for this function call only. It is usually empty in order to use the default values supplied with
    * @returns `NULL` if **aWord** is spelled correctly using **aLocale** . Otherwise, an {@link XSpellAlternatives} object with information about the reason of
    * @see com.sun.star.linguistic2.XSpellAlternatives
    * @see com.sun.star.lang.Locale
    */
  def spell(
    aWord: java.lang.String,
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    aProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues
  ): XSpellAlternatives
}

object XSpellChecker {
  @scala.inline
  def apply(
    Locales: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    acquire: js.Function0[scala.Unit],
    getLocales: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale]
    ],
    hasLocale: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Boolean],
    isValid: js.Function3[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues, 
      scala.Boolean
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    spell: js.Function3[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues, 
      XSpellAlternatives
    ]
  ): XSpellChecker = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Locales")(Locales)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getLocales")(getLocales)
    __obj.updateDynamic("hasLocale")(hasLocale)
    __obj.updateDynamic("isValid")(isValid)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("spell")(spell)
    __obj.asInstanceOf[XSpellChecker]
  }
}

