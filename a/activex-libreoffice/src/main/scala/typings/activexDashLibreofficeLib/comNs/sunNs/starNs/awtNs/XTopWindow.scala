package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** manages the functionality specific for a top window. */
trait XTopWindow
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** adds the specified top window listener to receive window events from this window. */
  def addTopWindowListener(xListener: XTopWindowListener): scala.Unit
  /** removes the specified top window listener so that it no longer receives window events from this window. */
  def removeTopWindowListener(xListener: XTopWindowListener): scala.Unit
  /** sets a menu bar. */
  def setMenuBar(xMenu: XMenuBar): scala.Unit
  /** places this window at the bottom of the stacking order and makes the corresponding adjustment to other visible windows. */
  def toBack(): scala.Unit
  /** places this window at the top of the stacking order and shows it in front of any other windows. */
  def toFront(): scala.Unit
}

object XTopWindow {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addTopWindowListener: js.Function1[XTopWindowListener, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeTopWindowListener: js.Function1[XTopWindowListener, scala.Unit],
    setMenuBar: js.Function1[XMenuBar, scala.Unit],
    toBack: js.Function0[scala.Unit],
    toFront: js.Function0[scala.Unit]
  ): XTopWindow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addTopWindowListener")(addTopWindowListener)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeTopWindowListener")(removeTopWindowListener)
    __obj.updateDynamic("setMenuBar")(setMenuBar)
    __obj.updateDynamic("toBack")(toBack)
    __obj.updateDynamic("toFront")(toFront)
    __obj.asInstanceOf[XTopWindow]
  }
}

