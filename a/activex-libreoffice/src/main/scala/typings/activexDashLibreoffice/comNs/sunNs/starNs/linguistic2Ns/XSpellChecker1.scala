package typings.activexDashLibreoffice.comNs.sunNs.starNs.linguistic2Ns

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValues
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
trait XSpellChecker1 extends XSupportedLanguages {
  def isValid(aWord: String, nLanguage: Double, aProperties: PropertyValues): Boolean
  def spell(aWord: String, nLanguage: Double, aProperties: PropertyValues): XSpellAlternatives
}

object XSpellChecker1 {
  @scala.inline
  def apply(
    Languages: SafeArray[Double],
    acquire: () => Unit,
    getLanguages: () => SafeArray[Double],
    hasLanguage: Double => Boolean,
    isValid: (String, Double, PropertyValues) => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    spell: (String, Double, PropertyValues) => XSpellAlternatives
  ): XSpellChecker1 = {
    val __obj = js.Dynamic.literal(Languages = Languages, acquire = js.Any.fromFunction0(acquire), getLanguages = js.Any.fromFunction0(getLanguages), hasLanguage = js.Any.fromFunction1(hasLanguage), isValid = js.Any.fromFunction3(isValid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), spell = js.Any.fromFunction3(spell))
  
    __obj.asInstanceOf[XSpellChecker1]
  }
}

