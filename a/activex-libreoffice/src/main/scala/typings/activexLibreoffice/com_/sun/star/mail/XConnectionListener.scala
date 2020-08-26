package typings.activexLibreoffice.com_.sun.star.mail

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The listener interface for connection events.
  * @see com.sun.star.mail.XMailService
  * @since OOo 2.0
  */
@js.native
trait XConnectionListener extends XEventListener {
  /**
    * Invoked when the connection to the mail server is established.
    * @param aEvent [in] specific information regarding this event.
    * @see com.sun.star.lang.EventObject
    */
  def connected(aEvent: EventObject): Unit = js.native
  /**
    * Invoked when the connection to the mail server is closed.
    * @param aEvent [in] specific information regarding this event.
    * @see com.sun.star.lang.EventObject
    */
  def disconnected(aEvent: EventObject): Unit = js.native
}

object XConnectionListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    connected: EventObject => Unit,
    disconnected: EventObject => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XConnectionListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), connected = js.Any.fromFunction1(connected), disconnected = js.Any.fromFunction1(disconnected), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XConnectionListener]
  }
  @scala.inline
  implicit class XConnectionListenerOps[Self <: XConnectionListener] (val x: Self) extends AnyVal {
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
    def setConnected(value: EventObject => Unit): Self = this.set("connected", js.Any.fromFunction1(value))
    @scala.inline
    def setDisconnected(value: EventObject => Unit): Self = this.set("disconnected", js.Any.fromFunction1(value))
  }
  
}

