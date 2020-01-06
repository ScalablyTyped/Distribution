package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvailabilityZoneDetail extends js.Object {
  /**
    * The name of a corresponding availability zone.
    */
  var Name: js.UndefOr[String] = js.native
}

object AvailabilityZoneDetail {
  @scala.inline
  def apply(Name: String = null): AvailabilityZoneDetail = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailabilityZoneDetail]
  }
}

