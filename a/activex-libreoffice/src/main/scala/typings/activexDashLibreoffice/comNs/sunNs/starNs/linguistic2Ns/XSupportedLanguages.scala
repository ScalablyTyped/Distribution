package typings.activexDashLibreoffice.comNs.sunNs.starNs.linguistic2Ns

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
trait XSupportedLanguages extends XInterface {
  val Languages: SafeArray[Double]
  def getLanguages(): SafeArray[Double]
  def hasLanguage(nLanguage: Double): Boolean
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
    val __obj = js.Dynamic.literal(Languages = Languages, acquire = js.Any.fromFunction0(acquire), getLanguages = js.Any.fromFunction0(getLanguages), hasLanguage = js.Any.fromFunction1(hasLanguage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XSupportedLanguages]
  }
}

