package typings.angularDashBootstrapDashLightbox.angular.bootstrap.lightbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IImageDimensionParameter extends js.Object {
  var imageHeight: Double
  var imageWidth: Double
  var windowHeight: Double
  var windowWidth: Double
}

object IImageDimensionParameter {
  @scala.inline
  def apply(imageHeight: Double, imageWidth: Double, windowHeight: Double, windowWidth: Double): IImageDimensionParameter = {
    val __obj = js.Dynamic.literal(imageHeight = imageHeight.asInstanceOf[js.Any], imageWidth = imageWidth.asInstanceOf[js.Any], windowHeight = windowHeight.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IImageDimensionParameter]
  }
}

