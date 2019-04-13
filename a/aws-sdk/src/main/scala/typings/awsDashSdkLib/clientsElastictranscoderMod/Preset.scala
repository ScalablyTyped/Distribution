package typings
package awsDashSdkLib.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Preset extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the preset.
    */
  var Arn: js.UndefOr[String] = js.undefined
  /**
    * A section of the response body that provides information about the audio preset values.
    */
  var Audio: js.UndefOr[AudioParameters] = js.undefined
  /**
    * The container type for the output file. Valid values include flac, flv, fmp4, gif, mp3, mp4, mpg, mxf, oga, ogg, ts, and webm.
    */
  var Container: js.UndefOr[PresetContainer] = js.undefined
  /**
    * A description of the preset.
    */
  var Description: js.UndefOr[Description] = js.undefined
  /**
    * Identifier for the new preset. You use this value to get settings for the preset or to delete it.
    */
  var Id: js.UndefOr[Id] = js.undefined
  /**
    * The name of the preset.
    */
  var Name: js.UndefOr[Name] = js.undefined
  /**
    * A section of the response body that provides information about the thumbnail preset values, if any.
    */
  var Thumbnails: js.UndefOr[Thumbnails] = js.undefined
  /**
    * Whether the preset is a default preset provided by Elastic Transcoder (System) or a preset that you have defined (Custom).
    */
  var Type: js.UndefOr[PresetType] = js.undefined
  /**
    * A section of the response body that provides information about the video preset values.
    */
  var Video: js.UndefOr[VideoParameters] = js.undefined
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
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (Audio != null) __obj.updateDynamic("Audio")(Audio)
    if (Container != null) __obj.updateDynamic("Container")(Container)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Thumbnails != null) __obj.updateDynamic("Thumbnails")(Thumbnails)
    if (Type != null) __obj.updateDynamic("Type")(Type)
    if (Video != null) __obj.updateDynamic("Video")(Video)
    __obj.asInstanceOf[Preset]
  }
}

