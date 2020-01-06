package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DolbyVision extends js.Object {
  /**
    * Use these settings when you set DolbyVisionLevel6Mode to SPECIFY to override the MaxCLL and MaxFALL values in your input with new values.
    */
  var L6Metadata: js.UndefOr[DolbyVisionLevel6Metadata] = js.native
  /**
    * Use Dolby Vision Mode to choose how the service will handle Dolby Vision MaxCLL and MaxFALL properies.
    */
  var L6Mode: js.UndefOr[DolbyVisionLevel6Mode] = js.native
  /**
    * In the current MediaConvert implementation, the Dolby Vision profile is always 5 (PROFILE_5). Therefore, all of your inputs must contain Dolby Vision frame interleaved data.
    */
  var Profile: js.UndefOr[DolbyVisionProfile] = js.native
}

object DolbyVision {
  @scala.inline
  def apply(
    L6Metadata: DolbyVisionLevel6Metadata = null,
    L6Mode: DolbyVisionLevel6Mode = null,
    Profile: DolbyVisionProfile = null
  ): DolbyVision = {
    val __obj = js.Dynamic.literal()
    if (L6Metadata != null) __obj.updateDynamic("L6Metadata")(L6Metadata.asInstanceOf[js.Any])
    if (L6Mode != null) __obj.updateDynamic("L6Mode")(L6Mode.asInstanceOf[js.Any])
    if (Profile != null) __obj.updateDynamic("Profile")(Profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[DolbyVision]
  }
}

