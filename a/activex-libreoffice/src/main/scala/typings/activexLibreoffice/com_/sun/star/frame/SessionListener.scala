package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This was created from its sole place of use, so it might be incomplete.
  * @since LibreOffice 4.1
  */
@js.native
trait SessionListener extends XSessionManagerListener2 {
  def createWithOnQuitFlag(AllowUserInteractionOnQuit: Boolean): Unit = js.native
}

object SessionListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    approveInteraction: Boolean => Unit,
    createWithOnQuitFlag: Boolean => Unit,
    disposing: EventObject => Unit,
    doQuit: () => Unit,
    doRestore: () => Boolean,
    doSave: (Boolean, Boolean) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    shutdownCanceled: () => Unit
  ): SessionListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), approveInteraction = js.Any.fromFunction1(approveInteraction), createWithOnQuitFlag = js.Any.fromFunction1(createWithOnQuitFlag), disposing = js.Any.fromFunction1(disposing), doQuit = js.Any.fromFunction0(doQuit), doRestore = js.Any.fromFunction0(doRestore), doSave = js.Any.fromFunction2(doSave), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), shutdownCanceled = js.Any.fromFunction0(shutdownCanceled))
    __obj.asInstanceOf[SessionListener]
  }
  @scala.inline
  implicit class SessionListenerOps[Self <: SessionListener] (val x: Self) extends AnyVal {
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
    def setCreateWithOnQuitFlag(value: Boolean => Unit): Self = this.set("createWithOnQuitFlag", js.Any.fromFunction1(value))
  }
  
}

