package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageSource extends js.Object {
  var heightPixels: js.UndefOr[Double] = js.native
  /**
    * Recommended sizes for the following dimensions (in px):
    * 480 x 320 for X_SMALL,
    * 720 x 480 for SMALL,
    * 960 x 640 for MEDIUM,
    * 1200 x 800 for LARGE,
    * 1920 x 1280 for X_LARGE
    */
  var size: js.UndefOr[ImageSourceSize] = js.native
  var url: String = js.native
  var widthPixels: js.UndefOr[Double] = js.native
}

object ImageSource {
  @scala.inline
  def apply(url: String): ImageSource = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageSource]
  }
  @scala.inline
  implicit class ImageSourceOps[Self <: ImageSource] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeightPixels(value: Double): Self = this.set("heightPixels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeightPixels: Self = this.set("heightPixels", js.undefined)
    @scala.inline
    def setSize(value: ImageSourceSize): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setWidthPixels(value: Double): Self = this.set("widthPixels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidthPixels: Self = this.set("widthPixels", js.undefined)
  }
  
}

