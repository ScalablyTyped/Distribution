package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisionedBandwidth extends js.Object {
  /**
    * Reserved. If you need to sustain traffic greater than the documented limits, contact us through the Support Center.
    */
  var ProvisionTime: js.UndefOr[DateTime] = js.native
  /**
    * Reserved. If you need to sustain traffic greater than the documented limits, contact us through the Support Center.
    */
  var Provisioned: js.UndefOr[String] = js.native
  /**
    * Reserved. If you need to sustain traffic greater than the documented limits, contact us through the Support Center.
    */
  var RequestTime: js.UndefOr[DateTime] = js.native
  /**
    * Reserved. If you need to sustain traffic greater than the documented limits, contact us through the Support Center.
    */
  var Requested: js.UndefOr[String] = js.native
  /**
    * Reserved. If you need to sustain traffic greater than the documented limits, contact us through the Support Center.
    */
  var Status: js.UndefOr[String] = js.native
}

object ProvisionedBandwidth {
  @scala.inline
  def apply(
    ProvisionTime: DateTime = null,
    Provisioned: String = null,
    RequestTime: DateTime = null,
    Requested: String = null,
    Status: String = null
  ): ProvisionedBandwidth = {
    val __obj = js.Dynamic.literal()
    if (ProvisionTime != null) __obj.updateDynamic("ProvisionTime")(ProvisionTime.asInstanceOf[js.Any])
    if (Provisioned != null) __obj.updateDynamic("Provisioned")(Provisioned.asInstanceOf[js.Any])
    if (RequestTime != null) __obj.updateDynamic("RequestTime")(RequestTime.asInstanceOf[js.Any])
    if (Requested != null) __obj.updateDynamic("Requested")(Requested.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionedBandwidth]
  }
}

