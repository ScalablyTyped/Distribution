package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Transition interface to render custom transitions over time.
  * @since OOo 2.4
  */
trait XTransition
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Update transition on screen to given time state.
    * @param t Time on the transition timeline to display. Must be in the [0,1] range.
    */
  def update(t: scala.Double): scala.Unit
  def viewChanged(
    view: XSlideShowView,
    leavingBitmap: activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.XBitmap,
    enteringBitmap: activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.XBitmap
  ): scala.Unit
}

