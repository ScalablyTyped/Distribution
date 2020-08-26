package typings.arcgisRestApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpatialReferenceWkt extends SpatialReference {
  var latestWkt: js.UndefOr[String] = js.native
  var wkt: js.UndefOr[String] = js.native
}

object SpatialReferenceWkt {
  @scala.inline
  def apply(): SpatialReferenceWkt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpatialReferenceWkt]
  }
  @scala.inline
  implicit class SpatialReferenceWktOps[Self <: SpatialReferenceWkt] (val x: Self) extends AnyVal {
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
    def setLatestWkt(value: String): Self = this.set("latestWkt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatestWkt: Self = this.set("latestWkt", js.undefined)
    @scala.inline
    def setWkt(value: String): Self = this.set("wkt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWkt: Self = this.set("wkt", js.undefined)
  }
  
}

