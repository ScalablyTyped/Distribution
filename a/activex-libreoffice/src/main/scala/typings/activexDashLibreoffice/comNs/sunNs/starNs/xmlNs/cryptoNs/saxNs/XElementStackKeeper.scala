package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.saxNs.XDocumentHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manipulate the "key SAX events" in a SAX event stream. */
trait XElementStackKeeper extends XInterface {
  /**
    * Transfers the buffered key SAX events to a document handler.
    *
    * All transferred events are removed from the buffer.
    * @param handler the document to receive key SAX events
    * @param includingTheLastEvent whether to transfer the last key SAX event
    */
  def retrieve(handler: XDocumentHandler, includingTheLastEvent: Boolean): Unit
  /** Starts to buffer key SAX events. */
  def start(): Unit
  /** Stops buffering key SAX events. */
  def stop(): Unit
}

object XElementStackKeeper {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    retrieve: (XDocumentHandler, Boolean) => Unit,
    start: () => Unit,
    stop: () => Unit
  ): XElementStackKeeper = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), retrieve = js.Any.fromFunction2(retrieve), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[XElementStackKeeper]
  }
}

