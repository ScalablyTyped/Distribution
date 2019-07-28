package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** must be supported to provide access to a multi-page drawing-layer. */
trait XDrawPagesSupplier extends XInterface {
  /** @returns an indexed container with the service {@link DrawPages} . */
  val DrawPages: XDrawPages
  /** @returns an indexed container with the service {@link DrawPages} . */
  def getDrawPages(): XDrawPages
}

object XDrawPagesSupplier {
  @scala.inline
  def apply(
    DrawPages: XDrawPages,
    acquire: () => Unit,
    getDrawPages: () => XDrawPages,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDrawPagesSupplier = {
    val __obj = js.Dynamic.literal(DrawPages = DrawPages, acquire = js.Any.fromFunction0(acquire), getDrawPages = js.Any.fromFunction0(getDrawPages), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDrawPagesSupplier]
  }
}

