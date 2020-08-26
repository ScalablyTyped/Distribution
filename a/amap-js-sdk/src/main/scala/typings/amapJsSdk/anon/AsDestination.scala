package typings.amapJsSdk.anon

import typings.amapJsSdk.AMap.LngLat
import typings.amapJsSdk.AMap.Pixel
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsDestination extends js.Object {
  var asDestination: js.UndefOr[Boolean] = js.native
  var asOrigin: js.UndefOr[Boolean] = js.native
  var autoMove: js.UndefOr[Boolean] = js.native
  var closeWhenClickMap: js.UndefOr[Boolean] = js.native
  var content: js.UndefOr[String | HTMLElement] = js.native
  var driving: js.UndefOr[Boolean] = js.native
  var offset: js.UndefOr[Pixel] = js.native
  var panel: js.UndefOr[String | HTMLElement] = js.native
  var placeSearch: js.UndefOr[Boolean] = js.native
  var position: js.UndefOr[LngLat] = js.native
  var searchRadius: js.UndefOr[Double] = js.native
  var transit: js.UndefOr[Boolean] = js.native
  var walking: js.UndefOr[Boolean] = js.native
}

object AsDestination {
  @scala.inline
  def apply(): AsDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsDestination]
  }
  @scala.inline
  implicit class AsDestinationOps[Self <: AsDestination] (val x: Self) extends AnyVal {
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
    def setAsDestination(value: Boolean): Self = this.set("asDestination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsDestination: Self = this.set("asDestination", js.undefined)
    @scala.inline
    def setAsOrigin(value: Boolean): Self = this.set("asOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsOrigin: Self = this.set("asOrigin", js.undefined)
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
    def setDriving(value: Boolean): Self = this.set("driving", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDriving: Self = this.set("driving", js.undefined)
    @scala.inline
    def setOffset(value: Pixel): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setPanel(value: String | HTMLElement): Self = this.set("panel", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanel: Self = this.set("panel", js.undefined)
    @scala.inline
    def setPlaceSearch(value: Boolean): Self = this.set("placeSearch", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceSearch: Self = this.set("placeSearch", js.undefined)
    @scala.inline
    def setPosition(value: LngLat): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setSearchRadius(value: Double): Self = this.set("searchRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchRadius: Self = this.set("searchRadius", js.undefined)
    @scala.inline
    def setTransit(value: Boolean): Self = this.set("transit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransit: Self = this.set("transit", js.undefined)
    @scala.inline
    def setWalking(value: Boolean): Self = this.set("walking", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWalking: Self = this.set("walking", js.undefined)
  }
  
}

