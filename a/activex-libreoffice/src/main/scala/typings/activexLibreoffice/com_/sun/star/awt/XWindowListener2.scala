package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows receive window-related events, additional to the ones received by an {@link XWindowListener} */
@js.native
trait XWindowListener2 extends XWindowListener {
  /** is called when the window has been disabled. */
  def windowDisabled(e: EventObject): Unit = js.native
  /** is called when the window has been enabled. */
  def windowEnabled(e: EventObject): Unit = js.native
}

object XWindowListener2 {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    windowDisabled: EventObject => Unit,
    windowEnabled: EventObject => Unit,
    windowHidden: EventObject => Unit,
    windowMoved: WindowEvent => Unit,
    windowResized: WindowEvent => Unit,
    windowShown: EventObject => Unit
  ): XWindowListener2 = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), windowDisabled = js.Any.fromFunction1(windowDisabled), windowEnabled = js.Any.fromFunction1(windowEnabled), windowHidden = js.Any.fromFunction1(windowHidden), windowMoved = js.Any.fromFunction1(windowMoved), windowResized = js.Any.fromFunction1(windowResized), windowShown = js.Any.fromFunction1(windowShown))
    __obj.asInstanceOf[XWindowListener2]
  }
  @scala.inline
  implicit class XWindowListener2Ops[Self <: XWindowListener2] (val x: Self) extends AnyVal {
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
    def setWindowDisabled(value: EventObject => Unit): Self = this.set("windowDisabled", js.Any.fromFunction1(value))
    @scala.inline
    def setWindowEnabled(value: EventObject => Unit): Self = this.set("windowEnabled", js.Any.fromFunction1(value))
  }
  
}

