package typings.activexDashLibreoffice.comNs.sunNs.starNs.embedNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Rectangle
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Size
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XWindowPeer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** creates a hatch window implementation. */
trait XHatchWindowFactory extends XInterface {
  /**
    * creates a new hatch window instance.
    * @param xParent the parent window the hatch window should be created in
    * @param aBounds position and size of the hatch window
    * @param aSize border and handler squares size
    * @returns a new hatch window
    * @throws com::sun::star::lang::IllegalArgumentException one of arguments is illegal
    */
  def createHatchWindowInstance(xParent: XWindowPeer, aBounds: Rectangle, aSize: Size): XHatchWindow
}

object XHatchWindowFactory {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createHatchWindowInstance: (XWindowPeer, Rectangle, Size) => XHatchWindow,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XHatchWindowFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createHatchWindowInstance = js.Any.fromFunction3(createHatchWindowInstance), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XHatchWindowFactory]
  }
}

