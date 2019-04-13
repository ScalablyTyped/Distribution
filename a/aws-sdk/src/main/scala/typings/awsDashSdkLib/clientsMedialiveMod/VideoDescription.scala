package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoDescription extends js.Object {
  /**
    * Video codec settings.
    */
  var CodecSettings: js.UndefOr[VideoCodecSettings] = js.undefined
  /**
    * Output video height, in pixels. Must be an even number. For most codecs, you can leave this field and width blank in order to use the height and width (resolution) from the source. Note, however, that leaving blank is not recommended. For the Frame Capture codec, height and width are required.
    */
  var Height: js.UndefOr[__integer] = js.undefined
  /**
    * The name of this VideoDescription. Outputs will use this name to uniquely identify this Description.  Description names should be unique within this Live Event.
    */
  var Name: __string
  /**
    * Indicates how to respond to the AFD values in the input stream. RESPOND causes input video to be clipped, depending on the AFD value, input display aspect ratio, and output display aspect ratio, and (except for FRAMECAPTURE codec) includes the values in the output. PASSTHROUGH (does not apply to FRAMECAPTURE codec) ignores the AFD values and includes the values in the output, so input video is not clipped. NONE ignores the AFD values and does not include the values through to the output, so input video is not clipped.
    */
  var RespondToAfd: js.UndefOr[VideoDescriptionRespondToAfd] = js.undefined
  /**
    * STRETCHTOOUTPUT configures the output position to stretch the video to the specified output resolution (height and width). This option will override any position value. DEFAULT may insert black boxes (pillar boxes or letter boxes) around the video to provide the specified output resolution.
    */
  var ScalingBehavior: js.UndefOr[VideoDescriptionScalingBehavior] = js.undefined
  /**
    * Changes the strength of the anti-alias filter used for scaling. 0 is the softest setting, 100 is the sharpest. A setting of 50 is recommended for most content.
    */
  var Sharpness: js.UndefOr[__integerMin0Max100] = js.undefined
  /**
    * Output video width, in pixels. Must be an even number. For most codecs, you can leave this field and height blank in order to use the height and width (resolution) from the source. Note, however, that leaving blank is not recommended. For the Frame Capture codec, height and width are required.
    */
  var Width: js.UndefOr[__integer] = js.undefined
}

object VideoDescription {
  @scala.inline
  def apply(
    Name: __string,
    CodecSettings: VideoCodecSettings = null,
    Height: js.UndefOr[__integer] = js.undefined,
    RespondToAfd: VideoDescriptionRespondToAfd = null,
    ScalingBehavior: VideoDescriptionScalingBehavior = null,
    Sharpness: js.UndefOr[__integerMin0Max100] = js.undefined,
    Width: js.UndefOr[__integer] = js.undefined
  ): VideoDescription = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (CodecSettings != null) __obj.updateDynamic("CodecSettings")(CodecSettings)
    if (!js.isUndefined(Height)) __obj.updateDynamic("Height")(Height)
    if (RespondToAfd != null) __obj.updateDynamic("RespondToAfd")(RespondToAfd.asInstanceOf[js.Any])
    if (ScalingBehavior != null) __obj.updateDynamic("ScalingBehavior")(ScalingBehavior.asInstanceOf[js.Any])
    if (!js.isUndefined(Sharpness)) __obj.updateDynamic("Sharpness")(Sharpness)
    if (!js.isUndefined(Width)) __obj.updateDynamic("Width")(Width)
    __obj.asInstanceOf[VideoDescription]
  }
}

