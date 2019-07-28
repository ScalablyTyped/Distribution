package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvailabilityZone extends js.Object {
  /**
    * The state of the Availability Zone.
    */
  var state: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The name of the Availability Zone. The format is us-east-2a (case-sensitive).
    */
  var zoneName: js.UndefOr[NonEmptyString] = js.undefined
}

object AvailabilityZone {
  @scala.inline
  def apply(state: NonEmptyString = null, zoneName: NonEmptyString = null): AvailabilityZone = {
    val __obj = js.Dynamic.literal()
    if (state != null) __obj.updateDynamic("state")(state)
    if (zoneName != null) __obj.updateDynamic("zoneName")(zoneName)
    __obj.asInstanceOf[AvailabilityZone]
  }
}

