package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to receive keyboard events. */
trait XKeyListener extends XEventListener {
  /** is invoked when a key has been pressed. */
  def keyPressed(e: KeyEvent): Unit
  /** is invoked when a key has been released. */
  def keyReleased(e: KeyEvent): Unit
}

object XKeyListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    keyPressed: KeyEvent => Unit,
    keyReleased: KeyEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XKeyListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), keyPressed = js.Any.fromFunction1(keyPressed), keyReleased = js.Any.fromFunction1(keyReleased), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XKeyListener]
  }
}

