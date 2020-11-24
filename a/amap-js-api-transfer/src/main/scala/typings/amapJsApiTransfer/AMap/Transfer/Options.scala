package typings.amapJsApiTransfer.AMap.Transfer

import typings.amapJsApi.AMap.Map
import typings.amapJsApiTransfer.AMap.TransferPolicy
import typings.amapJsApiTransfer.amapJsApiTransferStrings.all
import typings.amapJsApiTransfer.amapJsApiTransferStrings.base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * 用于控制在路径规划结束后，是否自动调整地图视野使绘制的路线处于视口的可见范围
    */
  var autoFitView: js.UndefOr[Boolean] = js.native
  
  /**
    * 公交换乘的城市，支持城市名称、城市区号、电话区号，此项为必填
    */
  var city: String = js.native
  
  /**
    * 终点城市，跨城公交路径规划时为必填参数
    */
  var cityd: js.UndefOr[String] = js.native
  
  /**
    * 返回结果控制, 默认值: base
    * base:返回基本信息
    * all:返回全部信息
    */
  var extensions: js.UndefOr[all | base] = js.native
  
  /**
    * 设置是否隐藏路径规划的起始点图标
    */
  var hideMarkers: js.UndefOr[Boolean] = js.native
  
  /**
    * 使用map属性时，绘制的规划线路是否显示描边。默认为true
    */
  var isOutline: js.UndefOr[Boolean] = js.native
  
  /**
    * AMap.Map对象, 展现结果的地图实例
    */
  var map: js.UndefOr[Map] = js.native
  
  /**
    * 是否计算夜班车，默认为不计算
    */
  var nightflag: js.UndefOr[Boolean] = js.native
  
  /**
    * 使用map属性时，绘制的规划线路的描边颜色。默认为'white'
    */
  var outlineColor: js.UndefOr[String] = js.native
  
  /**
    * 结果列表的HTML容器id或容器元素
    */
  var panel: js.UndefOr[String] = js.native
  
  /**
    * 公交换乘策略
    */
  var policy: js.UndefOr[TransferPolicy] = js.native
  
  // internal
  var showDir: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(city: String): Options = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any])
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
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFitView(value: Boolean): Self = this.set("autoFitView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFitView: Self = this.set("autoFitView", js.undefined)
    
    @scala.inline
    def setCityd(value: String): Self = this.set("cityd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCityd: Self = this.set("cityd", js.undefined)
    
    @scala.inline
    def setExtensions(value: all | base): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    
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
    def setNightflag(value: Boolean): Self = this.set("nightflag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNightflag: Self = this.set("nightflag", js.undefined)
    
    @scala.inline
    def setOutlineColor(value: String): Self = this.set("outlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlineColor: Self = this.set("outlineColor", js.undefined)
    
    @scala.inline
    def setPanel(value: String): Self = this.set("panel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePanel: Self = this.set("panel", js.undefined)
    
    @scala.inline
    def setPolicy(value: TransferPolicy): Self = this.set("policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
    
    @scala.inline
    def setShowDir(value: Boolean): Self = this.set("showDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDir: Self = this.set("showDir", js.undefined)
  }
}
