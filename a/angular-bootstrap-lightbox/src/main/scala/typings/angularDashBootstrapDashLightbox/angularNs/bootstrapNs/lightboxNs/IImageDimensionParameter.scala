package typings.angularDashBootstrapDashLightbox.angularNs.bootstrapNs.lightboxNs

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
    val __obj = js.Dynamic.literal(imageHeight = imageHeight, imageWidth = imageWidth, windowHeight = windowHeight, windowWidth = windowWidth)
  
    __obj.asInstanceOf[IImageDimensionParameter]
  }
}

