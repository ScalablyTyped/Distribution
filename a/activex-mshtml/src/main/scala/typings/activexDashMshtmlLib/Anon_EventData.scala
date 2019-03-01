package typings
package activexDashMshtmlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventData extends js.Object {
  val eventData: js.Any
  val name: java.lang.String
}

object Anon_EventData {
  @scala.inline
  def apply(eventData: js.Any, name: java.lang.String): Anon_EventData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("eventData")(eventData)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_EventData]
  }
}

