package typings.activexLibreoffice.com_.sun.star.linguistic2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Offers information about which languages are supported by the object.
  *
  * This interface has to be implemented by {@link com.sun.star.linguistic2.SpellChecker} , {@link com.sun.star.linguistic2.Hyphenator} and {@link
  * com.sun.star.linguistic2.Thesaurus} implementations in order to be queried for the languages they can use.
  * @see com.sun.star.lang.Locale
  * @see com.sun.star.uno.XInterface
  */
@js.native
trait XSupportedLocales extends XInterface {
  
  /** @returns the sequence of all supported languages. */
  val Locales: SafeArray[Locale] = js.native
  
  /** @returns the sequence of all supported languages. */
  def getLocales(): SafeArray[Locale] = js.native
  
  /**
    * @param aLocale specifies the language being checked for support by the object.
    * @returns `TRUE` if the language is supported, otherwise `FALSE` .
    */
  def hasLocale(aLocale: Locale): Boolean = js.native
}
object XSupportedLocales {
  
  @scala.inline
  def apply(
    Locales: SafeArray[Locale],
    acquire: () => Unit,
    getLocales: () => SafeArray[Locale],
    hasLocale: Locale => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSupportedLocales = {
    val __obj = js.Dynamic.literal(Locales = Locales.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getLocales = js.Any.fromFunction0(getLocales), hasLocale = js.Any.fromFunction1(hasLocale), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSupportedLocales]
  }
  
  @scala.inline
  implicit class XSupportedLocalesOps[Self <: XSupportedLocales] (val x: Self) extends AnyVal {
    
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
    def setLocales(value: SafeArray[Locale]): Self = this.set("Locales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetLocales(value: () => SafeArray[Locale]): Self = this.set("getLocales", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasLocale(value: Locale => Boolean): Self = this.set("hasLocale", js.Any.fromFunction1(value))
  }
}
