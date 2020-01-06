package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorCorrector extends js.Object {
  /**
    * Brightness level.
    */
  var Brightness: js.UndefOr[__integerMin1Max100] = js.native
  /**
    * Specify the color space you want for this output. The service supports conversion between HDR formats, between SDR formats, and from SDR to HDR. The service doesn't support conversion from HDR to SDR. SDR to HDR conversion doesn't upgrade the dynamic range. The converted video has an HDR format, but visually appears the same as an unconverted output.
    */
  var ColorSpaceConversion: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.ColorSpaceConversion] = js.native
  /**
    * Contrast level.
    */
  var Contrast: js.UndefOr[__integerMin1Max100] = js.native
  /**
    * Use these settings when you convert to the HDR 10 color space. Specify the SMPTE ST 2086 Mastering Display Color Volume static metadata that you want signaled in the output. These values don't affect the pixel values that are encoded in the video stream. They are intended to help the downstream video player display content in a way that reflects the intentions of the the content creator. When you set Color space conversion (ColorSpaceConversion) to HDR 10 (FORCE_HDR10), these settings are required. You must set values for Max frame average light level (maxFrameAverageLightLevel) and Max content light level (maxContentLightLevel); these settings don't have a default value. The default values for the other HDR 10 metadata settings are defined by the P3D65 color space. For more information about MediaConvert HDR jobs, see https://docs.aws.amazon.com/console/mediaconvert/hdr.
    */
  var Hdr10Metadata: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.Hdr10Metadata] = js.native
  /**
    * Hue in degrees.
    */
  var Hue: js.UndefOr[__integerMinNegative180Max180] = js.native
  /**
    * Saturation level.
    */
  var Saturation: js.UndefOr[__integerMin1Max100] = js.native
}

object ColorCorrector {
  @scala.inline
  def apply(
    Brightness: Int | Double = null,
    ColorSpaceConversion: ColorSpaceConversion = null,
    Contrast: Int | Double = null,
    Hdr10Metadata: Hdr10Metadata = null,
    Hue: Int | Double = null,
    Saturation: Int | Double = null
  ): ColorCorrector = {
    val __obj = js.Dynamic.literal()
    if (Brightness != null) __obj.updateDynamic("Brightness")(Brightness.asInstanceOf[js.Any])
    if (ColorSpaceConversion != null) __obj.updateDynamic("ColorSpaceConversion")(ColorSpaceConversion.asInstanceOf[js.Any])
    if (Contrast != null) __obj.updateDynamic("Contrast")(Contrast.asInstanceOf[js.Any])
    if (Hdr10Metadata != null) __obj.updateDynamic("Hdr10Metadata")(Hdr10Metadata.asInstanceOf[js.Any])
    if (Hue != null) __obj.updateDynamic("Hue")(Hue.asInstanceOf[js.Any])
    if (Saturation != null) __obj.updateDynamic("Saturation")(Saturation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorCorrector]
  }
}

