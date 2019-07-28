package typings.activexDashLibreoffice.comNs.sunNs.starNs.mailNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The listener interface for connection events.
  * @see com.sun.star.mail.XMailService
  * @since OOo 2.0
  */
trait XConnectionListener extends XEventListener {
  /**
    * Invoked when the connection to the mail server is established.
    * @param aEvent [in] specific information regarding this event.
    * @see com.sun.star.lang.EventObject
    */
  def connected(aEvent: EventObject): Unit
  /**
    * Invoked when the connection to the mail server is closed.
    * @param aEvent [in] specific information regarding this event.
    * @see com.sun.star.lang.EventObject
    */
  def disconnected(aEvent: EventObject): Unit
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
}

