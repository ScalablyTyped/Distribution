package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvailabilityZone extends js.Object {
  /**
    * The ID of the subnet. You can specify one subnet per Availability Zone.
    */
  var SubnetId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The name of the Availability Zone.
    */
  var ZoneName: js.UndefOr[NonEmptyString] = js.native
}

object AvailabilityZone {
  @scala.inline
  def apply(SubnetId: NonEmptyString = null, ZoneName: NonEmptyString = null): AvailabilityZone = {
    val __obj = js.Dynamic.literal()
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId.asInstanceOf[js.Any])
    if (ZoneName != null) __obj.updateDynamic("ZoneName")(ZoneName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailabilityZone]
  }
}

