package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddress extends js.Object {
  var Address: js.UndefOr[String] = js.native
  var CachePeriodInMinutes: js.UndefOr[Double] = js.native
}

object AnonAddress {
  @scala.inline
  def apply(Address: String = null, CachePeriodInMinutes: Int | Double = null): AnonAddress = {
    val __obj = js.Dynamic.literal()
    if (Address != null) __obj.updateDynamic("Address")(Address.asInstanceOf[js.Any])
    if (CachePeriodInMinutes != null) __obj.updateDynamic("CachePeriodInMinutes")(CachePeriodInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddress]
  }
}

