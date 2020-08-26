package typings.amapJsSdk.anon

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoFitView extends js.Object {
  var autoFitView: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[Double] = js.native
  var city: js.UndefOr[String] = js.native
  var citylimit: js.UndefOr[Boolean] = js.native
  var extensions: js.UndefOr[String] = js.native
  var lang: js.UndefOr[String] = js.native
  var map: js.UndefOr[typings.amapJsSdk.AMap.Map] = js.native
  var pageIndex: js.UndefOr[Double] = js.native
  var pageSize: js.UndefOr[Double] = js.native
  var panel: js.UndefOr[String | HTMLElement] = js.native
  var renderStyle: js.UndefOr[String] = js.native
  var showCover: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object AutoFitView {
  @scala.inline
  def apply(): AutoFitView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoFitView]
  }
  @scala.inline
  implicit class AutoFitViewOps[Self <: AutoFitView] (val x: Self) extends AnyVal {
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
    def setAutoFitView(value: Boolean): Self = this.set("autoFitView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFitView: Self = this.set("autoFitView", js.undefined)
    @scala.inline
    def setChildren(value: Double): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCity: Self = this.set("city", js.undefined)
    @scala.inline
    def setCitylimit(value: Boolean): Self = this.set("citylimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCitylimit: Self = this.set("citylimit", js.undefined)
    @scala.inline
    def setExtensions(value: String): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    @scala.inline
    def setMap(value: typings.amapJsSdk.AMap.Map): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setPageIndex(value: Double): Self = this.set("pageIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageIndex: Self = this.set("pageIndex", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPanel(value: String | HTMLElement): Self = this.set("panel", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanel: Self = this.set("panel", js.undefined)
    @scala.inline
    def setRenderStyle(value: String): Self = this.set("renderStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderStyle: Self = this.set("renderStyle", js.undefined)
    @scala.inline
    def setShowCover(value: Boolean): Self = this.set("showCover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCover: Self = this.set("showCover", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

