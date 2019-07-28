package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  /**
    * The device's ARN.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.undefined
  /**
    * Reflects how likely a device will be available for a test run. It is currently available in the ListDevices and GetDevice API methods.
    */
  var availability: js.UndefOr[DeviceAvailability] = js.undefined
  /**
    * The device's carrier.
    */
  var carrier: js.UndefOr[String] = js.undefined
  /**
    * Information about the device's CPU.
    */
  var cpu: js.UndefOr[CPU] = js.undefined
  /**
    * The name of the fleet to which this device belongs.
    */
  var fleetName: js.UndefOr[String] = js.undefined
  /**
    * The type of fleet to which this device belongs. Possible values for fleet type are PRIVATE and PUBLIC.
    */
  var fleetType: js.UndefOr[String] = js.undefined
  /**
    * The device's form factor. Allowed values include:   PHONE: The phone form factor.   TABLET: The tablet form factor.  
    */
  var formFactor: js.UndefOr[DeviceFormFactor] = js.undefined
  /**
    * The device's heap size, expressed in bytes.
    */
  var heapSize: js.UndefOr[Long] = js.undefined
  /**
    * The device's image name.
    */
  var image: js.UndefOr[String] = js.undefined
  /**
    * The instances belonging to this device.
    */
  var instances: js.UndefOr[DeviceInstances] = js.undefined
  /**
    * The device's manufacturer name.
    */
  var manufacturer: js.UndefOr[String] = js.undefined
  /**
    * The device's total memory size, expressed in bytes.
    */
  var memory: js.UndefOr[Long] = js.undefined
  /**
    * The device's model name.
    */
  var model: js.UndefOr[String] = js.undefined
  /**
    * The device's model ID.
    */
  var modelId: js.UndefOr[String] = js.undefined
  /**
    * The device's display name.
    */
  var name: js.UndefOr[Name] = js.undefined
  /**
    * The device's operating system type.
    */
  var os: js.UndefOr[String] = js.undefined
  /**
    * The device's platform. Allowed values include:   ANDROID: The Android platform.   IOS: The iOS platform.  
    */
  var platform: js.UndefOr[DevicePlatform] = js.undefined
  /**
    * The device's radio.
    */
  var radio: js.UndefOr[String] = js.undefined
  /**
    * Specifies whether remote access has been enabled for the specified device.
    */
  var remoteAccessEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * This flag is set to true if remote debugging is enabled for the device.
    */
  var remoteDebugEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The resolution of the device.
    */
  var resolution: js.UndefOr[Resolution] = js.undefined
}

object Device {
  @scala.inline
  def apply(
    arn: AmazonResourceName = null,
    availability: DeviceAvailability = null,
    carrier: String = null,
    cpu: CPU = null,
    fleetName: String = null,
    fleetType: String = null,
    formFactor: DeviceFormFactor = null,
    heapSize: js.UndefOr[Long] = js.undefined,
    image: String = null,
    instances: DeviceInstances = null,
    manufacturer: String = null,
    memory: js.UndefOr[Long] = js.undefined,
    model: String = null,
    modelId: String = null,
    name: Name = null,
    os: String = null,
    platform: DevicePlatform = null,
    radio: String = null,
    remoteAccessEnabled: js.UndefOr[Boolean] = js.undefined,
    remoteDebugEnabled: js.UndefOr[Boolean] = js.undefined,
    resolution: Resolution = null
  ): Device = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (availability != null) __obj.updateDynamic("availability")(availability.asInstanceOf[js.Any])
    if (carrier != null) __obj.updateDynamic("carrier")(carrier)
    if (cpu != null) __obj.updateDynamic("cpu")(cpu)
    if (fleetName != null) __obj.updateDynamic("fleetName")(fleetName)
    if (fleetType != null) __obj.updateDynamic("fleetType")(fleetType)
    if (formFactor != null) __obj.updateDynamic("formFactor")(formFactor.asInstanceOf[js.Any])
    if (!js.isUndefined(heapSize)) __obj.updateDynamic("heapSize")(heapSize)
    if (image != null) __obj.updateDynamic("image")(image)
    if (instances != null) __obj.updateDynamic("instances")(instances)
    if (manufacturer != null) __obj.updateDynamic("manufacturer")(manufacturer)
    if (!js.isUndefined(memory)) __obj.updateDynamic("memory")(memory)
    if (model != null) __obj.updateDynamic("model")(model)
    if (modelId != null) __obj.updateDynamic("modelId")(modelId)
    if (name != null) __obj.updateDynamic("name")(name)
    if (os != null) __obj.updateDynamic("os")(os)
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (radio != null) __obj.updateDynamic("radio")(radio)
    if (!js.isUndefined(remoteAccessEnabled)) __obj.updateDynamic("remoteAccessEnabled")(remoteAccessEnabled)
    if (!js.isUndefined(remoteDebugEnabled)) __obj.updateDynamic("remoteDebugEnabled")(remoteDebugEnabled)
    if (resolution != null) __obj.updateDynamic("resolution")(resolution)
    __obj.asInstanceOf[Device]
  }
}

