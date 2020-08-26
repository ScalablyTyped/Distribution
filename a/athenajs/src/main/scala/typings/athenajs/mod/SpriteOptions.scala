package typings.athenajs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpriteOptions extends DrawableOptions {
  var animations: js.UndefOr[Animations] = js.native
  var data: js.UndefOr[JSObject] = js.native
  var easing: js.UndefOr[String] = js.native
  var imageId: js.UndefOr[String] = js.native
}

object SpriteOptions {
  @scala.inline
  def apply(): SpriteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpriteOptions]
  }
  @scala.inline
  implicit class SpriteOptionsOps[Self <: SpriteOptions] (val x: Self) extends AnyVal {
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
    def setAnimations(value: Animations): Self = this.set("animations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimations: Self = this.set("animations", js.undefined)
    @scala.inline
    def setData(value: JSObject): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setImageId(value: String): Self = this.set("imageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageId: Self = this.set("imageId", js.undefined)
  }
  
}

