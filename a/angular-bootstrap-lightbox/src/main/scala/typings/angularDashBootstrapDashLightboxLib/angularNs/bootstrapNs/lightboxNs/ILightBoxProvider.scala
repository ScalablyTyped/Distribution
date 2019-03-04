package typings
package angularDashBootstrapDashLightboxLib.angularNs.bootstrapNs.lightboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILightBoxProvider extends js.Object {
  var templateUrl: java.lang.String
  def calculateImageDimensionLimits(dimensions: IImageDimensionParameter): IImageDimensionLimits
  def calculateModalDimensions(dimensions: IModalDimensionsParameter): IModalDimensions
}

object ILightBoxProvider {
  @scala.inline
  def apply(
    calculateImageDimensionLimits: js.Function1[IImageDimensionParameter, IImageDimensionLimits],
    calculateModalDimensions: js.Function1[IModalDimensionsParameter, IModalDimensions],
    templateUrl: java.lang.String
  ): ILightBoxProvider = {
    val __obj = js.Dynamic.literal(calculateImageDimensionLimits = calculateImageDimensionLimits, calculateModalDimensions = calculateModalDimensions, templateUrl = templateUrl)
  
    __obj.asInstanceOf[ILightBoxProvider]
  }
}

