package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hdr10Metadata extends js.Object {
  /**
    * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
    */
  var BluePrimaryX: js.UndefOr[__integerMin0Max50000] = js.undefined
  /**
    * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
    */
  var BluePrimaryY: js.UndefOr[__integerMin0Max50000] = js.undefined
  /**
    * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
    */
  var GreenPrimaryX: js.UndefOr[__integerMin0Max50000] = js.undefined
  /**
    * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
    */
  var GreenPrimaryY: js.UndefOr[__integerMin0Max50000] = js.undefined
  /**
    * Maximum light level among all samples in the coded video sequence, in units of candelas per square meter.  This setting doesn't have a default value; you must specify a value that is suitable for the content.
    */
  var MaxContentLightLevel: js.UndefOr[__integerMin0Max65535] = js.undefined
  /**
    * Maximum average light level of any frame in the coded video sequence, in units of candelas per square meter. This setting doesn't have a default value; you must specify a value that is suitable for the content.
    */
  var MaxFrameAverageLightLevel: js.UndefOr[__integerMin0Max65535] = js.undefined
  /**
    * Nominal maximum mastering display luminance in units of of 0.0001 candelas per square meter.
    */
  var MaxLuminance: js.UndefOr[__integerMin0Max2147483647] = js.undefined
  /**
    * Nominal minimum mastering display luminance in units of of 0.0001 candelas per square meter
    */
  var MinLuminance: js.UndefOr[__integerMin0Max2147483647] = js.undefined
  /**
    * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
    */
  var RedPrimaryX: js.UndefOr[__integerMin0Max50000] = js.undefined
  /**
    * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
    */
  var RedPrimaryY: js.UndefOr[__integerMin0Max50000] = js.undefined
  /**
    * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
    */
  var WhitePointX: js.UndefOr[__integerMin0Max50000] = js.undefined
  /**
    * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
    */
  var WhitePointY: js.UndefOr[__integerMin0Max50000] = js.undefined
}

object Hdr10Metadata {
  @scala.inline
  def apply(
    BluePrimaryX: js.UndefOr[__integerMin0Max50000] = js.undefined,
    BluePrimaryY: js.UndefOr[__integerMin0Max50000] = js.undefined,
    GreenPrimaryX: js.UndefOr[__integerMin0Max50000] = js.undefined,
    GreenPrimaryY: js.UndefOr[__integerMin0Max50000] = js.undefined,
    MaxContentLightLevel: js.UndefOr[__integerMin0Max65535] = js.undefined,
    MaxFrameAverageLightLevel: js.UndefOr[__integerMin0Max65535] = js.undefined,
    MaxLuminance: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
    MinLuminance: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
    RedPrimaryX: js.UndefOr[__integerMin0Max50000] = js.undefined,
    RedPrimaryY: js.UndefOr[__integerMin0Max50000] = js.undefined,
    WhitePointX: js.UndefOr[__integerMin0Max50000] = js.undefined,
    WhitePointY: js.UndefOr[__integerMin0Max50000] = js.undefined
  ): Hdr10Metadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BluePrimaryX)) __obj.updateDynamic("BluePrimaryX")(BluePrimaryX)
    if (!js.isUndefined(BluePrimaryY)) __obj.updateDynamic("BluePrimaryY")(BluePrimaryY)
    if (!js.isUndefined(GreenPrimaryX)) __obj.updateDynamic("GreenPrimaryX")(GreenPrimaryX)
    if (!js.isUndefined(GreenPrimaryY)) __obj.updateDynamic("GreenPrimaryY")(GreenPrimaryY)
    if (!js.isUndefined(MaxContentLightLevel)) __obj.updateDynamic("MaxContentLightLevel")(MaxContentLightLevel)
    if (!js.isUndefined(MaxFrameAverageLightLevel)) __obj.updateDynamic("MaxFrameAverageLightLevel")(MaxFrameAverageLightLevel)
    if (!js.isUndefined(MaxLuminance)) __obj.updateDynamic("MaxLuminance")(MaxLuminance)
    if (!js.isUndefined(MinLuminance)) __obj.updateDynamic("MinLuminance")(MinLuminance)
    if (!js.isUndefined(RedPrimaryX)) __obj.updateDynamic("RedPrimaryX")(RedPrimaryX)
    if (!js.isUndefined(RedPrimaryY)) __obj.updateDynamic("RedPrimaryY")(RedPrimaryY)
    if (!js.isUndefined(WhitePointX)) __obj.updateDynamic("WhitePointX")(WhitePointX)
    if (!js.isUndefined(WhitePointY)) __obj.updateDynamic("WhitePointY")(WhitePointY)
    __obj.asInstanceOf[Hdr10Metadata]
  }
}

