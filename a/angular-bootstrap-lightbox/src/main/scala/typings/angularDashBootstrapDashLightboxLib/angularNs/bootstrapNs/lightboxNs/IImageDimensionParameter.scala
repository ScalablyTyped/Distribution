package typings
package angularDashBootstrapDashLightboxLib.angularNs.bootstrapNs.lightboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IImageDimensionParameter extends js.Object {
  var imageHeight: scala.Double
  var imageWidth: scala.Double
  var windowHeight: scala.Double
  var windowWidth: scala.Double
}

object IImageDimensionParameter {
  @scala.inline
  def apply(
    imageHeight: scala.Double,
    imageWidth: scala.Double,
    windowHeight: scala.Double,
    windowWidth: scala.Double
  ): IImageDimensionParameter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("imageHeight")(imageHeight)
    __obj.updateDynamic("imageWidth")(imageWidth)
    __obj.updateDynamic("windowHeight")(windowHeight)
    __obj.updateDynamic("windowWidth")(windowWidth)
    __obj.asInstanceOf[IImageDimensionParameter]
  }
}

