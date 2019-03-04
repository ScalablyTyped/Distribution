package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.connectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to add listeners to a connection.
  *
  * Maybe supported by connections returned from {@link XAcceptor.accept()} or {@link XConnector.connect()} .
  */
trait XConnectionBroadcaster
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * registers an object to receive events from this connection.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    */
  def addStreamListener(aListener: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStreamListener): scala.Unit
  /**
    * unregisters an object to receive events from this connection.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    */
  def removeStreamListener(aListener: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStreamListener): scala.Unit
}

object XConnectionBroadcaster {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addStreamListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStreamListener, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeStreamListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStreamListener, scala.Unit]
  ): XConnectionBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = acquire, addStreamListener = addStreamListener, queryInterface = queryInterface, release = release, removeStreamListener = removeStreamListener)
  
    __obj.asInstanceOf[XConnectionBroadcaster]
  }
}

