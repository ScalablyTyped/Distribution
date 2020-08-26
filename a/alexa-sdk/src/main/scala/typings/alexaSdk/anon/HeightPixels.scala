package typings.alexaSdk.anon

import typings.alexaSdk.mod.ImageSourceSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeightPixels extends js.Object {
  var heightPixels: js.UndefOr[Double] = js.native
  var size: ImageSourceSize = js.native
  var url: String = js.native
  var widthPixels: js.UndefOr[Double] = js.native
}

object HeightPixels {
  @scala.inline
  def apply(size: ImageSourceSize, url: String): HeightPixels = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeightPixels]
  }
  @scala.inline
  implicit class HeightPixelsOps[Self <: HeightPixels] (val x: Self) extends AnyVal {
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
    def setSize(value: ImageSourceSize): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeightPixels(value: Double): Self = this.set("heightPixels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeightPixels: Self = this.set("heightPixels", js.undefined)
    @scala.inline
    def setWidthPixels(value: Double): Self = this.set("widthPixels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidthPixels: Self = this.set("widthPixels", js.undefined)
  }
  
}

