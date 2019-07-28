package typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XDocumentLanguages extends XInterface {
  /**
    * retrieve the list of languages already used in current document
    * @returns sequence
    */
  def getDocumentLanguages(nScriptTypes: Double, nCount: Double): SafeArray[Locale]
}

object XDocumentLanguages {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getDocumentLanguages: (Double, Double) => SafeArray[Locale],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDocumentLanguages = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getDocumentLanguages = js.Any.fromFunction2(getDocumentLanguages), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDocumentLanguages]
  }
}

