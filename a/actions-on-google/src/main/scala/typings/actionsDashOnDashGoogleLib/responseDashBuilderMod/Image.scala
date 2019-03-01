package typings
package actionsDashOnDashGoogleLib.responseDashBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  /** Text to replace for image for accessibility. */
  var accessibilityText: java.lang.String
  /** Height of the image. */
  var height: scala.Double
  /** Image source URL. */
  var url: java.lang.String
  /** Width of the image. */
  var width: scala.Double
}

object Image {
  @scala.inline
  def apply(
    accessibilityText: java.lang.String,
    height: scala.Double,
    url: java.lang.String,
    width: scala.Double
  ): Image = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accessibilityText")(accessibilityText)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Image]
  }
}

