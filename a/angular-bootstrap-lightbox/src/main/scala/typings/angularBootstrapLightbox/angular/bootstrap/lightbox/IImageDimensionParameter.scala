package typings.angularBootstrapLightbox.angular.bootstrap.lightbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IImageDimensionParameter extends js.Object {
  var imageHeight: Double = js.native
  var imageWidth: Double = js.native
  var windowHeight: Double = js.native
  var windowWidth: Double = js.native
}

object IImageDimensionParameter {
  @scala.inline
  def apply(imageHeight: Double, imageWidth: Double, windowHeight: Double, windowWidth: Double): IImageDimensionParameter = {
    val __obj = js.Dynamic.literal(imageHeight = imageHeight.asInstanceOf[js.Any], imageWidth = imageWidth.asInstanceOf[js.Any], windowHeight = windowHeight.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[IImageDimensionParameter]
  }
  @scala.inline
  implicit class IImageDimensionParameterOps[Self <: IImageDimensionParameter] (val x: Self) extends AnyVal {
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
    def setImageHeight(value: Double): Self = this.set("imageHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageWidth(value: Double): Self = this.set("imageWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindowHeight(value: Double): Self = this.set("windowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindowWidth(value: Double): Self = this.set("windowWidth", value.asInstanceOf[js.Any])
  }
  
}

