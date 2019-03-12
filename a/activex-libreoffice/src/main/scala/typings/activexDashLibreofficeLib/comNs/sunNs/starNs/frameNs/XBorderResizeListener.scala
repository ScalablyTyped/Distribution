package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows to listen to border resize events of a controller. */
trait XBorderResizeListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * notifies the listener that the controller's border widths have been changed.
    * @param Object reference to the object representing the controller
    * @param NewSize the new widths of the controller's border
    */
  def borderWidthsChanged(Object: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, NewSize: BorderWidths): scala.Unit
}

object XBorderResizeListener {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    borderWidthsChanged: (activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, BorderWidths) => scala.Unit,
    disposing: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XBorderResizeListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), borderWidthsChanged = js.Any.fromFunction2(borderWidthsChanged), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XBorderResizeListener]
  }
}

