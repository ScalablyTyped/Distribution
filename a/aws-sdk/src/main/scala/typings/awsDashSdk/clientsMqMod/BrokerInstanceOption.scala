package typings.awsDashSdk.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrokerInstanceOption extends js.Object {
  /**
    * The list of available az.
    */
  var AvailabilityZones: js.UndefOr[__listOfAvailabilityZone] = js.native
  /**
    * The type of broker engine.
    */
  var EngineType: js.UndefOr[typings.awsDashSdk.clientsMqMod.EngineType] = js.native
  /**
    * The type of broker instance.
    */
  var HostInstanceType: js.UndefOr[__string] = js.native
  /**
    * The broker's storage type.
    */
  var StorageType: js.UndefOr[BrokerStorageType] = js.native
  /**
    * The list of supported deployment modes.
    */
  var SupportedDeploymentModes: js.UndefOr[__listOfDeploymentMode] = js.native
  /**
    * The list of supported engine versions.
    */
  var SupportedEngineVersions: js.UndefOr[__listOf__string] = js.native
}

object BrokerInstanceOption {
  @scala.inline
  def apply(
    AvailabilityZones: __listOfAvailabilityZone = null,
    EngineType: EngineType = null,
    HostInstanceType: __string = null,
    StorageType: BrokerStorageType = null,
    SupportedDeploymentModes: __listOfDeploymentMode = null,
    SupportedEngineVersions: __listOf__string = null
  ): BrokerInstanceOption = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones.asInstanceOf[js.Any])
    if (EngineType != null) __obj.updateDynamic("EngineType")(EngineType.asInstanceOf[js.Any])
    if (HostInstanceType != null) __obj.updateDynamic("HostInstanceType")(HostInstanceType.asInstanceOf[js.Any])
    if (StorageType != null) __obj.updateDynamic("StorageType")(StorageType.asInstanceOf[js.Any])
    if (SupportedDeploymentModes != null) __obj.updateDynamic("SupportedDeploymentModes")(SupportedDeploymentModes.asInstanceOf[js.Any])
    if (SupportedEngineVersions != null) __obj.updateDynamic("SupportedEngineVersions")(SupportedEngineVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrokerInstanceOption]
  }
}

