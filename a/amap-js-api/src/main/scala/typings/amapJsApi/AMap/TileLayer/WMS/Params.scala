package typings.amapJsApi.AMap.TileLayer.WMS

import typings.amapJsApi.amapJsApiStrings.FALSE
import typings.amapJsApi.amapJsApiStrings.TRUE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Params extends js.Object {
  var BGCOLOR: js.UndefOr[String] = js.native
  var ELEVATION: js.UndefOr[String] = js.native
  var EXCEPTIONS: js.UndefOr[String] = js.native
  var FORMAT: js.UndefOr[String] = js.native
  var LAYERS: js.UndefOr[String] = js.native
  var STYLES: js.UndefOr[String] = js.native
  var TIME: js.UndefOr[String] = js.native
  var TRANSPARENT: js.UndefOr[TRUE | FALSE] = js.native
  var VERSION: js.UndefOr[String] = js.native
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
    def setBGCOLOR(value: String): Self = this.set("BGCOLOR", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBGCOLOR: Self = this.set("BGCOLOR", js.undefined)
    @scala.inline
    def setELEVATION(value: String): Self = this.set("ELEVATION", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteELEVATION: Self = this.set("ELEVATION", js.undefined)
    @scala.inline
    def setEXCEPTIONS(value: String): Self = this.set("EXCEPTIONS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEXCEPTIONS: Self = this.set("EXCEPTIONS", js.undefined)
    @scala.inline
    def setFORMAT(value: String): Self = this.set("FORMAT", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFORMAT: Self = this.set("FORMAT", js.undefined)
    @scala.inline
    def setLAYERS(value: String): Self = this.set("LAYERS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLAYERS: Self = this.set("LAYERS", js.undefined)
    @scala.inline
    def setSTYLES(value: String): Self = this.set("STYLES", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSTYLES: Self = this.set("STYLES", js.undefined)
    @scala.inline
    def setTIME(value: String): Self = this.set("TIME", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTIME: Self = this.set("TIME", js.undefined)
    @scala.inline
    def setTRANSPARENT(value: TRUE | FALSE): Self = this.set("TRANSPARENT", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTRANSPARENT: Self = this.set("TRANSPARENT", js.undefined)
    @scala.inline
    def setVERSION(value: String): Self = this.set("VERSION", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVERSION: Self = this.set("VERSION", js.undefined)
  }
  
}

