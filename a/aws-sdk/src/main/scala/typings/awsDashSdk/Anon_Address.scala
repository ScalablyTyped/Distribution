package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Address extends js.Object {
  var Address: js.UndefOr[String] = js.native
  var CachePeriodInMinutes: js.UndefOr[Double] = js.native
}

object Anon_Address {
  @scala.inline
  def apply(Address: String = null, CachePeriodInMinutes: Int | Double = null): Anon_Address = {
    val __obj = js.Dynamic.literal()
    if (Address != null) __obj.updateDynamic("Address")(Address.asInstanceOf[js.Any])
    if (CachePeriodInMinutes != null) __obj.updateDynamic("CachePeriodInMinutes")(CachePeriodInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Address]
  }
}

