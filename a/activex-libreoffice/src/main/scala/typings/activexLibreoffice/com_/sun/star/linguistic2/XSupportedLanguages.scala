package typings.activexLibreoffice.com_.sun.star.linguistic2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @deprecated Deprecated */
@js.native
trait XSupportedLanguages extends XInterface {
  
  val Languages: SafeArray[Double] = js.native
  
  def getLanguages(): SafeArray[Double] = js.native
  
  def hasLanguage(nLanguage: Double): Boolean = js.native
}
object XSupportedLanguages {
  
  @scala.inline
  def apply(
    Languages: SafeArray[Double],
    acquire: () => Unit,
    getLanguages: () => SafeArray[Double],
    hasLanguage: Double => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSupportedLanguages = {
    val __obj = js.Dynamic.literal(Languages = Languages.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getLanguages = js.Any.fromFunction0(getLanguages), hasLanguage = js.Any.fromFunction1(hasLanguage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSupportedLanguages]
  }
  
  @scala.inline
  implicit class XSupportedLanguagesMutableBuilder[Self <: XSupportedLanguages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetLanguages(value: () => SafeArray[Double]): Self = StObject.set(x, "getLanguages", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasLanguage(value: Double => Boolean): Self = StObject.set(x, "hasLanguage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLanguages(value: SafeArray[Double]): Self = StObject.set(x, "Languages", value.asInstanceOf[js.Any])
  }
}
