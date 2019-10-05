package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait H264Settings extends js.Object {
  /**
    * Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
    */
  var AdaptiveQuantization: js.UndefOr[H264AdaptiveQuantization] = js.undefined
  /**
    * Indicates that AFD values will be written into the output stream.  If afdSignaling is "auto", the system will try to preserve the input AFD value (in cases where multiple AFD values are valid). If set to "fixed", the AFD value will be the value configured in the fixedAfd parameter.
    */
  var AfdSignaling: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.AfdSignaling] = js.undefined
  /**
    * Average bitrate in bits/second. Required when the rate control mode is VBR or CBR. Not used for QVBR. In an MS Smooth output group, each output must have a unique value when its bitrate is rounded down to the nearest multiple of 1000.
    */
  var Bitrate: js.UndefOr[__integerMin1000] = js.undefined
  /**
    * Percentage of the buffer that should initially be filled (HRD buffer model).
    */
  var BufFillPct: js.UndefOr[__integerMin0Max100] = js.undefined
  /**
    * Size of buffer (HRD buffer model) in bits.
    */
  var BufSize: js.UndefOr[__integerMin0] = js.undefined
  /**
    * Includes colorspace metadata in the output.
    */
  var ColorMetadata: js.UndefOr[H264ColorMetadata] = js.undefined
  /**
    * Color Space settings
    */
  var ColorSpaceSettings: js.UndefOr[H264ColorSpaceSettings] = js.undefined
  /**
    * Entropy encoding mode.  Use cabac (must be in Main or High profile) or cavlc.
    */
  var EntropyEncoding: js.UndefOr[H264EntropyEncoding] = js.undefined
  /**
    * Four bit AFD value to write on all frames of video in the output stream. Only valid when afdSignaling is set to 'Fixed'.
    */
  var FixedAfd: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.FixedAfd] = js.undefined
  /**
    * If set to enabled, adjust quantization within each frame to reduce flicker or 'pop' on I-frames.
    */
  var FlickerAq: js.UndefOr[H264FlickerAq] = js.undefined
  /**
    * This field indicates how the output video frame rate is specified.  If "specified" is selected then the output video frame rate is determined by framerateNumerator and framerateDenominator, else if "initializeFromSource" is selected then the output video frame rate will be set equal to the input video frame rate of the first input.
    */
  var FramerateControl: js.UndefOr[H264FramerateControl] = js.undefined
  /**
    * Framerate denominator.
    */
  var FramerateDenominator: js.UndefOr[__integerMin1] = js.undefined
  /**
    * Framerate numerator - framerate is a fraction, e.g. 24000 / 1001 = 23.976 fps.
    */
  var FramerateNumerator: js.UndefOr[__integerMin1] = js.undefined
  /**
    * Documentation update needed
    */
  var GopBReference: js.UndefOr[H264GopBReference] = js.undefined
  /**
    * Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder joining mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break output segmenting.
    */
  var GopClosedCadence: js.UndefOr[__integerMin0] = js.undefined
  /**
    * Number of B-frames between reference frames.
    */
  var GopNumBFrames: js.UndefOr[__integerMin0Max7] = js.undefined
  /**
    * GOP size (keyframe interval) in units of either frames or seconds per gopSizeUnits. Must be greater than zero.
    */
  var GopSize: js.UndefOr[__doubleMin1] = js.undefined
  /**
    * Indicates if the gopSize is specified in frames or seconds. If seconds the system will convert the gopSize into a frame count at run time.
    */
  var GopSizeUnits: js.UndefOr[H264GopSizeUnits] = js.undefined
  /**
    * H.264 Level.
    */
  var Level: js.UndefOr[H264Level] = js.undefined
  /**
    * Amount of lookahead. A value of low can decrease latency and memory usage, while high can produce better quality for certain content.
    */
  var LookAheadRateControl: js.UndefOr[H264LookAheadRateControl] = js.undefined
  /**
    * For QVBR: See the tooltip for Quality level
  For VBR: Set the maximum bitrate in order to accommodate expected spikes in the complexity of the video.
    */
  var MaxBitrate: js.UndefOr[__integerMin1000] = js.undefined
  /**
    * Only meaningful if sceneChangeDetect is set to enabled.  Enforces separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection. If a scene change I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or stretched to the scene change I-frame. GOP stretch requires enabling lookahead as well as setting I-interval. The normal cadence resumes for the next GOP. Note: Maximum GOP stretch = GOP size + Min-I-interval - 1
    */
  var MinIInterval: js.UndefOr[__integerMin0Max30] = js.undefined
  /**
    * Number of reference frames to use. The encoder may use more than requested if using B-frames and/or interlaced encoding.
    */
  var NumRefFrames: js.UndefOr[__integerMin1Max6] = js.undefined
  /**
    * This field indicates how the output pixel aspect ratio is specified.  If "specified" is selected then the output video pixel aspect ratio is determined by parNumerator and parDenominator, else if "initializeFromSource" is selected then the output pixsel aspect ratio will be set equal to the input video pixel aspect ratio of the first input.
    */
  var ParControl: js.UndefOr[H264ParControl] = js.undefined
  /**
    * Pixel Aspect Ratio denominator.
    */
  var ParDenominator: js.UndefOr[__integerMin1] = js.undefined
  /**
    * Pixel Aspect Ratio numerator.
    */
  var ParNumerator: js.UndefOr[__integer] = js.undefined
  /**
    * H.264 Profile.
    */
  var Profile: js.UndefOr[H264Profile] = js.undefined
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
  VBR: Quality and bitrate vary, depending on the video complexity. Recommended instead of QVBR
  if you want to maintain a specific average bitrate over the duration of the channel.
  CBR: Quality varies, depending on the video complexity. Recommended only if you distribute
  your assets to devices that cannot handle variable bitrates.
    */
  var RateControlMode: js.UndefOr[H264RateControlMode] = js.undefined
  /**
    * Sets the scan type of the output to progressive or top-field-first interlaced.
    */
  var ScanType: js.UndefOr[H264ScanType] = js.undefined
  /**
    * Scene change detection.
  - On: inserts I-frames when scene change is detected.
  - Off: does not force an I-frame when scene change is detected.
    */
  var SceneChangeDetect: js.UndefOr[H264SceneChangeDetect] = js.undefined
  /**
    * Number of slices per picture. Must be less than or equal to the number of macroblock rows for progressive pictures, and less than or equal to half the number of macroblock rows for interlaced pictures.
  This field is optional; when no value is specified the encoder will choose the number of slices based on encode resolution.
    */
  var Slices: js.UndefOr[__integerMin1Max32] = js.undefined
  /**
    * Softness. Selects quantizer matrix, larger values reduce high-frequency content in the encoded image.
    */
  var Softness: js.UndefOr[__integerMin0Max128] = js.undefined
  /**
    * If set to enabled, adjust quantization within each frame based on spatial variation of content complexity.
    */
  var SpatialAq: js.UndefOr[H264SpatialAq] = js.undefined
  /**
    * If set to fixed, use gopNumBFrames B-frames per sub-GOP. If set to dynamic, optimize the number of B-frames used for each sub-GOP to improve visual quality.
    */
  var SubgopLength: js.UndefOr[H264SubGopLength] = js.undefined
  /**
    * Produces a bitstream compliant with SMPTE RP-2027.
    */
  var Syntax: js.UndefOr[H264Syntax] = js.undefined
  /**
    * If set to enabled, adjust quantization within each frame based on temporal variation of content complexity.
    */
  var TemporalAq: js.UndefOr[H264TemporalAq] = js.undefined
  /**
    * Determines how timecodes should be inserted into the video elementary stream.
  - 'disabled': Do not include timecodes
  - 'picTimingSei': Pass through picture timing SEI messages from the source specified in Timecode Config
    */
  var TimecodeInsertion: js.UndefOr[H264TimecodeInsertionBehavior] = js.undefined
}

object H264Settings {
  @scala.inline
  def apply(
    AdaptiveQuantization: H264AdaptiveQuantization = null,
    AfdSignaling: AfdSignaling = null,
    Bitrate: Int | Double = null,
    BufFillPct: Int | Double = null,
    BufSize: Int | Double = null,
    ColorMetadata: H264ColorMetadata = null,
    ColorSpaceSettings: H264ColorSpaceSettings = null,
    EntropyEncoding: H264EntropyEncoding = null,
    FixedAfd: FixedAfd = null,
    FlickerAq: H264FlickerAq = null,
    FramerateControl: H264FramerateControl = null,
    FramerateDenominator: Int | Double = null,
    FramerateNumerator: Int | Double = null,
    GopBReference: H264GopBReference = null,
    GopClosedCadence: Int | Double = null,
    GopNumBFrames: Int | Double = null,
    GopSize: Int | Double = null,
    GopSizeUnits: H264GopSizeUnits = null,
    Level: H264Level = null,
    LookAheadRateControl: H264LookAheadRateControl = null,
    MaxBitrate: Int | Double = null,
    MinIInterval: Int | Double = null,
    NumRefFrames: Int | Double = null,
    ParControl: H264ParControl = null,
    ParDenominator: Int | Double = null,
    ParNumerator: Int | Double = null,
    Profile: H264Profile = null,
    QvbrQualityLevel: Int | Double = null,
    RateControlMode: H264RateControlMode = null,
    ScanType: H264ScanType = null,
    SceneChangeDetect: H264SceneChangeDetect = null,
    Slices: Int | Double = null,
    Softness: Int | Double = null,
    SpatialAq: H264SpatialAq = null,
    SubgopLength: H264SubGopLength = null,
    Syntax: H264Syntax = null,
    TemporalAq: H264TemporalAq = null,
    TimecodeInsertion: H264TimecodeInsertionBehavior = null
  ): H264Settings = {
    val __obj = js.Dynamic.literal()
    if (AdaptiveQuantization != null) __obj.updateDynamic("AdaptiveQuantization")(AdaptiveQuantization.asInstanceOf[js.Any])
    if (AfdSignaling != null) __obj.updateDynamic("AfdSignaling")(AfdSignaling.asInstanceOf[js.Any])
    if (Bitrate != null) __obj.updateDynamic("Bitrate")(Bitrate.asInstanceOf[js.Any])
    if (BufFillPct != null) __obj.updateDynamic("BufFillPct")(BufFillPct.asInstanceOf[js.Any])
    if (BufSize != null) __obj.updateDynamic("BufSize")(BufSize.asInstanceOf[js.Any])
    if (ColorMetadata != null) __obj.updateDynamic("ColorMetadata")(ColorMetadata.asInstanceOf[js.Any])
    if (ColorSpaceSettings != null) __obj.updateDynamic("ColorSpaceSettings")(ColorSpaceSettings)
    if (EntropyEncoding != null) __obj.updateDynamic("EntropyEncoding")(EntropyEncoding.asInstanceOf[js.Any])
    if (FixedAfd != null) __obj.updateDynamic("FixedAfd")(FixedAfd.asInstanceOf[js.Any])
    if (FlickerAq != null) __obj.updateDynamic("FlickerAq")(FlickerAq.asInstanceOf[js.Any])
    if (FramerateControl != null) __obj.updateDynamic("FramerateControl")(FramerateControl.asInstanceOf[js.Any])
    if (FramerateDenominator != null) __obj.updateDynamic("FramerateDenominator")(FramerateDenominator.asInstanceOf[js.Any])
    if (FramerateNumerator != null) __obj.updateDynamic("FramerateNumerator")(FramerateNumerator.asInstanceOf[js.Any])
    if (GopBReference != null) __obj.updateDynamic("GopBReference")(GopBReference.asInstanceOf[js.Any])
    if (GopClosedCadence != null) __obj.updateDynamic("GopClosedCadence")(GopClosedCadence.asInstanceOf[js.Any])
    if (GopNumBFrames != null) __obj.updateDynamic("GopNumBFrames")(GopNumBFrames.asInstanceOf[js.Any])
    if (GopSize != null) __obj.updateDynamic("GopSize")(GopSize.asInstanceOf[js.Any])
    if (GopSizeUnits != null) __obj.updateDynamic("GopSizeUnits")(GopSizeUnits.asInstanceOf[js.Any])
    if (Level != null) __obj.updateDynamic("Level")(Level.asInstanceOf[js.Any])
    if (LookAheadRateControl != null) __obj.updateDynamic("LookAheadRateControl")(LookAheadRateControl.asInstanceOf[js.Any])
    if (MaxBitrate != null) __obj.updateDynamic("MaxBitrate")(MaxBitrate.asInstanceOf[js.Any])
    if (MinIInterval != null) __obj.updateDynamic("MinIInterval")(MinIInterval.asInstanceOf[js.Any])
    if (NumRefFrames != null) __obj.updateDynamic("NumRefFrames")(NumRefFrames.asInstanceOf[js.Any])
    if (ParControl != null) __obj.updateDynamic("ParControl")(ParControl.asInstanceOf[js.Any])
    if (ParDenominator != null) __obj.updateDynamic("ParDenominator")(ParDenominator.asInstanceOf[js.Any])
    if (ParNumerator != null) __obj.updateDynamic("ParNumerator")(ParNumerator.asInstanceOf[js.Any])
    if (Profile != null) __obj.updateDynamic("Profile")(Profile.asInstanceOf[js.Any])
    if (QvbrQualityLevel != null) __obj.updateDynamic("QvbrQualityLevel")(QvbrQualityLevel.asInstanceOf[js.Any])
    if (RateControlMode != null) __obj.updateDynamic("RateControlMode")(RateControlMode.asInstanceOf[js.Any])
    if (ScanType != null) __obj.updateDynamic("ScanType")(ScanType.asInstanceOf[js.Any])
    if (SceneChangeDetect != null) __obj.updateDynamic("SceneChangeDetect")(SceneChangeDetect.asInstanceOf[js.Any])
    if (Slices != null) __obj.updateDynamic("Slices")(Slices.asInstanceOf[js.Any])
    if (Softness != null) __obj.updateDynamic("Softness")(Softness.asInstanceOf[js.Any])
    if (SpatialAq != null) __obj.updateDynamic("SpatialAq")(SpatialAq.asInstanceOf[js.Any])
    if (SubgopLength != null) __obj.updateDynamic("SubgopLength")(SubgopLength.asInstanceOf[js.Any])
    if (Syntax != null) __obj.updateDynamic("Syntax")(Syntax.asInstanceOf[js.Any])
    if (TemporalAq != null) __obj.updateDynamic("TemporalAq")(TemporalAq.asInstanceOf[js.Any])
    if (TimecodeInsertion != null) __obj.updateDynamic("TimecodeInsertion")(TimecodeInsertion.asInstanceOf[js.Any])
    __obj.asInstanceOf[H264Settings]
  }
}

