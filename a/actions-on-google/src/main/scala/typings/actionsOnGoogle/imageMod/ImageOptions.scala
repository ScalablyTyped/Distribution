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
  def apply(
    alt: String,
    url: String,
    height: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): ImageOptions = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageOptions]
  }
}

