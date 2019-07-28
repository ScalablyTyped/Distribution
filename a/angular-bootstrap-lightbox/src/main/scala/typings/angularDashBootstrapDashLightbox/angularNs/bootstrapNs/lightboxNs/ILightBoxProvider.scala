package typings.angularDashBootstrapDashLightbox.angularNs.bootstrapNs.lightboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILightBoxProvider extends js.Object {
  var templateUrl: String
  def calculateImageDimensionLimits(dimensions: IImageDimensionParameter): IImageDimensionLimits
  def calculateModalDimensions(dimensions: IModalDimensionsParameter): IModalDimensions
}

object ILightBoxProvider {
  @scala.inline
  def apply(
    calculateImageDimensionLimits: IImageDimensionParameter => IImageDimensionLimits,
    calculateModalDimensions: IModalDimensionsParameter => IModalDimensions,
    templateUrl: String
  ): ILightBoxProvider = {
    val __obj = js.Dynamic.literal(calculateImageDimensionLimits = js.Any.fromFunction1(calculateImageDimensionLimits), calculateModalDimensions = js.Any.fromFunction1(calculateModalDimensions), templateUrl = templateUrl)
  
    __obj.asInstanceOf[ILightBoxProvider]
  }
}

