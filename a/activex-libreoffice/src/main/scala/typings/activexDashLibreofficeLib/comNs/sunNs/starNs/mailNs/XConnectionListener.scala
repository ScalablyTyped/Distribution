package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.mailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The listener interface for connection events.
  * @see com.sun.star.mail.XMailService
  * @since OOo 2.0
  */
trait XConnectionListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * Invoked when the connection to the mail server is established.
    * @param aEvent [in] specific information regarding this event.
    * @see com.sun.star.lang.EventObject
    */
  def connected(aEvent: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
  /**
    * Invoked when the connection to the mail server is closed.
    * @param aEvent [in] specific information regarding this event.
    * @see com.sun.star.lang.EventObject
    */
  def disconnected(aEvent: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
}

object XConnectionListener {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    connected: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject => scala.Unit,
    disconnected: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject => scala.Unit,
    disposing: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XConnectionListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), connected = js.Any.fromFunction1(connected), disconnected = js.Any.fromFunction1(disconnected), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XConnectionListener]
  }
}

