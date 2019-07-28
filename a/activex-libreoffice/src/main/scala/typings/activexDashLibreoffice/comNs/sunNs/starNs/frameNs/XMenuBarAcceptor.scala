package typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XMenuBar
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides function to update a menu bar for inplace editing.
  * @deprecated Deprecated
  * @since OOo 2.0
  */
trait XMenuBarAcceptor extends XInterface {
  /**
    * update menu bar according to the current frame mode. This is used in inplace editing mode where we have to merge our own menu into the container
    * applications menu.
    * @param xMenuBar the menu bar that should be merged with current one.
    */
  def updateMenuBar(xMenuBar: js.Array[XMenuBar]): Unit
}

object XMenuBarAcceptor {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    updateMenuBar: js.Array[XMenuBar] => Unit
  ): XMenuBarAcceptor = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), updateMenuBar = js.Any.fromFunction1(updateMenuBar))
  
    __obj.asInstanceOf[XMenuBarAcceptor]
  }
}

