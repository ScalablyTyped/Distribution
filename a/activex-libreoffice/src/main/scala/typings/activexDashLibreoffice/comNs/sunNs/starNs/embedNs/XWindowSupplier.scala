package typings.activexDashLibreoffice.comNs.sunNs.starNs.embedNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XWindow
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to a VCL window implementation. */
trait XWindowSupplier extends XInterface {
  /**
    * allows to get access to a VCL window implementation.
    * @returns VCL window implementation
    */
  val Window: XWindow
  /**
    * allows to get access to a VCL window implementation.
    * @returns VCL window implementation
    */
  def getWindow(): XWindow
}

object XWindowSupplier {
  @scala.inline
  def apply(
    Window: XWindow,
    acquire: () => Unit,
    getWindow: () => XWindow,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XWindowSupplier = {
    val __obj = js.Dynamic.literal(Window = Window, acquire = js.Any.fromFunction0(acquire), getWindow = js.Any.fromFunction0(getWindow), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XWindowSupplier]
  }
}

