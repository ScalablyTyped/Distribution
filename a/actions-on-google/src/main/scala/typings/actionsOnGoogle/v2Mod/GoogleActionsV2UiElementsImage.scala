package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2UiElementsImage extends js.Object {
  /**
    * A text description of the image to be used for accessibility, e.g. screen
    * readers.
    * Required.
    */
  var accessibilityText: js.UndefOr[String] = js.undefined
  /**
    * The height of the image in pixels.
    * Optional.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * The source url of the image. Images can be JPG, PNG and GIF (animated and
    * non-animated). For example,`https://www.agentx.com/logo.png`. Required.
    */
  var url: js.UndefOr[String] = js.undefined
  /**
    * The width of the image in pixels.
    * Optional.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object GoogleActionsV2UiElementsImage {
  @scala.inline
  def apply(
    accessibilityText: String = null,
    height: js.UndefOr[Double] = js.undefined,
    url: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): GoogleActionsV2UiElementsImage = {
    val __obj = js.Dynamic.literal()
    if (accessibilityText != null) __obj.updateDynamic("accessibilityText")(accessibilityText.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2UiElementsImage]
  }
}

