package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobTemplateSettings extends js.Object {
  /**
    * When specified, this offset (in milliseconds) is added to the input Ad Avail PTS time.
    */
  var AdAvailOffset: js.UndefOr[__integerMinNegative1000Max1000] = js.undefined
  /**
    * Settings for ad avail blanking.  Video can be blanked or overlaid with an image, and audio muted during SCTE-35 triggered ad avails.
    */
  var AvailBlanking: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.AvailBlanking] = js.undefined
  /**
    * Settings for Event Signaling And Messaging (ESAM).
    */
  var Esam: js.UndefOr[EsamSettings] = js.undefined
  /**
    * Use Inputs (inputs) to define the source file used in the transcode job. There can only be one input in a job template.  Using the API, you can include multiple inputs when referencing a job template.
    */
  var Inputs: js.UndefOr[__listOfInputTemplate] = js.undefined
  /**
    * Overlay motion graphics on top of your video. The motion graphics that you specify here appear on all outputs in all output groups.
    */
  var MotionImageInserter: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.MotionImageInserter] = js.undefined
  /**
    * Settings for your Nielsen configuration. If you don't do Nielsen measurement and analytics, ignore these settings. When you enable Nielsen configuration (nielsenConfiguration), MediaConvert enables PCM to ID3 tagging for all outputs in the job. To enable Nielsen configuration programmatically, include an instance of nielsenConfiguration in your JSON job specification. Even if you don't include any children of nielsenConfiguration, you still enable the setting.
    */
  var NielsenConfiguration: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.NielsenConfiguration] = js.undefined
  /**
    * (OutputGroups) contains one group of settings for each set of outputs that share a common package type. All unpackaged files (MPEG-4, MPEG-2 TS, Quicktime, MXF, and no container) are grouped in a single output group as well. Required in (OutputGroups) is a group of settings that apply to the whole group. This required object depends on the value you set for (Type) under (OutputGroups)>(OutputGroupSettings). Type, settings object pairs are as follows. * FILE_GROUP_SETTINGS, FileGroupSettings * HLS_GROUP_SETTINGS, HlsGroupSettings * DASH_ISO_GROUP_SETTINGS, DashIsoGroupSettings * MS_SMOOTH_GROUP_SETTINGS, MsSmoothGroupSettings * CMAF_GROUP_SETTINGS, CmafGroupSettings
    */
  var OutputGroups: js.UndefOr[__listOfOutputGroup] = js.undefined
  /**
    * Contains settings used to acquire and adjust timecode information from inputs.
    */
  var TimecodeConfig: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.TimecodeConfig] = js.undefined
  /**
    * Enable Timed metadata insertion (TimedMetadataInsertion) to include ID3 tags in your job. To include timed metadata, you must enable it here, enable it in each output container, and specify tags and timecodes in ID3 insertion (Id3Insertion) objects.
    */
  var TimedMetadataInsertion: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.TimedMetadataInsertion] = js.undefined
}

object JobTemplateSettings {
  @scala.inline
  def apply(
    AdAvailOffset: Int | Double = null,
    AvailBlanking: AvailBlanking = null,
    Esam: EsamSettings = null,
    Inputs: __listOfInputTemplate = null,
    MotionImageInserter: MotionImageInserter = null,
    NielsenConfiguration: NielsenConfiguration = null,
    OutputGroups: __listOfOutputGroup = null,
    TimecodeConfig: TimecodeConfig = null,
    TimedMetadataInsertion: TimedMetadataInsertion = null
  ): JobTemplateSettings = {
    val __obj = js.Dynamic.literal()
    if (AdAvailOffset != null) __obj.updateDynamic("AdAvailOffset")(AdAvailOffset.asInstanceOf[js.Any])
    if (AvailBlanking != null) __obj.updateDynamic("AvailBlanking")(AvailBlanking)
    if (Esam != null) __obj.updateDynamic("Esam")(Esam)
    if (Inputs != null) __obj.updateDynamic("Inputs")(Inputs)
    if (MotionImageInserter != null) __obj.updateDynamic("MotionImageInserter")(MotionImageInserter)
    if (NielsenConfiguration != null) __obj.updateDynamic("NielsenConfiguration")(NielsenConfiguration)
    if (OutputGroups != null) __obj.updateDynamic("OutputGroups")(OutputGroups)
    if (TimecodeConfig != null) __obj.updateDynamic("TimecodeConfig")(TimecodeConfig)
    if (TimedMetadataInsertion != null) __obj.updateDynamic("TimedMetadataInsertion")(TimedMetadataInsertion)
    __obj.asInstanceOf[JobTemplateSettings]
  }
}

