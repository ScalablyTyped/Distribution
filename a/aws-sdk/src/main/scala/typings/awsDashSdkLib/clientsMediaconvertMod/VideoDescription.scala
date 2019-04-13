package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoDescription extends js.Object {
  /**
    * This setting only applies to H.264, H.265, and MPEG2 outputs. Use Insert AFD signaling (AfdSignaling) to specify whether the service includes AFD values in the output video data and what those values are. * Choose None to remove all AFD values from this output. * Choose Fixed to ignore input AFD values and instead encode the value specified in the job. * Choose Auto to calculate output AFD values based on the input AFD scaler data.
    */
  var AfdSignaling: js.UndefOr[AfdSignaling] = js.undefined
  /**
    * The anti-alias filter is automatically applied to all outputs. The service no longer accepts the value DISABLED for AntiAlias. If you specify that in your job, the service will ignore the setting.
    */
  var AntiAlias: js.UndefOr[AntiAlias] = js.undefined
  /**
    * Video codec settings, (CodecSettings) under (VideoDescription), contains the group of settings related to video encoding. The settings in this group vary depending on the value you choose for Video codec (Codec). For each codec enum you choose, define the corresponding settings object. The following lists the codec enum, settings object pairs. * H_264, H264Settings * H_265, H265Settings * MPEG2, Mpeg2Settings * PRORES, ProresSettings * FRAME_CAPTURE, FrameCaptureSettings
    */
  var CodecSettings: js.UndefOr[VideoCodecSettings] = js.undefined
  /**
    * Enable Insert color metadata (ColorMetadata) to include color metadata in this output. This setting is enabled by default.
    */
  var ColorMetadata: js.UndefOr[ColorMetadata] = js.undefined
  /**
    * Applies only if your input aspect ratio is different from your output aspect ratio. Use Input cropping rectangle (Crop) to specify the  video area the service will include in the output. This will crop the input source, causing video pixels to be removed on encode. If you crop your input frame size to smaller than your output frame size, make sure to specify the behavior you want in your output setting "Scaling behavior".
    */
  var Crop: js.UndefOr[Rectangle] = js.undefined
  /**
    * Applies only to 29.97 fps outputs. When this feature is enabled, the service will use drop-frame timecode on outputs. If it is not possible to use drop-frame timecode, the system will fall back to non-drop-frame. This setting is enabled by default when Timecode insertion (TimecodeInsertion) is enabled.
    */
  var DropFrameTimecode: js.UndefOr[DropFrameTimecode] = js.undefined
  /**
    * Applies only if you set AFD Signaling(AfdSignaling) to Fixed (FIXED). Use Fixed (FixedAfd) to specify a four-bit AFD value which the service will write on all  frames of this video output.
    */
  var FixedAfd: js.UndefOr[__integerMin0Max15] = js.undefined
  /**
    * Use the Height (Height) setting to define the video resolution height for this output. Specify in pixels. If you don't provide a value here, the service will use the input height.
    */
  var Height: js.UndefOr[__integerMin32Max2160] = js.undefined
  /**
    * Use Position (Position) to point to a rectangle object to define your position. This setting overrides any other aspect ratio.
    */
  var Position: js.UndefOr[Rectangle] = js.undefined
  /**
    * Use Respond to AFD (RespondToAfd) to specify how the service changes the video itself in response to AFD values in the input. * Choose Respond to clip the input video frame according to the AFD value, input display aspect ratio, and output display aspect ratio. * Choose Passthrough to include the input AFD values. Do not choose this when AfdSignaling is set to (NONE). A preferred implementation of this workflow is to set RespondToAfd to (NONE) and set AfdSignaling to (AUTO). * Choose None to remove all input AFD values from this output.
    */
  var RespondToAfd: js.UndefOr[RespondToAfd] = js.undefined
  /**
    * Applies only if your input aspect ratio is different from your output aspect ratio. Choose "Stretch to output" to have the service stretch your video image to fit. Keep the setting "Default" to allow the service to letterbox your video instead. This setting overrides any positioning value you specify elsewhere in the job.
    */
  var ScalingBehavior: js.UndefOr[ScalingBehavior] = js.undefined
  /**
    * Use Sharpness (Sharpness) setting to specify the strength of anti-aliasing. This setting changes the width of the anti-alias filter kernel used for scaling. Sharpness only applies if your output resolution is different from your input resolution. 0 is the softest setting, 100 the sharpest, and 50 recommended for most content.
    */
  var Sharpness: js.UndefOr[__integerMin0Max100] = js.undefined
  /**
    * Applies only to H.264, H.265, MPEG2, and ProRes outputs. Only enable Timecode insertion when the input frame rate is identical to the output frame rate. To include timecodes in this output, set Timecode insertion (VideoTimecodeInsertion) to PIC_TIMING_SEI. To leave them out, set it to DISABLED. Default is DISABLED. When the service inserts timecodes in an output, by default, it uses any embedded timecodes from the input. If none are present, the service will set the timecode for the first output frame to zero. To change this default behavior, adjust the settings under Timecode configuration (TimecodeConfig). In the console, these settings are located under Job > Job settings > Timecode configuration. Note - Timecode source under input settings (InputTimecodeSource) does not affect the timecodes that are inserted in the output. Source under Job settings > Timecode configuration (TimecodeSource) does.
    */
  var TimecodeInsertion: js.UndefOr[VideoTimecodeInsertion] = js.undefined
  /**
    * Find additional transcoding features under Preprocessors (VideoPreprocessors). Enable the features at each output individually. These features are disabled by default.
    */
  var VideoPreprocessors: js.UndefOr[VideoPreprocessor] = js.undefined
  /**
    * Use Width (Width) to define the video resolution width, in pixels, for this output. If you don't provide a value here, the service will use the input width.
    */
  var Width: js.UndefOr[__integerMin32Max4096] = js.undefined
}

object VideoDescription {
  @scala.inline
  def apply(
    AfdSignaling: AfdSignaling = null,
    AntiAlias: AntiAlias = null,
    CodecSettings: VideoCodecSettings = null,
    ColorMetadata: ColorMetadata = null,
    Crop: Rectangle = null,
    DropFrameTimecode: DropFrameTimecode = null,
    FixedAfd: js.UndefOr[__integerMin0Max15] = js.undefined,
    Height: js.UndefOr[__integerMin32Max2160] = js.undefined,
    Position: Rectangle = null,
    RespondToAfd: RespondToAfd = null,
    ScalingBehavior: ScalingBehavior = null,
    Sharpness: js.UndefOr[__integerMin0Max100] = js.undefined,
    TimecodeInsertion: VideoTimecodeInsertion = null,
    VideoPreprocessors: VideoPreprocessor = null,
    Width: js.UndefOr[__integerMin32Max4096] = js.undefined
  ): VideoDescription = {
    val __obj = js.Dynamic.literal()
    if (AfdSignaling != null) __obj.updateDynamic("AfdSignaling")(AfdSignaling.asInstanceOf[js.Any])
    if (AntiAlias != null) __obj.updateDynamic("AntiAlias")(AntiAlias.asInstanceOf[js.Any])
    if (CodecSettings != null) __obj.updateDynamic("CodecSettings")(CodecSettings)
    if (ColorMetadata != null) __obj.updateDynamic("ColorMetadata")(ColorMetadata.asInstanceOf[js.Any])
    if (Crop != null) __obj.updateDynamic("Crop")(Crop)
    if (DropFrameTimecode != null) __obj.updateDynamic("DropFrameTimecode")(DropFrameTimecode.asInstanceOf[js.Any])
    if (!js.isUndefined(FixedAfd)) __obj.updateDynamic("FixedAfd")(FixedAfd)
    if (!js.isUndefined(Height)) __obj.updateDynamic("Height")(Height)
    if (Position != null) __obj.updateDynamic("Position")(Position)
    if (RespondToAfd != null) __obj.updateDynamic("RespondToAfd")(RespondToAfd.asInstanceOf[js.Any])
    if (ScalingBehavior != null) __obj.updateDynamic("ScalingBehavior")(ScalingBehavior.asInstanceOf[js.Any])
    if (!js.isUndefined(Sharpness)) __obj.updateDynamic("Sharpness")(Sharpness)
    if (TimecodeInsertion != null) __obj.updateDynamic("TimecodeInsertion")(TimecodeInsertion.asInstanceOf[js.Any])
    if (VideoPreprocessors != null) __obj.updateDynamic("VideoPreprocessors")(VideoPreprocessors)
    if (!js.isUndefined(Width)) __obj.updateDynamic("Width")(Width)
    __obj.asInstanceOf[VideoDescription]
  }
}

