package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateProfileRequest extends js.Object {
  /**
    * The updated address for the room profile.
    */
  var Address: js.UndefOr[Address] = js.undefined
  /**
    * The updated distance unit for the room profile.
    */
  var DistanceUnit: js.UndefOr[DistanceUnit] = js.undefined
  /**
    * Sets the profile as default if selected. If this is missing, no update is done to the default status.
    */
  var IsDefault: js.UndefOr[Boolean] = js.undefined
  /**
    * The updated maximum volume limit for the room profile.
    */
  var MaxVolumeLimit: js.UndefOr[MaxVolumeLimit] = js.undefined
  /**
    * Whether the PSTN setting of the room profile is enabled.
    */
  var PSTNEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The ARN of the room profile to update. Required.
    */
  var ProfileArn: js.UndefOr[Arn] = js.undefined
  /**
    * The updated name for the room profile.
    */
  var ProfileName: js.UndefOr[ProfileName] = js.undefined
  /**
    * Whether the setup mode of the profile is enabled.
    */
  var SetupModeDisabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The updated temperature unit for the room profile.
    */
  var TemperatureUnit: js.UndefOr[TemperatureUnit] = js.undefined
  /**
    * The updated timezone for the room profile.
    */
  var Timezone: js.UndefOr[Timezone] = js.undefined
  /**
    * The updated wake word for the room profile.
    */
  var WakeWord: js.UndefOr[WakeWord] = js.undefined
}

object UpdateProfileRequest {
  @scala.inline
  def apply(
    Address: Address = null,
    DistanceUnit: DistanceUnit = null,
    IsDefault: js.UndefOr[Boolean] = js.undefined,
    MaxVolumeLimit: js.UndefOr[MaxVolumeLimit] = js.undefined,
    PSTNEnabled: js.UndefOr[Boolean] = js.undefined,
    ProfileArn: Arn = null,
    ProfileName: ProfileName = null,
    SetupModeDisabled: js.UndefOr[Boolean] = js.undefined,
    TemperatureUnit: TemperatureUnit = null,
    Timezone: Timezone = null,
    WakeWord: WakeWord = null
  ): UpdateProfileRequest = {
    val __obj = js.Dynamic.literal()
    if (Address != null) __obj.updateDynamic("Address")(Address)
    if (DistanceUnit != null) __obj.updateDynamic("DistanceUnit")(DistanceUnit.asInstanceOf[js.Any])
    if (!js.isUndefined(IsDefault)) __obj.updateDynamic("IsDefault")(IsDefault)
    if (!js.isUndefined(MaxVolumeLimit)) __obj.updateDynamic("MaxVolumeLimit")(MaxVolumeLimit)
    if (!js.isUndefined(PSTNEnabled)) __obj.updateDynamic("PSTNEnabled")(PSTNEnabled)
    if (ProfileArn != null) __obj.updateDynamic("ProfileArn")(ProfileArn)
    if (ProfileName != null) __obj.updateDynamic("ProfileName")(ProfileName)
    if (!js.isUndefined(SetupModeDisabled)) __obj.updateDynamic("SetupModeDisabled")(SetupModeDisabled)
    if (TemperatureUnit != null) __obj.updateDynamic("TemperatureUnit")(TemperatureUnit.asInstanceOf[js.Any])
    if (Timezone != null) __obj.updateDynamic("Timezone")(Timezone)
    if (WakeWord != null) __obj.updateDynamic("WakeWord")(WakeWord.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProfileRequest]
  }
}

