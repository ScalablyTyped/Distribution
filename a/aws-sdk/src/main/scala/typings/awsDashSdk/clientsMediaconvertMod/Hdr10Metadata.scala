package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hdr10Metadata extends js.Object {
  /**
    * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
    */
  var BluePrimaryX: js.UndefOr[__integerMin0Max50000] = js.native
  /**
    * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
    */
  var BluePrimaryY: js.UndefOr[__integerMin0Max50000] = js.native
  /**
    * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
    */
  var GreenPrimaryX: js.UndefOr[__integerMin0Max50000] = js.native
  /**
    * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
    */
  var GreenPrimaryY: js.UndefOr[__integerMin0Max50000] = js.native
  /**
    * Maximum light level among all samples in the coded video sequence, in units of candelas per square meter.  This setting doesn't have a default value; you must specify a value that is suitable for the content.
    */
  var MaxContentLightLevel: js.UndefOr[__integerMin0Max65535] = js.native
  /**
    * Maximum average light level of any frame in the coded video sequence, in units of candelas per square meter. This setting doesn't have a default value; you must specify a value that is suitable for the content.
    */
  var MaxFrameAverageLightLevel: js.UndefOr[__integerMin0Max65535] = js.native
  /**
    * Nominal maximum mastering display luminance in units of of 0.0001 candelas per square meter.
    */
  var MaxLuminance: js.UndefOr[__integerMin0Max2147483647] = js.native
  /**
    * Nominal minimum mastering display luminance in units of of 0.0001 candelas per square meter
    */
  var MinLuminance: js.UndefOr[__integerMin0Max2147483647] = js.native
  /**
    * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
    */
  var RedPrimaryX: js.UndefOr[__integerMin0Max50000] = js.native
  /**
    * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
    */
  var RedPrimaryY: js.UndefOr[__integerMin0Max50000] = js.native
  /**
    * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
    */
  var WhitePointX: js.UndefOr[__integerMin0Max50000] = js.native
  /**
    * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
    */
  var WhitePointY: js.UndefOr[__integerMin0Max50000] = js.native
}

object Hdr10Metadata {
  @scala.inline
  def apply(
    BluePrimaryX: Int | Double = null,
    BluePrimaryY: Int | Double = null,
    GreenPrimaryX: Int | Double = null,
    GreenPrimaryY: Int | Double = null,
    MaxContentLightLevel: Int | Double = null,
    MaxFrameAverageLightLevel: Int | Double = null,
    MaxLuminance: Int | Double = null,
    MinLuminance: Int | Double = null,
    RedPrimaryX: Int | Double = null,
    RedPrimaryY: Int | Double = null,
    WhitePointX: Int | Double = null,
    WhitePointY: Int | Double = null
  ): Hdr10Metadata = {
    val __obj = js.Dynamic.literal()
    if (BluePrimaryX != null) __obj.updateDynamic("BluePrimaryX")(BluePrimaryX.asInstanceOf[js.Any])
    if (BluePrimaryY != null) __obj.updateDynamic("BluePrimaryY")(BluePrimaryY.asInstanceOf[js.Any])
    if (GreenPrimaryX != null) __obj.updateDynamic("GreenPrimaryX")(GreenPrimaryX.asInstanceOf[js.Any])
    if (GreenPrimaryY != null) __obj.updateDynamic("GreenPrimaryY")(GreenPrimaryY.asInstanceOf[js.Any])
    if (MaxContentLightLevel != null) __obj.updateDynamic("MaxContentLightLevel")(MaxContentLightLevel.asInstanceOf[js.Any])
    if (MaxFrameAverageLightLevel != null) __obj.updateDynamic("MaxFrameAverageLightLevel")(MaxFrameAverageLightLevel.asInstanceOf[js.Any])
    if (MaxLuminance != null) __obj.updateDynamic("MaxLuminance")(MaxLuminance.asInstanceOf[js.Any])
    if (MinLuminance != null) __obj.updateDynamic("MinLuminance")(MinLuminance.asInstanceOf[js.Any])
    if (RedPrimaryX != null) __obj.updateDynamic("RedPrimaryX")(RedPrimaryX.asInstanceOf[js.Any])
    if (RedPrimaryY != null) __obj.updateDynamic("RedPrimaryY")(RedPrimaryY.asInstanceOf[js.Any])
    if (WhitePointX != null) __obj.updateDynamic("WhitePointX")(WhitePointX.asInstanceOf[js.Any])
    if (WhitePointY != null) __obj.updateDynamic("WhitePointY")(WhitePointY.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hdr10Metadata]
  }
}

