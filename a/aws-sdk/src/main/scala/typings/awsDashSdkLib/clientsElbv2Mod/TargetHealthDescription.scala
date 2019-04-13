package typings
package awsDashSdkLib.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetHealthDescription extends js.Object {
  /**
    * The port to use to connect with the target.
    */
  var HealthCheckPort: js.UndefOr[HealthCheckPort] = js.undefined
  /**
    * The description of the target.
    */
  var Target: js.UndefOr[TargetDescription] = js.undefined
  /**
    * The health information for the target.
    */
  var TargetHealth: js.UndefOr[TargetHealth] = js.undefined
}

object TargetHealthDescription {
  @scala.inline
  def apply(
    HealthCheckPort: HealthCheckPort = null,
    Target: TargetDescription = null,
    TargetHealth: TargetHealth = null
  ): TargetHealthDescription = {
    val __obj = js.Dynamic.literal()
    if (HealthCheckPort != null) __obj.updateDynamic("HealthCheckPort")(HealthCheckPort)
    if (Target != null) __obj.updateDynamic("Target")(Target)
    if (TargetHealth != null) __obj.updateDynamic("TargetHealth")(TargetHealth)
    __obj.asInstanceOf[TargetHealthDescription]
  }
}

