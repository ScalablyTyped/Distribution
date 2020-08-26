package typings.angularBootstrapLightbox.angular.bootstrap.lightbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModalDimensionsParameter extends js.Object {
  var imageDisplayHeight: Double = js.native
  var imageDisplayWidth: Double = js.native
  var windowHeight: Double = js.native
  var windowWidth: Double = js.native
}

object IModalDimensionsParameter {
  @scala.inline
  def apply(imageDisplayHeight: Double, imageDisplayWidth: Double, windowHeight: Double, windowWidth: Double): IModalDimensionsParameter = {
    val __obj = js.Dynamic.literal(imageDisplayHeight = imageDisplayHeight.asInstanceOf[js.Any], imageDisplayWidth = imageDisplayWidth.asInstanceOf[js.Any], windowHeight = windowHeight.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModalDimensionsParameter]
  }
  @scala.inline
  implicit class IModalDimensionsParameterOps[Self <: IModalDimensionsParameter] (val x: Self) extends AnyVal {
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
    def setImageDisplayHeight(value: Double): Self = this.set("imageDisplayHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageDisplayWidth(value: Double): Self = this.set("imageDisplayWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindowHeight(value: Double): Self = this.set("windowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindowWidth(value: Double): Self = this.set("windowWidth", value.asInstanceOf[js.Any])
  }
  
}

