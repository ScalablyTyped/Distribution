package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to receive keyboard events. */
@js.native
trait XKeyListener extends XEventListener {
  /** is invoked when a key has been pressed. */
  def keyPressed(e: KeyEvent): Unit = js.native
  /** is invoked when a key has been released. */
  def keyReleased(e: KeyEvent): Unit = js.native
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
  @scala.inline
  implicit class XKeyListenerOps[Self <: XKeyListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKeyPressed(value: KeyEvent => Unit): Self = this.set("keyPressed", js.Any.fromFunction1(value))
    @scala.inline
    def setKeyReleased(value: KeyEvent => Unit): Self = this.set("keyReleased", js.Any.fromFunction1(value))
  }
  
}

