package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to add and remove EnhancedMouseClickHandler
  * @since OOo 2.0
  */
trait XEnhancedMouseClickBroadcaster
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * allows a component supporting the XEnhancedMouseClickHandler interface to register as listener. The component will be notified with a
    * EnhancedMouseEvent every time the mouse is clicked in the spreadsheet
    * @param aListener the component that is to be added as listener
    * @see XEnhancedMouseClickHandler
    * @see EnhancedMouseEvent The interfaces in the EnhancedMouseEvent can be XCell or XShape
    * @see XShape
    * @see XCell
    */
  def addEnhancedMouseClickHandler(aListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XEnhancedMouseClickHandler): scala.Unit
  /**
    * removes a previously registered listener.
    * @param aListener the component that is to be removed
    */
  def removeEnhancedMouseClickHandler(aListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XEnhancedMouseClickHandler): scala.Unit
}

