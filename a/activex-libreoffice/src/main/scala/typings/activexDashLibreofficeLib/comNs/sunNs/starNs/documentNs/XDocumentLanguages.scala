package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XDocumentLanguages
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * retrieve the list of languages already used in current document
    * @returns sequence
    */
  def getDocumentLanguages(nScriptTypes: scala.Double, nCount: scala.Double): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale]
}

