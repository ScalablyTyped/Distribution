package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XEventAttacher2 extends XEventAttacher {
  /**
    * Register a multiple set of listeners listening for the same target. Besides passing multiple listeners, the behavior of this method is identical to
    * that of {@link attachSingleEventListener()} .
    * @see com.sun.star.script.XEventAttacher.attachSingleEventListener
    */
  def attachMultipleEventListeners(xTarget: XInterface, aListeners: SeqEquiv[EventListener]): SafeArray[XEventListener] = js.native
}

object XEventAttacher2 {
  @scala.inline
  def apply(
    acquire: () => Unit,
    attachListener: (XInterface, XAllListener, js.Any, String, String) => XEventListener,
    attachMultipleEventListeners: (XInterface, SeqEquiv[EventListener]) => SafeArray[XEventListener],
    attachSingleEventListener: (XInterface, XAllListener, js.Any, String, String, String) => XEventListener,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeListener: (XInterface, String, String, XEventListener) => Unit
  ): XEventAttacher2 = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), attachListener = js.Any.fromFunction5(attachListener), attachMultipleEventListeners = js.Any.fromFunction2(attachMultipleEventListeners), attachSingleEventListener = js.Any.fromFunction6(attachSingleEventListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeListener = js.Any.fromFunction4(removeListener))
    __obj.asInstanceOf[XEventAttacher2]
  }
  @scala.inline
  implicit class XEventAttacher2Ops[Self <: XEventAttacher2] (val x: Self) extends AnyVal {
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
    def setAttachMultipleEventListeners(value: (XInterface, SeqEquiv[EventListener]) => SafeArray[XEventListener]): Self = this.set("attachMultipleEventListeners", js.Any.fromFunction2(value))
  }
  
}

