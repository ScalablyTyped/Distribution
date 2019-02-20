package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Listener interface to receive shape-specific events.
  * @since OOo 2.4
  */
trait XShapeEventListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * Notify a clicked shape.
    *
    * This method notifies the listener that a shape was clicked.
    * @param xShape The shape that was clicked upon.
    * @param aOriginalEvent The original mouse click event that generated this notification.
    */
  def click(
    xShape: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    aOriginalEvent: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.MouseEvent
  ): scala.Unit
}

