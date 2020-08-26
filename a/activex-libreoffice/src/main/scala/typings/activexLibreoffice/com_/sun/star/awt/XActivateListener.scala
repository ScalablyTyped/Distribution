package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to receive activate events.
  * @see XFocusListener
  * @see XTopWindowListener
  */
@js.native
trait XActivateListener extends XEventListener {
  /**
    * is invoked when a window is activated.
    *
    * A window is activated if a child or itself got the focus.
    * @see XFocusListener.focusGained
    */
  def windowActivated(e: EventObject): Unit = js.native
  /**
    * is invoked when a window is deactivated.
    *
    * A window is deactivated if a child or itself lost the focus.
    * @see XFocusListener.focusLost
    */
  def windowDeactivated(e: EventObject): Unit = js.native
}

object XActivateListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    windowActivated: EventObject => Unit,
    windowDeactivated: EventObject => Unit
  ): XActivateListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), windowActivated = js.Any.fromFunction1(windowActivated), windowDeactivated = js.Any.fromFunction1(windowDeactivated))
    __obj.asInstanceOf[XActivateListener]
  }
  @scala.inline
  implicit class XActivateListenerOps[Self <: XActivateListener] (val x: Self) extends AnyVal {
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
    def setWindowActivated(value: EventObject => Unit): Self = this.set("windowActivated", js.Any.fromFunction1(value))
    @scala.inline
    def setWindowDeactivated(value: EventObject => Unit): Self = this.set("windowDeactivated", js.Any.fromFunction1(value))
  }
  
}

