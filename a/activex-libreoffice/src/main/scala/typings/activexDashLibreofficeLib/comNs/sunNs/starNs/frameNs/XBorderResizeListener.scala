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
    acquire: js.Function0[scala.Unit],
    borderWidthsChanged: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, 
      BorderWidths, 
      scala.Unit
    ],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XBorderResizeListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, borderWidthsChanged = borderWidthsChanged, disposing = disposing, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XBorderResizeListener]
  }
}

