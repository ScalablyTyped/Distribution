package typings.amapJsSdk.anon

import typings.amapJsSdk.AMap.LngLat
import typings.amapJsSdk.AMap.Pixel
import typings.amapJsSdk.AMap.Size
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoMove extends js.Object {
  var autoMove: js.UndefOr[Boolean] = js.native
  var closeWhenClickMap: js.UndefOr[Boolean] = js.native
  var content: js.UndefOr[String | HTMLElement] = js.native
  var isCustom: js.UndefOr[Boolean] = js.native
  var offset: js.UndefOr[Pixel] = js.native
  var position: js.UndefOr[LngLat] = js.native
  var showShadow: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[Size] = js.native
}

object AutoMove {
  @scala.inline
  def apply(): AutoMove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoMove]
  }
  @scala.inline
  implicit class AutoMoveOps[Self <: AutoMove] (val x: Self) extends AnyVal {
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
    def setAutoMove(value: Boolean): Self = this.set("autoMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoMove: Self = this.set("autoMove", js.undefined)
    @scala.inline
    def setCloseWhenClickMap(value: Boolean): Self = this.set("closeWhenClickMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseWhenClickMap: Self = this.set("closeWhenClickMap", js.undefined)
    @scala.inline
    def setContent(value: String | HTMLElement): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setIsCustom(value: Boolean): Self = this.set("isCustom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsCustom: Self = this.set("isCustom", js.undefined)
    @scala.inline
    def setOffset(value: Pixel): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setPosition(value: LngLat): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setShowShadow(value: Boolean): Self = this.set("showShadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowShadow: Self = this.set("showShadow", js.undefined)
    @scala.inline
    def setSize(value: Size): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

