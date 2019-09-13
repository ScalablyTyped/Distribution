package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait H265Settings extends js.Object {
  /**
    * Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
    */
  var AdaptiveQuantization: js.UndefOr[H265AdaptiveQuantization] = js.undefined
  /**
    * Indicates that AFD values will be written into the output stream.  If afdSignaling is "auto", the system will try to preserve the input AFD value (in cases where multiple AFD values are valid). If set to "fixed", the AFD value will be the value configured in the fixedAfd parameter.
    */
  var AfdSignaling: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.AfdSignaling] = js.undefined
  /**
    * Whether or not EML should insert an Alternative Transfer Function SEI message to support backwards compatibility with non-HDR decoders and displays.
    */
  var AlternativeTransferFunction: js.UndefOr[H265AlternativeTransferFunction] = js.undefined
  /**
    * Average bitrate in bits/second. Required when the rate control mode is VBR or CBR. Not used for QVBR. In an MS Smooth output group, each output must have a unique value when its bitrate is rounded down to the nearest multiple of 1000.
    */
  var Bitrate: js.UndefOr[__integerMin100000Max40000000] = js.undefined
  /**
    * Size of buffer (HRD buffer model) in bits.
    */
  var BufSize: js.UndefOr[__integerMin100000Max80000000] = js.undefined
  /**
    * Includes colorspace metadata in the output.
    */
  var ColorMetadata: js.UndefOr[H265ColorMetadata] = js.undefined
  /**
    * Color Space settings
    */
  var ColorSpaceSettings: js.UndefOr[H265ColorSpaceSettings] = js.undefined
  /**
    * Four bit AFD value to write on all frames of video in the output stream. Only valid when afdSignaling is set to 'Fixed'.
    */
  var FixedAfd: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.FixedAfd] = js.undefined
  /**
    * If set to enabled, adjust quantization within each frame to reduce flicker or 'pop' on I-frames.
    */
  var FlickerAq: js.UndefOr[H265FlickerAq] = js.undefined
  /**
    * Framerate denominator.
    */
  var FramerateDenominator: __integerMin1Max3003
  /**
    * Framerate numerator - framerate is a fraction, e.g. 24000 / 1001 = 23.976 fps.
    */
  var FramerateNumerator: __integerMin1
  /**
    * Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder joining mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break output segmenting.
    */
  var GopClosedCadence: js.UndefOr[__integerMin0] = js.undefined
  /**
    * GOP size (keyframe interval) in units of either frames or seconds per gopSizeUnits. Must be greater than zero.
    */
  var GopSize: js.UndefOr[__doubleMin1] = js.undefined
  /**
    * Indicates if the gopSize is specified in frames or seconds. If seconds the system will convert the gopSize into a frame count at run time.
    */
  var GopSizeUnits: js.UndefOr[H265GopSizeUnits] = js.undefined
  /**
    * H.265 Level.
    */
  var Level: js.UndefOr[H265Level] = js.undefined
  /**
    * Amount of lookahead. A value of low can decrease latency and memory usage, while high can produce better quality for certain content.
    */
  var LookAheadRateControl: js.UndefOr[H265LookAheadRateControl] = js.undefined
  /**
    * For QVBR: See the tooltip for Quality level
    */
  var MaxBitrate: js.UndefOr[__integerMin100000Max40000000] = js.undefined
  /**
    * Only meaningful if sceneChangeDetect is set to enabled.  Enforces separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection. If a scene change I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or stretched to the scene change I-frame. GOP stretch requires enabling lookahead as well as setting I-interval. The normal cadence resumes for the next GOP. Note: Maximum GOP stretch = GOP size + Min-I-interval - 1
    */
  var MinIInterval: js.UndefOr[__integerMin0Max30] = js.undefined
  /**
    * Pixel Aspect Ratio denominator.
    */
  var ParDenominator: js.UndefOr[__integerMin1] = js.undefined
  /**
    * Pixel Aspect Ratio numerator.
    */
  var ParNumerator: js.UndefOr[__integerMin1] = js.undefined
  /**
    * H.265 Profile.
    */
  var Profile: js.UndefOr[H265Profile] = js.undefined
  /**
    * Controls the target quality for the video encode. Applies only when the rate control mode is QVBR. Set values for the QVBR quality level field and Max bitrate field that suit your most important viewing devices. Recommended values are:
  - Primary screen: Quality level: 8 to 10. Max bitrate: 4M
  - PC or tablet: Quality level: 7. Max bitrate: 1.5M to 3M
  - Smartphone: Quality level: 6. Max bitrate: 1M to 1.5M
    */
  var QvbrQualityLevel: js.UndefOr[__integerMin1Max10] = js.undefined
  /**
    * Rate control mode.
  QVBR: Quality will match the specified quality level except when it is constrained by the
  maximum bitrate.  Recommended if you or your viewers pay for bandwidth.
  CBR: Quality varies, depending on the video complexity. Recommended only if you distribute
  your assets to devices that cannot handle variable bitrates.
    */
  var RateControlMode: js.UndefOr[H265RateControlMode] = js.undefined
  /**
    * Sets the scan type of the output to progressive or top-field-first interlaced.
    */
  var ScanType: js.UndefOr[H265ScanType] = js.undefined
  /**
    * Scene change detection.
    */
  var SceneChangeDetect: js.UndefOr[H265SceneChangeDetect] = js.undefined
  /**
    * Number of slices per picture. Must be less than or equal to the number of macroblock rows for progressive pictures, and less than or equal to half the number of macroblock rows for interlaced pictures.
  This field is optional; when no value is specified the encoder will choose the number of slices based on encode resolution.
    */
  var Slices: js.UndefOr[__integerMin1Max16] = js.undefined
  /**
    * H.265 Tier.
    */
  var Tier: js.UndefOr[H265Tier] = js.undefined
  /**
    * Determines how timecodes should be inserted into the video elementary stream.
  - 'disabled': Do not include timecodes
  - 'picTimingSei': Pass through picture timing SEI messages from the source specified in Timecode Config
    */
  var TimecodeInsertion: js.UndefOr[H265TimecodeInsertionBehavior] = js.undefined
}

object H265Settings {
  @scala.inline
  def apply(
    FramerateDenominator: __integerMin1Max3003,
    FramerateNumerator: __integerMin1,
    AdaptiveQuantization: H265AdaptiveQuantization = null,
    AfdSignaling: AfdSignaling = null,
    AlternativeTransferFunction: H265AlternativeTransferFunction = null,
    Bitrate: js.UndefOr[__integerMin100000Max40000000] = js.undefined,
    BufSize: js.UndefOr[__integerMin100000Max80000000] = js.undefined,
    ColorMetadata: H265ColorMetadata = null,
    ColorSpaceSettings: H265ColorSpaceSettings = null,
    FixedAfd: FixedAfd = null,
    FlickerAq: H265FlickerAq = null,
    GopClosedCadence: js.UndefOr[__integerMin0] = js.undefined,
    GopSize: js.UndefOr[__doubleMin1] = js.undefined,
    GopSizeUnits: H265GopSizeUnits = null,
    Level: H265Level = null,
    LookAheadRateControl: H265LookAheadRateControl = null,
    MaxBitrate: js.UndefOr[__integerMin100000Max40000000] = js.undefined,
    MinIInterval: js.UndefOr[__integerMin0Max30] = js.undefined,
    ParDenominator: js.UndefOr[__integerMin1] = js.undefined,
    ParNumerator: js.UndefOr[__integerMin1] = js.undefined,
    Profile: H265Profile = null,
    QvbrQualityLevel: js.UndefOr[__integerMin1Max10] = js.undefined,
    RateControlMode: H265RateControlMode = null,
    ScanType: H265ScanType = null,
    SceneChangeDetect: H265SceneChangeDetect = null,
    Slices: js.UndefOr[__integerMin1Max16] = js.undefined,
    Tier: H265Tier = null,
    TimecodeInsertion: H265TimecodeInsertionBehavior = null
  ): H265Settings = {
    val __obj = js.Dynamic.literal(FramerateDenominator = FramerateDenominator, FramerateNumerator = FramerateNumerator)
    if (AdaptiveQuantization != null) __obj.updateDynamic("AdaptiveQuantization")(AdaptiveQuantization.asInstanceOf[js.Any])
    if (AfdSignaling != null) __obj.updateDynamic("AfdSignaling")(AfdSignaling.asInstanceOf[js.Any])
    if (AlternativeTransferFunction != null) __obj.updateDynamic("AlternativeTransferFunction")(AlternativeTransferFunction.asInstanceOf[js.Any])
    if (!js.isUndefined(Bitrate)) __obj.updateDynamic("Bitrate")(Bitrate)
    if (!js.isUndefined(BufSize)) __obj.updateDynamic("BufSize")(BufSize)
    if (ColorMetadata != null) __obj.updateDynamic("ColorMetadata")(ColorMetadata.asInstanceOf[js.Any])
    if (ColorSpaceSettings != null) __obj.updateDynamic("ColorSpaceSettings")(ColorSpaceSettings)
    if (FixedAfd != null) __obj.updateDynamic("FixedAfd")(FixedAfd.asInstanceOf[js.Any])
    if (FlickerAq != null) __obj.updateDynamic("FlickerAq")(FlickerAq.asInstanceOf[js.Any])
    if (!js.isUndefined(GopClosedCadence)) __obj.updateDynamic("GopClosedCadence")(GopClosedCadence)
    if (!js.isUndefined(GopSize)) __obj.updateDynamic("GopSize")(GopSize)
    if (GopSizeUnits != null) __obj.updateDynamic("GopSizeUnits")(GopSizeUnits.asInstanceOf[js.Any])
    if (Level != null) __obj.updateDynamic("Level")(Level.asInstanceOf[js.Any])
    if (LookAheadRateControl != null) __obj.updateDynamic("LookAheadRateControl")(LookAheadRateControl.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxBitrate)) __obj.updateDynamic("MaxBitrate")(MaxBitrate)
    if (!js.isUndefined(MinIInterval)) __obj.updateDynamic("MinIInterval")(MinIInterval)
    if (!js.isUndefined(ParDenominator)) __obj.updateDynamic("ParDenominator")(ParDenominator)
    if (!js.isUndefined(ParNumerator)) __obj.updateDynamic("ParNumerator")(ParNumerator)
    if (Profile != null) __obj.updateDynamic("Profile")(Profile.asInstanceOf[js.Any])
    if (!js.isUndefined(QvbrQualityLevel)) __obj.updateDynamic("QvbrQualityLevel")(QvbrQualityLevel)
    if (RateControlMode != null) __obj.updateDynamic("RateControlMode")(RateControlMode.asInstanceOf[js.Any])
    if (ScanType != null) __obj.updateDynamic("ScanType")(ScanType.asInstanceOf[js.Any])
    if (SceneChangeDetect != null) __obj.updateDynamic("SceneChangeDetect")(SceneChangeDetect.asInstanceOf[js.Any])
    if (!js.isUndefined(Slices)) __obj.updateDynamic("Slices")(Slices)
    if (Tier != null) __obj.updateDynamic("Tier")(Tier.asInstanceOf[js.Any])
    if (TimecodeInsertion != null) __obj.updateDynamic("TimecodeInsertion")(TimecodeInsertion.asInstanceOf[js.Any])
    __obj.asInstanceOf[H265Settings]
  }
}

