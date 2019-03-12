package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** creates a hatch window implementation. */
trait XHatchWindowFactory
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * creates a new hatch window instance.
    * @param xParent the parent window the hatch window should be created in
    * @param aBounds position and size of the hatch window
    * @param aSize border and handler squares size
    * @returns a new hatch window
    * @throws com::sun::star::lang::IllegalArgumentException one of arguments is illegal
    */
  def createHatchWindowInstance(
    xParent: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowPeer,
    aBounds: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    aSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size
  ): XHatchWindow
}

object XHatchWindowFactory {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    createHatchWindowInstance: (activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowPeer, activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle, activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size) => XHatchWindow,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XHatchWindowFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createHatchWindowInstance = js.Any.fromFunction3(createHatchWindowInstance), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XHatchWindowFactory]
  }
}

