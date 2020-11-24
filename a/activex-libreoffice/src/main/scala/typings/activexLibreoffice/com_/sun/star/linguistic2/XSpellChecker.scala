package typings.activexLibreoffice.com_.sun.star.linguistic2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValues
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface allows for spell checking.
  *
  * It is possible to simply check if a word, in a specified language, is correct or additionally, if it was misspelled, some proposals how it might be
  * correctly written.
  * @see com.sun.star.linguistic2.XSupportedLocales
  */
@js.native
trait XSpellChecker extends XSupportedLocales {
  
  /**
    * checks if a word is spelled correctly in a given language.
    * @param aWord the word to be checked.
    * @param aLocale the Locale (language) to be used. If the Locale is empty, the word is spelled correctly by definition.  If **aLocale** is not supported a
    * @param aProperties provides property values to be used for this function call only. It is usually empty in order to use the default values supplied with
    * @returns `TRUE` if the word is spelled correctly using the specified language, `FALSE` otherwise.
    * @see com.sun.star.lang.Locale
    */
  def isValid(aWord: String, aLocale: Locale, aProperties: PropertyValues): Boolean = js.native
  
  /**
    * This method checks if a word is spelled correctly in a given language.
    * @param aWord the word to be checked.
    * @param aLocale the language to be used.  If the language is not supported an IllegalArgumentException exception is raised.
    * @param aProperties provides property values to be used for this function call only. It is usually empty in order to use the default values supplied with
    * @returns `NULL` if **aWord** is spelled correctly using **aLocale** . Otherwise, an {@link XSpellAlternatives} object with information about the reason of
    * @see com.sun.star.linguistic2.XSpellAlternatives
    * @see com.sun.star.lang.Locale
    */
  def spell(aWord: String, aLocale: Locale, aProperties: PropertyValues): XSpellAlternatives = js.native
}
object XSpellChecker {
  
  @scala.inline
  def apply(
    Locales: SafeArray[Locale],
    acquire: () => Unit,
    getLocales: () => SafeArray[Locale],
    hasLocale: Locale => Boolean,
    isValid: (String, Locale, PropertyValues) => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    spell: (String, Locale, PropertyValues) => XSpellAlternatives
  ): XSpellChecker = {
    val __obj = js.Dynamic.literal(Locales = Locales.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getLocales = js.Any.fromFunction0(getLocales), hasLocale = js.Any.fromFunction1(hasLocale), isValid = js.Any.fromFunction3(isValid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), spell = js.Any.fromFunction3(spell))
    __obj.asInstanceOf[XSpellChecker]
  }
  
  @scala.inline
  implicit class XSpellCheckerOps[Self <: XSpellChecker] (val x: Self) extends AnyVal {
    
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
    def setIsValid(value: (String, Locale, PropertyValues) => Boolean): Self = this.set("isValid", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSpell(value: (String, Locale, PropertyValues) => XSpellAlternatives): Self = this.set("spell", js.Any.fromFunction3(value))
  }
}
