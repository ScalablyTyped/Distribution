package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manipulate the "key SAX events" in a SAX event stream. */
trait XElementStackKeeper
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Transfers the buffered key SAX events to a document handler.
    *
    * All transferred events are removed from the buffer.
    * @param handler the document to receive key SAX events
    * @param includingTheLastEvent whether to transfer the last key SAX event
    */
  def retrieve(
    handler: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XDocumentHandler,
    includingTheLastEvent: scala.Boolean
  ): scala.Unit
  /** Starts to buffer key SAX events. */
  def start(): scala.Unit
  /** Stops buffering key SAX events. */
  def stop(): scala.Unit
}

object XElementStackKeeper {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    retrieve: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XDocumentHandler, 
      scala.Boolean, 
      scala.Unit
    ],
    start: js.Function0[scala.Unit],
    stop: js.Function0[scala.Unit]
  ): XElementStackKeeper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("retrieve")(retrieve)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("stop")(stop)
    __obj.asInstanceOf[XElementStackKeeper]
  }
}

