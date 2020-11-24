package typings.amapJsApiToolBar.AMap.ToolBar

import typings.amapJsApi.AMap.Marker
import typings.amapJsApi.AMap.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * 是否自动定位，即地图初始化加载完成后，是否自动定位的用户所在地，仅在支持HTML5的浏览器中有效
    */
  var autoPosition: js.UndefOr[Boolean] = js.native
  
  /**
    * 方向键盘是否可见
    */
  var direction: js.UndefOr[Boolean] = js.native
  
  /**
    * 是否使用精简模式
    */
  var liteStyle: js.UndefOr[Boolean] = js.native
  
  /**
    * 是否显示定位按钮
    */
  var locate: js.UndefOr[Boolean] = js.native
  
  /**
    * 自定义定位图标，值为Marker对象
    */
  var locationMarker: js.UndefOr[Marker[_]] = js.native
  
  /**
    * 定位失败后，是否开启IP定位
    */
  var noIpLocate: js.UndefOr[Boolean] = js.native
  
  /**
    * 相对于地图容器左上角的偏移量
    */
  var offset: js.UndefOr[Pixel] = js.native
  
  /**
    * 控件停靠位置
    * LT:左上角;
    * RT:右上角;
    * LB:左下角;
    * RB:右下角;
    */
  var position: js.UndefOr[Position] = js.native
  
  /**
    * 标尺键盘是否可见
    */
  var ruler: js.UndefOr[Boolean] = js.native
  
  // internal
  var timeout: js.UndefOr[Double] = js.native
  
  /**
    * 是否使用高德定位sdk用来辅助优化定位效果
    */
  var useNative: js.UndefOr[Boolean] = js.native
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
    def setAutoPosition(value: Boolean): Self = this.set("autoPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoPosition: Self = this.set("autoPosition", js.undefined)
    
    @scala.inline
    def setDirection(value: Boolean): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setLiteStyle(value: Boolean): Self = this.set("liteStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLiteStyle: Self = this.set("liteStyle", js.undefined)
    
    @scala.inline
    def setLocate(value: Boolean): Self = this.set("locate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocate: Self = this.set("locate", js.undefined)
    
    @scala.inline
    def setLocationMarker(value: Marker[_]): Self = this.set("locationMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationMarker: Self = this.set("locationMarker", js.undefined)
    
    @scala.inline
    def setNoIpLocate(value: Boolean): Self = this.set("noIpLocate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoIpLocate: Self = this.set("noIpLocate", js.undefined)
    
    @scala.inline
    def setOffset(value: Pixel): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setPosition(value: Position): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setRuler(value: Boolean): Self = this.set("ruler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuler: Self = this.set("ruler", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setUseNative(value: Boolean): Self = this.set("useNative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseNative: Self = this.set("useNative", js.undefined)
  }
}
