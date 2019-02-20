package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to receive activate events.
  * @see XFocusListener
  * @see XTopWindowListener
  */
trait XActivateListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * is invoked when a window is activated.
    *
    * A window is activated if a child or itself got the focus.
    * @see XFocusListener.focusGained
    */
  def windowActivated(e: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
  /**
    * is invoked when a window is deactivated.
    *
    * A window is deactivated if a child or itself lost the focus.
    * @see XFocusListener.focusLost
    */
  def windowDeactivated(e: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
}

