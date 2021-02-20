package typings.activexLibreoffice.com_.sun.star.lang

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
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
  implicit class XLocalizableMutableBuilder[Self <: XLocalizable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetLocale(value: () => Locale): Self = StObject.set(x, "getLocale", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLocale(value: Locale): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetLocale(value: Locale => Unit): Self = StObject.set(x, "setLocale", js.Any.fromFunction1(value))
  }
}
