package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows initiating an update of linked parts of a document. */
trait XLinkUpdate
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** initiates the reloading of all linked document content like linked graphics, linked text sections. */
  def updateLinks(): scala.Unit
}

object XLinkUpdate {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    updateLinks: () => scala.Unit
  ): XLinkUpdate = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), updateLinks = js.Any.fromFunction0(updateLinks))
  
    __obj.asInstanceOf[XLinkUpdate]
  }
}

