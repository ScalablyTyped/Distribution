package typings.activexLibreoffice.com_.sun.star.linguistic2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValues
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @deprecated Deprecated */
trait XSpellChecker1
  extends StObject
     with XSupportedLanguages {
  
  def isValid(aWord: String, nLanguage: Double, aProperties: PropertyValues): Boolean
  
  def spell(aWord: String, nLanguage: Double, aProperties: PropertyValues): XSpellAlternatives
}
object XSpellChecker1 {
  
  inline def apply(
    Languages: SafeArray[Double],
    acquire: () => Unit,
    getLanguages: () => SafeArray[Double],
    hasLanguage: Double => Boolean,
    isValid: (String, Double, PropertyValues) => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit,
    spell: (String, Double, PropertyValues) => XSpellAlternatives
  ): XSpellChecker1 = {
    val __obj = js.Dynamic.literal(Languages = Languages.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getLanguages = js.Any.fromFunction0(getLanguages), hasLanguage = js.Any.fromFunction1(hasLanguage), isValid = js.Any.fromFunction3(isValid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), spell = js.Any.fromFunction3(spell))
    __obj.asInstanceOf[XSpellChecker1]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XSpellChecker1] (val x: Self) extends AnyVal {
    
    inline def setIsValid(value: (String, Double, PropertyValues) => Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction3(value))
    
    inline def setSpell(value: (String, Double, PropertyValues) => XSpellAlternatives): Self = StObject.set(x, "spell", js.Any.fromFunction3(value))
  }
}
