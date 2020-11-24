package typings.amapJsApiDriving.AMap.Driving

import typings.amapJsApi.AMap.Map
import typings.amapJsApiDriving.AMap.DrivingPolicy
import typings.amapJsApiDriving.amapJsApiDrivingStrings.all
import typings.amapJsApiDriving.amapJsApiDrivingStrings.base
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * 于控制在路径规划结束后，是否自动调整地图视野使绘制的路线处于视口的可见范围
    */
  var autoFitView: js.UndefOr[Boolean] = js.native
  
  /**
    * 返回信息种类
    * 默认值：base，返回基本地址信息
    * 当取值为：all，返回DriveStep基本信息+DriveStep详细信息
    */
  var extensions: js.UndefOr[base | all] = js.native
  
  /**
    * 默认为0，表示可以使用轮渡，为1的时候表示不可以使用轮渡
    */
  var ferry: js.UndefOr[Boolean] = js.native
  
  /**
    * 设置隐藏路径规划的起始点图标
    */
  var hideMarkers: js.UndefOr[Boolean] = js.native
  
  /**
    * 使用map属性时，绘制的规划线路是否显示描边。缺省为true
    */
  var isOutline: js.UndefOr[Boolean] = js.native
  
  /**
    * AMap.Map对象
    * 展现结果的地图实例。当指定此参数后，搜索结果的标注、线路等均会自动添加到此地图上。
    */
  var map: js.UndefOr[Map] = js.native
  
  /**
    * 除省份之外车牌的字母和数字，用于判断限行相关，与province属性组合使用。
    */
  var number: js.UndefOr[String] = js.native
  
  /**
    * 使用map属性时，绘制的规划线路的描边颜色。缺省为'white'
    */
  var outlineColor: js.UndefOr[String] = js.native
  
  /**
    * 结果列表的HTML容器id或容器元素，提供此参数后，结果列表将在此容器中进行展示。
    */
  var panel: js.UndefOr[String | HTMLElement] = js.native
  
  /**
    * 驾车路线规划策略
    */
  var policy: js.UndefOr[DrivingPolicy] = js.native
  
  /**
    * 车牌省份的汉字缩写，用于判断是否限行，与number属性组合使用。
    */
  var province: js.UndefOr[String] = js.native
  
  // internal
  var showDir: js.UndefOr[Boolean] = js.native
  
  /**
    * 设置是否显示实时路况信息，默认设置为true。
    * 显示绿色代表畅通，黄色代表轻微拥堵，红色代表比较拥堵，灰色表示无路况信息。
    */
  var showTraffic: js.UndefOr[Boolean] = js.native
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
    def setExtensions(value: base | all): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    
    @scala.inline
    def setFerry(value: Boolean): Self = this.set("ferry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFerry: Self = this.set("ferry", js.undefined)
    
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
    def setNumber(value: String): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    
    @scala.inline
    def setOutlineColor(value: String): Self = this.set("outlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlineColor: Self = this.set("outlineColor", js.undefined)
    
    @scala.inline
    def setPanel(value: String | HTMLElement): Self = this.set("panel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePanel: Self = this.set("panel", js.undefined)
    
    @scala.inline
    def setPolicy(value: DrivingPolicy): Self = this.set("policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
    
    @scala.inline
    def setProvince(value: String): Self = this.set("province", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvince: Self = this.set("province", js.undefined)
    
    @scala.inline
    def setShowDir(value: Boolean): Self = this.set("showDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDir: Self = this.set("showDir", js.undefined)
    
    @scala.inline
    def setShowTraffic(value: Boolean): Self = this.set("showTraffic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTraffic: Self = this.set("showTraffic", js.undefined)
  }
}
