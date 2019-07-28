package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Output extends js.Object {
  /**
    * The names of the AudioDescriptions used as audio sources for this output.
    */
  var AudioDescriptionNames: js.UndefOr[__listOf__string] = js.undefined
  /**
    * The names of the CaptionDescriptions used as caption sources for this output.
    */
  var CaptionDescriptionNames: js.UndefOr[__listOf__string] = js.undefined
  /**
    * The name used to identify an output.
    */
  var OutputName: js.UndefOr[__stringMin1Max255] = js.undefined
  /**
    * Output type-specific settings.
    */
  var OutputSettings: typings.awsDashSdk.clientsMedialiveMod.OutputSettings
  /**
    * The name of the VideoDescription used as the source for this output.
    */
  var VideoDescriptionName: js.UndefOr[__string] = js.undefined
}

object Output {
  @scala.inline
  def apply(
    OutputSettings: OutputSettings,
    AudioDescriptionNames: __listOf__string = null,
    CaptionDescriptionNames: __listOf__string = null,
    OutputName: __stringMin1Max255 = null,
    VideoDescriptionName: __string = null
  ): Output = {
    val __obj = js.Dynamic.literal(OutputSettings = OutputSettings)
    if (AudioDescriptionNames != null) __obj.updateDynamic("AudioDescriptionNames")(AudioDescriptionNames)
    if (CaptionDescriptionNames != null) __obj.updateDynamic("CaptionDescriptionNames")(CaptionDescriptionNames)
    if (OutputName != null) __obj.updateDynamic("OutputName")(OutputName)
    if (VideoDescriptionName != null) __obj.updateDynamic("VideoDescriptionName")(VideoDescriptionName)
    __obj.asInstanceOf[Output]
  }
}

