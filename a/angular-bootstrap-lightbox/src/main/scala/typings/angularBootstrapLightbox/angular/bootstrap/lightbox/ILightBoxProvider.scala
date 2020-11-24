package typings.angularBootstrapLightbox.angular.bootstrap.lightbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILightBoxProvider extends js.Object {
  
  def calculateImageDimensionLimits(dimensions: IImageDimensionParameter): IImageDimensionLimits = js.native
  
  def calculateModalDimensions(dimensions: IModalDimensionsParameter): IModalDimensions = js.native
  
  var templateUrl: String = js.native
}
object ILightBoxProvider {
  
  @scala.inline
  def apply(
    calculateImageDimensionLimits: IImageDimensionParameter => IImageDimensionLimits,
    calculateModalDimensions: IModalDimensionsParameter => IModalDimensions,
    templateUrl: String
  ): ILightBoxProvider = {
    val __obj = js.Dynamic.literal(calculateImageDimensionLimits = js.Any.fromFunction1(calculateImageDimensionLimits), calculateModalDimensions = js.Any.fromFunction1(calculateModalDimensions), templateUrl = templateUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILightBoxProvider]
  }
  
  @scala.inline
  implicit class ILightBoxProviderOps[Self <: ILightBoxProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCalculateImageDimensionLimits(value: IImageDimensionParameter => IImageDimensionLimits): Self = this.set("calculateImageDimensionLimits", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCalculateModalDimensions(value: IModalDimensionsParameter => IModalDimensions): Self = this.set("calculateModalDimensions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTemplateUrl(value: String): Self = this.set("templateUrl", value.asInstanceOf[js.Any])
  }
}
