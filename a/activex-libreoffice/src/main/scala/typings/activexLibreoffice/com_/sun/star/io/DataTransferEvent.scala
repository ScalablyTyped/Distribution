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
@js.native
trait DataTransferEvent extends EventObject {
  /** specifies an occurred exception. */
  var aException: js.Any = js.native
}

object DataTransferEvent {
  @scala.inline
  def apply(Source: XInterface, aException: js.Any): DataTransferEvent = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], aException = aException.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTransferEvent]
  }
  @scala.inline
  implicit class DataTransferEventOps[Self <: DataTransferEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAException(value: js.Any): Self = this.set("aException", value.asInstanceOf[js.Any])
  }
  
}

