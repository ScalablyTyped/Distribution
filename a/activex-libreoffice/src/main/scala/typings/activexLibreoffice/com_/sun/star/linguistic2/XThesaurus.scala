package typings.activexLibreoffice.com_.sun.star.linguistic2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValues
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows for the retrieval of possible meanings for a given word and language.
  *
  * The meaning of a word is in essence a descriptive text for that word. Each meaning may have several synonyms where a synonym is a word (or small text)
  * with the same or similar meaning.
  * @see com.sun.star.linguistic2.XSupportedLocales
  */
trait XThesaurus
  extends StObject
     with XSupportedLocales {
  
  /**
    * @param aTerm the word to query for its meanings.
    * @param aLocale specifies the language of the word.  If the language is not supported, an {@link com.sun.star.lang.IllegalArgumentException} exception is
    * @param aProperties provides property values to be used for this function call only. It is usually empty in order to use the default values supplied with
    * @returns a list of meanings for the given word and language.
    * @see com.sun.star.lang.Locale
    * @see com.sun.star.linguistic2.XMeaning
    */
  def queryMeanings(aTerm: String, aLocale: Locale, aProperties: PropertyValues): SafeArray[XMeaning]
}
object XThesaurus {
  
  inline def apply(
    Locales: SafeArray[Locale],
    acquire: () => Unit,
    getLocales: () => SafeArray[Locale],
    hasLocale: Locale => Boolean,
    queryInterface: `type` => Any,
    queryMeanings: (String, Locale, PropertyValues) => SafeArray[XMeaning],
    release: () => Unit
  ): XThesaurus = {
    val __obj = js.Dynamic.literal(Locales = Locales.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getLocales = js.Any.fromFunction0(getLocales), hasLocale = js.Any.fromFunction1(hasLocale), queryInterface = js.Any.fromFunction1(queryInterface), queryMeanings = js.Any.fromFunction3(queryMeanings), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XThesaurus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XThesaurus] (val x: Self) extends AnyVal {
    
    inline def setQueryMeanings(value: (String, Locale, PropertyValues) => SafeArray[XMeaning]): Self = StObject.set(x, "queryMeanings", js.Any.fromFunction3(value))
  }
}
