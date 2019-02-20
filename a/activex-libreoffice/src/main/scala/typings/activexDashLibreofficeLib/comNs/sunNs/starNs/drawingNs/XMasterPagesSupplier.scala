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

