package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides function to update a menu bar for inplace editing.
  * @deprecated Deprecated
  * @since OOo 2.0
  */
trait XMenuBarAcceptor
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * update menu bar according to the current frame mode. This is used in inplace editing mode where we have to merge our own menu into the container
    * applications menu.
    * @param xMenuBar the menu bar that should be merged with current one.
    */
  def updateMenuBar(xMenuBar: js.Array[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMenuBar]): scala.Unit
}

