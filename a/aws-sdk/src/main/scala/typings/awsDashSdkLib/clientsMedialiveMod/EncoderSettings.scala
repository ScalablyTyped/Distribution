package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncoderSettings extends js.Object {
  var AudioDescriptions: __listOfAudioDescription
  /**
    * Settings for ad avail blanking.
    */
  var AvailBlanking: js.UndefOr[AvailBlanking] = js.undefined
  /**
    * Event-wide configuration settings for ad avail insertion.
    */
  var AvailConfiguration: js.UndefOr[AvailConfiguration] = js.undefined
  /**
    * Settings for blackout slate.
    */
  var BlackoutSlate: js.UndefOr[BlackoutSlate] = js.undefined
  /**
    * Settings for caption decriptions
    */
  var CaptionDescriptions: js.UndefOr[__listOfCaptionDescription] = js.undefined
  /**
    * Configuration settings that apply to the event as a whole.
    */
  var GlobalConfiguration: js.UndefOr[GlobalConfiguration] = js.undefined
  var OutputGroups: __listOfOutputGroup
  /**
    * Contains settings used to acquire and adjust timecode information from inputs.
    */
  var TimecodeConfig: awsDashSdkLib.clientsMedialiveMod.TimecodeConfig
  var VideoDescriptions: __listOfVideoDescription
}

object EncoderSettings {
  @scala.inline
  def apply(
    AudioDescriptions: __listOfAudioDescription,
    OutputGroups: __listOfOutputGroup,
    TimecodeConfig: TimecodeConfig,
    VideoDescriptions: __listOfVideoDescription,
    AvailBlanking: AvailBlanking = null,
    AvailConfiguration: AvailConfiguration = null,
    BlackoutSlate: BlackoutSlate = null,
    CaptionDescriptions: __listOfCaptionDescription = null,
    GlobalConfiguration: GlobalConfiguration = null
  ): EncoderSettings = {
    val __obj = js.Dynamic.literal(AudioDescriptions = AudioDescriptions, OutputGroups = OutputGroups, TimecodeConfig = TimecodeConfig, VideoDescriptions = VideoDescriptions)
    if (AvailBlanking != null) __obj.updateDynamic("AvailBlanking")(AvailBlanking)
    if (AvailConfiguration != null) __obj.updateDynamic("AvailConfiguration")(AvailConfiguration)
    if (BlackoutSlate != null) __obj.updateDynamic("BlackoutSlate")(BlackoutSlate)
    if (CaptionDescriptions != null) __obj.updateDynamic("CaptionDescriptions")(CaptionDescriptions)
    if (GlobalConfiguration != null) __obj.updateDynamic("GlobalConfiguration")(GlobalConfiguration)
    __obj.asInstanceOf[EncoderSettings]
  }
}

