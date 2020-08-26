package typings.activexLibreoffice.com_.sun.star.xml.dom.events

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XEventTarget extends XInterface {
  def addEventListener(eventType: String, listener: XEventListener, useCapture: Boolean): Unit = js.native
  def dispatchEvent(evt: XEvent): Boolean = js.native
  def removeEventListener(eventType: String, listener: XEventListener, useCapture: Boolean): Unit = js.native
}

object XEventTarget {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addEventListener: (String, XEventListener, Boolean) => Unit,
    dispatchEvent: XEvent => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: (String, XEventListener, Boolean) => Unit
  ): XEventTarget = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction3(addEventListener), dispatchEvent = js.Any.fromFunction1(dispatchEvent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction3(removeEventListener))
    __obj.asInstanceOf[XEventTarget]
  }
  @scala.inline
  implicit class XEventTargetOps[Self <: XEventTarget] (val x: Self) extends AnyVal {
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
    def setAddEventListener(value: (String, XEventListener, Boolean) => Unit): Self = this.set("addEventListener", js.Any.fromFunction3(value))
    @scala.inline
    def setDispatchEvent(value: XEvent => Boolean): Self = this.set("dispatchEvent", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveEventListener(value: (String, XEventListener, Boolean) => Unit): Self = this.set("removeEventListener", js.Any.fromFunction3(value))
  }
  
}

