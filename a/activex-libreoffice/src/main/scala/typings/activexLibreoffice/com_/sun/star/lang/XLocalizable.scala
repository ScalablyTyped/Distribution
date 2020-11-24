package typings.activexLibreoffice.com_.sun.star.lang

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to set a {@link Locale} to be used by the object. */
@js.native
trait XLocalizable extends XInterface {
  
  /** @returns the locale, which is used by this object. */
  var Locale: typings.activexLibreoffice.com_.sun.star.lang.Locale = js.native
  
  /** @returns the locale, which is used by this object. */
  def getLocale(): Locale = js.native
  
  /** sets the locale to be used by this object. */
  def setLocale(eLocale: Locale): Unit = js.native
}
object XLocalizable {
  
  @scala.inline
  def apply(
    Locale: Locale,
    acquire: () => Unit,
    getLocale: () => Locale,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setLocale: Locale => Unit
  ): XLocalizable = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getLocale = js.Any.fromFunction0(getLocale), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setLocale = js.Any.fromFunction1(setLocale))
    __obj.asInstanceOf[XLocalizable]
  }
  
  @scala.inline
  implicit class XLocalizableOps[Self <: XLocalizable] (val x: Self) extends AnyVal {
    
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
    def setLocale(value: Locale): Self = this.set("Locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetLocale(value: () => Locale): Self = this.set("getLocale", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetLocale(value: Locale => Unit): Self = this.set("setLocale", js.Any.fromFunction1(value))
  }
}
