package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows for the retrieval of possible meanings for a given word and language.
  *
  * The meaning of a word is in essence a descriptive text for that word. Each meaning may have several synonyms where a synonym is a word (or small text)
  * with the same or similar meaning.
  * @see com.sun.star.linguistic2.XSupportedLocales
  */
trait XThesaurus extends XSupportedLocales {
  /**
    * @param aTerm the word to query for its meanings.
    * @param aLocale specifies the language of the word.  If the language is not supported, an {@link com.sun.star.lang.IllegalArgumentException} exception is
    * @param aProperties provides property values to be used for this function call only. It is usually empty in order to use the default values supplied with
    * @returns a list of meanings for the given word and language.
    * @see com.sun.star.lang.Locale
    * @see com.sun.star.linguistic2.XMeaning
    */
  def queryMeanings(
    aTerm: java.lang.String,
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    aProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues
  ): activexDashInteropLib.SafeArray[XMeaning]
}

object XThesaurus {
  @scala.inline
  def apply(
    Locales: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    acquire: js.Function0[scala.Unit],
    getLocales: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale]
    ],
    hasLocale: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    queryMeanings: js.Function3[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues, 
      activexDashInteropLib.SafeArray[XMeaning]
    ],
    release: js.Function0[scala.Unit]
  ): XThesaurus = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Locales")(Locales)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getLocales")(getLocales)
    __obj.updateDynamic("hasLocale")(hasLocale)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("queryMeanings")(queryMeanings)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XThesaurus]
  }
}

