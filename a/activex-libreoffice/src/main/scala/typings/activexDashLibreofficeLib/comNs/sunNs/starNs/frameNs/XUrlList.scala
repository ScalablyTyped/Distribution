package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
trait XUrlList
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  var List: stdLib.SafeArray[java.lang.String]
}

object XUrlList {
  @scala.inline
  def apply(
    List: stdLib.SafeArray[java.lang.String],
    acquire: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XUrlList = {
    val __obj = js.Dynamic.literal(List = List, acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XUrlList]
  }
}

