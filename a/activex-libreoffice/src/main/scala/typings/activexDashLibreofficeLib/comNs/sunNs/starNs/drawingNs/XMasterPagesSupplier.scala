package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** must be supported to provide access to the {@link MasterPages} of a multi-page drawing-layer. */
trait XMasterPagesSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns an indexed container with the service {@link MasterPages} . */
  val MasterPages: XDrawPages
  /** @returns an indexed container with the service {@link MasterPages} . */
  def getMasterPages(): XDrawPages
}

object XMasterPagesSupplier {
  @scala.inline
  def apply(
    MasterPages: XDrawPages,
    acquire: js.Function0[scala.Unit],
    getMasterPages: js.Function0[XDrawPages],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XMasterPagesSupplier = {
    val __obj = js.Dynamic.literal(MasterPages = MasterPages, acquire = acquire, getMasterPages = getMasterPages, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XMasterPagesSupplier]
  }
}

