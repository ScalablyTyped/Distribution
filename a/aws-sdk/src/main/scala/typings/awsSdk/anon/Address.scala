package typings.awsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Address extends js.Object {
  var Address: js.UndefOr[String] = js.native
  var CachePeriodInMinutes: js.UndefOr[Double] = js.native
}

object Address {
  @scala.inline
  def apply(Address: String = null, CachePeriodInMinutes: js.UndefOr[Double] = js.undefined): Address = {
    val __obj = js.Dynamic.literal()
    if (Address != null) __obj.updateDynamic("Address")(Address.asInstanceOf[js.Any])
    if (!js.isUndefined(CachePeriodInMinutes)) __obj.updateDynamic("CachePeriodInMinutes")(CachePeriodInMinutes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
}

