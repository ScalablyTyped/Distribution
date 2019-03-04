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

object XTransition {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    update: js.Function1[scala.Double, scala.Unit],
    viewChanged: js.Function3[
      XSlideShowView, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.XBitmap, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.XBitmap, 
      scala.Unit
    ]
  ): XTransition = {
    val __obj = js.Dynamic.literal(acquire = acquire, queryInterface = queryInterface, release = release, update = update, viewChanged = viewChanged)
  
    __obj.asInstanceOf[XTransition]
  }
}

