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

