package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XCodeNameQuery extends js.Object {
  def getCodeNameForContainer(aObj: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface): java.lang.String
  def getCodeNameForObject(aObj: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface): java.lang.String
}

object XCodeNameQuery {
  @scala.inline
  def apply(
    getCodeNameForContainer: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, java.lang.String],
    getCodeNameForObject: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, java.lang.String]
  ): XCodeNameQuery = {
    val __obj = js.Dynamic.literal(getCodeNameForContainer = getCodeNameForContainer, getCodeNameForObject = getCodeNameForObject)
  
    __obj.asInstanceOf[XCodeNameQuery]
  }
}

