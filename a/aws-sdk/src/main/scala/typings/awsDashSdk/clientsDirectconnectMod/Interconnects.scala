package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Interconnects extends js.Object {
  /**
    * The interconnects.
    */
  var interconnects: js.UndefOr[InterconnectList] = js.undefined
}

object Interconnects {
  @scala.inline
  def apply(interconnects: InterconnectList = null): Interconnects = {
    val __obj = js.Dynamic.literal()
    if (interconnects != null) __obj.updateDynamic("interconnects")(interconnects)
    __obj.asInstanceOf[Interconnects]
  }
}

