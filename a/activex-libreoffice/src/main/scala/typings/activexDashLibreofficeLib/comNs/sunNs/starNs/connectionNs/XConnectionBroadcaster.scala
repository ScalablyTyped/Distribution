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
    acquire: () => scala.Unit,
    addStreamListener: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStreamListener => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeStreamListener: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStreamListener => scala.Unit
  ): XConnectionBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addStreamListener = js.Any.fromFunction1(addStreamListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeStreamListener = js.Any.fromFunction1(removeStreamListener))
  
    __obj.asInstanceOf[XConnectionBroadcaster]
  }
}

