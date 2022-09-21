package typings.activexLibreoffice.com_.sun.star.linguistic2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** retrieves the list of available languages. */
trait XAvailableLocales
  extends StObject
     with XInterface {
  
  /**
    * retrieve the list of supported languages (Locales).
    * @param aServiceName the name of the service to get the list of available Locales for.
    * @returns the list of locales supported by the whole of all registered implementations of that service. The sequence will be empty if there is no such lang
    * @see com.sun.star.linguistic2.XSupportedLocales
    */
  def getAvailableLocales(aServiceName: String): SafeArray[Locale]
}
object XAvailableLocales {
  
  inline def apply(
    acquire: () => Unit,
    getAvailableLocales: String => SafeArray[Locale],
    queryInterface: `type` => Any,
    release: () => Unit
  ): XAvailableLocales = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getAvailableLocales = js.Any.fromFunction1(getAvailableLocales), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAvailableLocales]
  }
  
  extension [Self <: XAvailableLocales](x: Self) {
    
    inline def setGetAvailableLocales(value: String => SafeArray[Locale]): Self = StObject.set(x, "getAvailableLocales", js.Any.fromFunction1(value))
  }
}
