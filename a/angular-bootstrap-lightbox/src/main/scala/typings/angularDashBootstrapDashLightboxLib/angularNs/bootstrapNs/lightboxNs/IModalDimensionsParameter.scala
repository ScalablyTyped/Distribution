package typings
package angularDashBootstrapDashLightboxLib.angularNs.bootstrapNs.lightboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModalDimensionsParameter extends js.Object {
  var imageDisplayHeight: scala.Double
  var imageDisplayWidth: scala.Double
  var windowHeight: scala.Double
  var windowWidth: scala.Double
}

object IModalDimensionsParameter {
  @scala.inline
  def apply(
    imageDisplayHeight: scala.Double,
    imageDisplayWidth: scala.Double,
    windowHeight: scala.Double,
    windowWidth: scala.Double
  ): IModalDimensionsParameter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("imageDisplayHeight")(imageDisplayHeight)
    __obj.updateDynamic("imageDisplayWidth")(imageDisplayWidth)
    __obj.updateDynamic("windowHeight")(windowHeight)
    __obj.updateDynamic("windowWidth")(windowWidth)
    __obj.asInstanceOf[IModalDimensionsParameter]
  }
}

