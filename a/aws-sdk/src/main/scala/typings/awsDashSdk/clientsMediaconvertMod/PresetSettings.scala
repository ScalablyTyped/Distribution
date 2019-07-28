package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PresetSettings extends js.Object {
  /**
    * (AudioDescriptions) contains groups of audio encoding settings organized by audio codec. Include one instance of (AudioDescriptions) per output. (AudioDescriptions) can contain multiple groups of encoding settings.
    */
  var AudioDescriptions: js.UndefOr[__listOfAudioDescription] = js.undefined
  /**
    * Caption settings for this preset. There can be multiple caption settings in a single output.
    */
  var CaptionDescriptions: js.UndefOr[__listOfCaptionDescriptionPreset] = js.undefined
  /**
    * Container specific settings.
    */
  var ContainerSettings: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.ContainerSettings] = js.undefined
  /**
    * (VideoDescription) contains a group of video encoding settings. The specific video settings depend on the video codec that you choose when you specify a value for Video codec (codec). Include one instance of (VideoDescription) per output.
    */
  var VideoDescription: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.VideoDescription] = js.undefined
}

object PresetSettings {
  @scala.inline
  def apply(
    AudioDescriptions: __listOfAudioDescription = null,
    CaptionDescriptions: __listOfCaptionDescriptionPreset = null,
    ContainerSettings: ContainerSettings = null,
    VideoDescription: VideoDescription = null
  ): PresetSettings = {
    val __obj = js.Dynamic.literal()
    if (AudioDescriptions != null) __obj.updateDynamic("AudioDescriptions")(AudioDescriptions)
    if (CaptionDescriptions != null) __obj.updateDynamic("CaptionDescriptions")(CaptionDescriptions)
    if (ContainerSettings != null) __obj.updateDynamic("ContainerSettings")(ContainerSettings)
    if (VideoDescription != null) __obj.updateDynamic("VideoDescription")(VideoDescription)
    __obj.asInstanceOf[PresetSettings]
  }
}

