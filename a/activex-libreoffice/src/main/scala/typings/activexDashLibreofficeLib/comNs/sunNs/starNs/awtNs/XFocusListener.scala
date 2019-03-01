package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to receive keyboard focus events.
  *
  * The window which has the keyboard focus is the window which gets the keyboard events.
  */
trait XFocusListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * is invoked when a window gains the keyboard focus.
    * @see XActivateListener.windowActivated
    */
  def focusGained(e: FocusEvent): scala.Unit
  /**
    * is invoked when a window loses the keyboard focus.
    * @see XActivateListener.windowDeactivated
    */
  def focusLost(e: FocusEvent): scala.Unit
}

object XFocusListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    focusGained: js.Function1[FocusEvent, scala.Unit],
    focusLost: js.Function1[FocusEvent, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XFocusListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("disposing")(disposing)
    __obj.updateDynamic("focusGained")(focusGained)
    __obj.updateDynamic("focusLost")(focusLost)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XFocusListener]
  }
}

