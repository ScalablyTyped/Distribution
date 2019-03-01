package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to receive window events.
  *
  * Component events are provided **only** for notification purposes. Moves and resizes will be handled internally by the window component, so that GUI
  * layout works properly regardless of whether a program registers such a listener or not.
  */
trait XWindowListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** is invoked when the window has been hidden. */
  def windowHidden(e: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
  /** is invoked when the window has been moved. */
  def windowMoved(e: WindowEvent): scala.Unit
  /** is invoked when the window has been resized. */
  def windowResized(e: WindowEvent): scala.Unit
  /** is invoked when the window has been shown. */
  def windowShown(e: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
}

object XWindowListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    windowHidden: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    windowMoved: js.Function1[WindowEvent, scala.Unit],
    windowResized: js.Function1[WindowEvent, scala.Unit],
    windowShown: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit]
  ): XWindowListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("disposing")(disposing)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("windowHidden")(windowHidden)
    __obj.updateDynamic("windowMoved")(windowMoved)
    __obj.updateDynamic("windowResized")(windowResized)
    __obj.updateDynamic("windowShown")(windowShown)
    __obj.asInstanceOf[XWindowListener]
  }
}

