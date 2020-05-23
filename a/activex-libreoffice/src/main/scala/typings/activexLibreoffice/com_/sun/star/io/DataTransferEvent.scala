package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], aException = aException.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTransferEvent]
  }
}

