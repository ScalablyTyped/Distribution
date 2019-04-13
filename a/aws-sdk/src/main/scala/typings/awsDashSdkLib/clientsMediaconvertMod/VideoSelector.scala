package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoSelector extends js.Object {
  /**
    * If your input video has accurate color space metadata, or if you don't know about color space, leave this set to the default value FOLLOW. The service will automatically detect your input color space. If your input video has metadata indicating the wrong color space, or if your input video is missing color space metadata that should be there, specify the accurate color space here. If you choose HDR10, you can also correct inaccurate color space coefficients, using the HDR master display information controls. You must also set Color space usage (ColorSpaceUsage) to FORCE for the service to use these values.
    */
  var ColorSpace: js.UndefOr[ColorSpace] = js.undefined
  /**
    * There are two sources for color metadata, the input file and the job configuration (in the Color space and HDR master display informaiton settings). The Color space usage setting controls which takes precedence. FORCE: The system will use color metadata supplied by user, if any. If the user does not supply color metadata, the system will use data from the source. FALLBACK: The system will use color metadata from the source. If source has no color metadata, the system will use user-supplied color metadata values if available.
    */
  var ColorSpaceUsage: js.UndefOr[ColorSpaceUsage] = js.undefined
  /**
    * Use the "HDR master display information" (Hdr10Metadata) settings to correct HDR metadata or to provide missing metadata. These values vary depending on the input video and must be provided by a color grader. Range is 0 to 50,000; each increment represents 0.00002 in CIE1931 color coordinate. Note that these settings are not color correction. Note that if you are creating HDR outputs inside of an HLS CMAF package, to comply with the Apple specification, you must use the following settings. Set "MP4 packaging type" (writeMp4PackagingType) to HVC1 (HVC1). Set "Profile" (H265Settings > codecProfile) to Main10/High (MAIN10_HIGH). Set "Level" (H265Settings > codecLevel) to 5 (LEVEL_5).
    */
  var Hdr10Metadata: js.UndefOr[Hdr10Metadata] = js.undefined
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

