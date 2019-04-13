package typings
package awsDashSdkLib.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Thumbnails extends js.Object {
  /**
    *  To better control resolution and aspect ratio of thumbnails, we recommend that you use the values MaxWidth, MaxHeight, SizingPolicy, and PaddingPolicy instead of Resolution and AspectRatio. The two groups of settings are mutually exclusive. Do not use them together.  The aspect ratio of thumbnails. Valid values include:  auto, 1:1, 4:3, 3:2, 16:9  If you specify auto, Elastic Transcoder tries to preserve the aspect ratio of the video in the output file.
    */
  var AspectRatio: js.UndefOr[AspectRatio] = js.undefined
  /**
    * The format of thumbnails, if any. Valid values are jpg and png.  You specify whether you want Elastic Transcoder to create thumbnails when you create a job.
    */
  var Format: js.UndefOr[JpgOrPng] = js.undefined
  /**
    * The approximate number of seconds between thumbnails. Specify an integer value.
    */
  var Interval: js.UndefOr[Digits] = js.undefined
  /**
    * The maximum height of thumbnails in pixels. If you specify auto, Elastic Transcoder uses 1080 (Full HD) as the default value. If you specify a numeric value, enter an even integer between 32 and 3072.
    */
  var MaxHeight: js.UndefOr[DigitsOrAuto] = js.undefined
  /**
    * The maximum width of thumbnails in pixels. If you specify auto, Elastic Transcoder uses 1920 (Full HD) as the default value. If you specify a numeric value, enter an even integer between 32 and 4096.
    */
  var MaxWidth: js.UndefOr[DigitsOrAuto] = js.undefined
  /**
    * When you set PaddingPolicy to Pad, Elastic Transcoder may add black bars to the top and bottom and/or left and right sides of thumbnails to make the total size of the thumbnails match the values that you specified for thumbnail MaxWidth and MaxHeight settings.
    */
  var PaddingPolicy: js.UndefOr[PaddingPolicy] = js.undefined
  /**
    *  To better control resolution and aspect ratio of thumbnails, we recommend that you use the values MaxWidth, MaxHeight, SizingPolicy, and PaddingPolicy instead of Resolution and AspectRatio. The two groups of settings are mutually exclusive. Do not use them together.  The width and height of thumbnail files in pixels. Specify a value in the format  width  x  height  where both values are even integers. The values cannot exceed the width and height that you specified in the Video:Resolution object.
    */
  var Resolution: js.UndefOr[ThumbnailResolution] = js.undefined
  /**
    * Specify one of the following values to control scaling of thumbnails:    Fit: Elastic Transcoder scales thumbnails so they match the value that you specified in thumbnail MaxWidth or MaxHeight settings without exceeding the other value.     Fill: Elastic Transcoder scales thumbnails so they match the value that you specified in thumbnail MaxWidth or MaxHeight settings and matches or exceeds the other value. Elastic Transcoder centers the image in thumbnails and then crops in the dimension (if any) that exceeds the maximum value.    Stretch: Elastic Transcoder stretches thumbnails to match the values that you specified for thumbnail MaxWidth and MaxHeight settings. If the relative proportions of the input video and thumbnails are different, the thumbnails will be distorted.    Keep: Elastic Transcoder does not scale thumbnails. If either dimension of the input video exceeds the values that you specified for thumbnail MaxWidth and MaxHeight settings, Elastic Transcoder crops the thumbnails.    ShrinkToFit: Elastic Transcoder scales thumbnails down so that their dimensions match the values that you specified for at least one of thumbnail MaxWidth and MaxHeight without exceeding either value. If you specify this option, Elastic Transcoder does not scale thumbnails up.    ShrinkToFill: Elastic Transcoder scales thumbnails down so that their dimensions match the values that you specified for at least one of MaxWidth and MaxHeight without dropping below either value. If you specify this option, Elastic Transcoder does not scale thumbnails up.  
    */
  var SizingPolicy: js.UndefOr[SizingPolicy] = js.undefined
}

object Thumbnails {
  @scala.inline
  def apply(
    AspectRatio: AspectRatio = null,
    Format: JpgOrPng = null,
    Interval: Digits = null,
    MaxHeight: DigitsOrAuto = null,
    MaxWidth: DigitsOrAuto = null,
    PaddingPolicy: PaddingPolicy = null,
    Resolution: ThumbnailResolution = null,
    SizingPolicy: SizingPolicy = null
  ): Thumbnails = {
    val __obj = js.Dynamic.literal()
    if (AspectRatio != null) __obj.updateDynamic("AspectRatio")(AspectRatio)
    if (Format != null) __obj.updateDynamic("Format")(Format)
    if (Interval != null) __obj.updateDynamic("Interval")(Interval)
    if (MaxHeight != null) __obj.updateDynamic("MaxHeight")(MaxHeight)
    if (MaxWidth != null) __obj.updateDynamic("MaxWidth")(MaxWidth)
    if (PaddingPolicy != null) __obj.updateDynamic("PaddingPolicy")(PaddingPolicy)
    if (Resolution != null) __obj.updateDynamic("Resolution")(Resolution)
    if (SizingPolicy != null) __obj.updateDynamic("SizingPolicy")(SizingPolicy)
    __obj.asInstanceOf[Thumbnails]
  }
}

