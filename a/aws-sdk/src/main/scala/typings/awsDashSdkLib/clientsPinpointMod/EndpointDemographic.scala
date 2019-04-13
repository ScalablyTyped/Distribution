package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointDemographic extends js.Object {
  /**
    * The version of the application associated with the endpoint.
    */
  var AppVersion: js.UndefOr[__string] = js.undefined
  /**
    * The endpoint locale in the following format: The ISO 639-1 alpha-2 code, followed by an underscore, followed by an ISO 3166-1 alpha-2 value.
    */
  var Locale: js.UndefOr[__string] = js.undefined
  /**
    * The manufacturer of the endpoint device, such as Apple or Samsung.
    */
  var Make: js.UndefOr[__string] = js.undefined
  /**
    * The model name or number of the endpoint device, such as iPhone.
    */
  var Model: js.UndefOr[__string] = js.undefined
  /**
    * The model version of the endpoint device.
    */
  var ModelVersion: js.UndefOr[__string] = js.undefined
  /**
    * The platform of the endpoint device, such as iOS or Android.
    */
  var Platform: js.UndefOr[__string] = js.undefined
  /**
    * The platform version of the endpoint device.
    */
  var PlatformVersion: js.UndefOr[__string] = js.undefined
  /**
    * The timezone of the endpoint. Specified as a tz database value, such as Americas/Los_Angeles.
    */
  var Timezone: js.UndefOr[__string] = js.undefined
}

object EndpointDemographic {
  @scala.inline
  def apply(
    AppVersion: __string = null,
    Locale: __string = null,
    Make: __string = null,
    Model: __string = null,
    ModelVersion: __string = null,
    Platform: __string = null,
    PlatformVersion: __string = null,
    Timezone: __string = null
  ): EndpointDemographic = {
    val __obj = js.Dynamic.literal()
    if (AppVersion != null) __obj.updateDynamic("AppVersion")(AppVersion)
    if (Locale != null) __obj.updateDynamic("Locale")(Locale)
    if (Make != null) __obj.updateDynamic("Make")(Make)
    if (Model != null) __obj.updateDynamic("Model")(Model)
    if (ModelVersion != null) __obj.updateDynamic("ModelVersion")(ModelVersion)
    if (Platform != null) __obj.updateDynamic("Platform")(Platform)
    if (PlatformVersion != null) __obj.updateDynamic("PlatformVersion")(PlatformVersion)
    if (Timezone != null) __obj.updateDynamic("Timezone")(Timezone)
    __obj.asInstanceOf[EndpointDemographic]
  }
}

