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
    acquire: js.Function0[scala.Unit],
    createHatchWindowInstance: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowPeer, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size, 
      XHatchWindow
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XHatchWindowFactory = {
    val __obj = js.Dynamic.literal(acquire = acquire, createHatchWindowInstance = createHatchWindowInstance, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XHatchWindowFactory]
  }
}

