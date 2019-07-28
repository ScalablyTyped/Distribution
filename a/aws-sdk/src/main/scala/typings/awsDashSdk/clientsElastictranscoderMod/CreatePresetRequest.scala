package typings.awsDashSdk.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePresetRequest extends js.Object {
  /**
    * A section of the request body that specifies the audio parameters.
    */
  var Audio: js.UndefOr[AudioParameters] = js.undefined
  /**
    * The container type for the output file. Valid values include flac, flv, fmp4, gif, mp3, mp4, mpg, mxf, oga, ogg, ts, and webm.
    */
  var Container: PresetContainer
  /**
    * A description of the preset.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsElastictranscoderMod.Description] = js.undefined
  /**
    * The name of the preset. We recommend that the name be unique within the AWS account, but uniqueness is not enforced.
    */
  var Name: typings.awsDashSdk.clientsElastictranscoderMod.Name
  /**
    * A section of the request body that specifies the thumbnail parameters, if any.
    */
  var Thumbnails: js.UndefOr[typings.awsDashSdk.clientsElastictranscoderMod.Thumbnails] = js.undefined
  /**
    * A section of the request body that specifies the video parameters.
    */
  var Video: js.UndefOr[VideoParameters] = js.undefined
}

object CreatePresetRequest {
  @scala.inline
  def apply(
    Container: PresetContainer,
    Name: Name,
    Audio: AudioParameters = null,
    Description: Description = null,
    Thumbnails: Thumbnails = null,
    Video: VideoParameters = null
  ): CreatePresetRequest = {
    val __obj = js.Dynamic.literal(Container = Container, Name = Name)
    if (Audio != null) __obj.updateDynamic("Audio")(Audio)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Thumbnails != null) __obj.updateDynamic("Thumbnails")(Thumbnails)
    if (Video != null) __obj.updateDynamic("Video")(Video)
    __obj.asInstanceOf[CreatePresetRequest]
  }
}

