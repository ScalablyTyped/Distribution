package typings.activexLibreoffice.com_.sun.star.connection

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.io.XStreamListener
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to add listeners to a connection.
  *
  * Maybe supported by connections returned from {@link XAcceptor.accept()} or {@link XConnector.connect()} .
  */
trait XConnectionBroadcaster extends XInterface {
  /**
    * registers an object to receive events from this connection.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    */
  def addStreamListener(aListener: XStreamListener): Unit
  /**
    * unregisters an object to receive events from this connection.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    */
  def removeStreamListener(aListener: XStreamListener): Unit
}

object XConnectionBroadcaster {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addStreamListener: XStreamListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeStreamListener: XStreamListener => Unit
  ): XConnectionBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addStreamListener = js.Any.fromFunction1(addStreamListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeStreamListener = js.Any.fromFunction1(removeStreamListener))
    __obj.asInstanceOf[XConnectionBroadcaster]
  }
}

