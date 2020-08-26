package typings.alexaSdk.mod

import typings.alexaSdk.anon.HeightPixels
import typings.alexaSdk.anon.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("alexa-sdk", "utils")
@js.native
object utils extends js.Object {
  @js.native
  object ImageUtils extends js.Object {
    /**
      * Creates an image object with a single source
      * These images may be in either JPEG or PNG formats, with the appropriate file extensions.
      * An image cannot be larger than 2 MB
      * You must host the images at HTTPS URLs that are publicly accessible.
      * widthPixels and heightPixels are optional - Do not include them unless they are exactly correct.
      * By default, for Echo Show, size takes the value X_SMALL. If the other size values are included,
      * then the order of precedence for displaying images begins with X_LARGE and proceeds downward,
      * which means that larger images will be downscaled for display on Echo Show if provided.
      * example : ImageUtils.makeImage("https://url/to/my/img.png", 300, 400, "SMALL", "image description")
      * @param url url of the image
      * @param widthPixels (optional) width of the image in pixels
      * @param heightPixels (optional) height of the image in pixels
      * @param size size of the image (X_SMALL, SMALL, MEDIUM, LARGE, X_LARGE)
      * @param description text used to describe the image in a screen reader
      * @returns Image
      */
    def makeImage(url: String): Image = js.native
    def makeImage(
      url: String,
      widthPixels: js.UndefOr[scala.Nothing],
      heightPixels: js.UndefOr[scala.Nothing],
      size: js.UndefOr[scala.Nothing],
      description: String
    ): Image = js.native
    def makeImage(
      url: String,
      widthPixels: js.UndefOr[scala.Nothing],
      heightPixels: js.UndefOr[scala.Nothing],
      size: ImageSourceSize
    ): Image = js.native
    def makeImage(
      url: String,
      widthPixels: js.UndefOr[scala.Nothing],
      heightPixels: js.UndefOr[scala.Nothing],
      size: ImageSourceSize,
      description: String
    ): Image = js.native
    def makeImage(url: String, widthPixels: js.UndefOr[scala.Nothing], heightPixels: Double): Image = js.native
    def makeImage(
      url: String,
      widthPixels: js.UndefOr[scala.Nothing],
      heightPixels: Double,
      size: js.UndefOr[scala.Nothing],
      description: String
    ): Image = js.native
    def makeImage(url: String, widthPixels: js.UndefOr[scala.Nothing], heightPixels: Double, size: ImageSourceSize): Image = js.native
    def makeImage(
      url: String,
      widthPixels: js.UndefOr[scala.Nothing],
      heightPixels: Double,
      size: ImageSourceSize,
      description: String
    ): Image = js.native
    def makeImage(url: String, widthPixels: Double): Image = js.native
    def makeImage(
      url: String,
      widthPixels: Double,
      heightPixels: js.UndefOr[scala.Nothing],
      size: js.UndefOr[scala.Nothing],
      description: String
    ): Image = js.native
    def makeImage(url: String, widthPixels: Double, heightPixels: js.UndefOr[scala.Nothing], size: ImageSourceSize): Image = js.native
    def makeImage(
      url: String,
      widthPixels: Double,
      heightPixels: js.UndefOr[scala.Nothing],
      size: ImageSourceSize,
      description: String
    ): Image = js.native
    def makeImage(url: String, widthPixels: Double, heightPixels: Double): Image = js.native
    def makeImage(
      url: String,
      widthPixels: Double,
      heightPixels: Double,
      size: js.UndefOr[scala.Nothing],
      description: String
    ): Image = js.native
    def makeImage(url: String, widthPixels: Double, heightPixels: Double, size: ImageSourceSize): Image = js.native
    def makeImage(url: String, widthPixels: Double, heightPixels: Double, size: ImageSourceSize, description: String): Image = js.native
    /**
      * Creates an image object with a multiple sources, source images are provided as an array of image objects
      * These images may be in either JPEG or PNG formats, with the appropriate file extensions.
      * An image cannot be larger than 2 MB
      * You must host the images at HTTPS URLs that are publicly accessible.
      * widthPixels and heightPixels are optional - Do not include them unless they are exactly correct.
      * By default, for Echo Show, size takes the value X_SMALL. If the other size values are included,
      * then the order of precedence for displaying images begins with X_LARGE and proceeds downward,
      * which means that larger images will be downscaled for display on Echo Show if provided.
      * example :
      * let imgArr = [
      *  { "https://url/to/my/small.png", 300, 400, "SMALL" },
      *  { "https://url/to/my/large.png", 900, 1200, "LARGE" },
      * ]
      *  ImageUtils.makeImage(imgArr, "image description")
      *
      * @param imgArr Array of Image
      * @param description text used to describe the image in a screen reader
      * @returns Image
      */
    def makeImages(imgArr: js.Array[HeightPixels], description: String): Image = js.native
  }
  
  /**
    * Utility methods for building TextField objects
    */
  @js.native
  object TextUtils extends js.Object {
    /**
      * Creates a plain TextField object with contents : text
      * @param text contents of plain text object
      * @returns TextField
      */
    def makePlainText(text: String): TextField = js.native
    /**
      * Creates a rich TextField object with contents : text
      * @param text text
      * @returns TextField
      */
    def makeRichText(text: String): TextField = js.native
    /**
      * Creates a textContent
      * @param primaryText primary Text
      * @param secondaryText secondary Text
      * @param tertiaryText tertiary Text
      * @returns TextContent
      */
    def makeTextContent(primaryText: Text, secondaryText: Text, tertiaryText: Text): TextContent = js.native
  }
  
}

