package typings.amapJsApiRiding.AMap.Riding

import typings.amapJsApi.AMap.Map
import typings.amapJsApiRiding.AMap.RidingPolicy
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * 用于控制在路径规划结束后，是否自动调整地图视野使绘制的路线处于视口的可见范围
    */
  var autoFitView: js.UndefOr[Boolean] = js.native
  /**
    * 设置隐藏路径规划的起始点图标，设置为true：隐藏图标；设置false：显示图标 默认值为：false
    */
  var hideMarkers: js.UndefOr[Boolean] = js.native
  /**
    * 使用map属性时，绘制的规划线路是否显示描边，默认为true
    */
  var isOutline: js.UndefOr[Boolean] = js.native
  /**
    * AMap.Map对象, 展现结果的地图实例。
    * 当指定此参数后，搜索结果的标注、线路等均会自动添加到此地图上
    */
  var map: js.UndefOr[Map] = js.native
  /**
    * 使用map属性时，绘制的规划线路是否显示描边，默认为"white"
    */
  var outlineColor: js.UndefOr[String] = js.native
  /**
    * 结果列表的HTML容器id或容器元素，提供此参数后，结果列表将在此容器中进行展示
    */
  var panel: js.UndefOr[String | HTMLElement] = js.native
  /**
    * 骑行路线规划策略
    */
  var policy: js.UndefOr[RidingPolicy] = js.native
  // internal
  var showDir: js.UndefOr[Boolean] = js.native
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
    def setHideMarkers(value: Boolean): Self = this.set("hideMarkers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideMarkers: Self = this.set("hideMarkers", js.undefined)
    @scala.inline
    def setIsOutline(value: Boolean): Self = this.set("isOutline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsOutline: Self = this.set("isOutline", js.undefined)
    @scala.inline
    def setMap(value: Map): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setOutlineColor(value: String): Self = this.set("outlineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutlineColor: Self = this.set("outlineColor", js.undefined)
    @scala.inline
    def setPanel(value: String | HTMLElement): Self = this.set("panel", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanel: Self = this.set("panel", js.undefined)
    @scala.inline
    def setPolicy(value: RidingPolicy): Self = this.set("policy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
    @scala.inline
    def setShowDir(value: Boolean): Self = this.set("showDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowDir: Self = this.set("showDir", js.undefined)
  }
  
}

