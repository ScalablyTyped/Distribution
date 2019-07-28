package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait H264Settings extends js.Object {
  /**
    * Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
    */
  var AdaptiveQuantization: js.UndefOr[H264AdaptiveQuantization] = js.undefined
  /**
    * Specify the average bitrate in bits per second. Required for VBR and CBR. For MS Smooth outputs, bitrates must be unique when rounded down to the nearest multiple of 1000.
    */
  var Bitrate: js.UndefOr[__integerMin1000Max1152000000] = js.undefined
  /**
    * Specify an H.264 level that is consistent with your output video settings. If you aren't sure what level to specify, choose Auto (AUTO).
    */
  var CodecLevel: js.UndefOr[H264CodecLevel] = js.undefined
  /**
    * H.264 Profile. High 4:2:2 and 10-bit profiles are only available with the AVC-I License.
    */
  var CodecProfile: js.UndefOr[H264CodecProfile] = js.undefined
  /**
    * Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
    */
  var DynamicSubGop: js.UndefOr[H264DynamicSubGop] = js.undefined
  /**
    * Entropy encoding mode. Use CABAC (must be in Main or High profile) or CAVLC.
    */
  var EntropyEncoding: js.UndefOr[H264EntropyEncoding] = js.undefined
  /**
    * Choosing FORCE_FIELD disables PAFF encoding for interlaced outputs.
    */
  var FieldEncoding: js.UndefOr[H264FieldEncoding] = js.undefined
  /**
    * Adjust quantization within each frame to reduce flicker or 'pop' on I-frames.
    */
  var FlickerAdaptiveQuantization: js.UndefOr[H264FlickerAdaptiveQuantization] = js.undefined
  /**
    * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
    */
  var FramerateControl: js.UndefOr[H264FramerateControl] = js.undefined
  /**
    * When set to INTERPOLATE, produces smoother motion during frame rate conversion.
    */
  var FramerateConversionAlgorithm: js.UndefOr[H264FramerateConversionAlgorithm] = js.undefined
  /**
    * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For example,  24000 / 1001 = 23.976 fps. Use FramerateDenominator to specify the denominator of this fraction. In this example, use 1001 for the value of FramerateDenominator. When you use the console for transcode jobs that use frame rate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
    */
  var FramerateDenominator: js.UndefOr[__integerMin1Max2147483647] = js.undefined
  /**
    * Frame rate numerator - frame rate is a fraction, e.g. 24000 / 1001 = 23.976 fps.
    */
  var FramerateNumerator: js.UndefOr[__integerMin1Max2147483647] = js.undefined
  /**
    * If enable, use reference B frames for GOP structures that have B frames > 1.
    */
  var GopBReference: js.UndefOr[H264GopBReference] = js.undefined
  /**
    * Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder joining mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break output segmenting.
    */
  var GopClosedCadence: js.UndefOr[__integerMin0Max2147483647] = js.undefined
  /**
    * GOP Length (keyframe interval) in frames or seconds. Must be greater than zero.
    */
  var GopSize: js.UndefOr[__doubleMin0] = js.undefined
  /**
    * Indicates if the GOP Size in H264 is specified in frames or seconds. If seconds the system will convert the GOP Size into a frame count at run time.
    */
  var GopSizeUnits: js.UndefOr[H264GopSizeUnits] = js.undefined
  /**
    * Percentage of the buffer that should initially be filled (HRD buffer model).
    */
  var HrdBufferInitialFillPercentage: js.UndefOr[__integerMin0Max100] = js.undefined
  /**
    * Size of buffer (HRD buffer model) in bits. For example, enter five megabits as 5000000.
    */
  var HrdBufferSize: js.UndefOr[__integerMin0Max1152000000] = js.undefined
  /**
    * Use Interlace mode (InterlaceMode) to choose the scan line type for the output. * Top Field First (TOP_FIELD) and Bottom Field First (BOTTOM_FIELD) produce interlaced output with the entire output having the same field polarity (top or bottom first). * Follow, Default Top (FOLLOW_TOP_FIELD) and Follow, Default Bottom (FOLLOW_BOTTOM_FIELD) use the same field polarity as the source. Therefore, behavior depends on the input scan type, as follows.
    - If the source is interlaced, the output will be interlaced with the same polarity as the source (it will follow the source). The output could therefore be a mix of "top field first" and "bottom field first".
    - If the source is progressive, the output will be interlaced with "top field first" or "bottom field first" polarity, depending on which of the Follow options you chose.
    */
  var InterlaceMode: js.UndefOr[H264InterlaceMode] = js.undefined
  /**
    * Maximum bitrate in bits/second. For example, enter five megabits per second as 5000000. Required when Rate control mode is QVBR.
    */
  var MaxBitrate: js.UndefOr[__integerMin1000Max1152000000] = js.undefined
  /**
    * Enforces separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection. If a scene change I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or stretched to the scene change I-frame. GOP stretch requires enabling lookahead as well as setting I-interval. The normal cadence resumes for the next GOP. This setting is only used when Scene Change Detect is enabled. Note: Maximum GOP stretch = GOP size + Min-I-interval - 1
    */
  var MinIInterval: js.UndefOr[__integerMin0Max30] = js.undefined
  /**
    * Number of B-frames between reference frames.
    */
  var NumberBFramesBetweenReferenceFrames: js.UndefOr[__integerMin0Max7] = js.undefined
  /**
    * Number of reference frames to use. The encoder may use more than requested if using B-frames and/or interlaced encoding.
    */
  var NumberReferenceFrames: js.UndefOr[__integerMin1Max6] = js.undefined
  /**
    * Using the API, enable ParFollowSource if you want the service to use the pixel aspect ratio from the input. Using the console, do this by choosing Follow source for Pixel aspect ratio.
    */
  var ParControl: js.UndefOr[H264ParControl] = js.undefined
  /**
    * Pixel Aspect Ratio denominator.
    */
  var ParDenominator: js.UndefOr[__integerMin1Max2147483647] = js.undefined
  /**
    * Pixel Aspect Ratio numerator.
    */
  var ParNumerator: js.UndefOr[__integerMin1Max2147483647] = js.undefined
  /**
    * Use Quality tuning level (H264QualityTuningLevel) to specifiy whether to use fast single-pass, high-quality singlepass, or high-quality multipass video encoding.
    */
  var QualityTuningLevel: js.UndefOr[H264QualityTuningLevel] = js.undefined
  /**
    * Settings for quality-defined variable bitrate encoding with the H.264 codec. Required when you set Rate control mode to QVBR. Not valid when you set Rate control mode to a value other than QVBR, or when you don't define Rate control mode.
    */
  var QvbrSettings: js.UndefOr[H264QvbrSettings] = js.undefined
  /**
    * Use this setting to specify whether this output has a variable bitrate (VBR), constant bitrate (CBR) or quality-defined variable bitrate (QVBR).
    */
  var RateControlMode: js.UndefOr[H264RateControlMode] = js.undefined
  /**
    * Places a PPS header on each encoded picture, even if repeated.
    */
  var RepeatPps: js.UndefOr[H264RepeatPps] = js.undefined
  /**
    * Scene change detection (inserts I-frames on scene changes).
    */
  var SceneChangeDetect: js.UndefOr[H264SceneChangeDetect] = js.undefined
  /**
    * Number of slices per picture. Must be less than or equal to the number of macroblock rows for progressive pictures, and less than or equal to half the number of macroblock rows for interlaced pictures.
    */
  var Slices: js.UndefOr[__integerMin1Max32] = js.undefined
  /**
    * Enables Slow PAL rate conversion. 23.976fps and 24fps input is relabeled as 25fps, and audio is sped up correspondingly.
    */
  var SlowPal: js.UndefOr[H264SlowPal] = js.undefined
  /**
    * Softness. Selects quantizer matrix, larger values reduce high-frequency content in the encoded image.
    */
  var Softness: js.UndefOr[__integerMin0Max128] = js.undefined
  /**
    * Adjust quantization within each frame based on spatial variation of content complexity.
    */
  var SpatialAdaptiveQuantization: js.UndefOr[H264SpatialAdaptiveQuantization] = js.undefined
  /**
    * Produces a bitstream compliant with SMPTE RP-2027.
    */
  var Syntax: js.UndefOr[H264Syntax] = js.undefined
  /**
    * This field applies only if the Streams > Advanced > Framerate (framerate) field  is set to 29.970. This field works with the Streams > Advanced > Preprocessors > Deinterlacer  field (deinterlace_mode) and the Streams > Advanced > Interlaced Mode field (interlace_mode)  to identify the scan type for the output: Progressive, Interlaced, Hard Telecine or Soft Telecine. - Hard: produces 29.97i output from 23.976 input. - Soft: produces 23.976; the player converts this output to 29.97i.
    */
  var Telecine: js.UndefOr[H264Telecine] = js.undefined
  /**
    * Adjust quantization within each frame based on temporal variation of content complexity.
    */
  var TemporalAdaptiveQuantization: js.UndefOr[H264TemporalAdaptiveQuantization] = js.undefined
  /**
    * Inserts timecode for each frame as 4 bytes of an unregistered SEI message.
    */
  var UnregisteredSeiTimecode: js.UndefOr[H264UnregisteredSeiTimecode] = js.undefined
}

object H264Settings {
  @scala.inline
  def apply(
    AdaptiveQuantization: H264AdaptiveQuantization = null,
    Bitrate: js.UndefOr[__integerMin1000Max1152000000] = js.undefined,
    CodecLevel: H264CodecLevel = null,
    CodecProfile: H264CodecProfile = null,
    DynamicSubGop: H264DynamicSubGop = null,
    EntropyEncoding: H264EntropyEncoding = null,
    FieldEncoding: H264FieldEncoding = null,
    FlickerAdaptiveQuantization: H264FlickerAdaptiveQuantization = null,
    FramerateControl: H264FramerateControl = null,
    FramerateConversionAlgorithm: H264FramerateConversionAlgorithm = null,
    FramerateDenominator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
    FramerateNumerator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
    GopBReference: H264GopBReference = null,
    GopClosedCadence: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
    GopSize: js.UndefOr[__doubleMin0] = js.undefined,
    GopSizeUnits: H264GopSizeUnits = null,
    HrdBufferInitialFillPercentage: js.UndefOr[__integerMin0Max100] = js.undefined,
    HrdBufferSize: js.UndefOr[__integerMin0Max1152000000] = js.undefined,
    InterlaceMode: H264InterlaceMode = null,
    MaxBitrate: js.UndefOr[__integerMin1000Max1152000000] = js.undefined,
    MinIInterval: js.UndefOr[__integerMin0Max30] = js.undefined,
    NumberBFramesBetweenReferenceFrames: js.UndefOr[__integerMin0Max7] = js.undefined,
    NumberReferenceFrames: js.UndefOr[__integerMin1Max6] = js.undefined,
    ParControl: H264ParControl = null,
    ParDenominator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
    ParNumerator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
    QualityTuningLevel: H264QualityTuningLevel = null,
    QvbrSettings: H264QvbrSettings = null,
    RateControlMode: H264RateControlMode = null,
    RepeatPps: H264RepeatPps = null,
    SceneChangeDetect: H264SceneChangeDetect = null,
    Slices: js.UndefOr[__integerMin1Max32] = js.undefined,
    SlowPal: H264SlowPal = null,
    Softness: js.UndefOr[__integerMin0Max128] = js.undefined,
    SpatialAdaptiveQuantization: H264SpatialAdaptiveQuantization = null,
    Syntax: H264Syntax = null,
    Telecine: H264Telecine = null,
    TemporalAdaptiveQuantization: H264TemporalAdaptiveQuantization = null,
    UnregisteredSeiTimecode: H264UnregisteredSeiTimecode = null
  ): H264Settings = {
    val __obj = js.Dynamic.literal()
    if (AdaptiveQuantization != null) __obj.updateDynamic("AdaptiveQuantization")(AdaptiveQuantization.asInstanceOf[js.Any])
    if (!js.isUndefined(Bitrate)) __obj.updateDynamic("Bitrate")(Bitrate)
    if (CodecLevel != null) __obj.updateDynamic("CodecLevel")(CodecLevel.asInstanceOf[js.Any])
    if (CodecProfile != null) __obj.updateDynamic("CodecProfile")(CodecProfile.asInstanceOf[js.Any])
    if (DynamicSubGop != null) __obj.updateDynamic("DynamicSubGop")(DynamicSubGop.asInstanceOf[js.Any])
    if (EntropyEncoding != null) __obj.updateDynamic("EntropyEncoding")(EntropyEncoding.asInstanceOf[js.Any])
    if (FieldEncoding != null) __obj.updateDynamic("FieldEncoding")(FieldEncoding.asInstanceOf[js.Any])
    if (FlickerAdaptiveQuantization != null) __obj.updateDynamic("FlickerAdaptiveQuantization")(FlickerAdaptiveQuantization.asInstanceOf[js.Any])
    if (FramerateControl != null) __obj.updateDynamic("FramerateControl")(FramerateControl.asInstanceOf[js.Any])
    if (FramerateConversionAlgorithm != null) __obj.updateDynamic("FramerateConversionAlgorithm")(FramerateConversionAlgorithm.asInstanceOf[js.Any])
    if (!js.isUndefined(FramerateDenominator)) __obj.updateDynamic("FramerateDenominator")(FramerateDenominator)
    if (!js.isUndefined(FramerateNumerator)) __obj.updateDynamic("FramerateNumerator")(FramerateNumerator)
    if (GopBReference != null) __obj.updateDynamic("GopBReference")(GopBReference.asInstanceOf[js.Any])
    if (!js.isUndefined(GopClosedCadence)) __obj.updateDynamic("GopClosedCadence")(GopClosedCadence)
    if (!js.isUndefined(GopSize)) __obj.updateDynamic("GopSize")(GopSize)
    if (GopSizeUnits != null) __obj.updateDynamic("GopSizeUnits")(GopSizeUnits.asInstanceOf[js.Any])
    if (!js.isUndefined(HrdBufferInitialFillPercentage)) __obj.updateDynamic("HrdBufferInitialFillPercentage")(HrdBufferInitialFillPercentage)
    if (!js.isUndefined(HrdBufferSize)) __obj.updateDynamic("HrdBufferSize")(HrdBufferSize)
    if (InterlaceMode != null) __obj.updateDynamic("InterlaceMode")(InterlaceMode.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxBitrate)) __obj.updateDynamic("MaxBitrate")(MaxBitrate)
    if (!js.isUndefined(MinIInterval)) __obj.updateDynamic("MinIInterval")(MinIInterval)
    if (!js.isUndefined(NumberBFramesBetweenReferenceFrames)) __obj.updateDynamic("NumberBFramesBetweenReferenceFrames")(NumberBFramesBetweenReferenceFrames)
    if (!js.isUndefined(NumberReferenceFrames)) __obj.updateDynamic("NumberReferenceFrames")(NumberReferenceFrames)
    if (ParControl != null) __obj.updateDynamic("ParControl")(ParControl.asInstanceOf[js.Any])
    if (!js.isUndefined(ParDenominator)) __obj.updateDynamic("ParDenominator")(ParDenominator)
    if (!js.isUndefined(ParNumerator)) __obj.updateDynamic("ParNumerator")(ParNumerator)
    if (QualityTuningLevel != null) __obj.updateDynamic("QualityTuningLevel")(QualityTuningLevel.asInstanceOf[js.Any])
    if (QvbrSettings != null) __obj.updateDynamic("QvbrSettings")(QvbrSettings)
    if (RateControlMode != null) __obj.updateDynamic("RateControlMode")(RateControlMode.asInstanceOf[js.Any])
    if (RepeatPps != null) __obj.updateDynamic("RepeatPps")(RepeatPps.asInstanceOf[js.Any])
    if (SceneChangeDetect != null) __obj.updateDynamic("SceneChangeDetect")(SceneChangeDetect.asInstanceOf[js.Any])
    if (!js.isUndefined(Slices)) __obj.updateDynamic("Slices")(Slices)
    if (SlowPal != null) __obj.updateDynamic("SlowPal")(SlowPal.asInstanceOf[js.Any])
    if (!js.isUndefined(Softness)) __obj.updateDynamic("Softness")(Softness)
    if (SpatialAdaptiveQuantization != null) __obj.updateDynamic("SpatialAdaptiveQuantization")(SpatialAdaptiveQuantization.asInstanceOf[js.Any])
    if (Syntax != null) __obj.updateDynamic("Syntax")(Syntax.asInstanceOf[js.Any])
    if (Telecine != null) __obj.updateDynamic("Telecine")(Telecine.asInstanceOf[js.Any])
    if (TemporalAdaptiveQuantization != null) __obj.updateDynamic("TemporalAdaptiveQuantization")(TemporalAdaptiveQuantization.asInstanceOf[js.Any])
    if (UnregisteredSeiTimecode != null) __obj.updateDynamic("UnregisteredSeiTimecode")(UnregisteredSeiTimecode.asInstanceOf[js.Any])
    __obj.asInstanceOf[H264Settings]
  }
}

