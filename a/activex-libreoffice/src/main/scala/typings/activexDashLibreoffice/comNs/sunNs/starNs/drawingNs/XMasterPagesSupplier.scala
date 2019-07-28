package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** must be supported to provide access to the {@link MasterPages} of a multi-page drawing-layer. */
trait XMasterPagesSupplier extends XInterface {
  /** @returns an indexed container with the service {@link MasterPages} . */
  val MasterPages: XDrawPages
  /** @returns an indexed container with the service {@link MasterPages} . */
  def getMasterPages(): XDrawPages
}

object XMasterPagesSupplier {
  @scala.inline
  def apply(
    MasterPages: XDrawPages,
    acquire: () => Unit,
    getMasterPages: () => XDrawPages,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XMasterPagesSupplier = {
    val __obj = js.Dynamic.literal(MasterPages = MasterPages, acquire = js.Any.fromFunction0(acquire), getMasterPages = js.Any.fromFunction0(getMasterPages), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XMasterPagesSupplier]
  }
}

