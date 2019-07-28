package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XEnhancedMouseClickHandler
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to add and remove EnhancedMouseClickHandler
  * @since OOo 2.0
  */
trait XEnhancedMouseClickBroadcaster extends XInterface {
  /**
    * allows a component supporting the XEnhancedMouseClickHandler interface to register as listener. The component will be notified with a
    * EnhancedMouseEvent every time the mouse is clicked in the spreadsheet
    * @param aListener the component that is to be added as listener
    * @see XEnhancedMouseClickHandler
    * @see EnhancedMouseEvent The interfaces in the EnhancedMouseEvent can be XCell or XShape
    * @see XShape
    * @see XCell
    */
  def addEnhancedMouseClickHandler(aListener: XEnhancedMouseClickHandler): Unit
  /**
    * removes a previously registered listener.
    * @param aListener the component that is to be removed
    */
  def removeEnhancedMouseClickHandler(aListener: XEnhancedMouseClickHandler): Unit
}

object XEnhancedMouseClickBroadcaster {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addEnhancedMouseClickHandler: XEnhancedMouseClickHandler => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEnhancedMouseClickHandler: XEnhancedMouseClickHandler => Unit
  ): XEnhancedMouseClickBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addEnhancedMouseClickHandler = js.Any.fromFunction1(addEnhancedMouseClickHandler), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEnhancedMouseClickHandler = js.Any.fromFunction1(removeEnhancedMouseClickHandler))
  
    __obj.asInstanceOf[XEnhancedMouseClickBroadcaster]
  }
}

