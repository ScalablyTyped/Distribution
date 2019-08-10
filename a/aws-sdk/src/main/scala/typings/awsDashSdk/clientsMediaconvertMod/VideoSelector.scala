package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoSelector extends js.Object {
  /**
    * If your input video has accurate color space metadata, or if you don't know about color space, leave this set to the default value Follow (FOLLOW). The service will automatically detect your input color space. If your input video has metadata indicating the wrong color space, specify the accurate color space here. If your input video is HDR 10 and the SMPTE ST 2086 Mastering Display Color Volume static metadata isn't present in your video stream, or if that metadata is present but not accurate, choose Force HDR 10 (FORCE_HDR10) here and specify correct values in the input HDR 10 metadata (Hdr10Metadata) settings. For more information about MediaConvert HDR jobs, see https://docs.aws.amazon.com/console/mediaconvert/hdr.
    */
  var ColorSpace: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.ColorSpace] = js.undefined
  /**
    * There are two sources for color metadata, the input file and the job input settings Color space (ColorSpace) and HDR master display information settings(Hdr10Metadata). The Color space usage setting determines which takes precedence. Choose Force (FORCE) to use color metadata from the input job settings. If you don't specify values for those settings, the service defaults to using metadata from your input. FALLBACK - Choose Fallback (FALLBACK) to use color metadata from the source when it is present. If there's no color metadata in your input file, the service defaults to using values you specify in the input settings.
    */
  var ColorSpaceUsage: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.ColorSpaceUsage] = js.undefined
  /**
    * Use these settings to provide HDR 10 metadata that is missing or inaccurate in your input video. Appropriate values vary depending on the input video and must be provided by a color grader. The color grader generates these values during the HDR 10 mastering process. The valid range for each of these settings is 0 to 50,000. Each increment represents 0.00002 in CIE1931 color coordinate. Related settings - When you specify these values, you must also set Color space (ColorSpace) to HDR 10 (HDR10). To specify whether the the values you specify here take precedence over the values in the metadata of your input file, set Color space usage (ColorSpaceUsage). To specify whether color metadata is included in an output, set Color metadata (ColorMetadata). For more information about MediaConvert HDR jobs, see https://docs.aws.amazon.com/console/mediaconvert/hdr.
    */
  var Hdr10Metadata: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.Hdr10Metadata] = js.undefined
  /**
    * Use PID (Pid) to select specific video data from an input file. Specify this value as an integer; the system automatically converts it to the hexidecimal value. For example, 257 selects PID 0x101. A PID, or packet identifier, is an identifier for a set of data in an MPEG-2 transport stream container.
    */
  var Pid: js.UndefOr[__integerMin1Max2147483647] = js.undefined
  /**
    * Selects a specific program from within a multi-program transport stream. Note that Quad 4K is not currently supported.
    */
  var ProgramNumber: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined
  /**
    * Use Rotate (InputRotate) to specify how the service rotates your video. You can choose automatic rotation or specify a rotation. You can specify a clockwise rotation of 0, 90, 180, or 270 degrees. If your input video container is .mov or .mp4 and your input has rotation metadata, you can choose Automatic to have the service rotate your video according to the rotation specified in the metadata. The rotation must be within one degree of 90, 180, or 270 degrees. If the rotation metadata specifies any other rotation, the service will default to no rotation. By default, the service does no rotation, even if your input video has rotation metadata. The service doesn't pass through rotation metadata.
    */
  var Rotate: js.UndefOr[InputRotate] = js.undefined
}

object VideoSelector {
  @scala.inline
  def apply(
    ColorSpace: ColorSpace = null,
    ColorSpaceUsage: ColorSpaceUsage = null,
    Hdr10Metadata: Hdr10Metadata = null,
    Pid: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
    ProgramNumber: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined,
    Rotate: InputRotate = null
  ): VideoSelector = {
    val __obj = js.Dynamic.literal()
    if (ColorSpace != null) __obj.updateDynamic("ColorSpace")(ColorSpace.asInstanceOf[js.Any])
    if (ColorSpaceUsage != null) __obj.updateDynamic("ColorSpaceUsage")(ColorSpaceUsage.asInstanceOf[js.Any])
    if (Hdr10Metadata != null) __obj.updateDynamic("Hdr10Metadata")(Hdr10Metadata)
    if (!js.isUndefined(Pid)) __obj.updateDynamic("Pid")(Pid)
    if (!js.isUndefined(ProgramNumber)) __obj.updateDynamic("ProgramNumber")(ProgramNumber)
    if (Rotate != null) __obj.updateDynamic("Rotate")(Rotate.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoSelector]
  }
}

