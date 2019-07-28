package typings.awsDashSdk.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrokerInstanceOption extends js.Object {
  /**
    * The list of available az.
    */
  var AvailabilityZones: js.UndefOr[__listOfAvailabilityZone] = js.undefined
  /**
    * The type of broker engine.
    */
  var EngineType: js.UndefOr[typings.awsDashSdk.clientsMqMod.EngineType] = js.undefined
  /**
    * The type of broker instance.
    */
  var HostInstanceType: js.UndefOr[__string] = js.undefined
  /**
    * The list of supported engine versions.
    */
  var SupportedEngineVersions: js.UndefOr[__listOf__string] = js.undefined
}

object BrokerInstanceOption {
  @scala.inline
  def apply(
    AvailabilityZones: __listOfAvailabilityZone = null,
    EngineType: EngineType = null,
    HostInstanceType: __string = null,
    SupportedEngineVersions: __listOf__string = null
  ): BrokerInstanceOption = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones)
    if (EngineType != null) __obj.updateDynamic("EngineType")(EngineType.asInstanceOf[js.Any])
    if (HostInstanceType != null) __obj.updateDynamic("HostInstanceType")(HostInstanceType)
    if (SupportedEngineVersions != null) __obj.updateDynamic("SupportedEngineVersions")(SupportedEngineVersions)
    __obj.asInstanceOf[BrokerInstanceOption]
  }
}

