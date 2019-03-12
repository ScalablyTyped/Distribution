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

object XMenuBarAcceptor {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    updateMenuBar: js.Array[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMenuBar] => scala.Unit
  ): XMenuBarAcceptor = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), updateMenuBar = js.Any.fromFunction1(updateMenuBar))
  
    __obj.asInstanceOf[XMenuBarAcceptor]
  }
}

