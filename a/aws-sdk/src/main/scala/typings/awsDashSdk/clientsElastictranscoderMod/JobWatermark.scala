package typings.awsDashSdk.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobWatermark extends js.Object {
  /**
    * The encryption settings, if any, that you want Elastic Transcoder to apply to your watermarks.
    */
  var Encryption: js.UndefOr[typings.awsDashSdk.clientsElastictranscoderMod.Encryption] = js.undefined
  /**
    *  The name of the .png or .jpg file that you want to use for the watermark. To determine which Amazon S3 bucket contains the specified file, Elastic Transcoder checks the pipeline specified by Pipeline; the Input Bucket object in that pipeline identifies the bucket.  If the file name includes a prefix, for example, logos/128x64.png, include the prefix in the key. If the file isn't in the specified bucket, Elastic Transcoder returns an error. 
    */
  var InputKey: js.UndefOr[WatermarkKey] = js.undefined
  /**
    * The ID of the watermark settings that Elastic Transcoder uses to add watermarks to the video during transcoding. The settings are in the preset specified by Preset for the current output. In that preset, the value of Watermarks Id tells Elastic Transcoder which settings to use.
    */
  var PresetWatermarkId: js.UndefOr[typings.awsDashSdk.clientsElastictranscoderMod.PresetWatermarkId] = js.undefined
}

object JobWatermark {
  @scala.inline
  def apply(
    Encryption: Encryption = null,
    InputKey: WatermarkKey = null,
    PresetWatermarkId: PresetWatermarkId = null
  ): JobWatermark = {
    val __obj = js.Dynamic.literal()
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption)
    if (InputKey != null) __obj.updateDynamic("InputKey")(InputKey)
    if (PresetWatermarkId != null) __obj.updateDynamic("PresetWatermarkId")(PresetWatermarkId)
    __obj.asInstanceOf[JobWatermark]
  }
}

