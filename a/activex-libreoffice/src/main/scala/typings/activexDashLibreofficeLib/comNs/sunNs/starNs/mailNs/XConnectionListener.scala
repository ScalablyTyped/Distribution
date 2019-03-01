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
    acquire: js.Function0[scala.Unit],
    connected: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    disconnected: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XConnectionListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("connected")(connected)
    __obj.updateDynamic("disconnected")(disconnected)
    __obj.updateDynamic("disposing")(disposing)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XConnectionListener]
  }
}

