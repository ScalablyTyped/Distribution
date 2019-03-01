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
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    updateLinks: js.Function0[scala.Unit]
  ): XLinkUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("updateLinks")(updateLinks)
    __obj.asInstanceOf[XLinkUpdate]
  }
}

