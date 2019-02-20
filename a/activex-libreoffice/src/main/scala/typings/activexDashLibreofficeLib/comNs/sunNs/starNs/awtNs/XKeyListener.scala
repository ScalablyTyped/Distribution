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

