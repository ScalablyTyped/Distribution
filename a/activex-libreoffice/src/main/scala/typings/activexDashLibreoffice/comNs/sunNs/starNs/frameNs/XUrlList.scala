package typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
trait XUrlList extends XInterface {
  var List: SafeArray[String]
}

object XUrlList {
  @scala.inline
  def apply(
    List: SafeArray[String],
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XUrlList = {
    val __obj = js.Dynamic.literal(List = List, acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XUrlList]
  }
}

