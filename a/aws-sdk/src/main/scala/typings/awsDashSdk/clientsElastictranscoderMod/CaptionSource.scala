package typings.awsDashSdk.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionSource extends js.Object {
  /**
    * The encryption settings, if any, that Elastic Transcoder needs to decyrpt your caption sources, or that you want Elastic Transcoder to apply to your caption sources.
    */
  var Encryption: js.UndefOr[typings.awsDashSdk.clientsElastictranscoderMod.Encryption] = js.undefined
  /**
    * The name of the sidecar caption file that you want Elastic Transcoder to include in the output file.
    */
  var Key: js.UndefOr[LongKey] = js.undefined
  /**
    * The label of the caption shown in the player when choosing a language. We recommend that you put the caption language name here, in the language of the captions.
    */
  var Label: js.UndefOr[Name] = js.undefined
  /**
    * A string that specifies the language of the caption. If you specified multiple inputs with captions, the caption language must match in order to be included in the output. Specify this as one of:   2-character ISO 639-1 code   3-character ISO 639-2 code   For more information on ISO language codes and language names, see the List of ISO 639-1 codes.
    */
  var Language: js.UndefOr[Key] = js.undefined
  /**
    * For clip generation or captions that do not start at the same time as the associated video file, the TimeOffset tells Elastic Transcoder how much of the video to encode before including captions. Specify the TimeOffset in the form [+-]SS.sss or [+-]HH:mm:SS.ss.
    */
  var TimeOffset: js.UndefOr[typings.awsDashSdk.clientsElastictranscoderMod.TimeOffset] = js.undefined
}

object CaptionSource {
  @scala.inline
  def apply(
    Encryption: Encryption = null,
    Key: LongKey = null,
    Label: Name = null,
    Language: Key = null,
    TimeOffset: TimeOffset = null
  ): CaptionSource = {
    val __obj = js.Dynamic.literal()
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption)
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (Label != null) __obj.updateDynamic("Label")(Label)
    if (Language != null) __obj.updateDynamic("Language")(Language)
    if (TimeOffset != null) __obj.updateDynamic("TimeOffset")(TimeOffset)
    __obj.asInstanceOf[CaptionSource]
  }
}

