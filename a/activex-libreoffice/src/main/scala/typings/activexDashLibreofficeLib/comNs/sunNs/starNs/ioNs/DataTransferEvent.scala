package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is broadcast by a filter.
  * @see XDataTransferEventListener
  */
trait DataTransferEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /** specifies an occurred exception. */
  var aException: js.Any
}

object DataTransferEvent {
  @scala.inline
  def apply(Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, aException: js.Any): DataTransferEvent = {
    val __obj = js.Dynamic.literal(Source = Source, aException = aException)
  
    __obj.asInstanceOf[DataTransferEvent]
  }
}

