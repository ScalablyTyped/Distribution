package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
trait XSpellChecker1 extends XSupportedLanguages {
  def isValid(
    aWord: java.lang.String,
    nLanguage: scala.Double,
    aProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues
  ): scala.Boolean
  def spell(
    aWord: java.lang.String,
    nLanguage: scala.Double,
    aProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues
  ): XSpellAlternatives
}

object XSpellChecker1 {
  @scala.inline
  def apply(
    Languages: stdLib.SafeArray[scala.Double],
    acquire: () => scala.Unit,
    getLanguages: () => stdLib.SafeArray[scala.Double],
    hasLanguage: scala.Double => scala.Boolean,
    isValid: (java.lang.String, scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues) => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    spell: (java.lang.String, scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues) => XSpellAlternatives
  ): XSpellChecker1 = {
    val __obj = js.Dynamic.literal(Languages = Languages, acquire = js.Any.fromFunction0(acquire), getLanguages = js.Any.fromFunction0(getLanguages), hasLanguage = js.Any.fromFunction1(hasLanguage), isValid = js.Any.fromFunction3(isValid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), spell = js.Any.fromFunction3(spell))
  
    __obj.asInstanceOf[XSpellChecker1]
  }
}

