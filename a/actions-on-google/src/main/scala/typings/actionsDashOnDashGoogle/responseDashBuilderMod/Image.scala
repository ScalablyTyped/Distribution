package typings.actionsDashOnDashGoogle.responseDashBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  /** Text to replace for image for accessibility. */
  var accessibilityText: String
  /** Height of the image. */
  var height: Double
  /** Image source URL. */
  var url: String
  /** Width of the image. */
  var width: Double
}

object Image {
  @scala.inline
  def apply(accessibilityText: String, height: Double, url: String, width: Double): Image = {
    val __obj = js.Dynamic.literal(accessibilityText = accessibilityText, height = height, url = url, width = width)
  
    __obj.asInstanceOf[Image]
  }
}

