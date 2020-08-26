package typings.amapJsApi.AMap.TileLayer.WMTS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Params extends js.Object {
  var Format: js.UndefOr[String] = js.native
  var Layer: js.UndefOr[String] = js.native
  var Style: js.UndefOr[String] = js.native
  var Version: js.UndefOr[String] = js.native
}

object Params {
  @scala.inline
  def apply(): Params = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Params]
  }
  @scala.inline
  implicit class ParamsOps[Self <: Params] (val x: Self) extends AnyVal {
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
    def setFormat(value: String): Self = this.set("Format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("Format", js.undefined)
    @scala.inline
    def setLayer(value: String): Self = this.set("Layer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayer: Self = this.set("Layer", js.undefined)
    @scala.inline
    def setStyle(value: String): Self = this.set("Style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("Style", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
  
}

