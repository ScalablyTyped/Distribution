package typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows to listen to border resize events of a controller. */
trait XBorderResizeListener extends XEventListener {
  /**
    * notifies the listener that the controller's border widths have been changed.
    * @param Object reference to the object representing the controller
    * @param NewSize the new widths of the controller's border
    */
  def borderWidthsChanged(Object: XInterface, NewSize: BorderWidths): Unit
}

object XBorderResizeListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    borderWidthsChanged: (XInterface, BorderWidths) => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XBorderResizeListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), borderWidthsChanged = js.Any.fromFunction2(borderWidthsChanged), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XBorderResizeListener]
  }
}

