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

