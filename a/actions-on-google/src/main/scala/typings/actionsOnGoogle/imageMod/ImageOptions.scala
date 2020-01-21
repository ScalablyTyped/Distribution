package typings.actionsOnGoogle.imageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageOptions extends js.Object {
  /**
    * Text to replace for image for accessibility.
    * @public
    */
  var alt: String
  /**
    * Height of the image.
    * @public
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Image source URL.
    * @public
    */
  var url: String
  /**
    * Width of the image.
    * @public
    */
  var width: js.UndefOr[Double] = js.undefined
}

object ImageOptions {
  @scala.inline
  def apply(alt: String, url: String, height: Int | Double = null, width: Int | Double = null): ImageOptions = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageOptions]
  }
}

