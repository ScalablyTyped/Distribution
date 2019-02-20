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

