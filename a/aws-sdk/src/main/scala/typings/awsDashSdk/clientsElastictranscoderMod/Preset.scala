package typings.awsDashSdk.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Preset extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the preset.
    */
  var Arn: js.UndefOr[String] = js.native
  /**
    * A section of the response body that provides information about the audio preset values.
    */
  var Audio: js.UndefOr[AudioParameters] = js.native
  /**
    * The container type for the output file. Valid values include flac, flv, fmp4, gif, mp3, mp4, mpg, mxf, oga, ogg, ts, and webm.
    */
  var Container: js.UndefOr[PresetContainer] = js.native
  /**
    * A description of the preset.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsElastictranscoderMod.Description] = js.native
  /**
    * Identifier for the new preset. You use this value to get settings for the preset or to delete it.
    */
  var Id: js.UndefOr[typings.awsDashSdk.clientsElastictranscoderMod.Id] = js.native
  /**
    * The name of the preset.
    */
  var Name: js.UndefOr[typings.awsDashSdk.clientsElastictranscoderMod.Name] = js.native
  /**
    * A section of the response body that provides information about the thumbnail preset values, if any.
    */
  var Thumbnails: js.UndefOr[typings.awsDashSdk.clientsElastictranscoderMod.Thumbnails] = js.native
  /**
    * Whether the preset is a default preset provided by Elastic Transcoder (System) or a preset that you have defined (Custom).
    */
  var Type: js.UndefOr[PresetType] = js.native
  /**
    * A section of the response body that provides information about the video preset values.
    */
  var Video: js.UndefOr[VideoParameters] = js.native
}

object Preset {
  @scala.inline
  def apply(
    Arn: String = null,
    Audio: AudioParameters = null,
    Container: PresetContainer = null,
    Description: Description = null,
    Id: Id = null,
    Name: Name = null,
    Thumbnails: Thumbnails = null,
    Type: PresetType = null,
    Video: VideoParameters = null
  ): Preset = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (Audio != null) __obj.updateDynamic("Audio")(Audio.asInstanceOf[js.Any])
    if (Container != null) __obj.updateDynamic("Container")(Container.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Thumbnails != null) __obj.updateDynamic("Thumbnails")(Thumbnails.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (Video != null) __obj.updateDynamic("Video")(Video.asInstanceOf[js.Any])
    __obj.asInstanceOf[Preset]
  }
}

