package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertableImage extends js.Object {
  /**
    * Specify the time, in milliseconds, for the image to remain on the output video. This duration includes fade-in time but not fade-out time.
    */
  var Duration: js.UndefOr[__integerMin0Max2147483647] = js.undefined
  /**
    * Specify the length of time, in milliseconds, between the Start time that you specify for the image insertion and the time that the image appears at full opacity. Full opacity is the level that you specify for the opacity setting. If you don't specify a value for Fade-in, the image will appear abruptly at the overlay start time.
    */
  var FadeIn: js.UndefOr[__integerMin0Max2147483647] = js.undefined
  /**
    * Specify the length of time, in milliseconds, between the end of the time that you have specified for the image overlay Duration and when the overlaid image has faded to total transparency. If you don't specify a value for Fade-out, the image will disappear abruptly at the end of the inserted image duration.
    */
  var FadeOut: js.UndefOr[__integerMin0Max2147483647] = js.undefined
  /**
    * Specify the height of the inserted image in pixels. If you specify a value that's larger than the video resolution height, the service will crop your overlaid image to fit. To use the native height of the image, keep this setting blank.
    */
  var Height: js.UndefOr[__integerMin0Max2147483647] = js.undefined
  /**
    * Specify the Amazon S3 location of the image that you want to overlay on the video. Use a PNG or TGA file.
    */
  var ImageInserterInput: js.UndefOr[__stringMin14PatternS3BmpBMPPngPNGTgaTGA] = js.undefined
  /**
    * Specify the distance, in pixels, between the inserted image and the left edge of the video frame. Required for any image overlay that you specify.
    */
  var ImageX: js.UndefOr[__integerMin0Max2147483647] = js.undefined
  /**
    * Specify the distance, in pixels, between the overlaid image and the top edge of the video frame. Required for any image overlay that you specify.
    */
  var ImageY: js.UndefOr[__integerMin0Max2147483647] = js.undefined
  /**
    * Specify how overlapping inserted images appear. Images with higher values for Layer appear on top of images with lower values for Layer.
    */
  var Layer: js.UndefOr[__integerMin0Max99] = js.undefined
  /**
    * Use Opacity (Opacity) to specify how much of the underlying video shows through the inserted image. 0 is transparent and 100 is fully opaque. Default is 50.
    */
  var Opacity: js.UndefOr[__integerMin0Max100] = js.undefined
  /**
    * Specify the timecode of the frame that you want the overlay to first appear on. This must be in timecode (HH:MM:SS:FF or HH:MM:SS;FF) format. Remember to take into account your timecode source settings.
    */
  var StartTime: js.UndefOr[__stringPattern01D20305D205D] = js.undefined
  /**
    * Specify the width of the inserted image in pixels. If you specify a value that's larger than the video resolution width, the service will crop your overlaid image to fit. To use the native width of the image, keep this setting blank.
    */
  var Width: js.UndefOr[__integerMin0Max2147483647] = js.undefined
}

object InsertableImage {
  @scala.inline
  def apply(
    Duration: Int | Double = null,
    FadeIn: Int | Double = null,
    FadeOut: Int | Double = null,
    Height: Int | Double = null,
    ImageInserterInput: __stringMin14PatternS3BmpBMPPngPNGTgaTGA = null,
    ImageX: Int | Double = null,
    ImageY: Int | Double = null,
    Layer: Int | Double = null,
    Opacity: Int | Double = null,
    StartTime: __stringPattern01D20305D205D = null,
    Width: Int | Double = null
  ): InsertableImage = {
    val __obj = js.Dynamic.literal()
    if (Duration != null) __obj.updateDynamic("Duration")(Duration.asInstanceOf[js.Any])
    if (FadeIn != null) __obj.updateDynamic("FadeIn")(FadeIn.asInstanceOf[js.Any])
    if (FadeOut != null) __obj.updateDynamic("FadeOut")(FadeOut.asInstanceOf[js.Any])
    if (Height != null) __obj.updateDynamic("Height")(Height.asInstanceOf[js.Any])
    if (ImageInserterInput != null) __obj.updateDynamic("ImageInserterInput")(ImageInserterInput)
    if (ImageX != null) __obj.updateDynamic("ImageX")(ImageX.asInstanceOf[js.Any])
    if (ImageY != null) __obj.updateDynamic("ImageY")(ImageY.asInstanceOf[js.Any])
    if (Layer != null) __obj.updateDynamic("Layer")(Layer.asInstanceOf[js.Any])
    if (Opacity != null) __obj.updateDynamic("Opacity")(Opacity.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    if (Width != null) __obj.updateDynamic("Width")(Width.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertableImage]
  }
}

