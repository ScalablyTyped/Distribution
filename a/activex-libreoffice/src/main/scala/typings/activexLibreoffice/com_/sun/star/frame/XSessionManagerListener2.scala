package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XSessionManagerListener2 extends XSessionManagerListener {
  /**
    * doQuit gets called when the session manager has decided the application should quit. Under these circumstances bringing up further UI will usually be
    * impossible and must be avoided.
    */
  def doQuit(): Unit = js.native
}

object XSessionManagerListener2 {
  @scala.inline
  def apply(
    acquire: () => Unit,
    approveInteraction: Boolean => Unit,
    disposing: EventObject => Unit,
    doQuit: () => Unit,
    doRestore: () => Boolean,
    doSave: (Boolean, Boolean) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    shutdownCanceled: () => Unit
  ): XSessionManagerListener2 = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), approveInteraction = js.Any.fromFunction1(approveInteraction), disposing = js.Any.fromFunction1(disposing), doQuit = js.Any.fromFunction0(doQuit), doRestore = js.Any.fromFunction0(doRestore), doSave = js.Any.fromFunction2(doSave), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), shutdownCanceled = js.Any.fromFunction0(shutdownCanceled))
    __obj.asInstanceOf[XSessionManagerListener2]
  }
  @scala.inline
  implicit class XSessionManagerListener2Ops[Self <: XSessionManagerListener2] (val x: Self) extends AnyVal {
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
    def setDoQuit(value: () => Unit): Self = this.set("doQuit", js.Any.fromFunction0(value))
  }
  
}

