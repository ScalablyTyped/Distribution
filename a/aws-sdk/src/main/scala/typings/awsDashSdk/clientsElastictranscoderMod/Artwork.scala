package typings.awsDashSdk.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Artwork extends js.Object {
  /**
    * The format of album art, if any. Valid formats are .jpg and .png.
    */
  var AlbumArtFormat: js.UndefOr[JpgOrPng] = js.native
  /**
    * The encryption settings, if any, that you want Elastic Transcoder to apply to your artwork.
    */
  var Encryption: js.UndefOr[typings.awsDashSdk.clientsElastictranscoderMod.Encryption] = js.native
  /**
    * The name of the file to be used as album art. To determine which Amazon S3 bucket contains the specified file, Elastic Transcoder checks the pipeline specified by PipelineId; the InputBucket object in that pipeline identifies the bucket. If the file name includes a prefix, for example, cooking/pie.jpg, include the prefix in the key. If the file isn't in the specified bucket, Elastic Transcoder returns an error.
    */
  var InputKey: js.UndefOr[WatermarkKey] = js.native
  /**
    * The maximum height of the output album art in pixels. If you specify auto, Elastic Transcoder uses 600 as the default value. If you specify a numeric value, enter an even integer between 32 and 3072, inclusive.
    */
  var MaxHeight: js.UndefOr[DigitsOrAuto] = js.native
  /**
    * The maximum width of the output album art in pixels. If you specify auto, Elastic Transcoder uses 600 as the default value. If you specify a numeric value, enter an even integer between 32 and 4096, inclusive.
    */
  var MaxWidth: js.UndefOr[DigitsOrAuto] = js.native
  /**
    * When you set PaddingPolicy to Pad, Elastic Transcoder may add white bars to the top and bottom and/or left and right sides of the output album art to make the total size of the output art match the values that you specified for MaxWidth and MaxHeight.
    */
  var PaddingPolicy: js.UndefOr[typings.awsDashSdk.clientsElastictranscoderMod.PaddingPolicy] = js.native
  /**
    * Specify one of the following values to control scaling of the output album art:    Fit: Elastic Transcoder scales the output art so it matches the value that you specified in either MaxWidth or MaxHeight without exceeding the other value.    Fill: Elastic Transcoder scales the output art so it matches the value that you specified in either MaxWidth or MaxHeight and matches or exceeds the other value. Elastic Transcoder centers the output art and then crops it in the dimension (if any) that exceeds the maximum value.     Stretch: Elastic Transcoder stretches the output art to match the values that you specified for MaxWidth and MaxHeight. If the relative proportions of the input art and the output art are different, the output art will be distorted.    Keep: Elastic Transcoder does not scale the output art. If either dimension of the input art exceeds the values that you specified for MaxWidth and MaxHeight, Elastic Transcoder crops the output art.    ShrinkToFit: Elastic Transcoder scales the output art down so that its dimensions match the values that you specified for at least one of MaxWidth and MaxHeight without exceeding either value. If you specify this option, Elastic Transcoder does not scale the art up.    ShrinkToFill Elastic Transcoder scales the output art down so that its dimensions match the values that you specified for at least one of MaxWidth and MaxHeight without dropping below either value. If you specify this option, Elastic Transcoder does not scale the art up.  
    */
  var SizingPolicy: js.UndefOr[typings.awsDashSdk.clientsElastictranscoderMod.SizingPolicy] = js.native
}

object Artwork {
  @scala.inline
  def apply(
    AlbumArtFormat: JpgOrPng = null,
    Encryption: Encryption = null,
    InputKey: WatermarkKey = null,
    MaxHeight: DigitsOrAuto = null,
    MaxWidth: DigitsOrAuto = null,
    PaddingPolicy: PaddingPolicy = null,
    SizingPolicy: SizingPolicy = null
  ): Artwork = {
    val __obj = js.Dynamic.literal()
    if (AlbumArtFormat != null) __obj.updateDynamic("AlbumArtFormat")(AlbumArtFormat.asInstanceOf[js.Any])
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption.asInstanceOf[js.Any])
    if (InputKey != null) __obj.updateDynamic("InputKey")(InputKey.asInstanceOf[js.Any])
    if (MaxHeight != null) __obj.updateDynamic("MaxHeight")(MaxHeight.asInstanceOf[js.Any])
    if (MaxWidth != null) __obj.updateDynamic("MaxWidth")(MaxWidth.asInstanceOf[js.Any])
    if (PaddingPolicy != null) __obj.updateDynamic("PaddingPolicy")(PaddingPolicy.asInstanceOf[js.Any])
    if (SizingPolicy != null) __obj.updateDynamic("SizingPolicy")(SizingPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Artwork]
  }
}

