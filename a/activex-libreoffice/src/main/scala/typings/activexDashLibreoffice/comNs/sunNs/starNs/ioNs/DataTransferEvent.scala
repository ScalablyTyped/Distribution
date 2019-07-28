package typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is broadcast by a filter.
  * @see XDataTransferEventListener
  */
trait DataTransferEvent extends EventObject {
  /** specifies an occurred exception. */
  var aException: js.Any
}

object DataTransferEvent {
  @scala.inline
  def apply(Source: XInterface, aException: js.Any): DataTransferEvent = {
    val __obj = js.Dynamic.literal(Source = Source, aException = aException)
  
    __obj.asInstanceOf[DataTransferEvent]
  }
}

