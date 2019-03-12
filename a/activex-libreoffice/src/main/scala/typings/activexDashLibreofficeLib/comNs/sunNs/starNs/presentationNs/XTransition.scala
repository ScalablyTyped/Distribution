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
    acquire: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    update: scala.Double => scala.Unit,
    viewChanged: (XSlideShowView, activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.XBitmap, activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.XBitmap) => scala.Unit
  ): XTransition = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), update = js.Any.fromFunction1(update), viewChanged = js.Any.fromFunction3(viewChanged))
  
    __obj.asInstanceOf[XTransition]
  }
}

