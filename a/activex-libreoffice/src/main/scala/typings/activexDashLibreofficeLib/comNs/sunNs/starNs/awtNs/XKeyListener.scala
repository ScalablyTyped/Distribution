package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to receive keyboard events. */
trait XKeyListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** is invoked when a key has been pressed. */
  def keyPressed(e: KeyEvent): scala.Unit
  /** is invoked when a key has been released. */
  def keyReleased(e: KeyEvent): scala.Unit
}

object XKeyListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    keyPressed: js.Function1[KeyEvent, scala.Unit],
    keyReleased: js.Function1[KeyEvent, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XKeyListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, disposing = disposing, keyPressed = keyPressed, keyReleased = keyReleased, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XKeyListener]
  }
}

