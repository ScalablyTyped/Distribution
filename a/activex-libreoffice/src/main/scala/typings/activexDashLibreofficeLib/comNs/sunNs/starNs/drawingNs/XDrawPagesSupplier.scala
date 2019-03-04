package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** must be supported to provide access to a multi-page drawing-layer. */
trait XDrawPagesSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns an indexed container with the service {@link DrawPages} . */
  val DrawPages: XDrawPages
  /** @returns an indexed container with the service {@link DrawPages} . */
  def getDrawPages(): XDrawPages
}

object XDrawPagesSupplier {
  @scala.inline
  def apply(
    DrawPages: XDrawPages,
    acquire: js.Function0[scala.Unit],
    getDrawPages: js.Function0[XDrawPages],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XDrawPagesSupplier = {
    val __obj = js.Dynamic.literal(DrawPages = DrawPages, acquire = acquire, getDrawPages = getDrawPages, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XDrawPagesSupplier]
  }
}

