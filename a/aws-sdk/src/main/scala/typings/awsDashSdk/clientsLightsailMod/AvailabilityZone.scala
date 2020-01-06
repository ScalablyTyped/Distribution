package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvailabilityZone extends js.Object {
  /**
    * The state of the Availability Zone.
    */
  var state: js.UndefOr[NonEmptyString] = js.native
  /**
    * The name of the Availability Zone. The format is us-east-2a (case-sensitive).
    */
  var zoneName: js.UndefOr[NonEmptyString] = js.native
}

object AvailabilityZone {
  @scala.inline
  def apply(state: NonEmptyString = null, zoneName: NonEmptyString = null): AvailabilityZone = {
    val __obj = js.Dynamic.literal()
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (zoneName != null) __obj.updateDynamic("zoneName")(zoneName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailabilityZone]
  }
}

