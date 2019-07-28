package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvailabilityZoneDetail extends js.Object {
  /**
    * The name of a corresponding availability zone.
    */
  var Name: js.UndefOr[String] = js.undefined
}

object AvailabilityZoneDetail {
  @scala.inline
  def apply(Name: String = null): AvailabilityZoneDetail = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[AvailabilityZoneDetail]
  }
}

