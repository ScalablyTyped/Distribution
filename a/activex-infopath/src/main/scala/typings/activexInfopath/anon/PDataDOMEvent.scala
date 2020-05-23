package typings.activexInfopath.anon

import typings.activexInfopath.InfoPath.DataDOMEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDataDOMEvent extends js.Object {
  val pDataDOMEvent: DataDOMEventObject
}

object PDataDOMEvent {
  @scala.inline
  def apply(pDataDOMEvent: DataDOMEventObject): PDataDOMEvent = {
    val __obj = js.Dynamic.literal(pDataDOMEvent = pDataDOMEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDataDOMEvent]
  }
}

