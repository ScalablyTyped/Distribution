package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProvisionedBandwidth extends js.Object {
  /**
    * Reserved. If you need to sustain traffic greater than the documented limits, contact us through the Support Center.
    */
  var ProvisionTime: js.UndefOr[DateTime] = js.undefined
  /**
    * Reserved. If you need to sustain traffic greater than the documented limits, contact us through the Support Center.
    */
  var Provisioned: js.UndefOr[String] = js.undefined
  /**
    * Reserved. If you need to sustain traffic greater than the documented limits, contact us through the Support Center.
    */
  var RequestTime: js.UndefOr[DateTime] = js.undefined
  /**
    * Reserved. If you need to sustain traffic greater than the documented limits, contact us through the Support Center.
    */
  var Requested: js.UndefOr[String] = js.undefined
  /**
    * Reserved. If you need to sustain traffic greater than the documented limits, contact us through the Support Center.
    */
  var Status: js.UndefOr[String] = js.undefined
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
    if (ProvisionTime != null) __obj.updateDynamic("ProvisionTime")(ProvisionTime)
    if (Provisioned != null) __obj.updateDynamic("Provisioned")(Provisioned)
    if (RequestTime != null) __obj.updateDynamic("RequestTime")(RequestTime)
    if (Requested != null) __obj.updateDynamic("Requested")(Requested)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[ProvisionedBandwidth]
  }
}

