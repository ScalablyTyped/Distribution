package typings.activexLibreoffice.com_.sun.star.mozilla

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Listener for closing of the corresponding session. */
@js.native
trait XCloseSessionListener extends XInterface {
  /**
    * Notifies a closesession listener that the corresponding session was logged out
    * @param sessionData [in]: the data identifying the session that was closed
    */
  def sessionClosed(sessionData: js.Any): Unit = js.native
}

object XCloseSessionListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    sessionClosed: js.Any => Unit
  ): XCloseSessionListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), sessionClosed = js.Any.fromFunction1(sessionClosed))
    __obj.asInstanceOf[XCloseSessionListener]
  }
  @scala.inline
  implicit class XCloseSessionListenerOps[Self <: XCloseSessionListener] (val x: Self) extends AnyVal {
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
    def setSessionClosed(value: js.Any => Unit): Self = this.set("sessionClosed", js.Any.fromFunction1(value))
  }
  
}

