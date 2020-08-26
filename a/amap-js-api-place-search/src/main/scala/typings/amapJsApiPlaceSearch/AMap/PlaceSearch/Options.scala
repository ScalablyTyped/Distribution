package typings.amapJsApiPlaceSearch.AMap.PlaceSearch

import typings.amapJsApi.AMap.Lang
import typings.amapJsApi.AMap.Map
import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.all
import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.base
import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.default
import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.newpc
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * 是否自动调整地图视野使绘制的Marker点都处于视口的可见范围
    */
  var autoFitView: js.UndefOr[Boolean] = js.native
  /**
    * 是否按照层级展示子POI数据
    * children=1，展示子节点POI数据，children=0，不展示子节点数据
    */
  var children: js.UndefOr[Double] = js.native
  /**
    * 兴趣点城市
    */
  var city: js.UndefOr[String] = js.native
  /**
    * 是否强制限制在设置的城市内搜索
    */
  var citylimit: js.UndefOr[Boolean] = js.native
  /**
    * 是否返回详细信息
    * base返回基本地址信息；all返回基本+详细信息
    */
  var extensions: js.UndefOr[base | all] = js.native
  /**
    * 检索语言类型
    */
  var lang: js.UndefOr[Lang] = js.native
  /**
    * Map对象
    */
  var map: js.UndefOr[Map] = js.native
  /**
    * 页码
    */
  var pageIndex: js.UndefOr[Double] = js.native
  /**
    * 单页显示结果条数
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * 结果列表的HTML容器id或容器元素
    */
  var panel: js.UndefOr[String | HTMLElement] = js.native
  var rankBy: js.UndefOr[String] = js.native
  // internal
  var renderEngine: js.UndefOr[String] = js.native
  /**
    * 绘制的UI风格
    */
  var renderStyle: js.UndefOr[newpc | default] = js.native
  /**
    * 是否在地图上显示周边搜索的圆或者范围搜索的多边形
    */
  var showCover: js.UndefOr[Boolean] = js.native
  /**
    * 兴趣点类别，多个类别用“|”分割
    */
  var `type`: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setExtensions(value: base | all): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setLang(value: Lang): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    @scala.inline
    def setMap(value: Map): Self = this.set("map", value.asInstanceOf[js.Any])
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
    def setRankBy(value: String): Self = this.set("rankBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRankBy: Self = this.set("rankBy", js.undefined)
    @scala.inline
    def setRenderEngine(value: String): Self = this.set("renderEngine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderEngine: Self = this.set("renderEngine", js.undefined)
    @scala.inline
    def setRenderStyle(value: newpc | default): Self = this.set("renderStyle", value.asInstanceOf[js.Any])
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

