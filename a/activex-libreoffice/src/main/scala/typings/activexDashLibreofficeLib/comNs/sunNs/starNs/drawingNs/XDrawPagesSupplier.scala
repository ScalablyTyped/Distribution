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
    acquire: () => scala.Unit,
    getDrawPages: () => XDrawPages,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XDrawPagesSupplier = {
    val __obj = js.Dynamic.literal(DrawPages = DrawPages, acquire = js.Any.fromFunction0(acquire), getDrawPages = js.Any.fromFunction0(getDrawPages), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDrawPagesSupplier]
  }
}

