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
    getCodeNameForContainer: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface => java.lang.String,
    getCodeNameForObject: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface => java.lang.String
  ): XCodeNameQuery = {
    val __obj = js.Dynamic.literal(getCodeNameForContainer = js.Any.fromFunction1(getCodeNameForContainer), getCodeNameForObject = js.Any.fromFunction1(getCodeNameForObject))
  
    __obj.asInstanceOf[XCodeNameQuery]
  }
}

