package typings.amapJsApi.AMap.InfoWindow

import typings.amapJsApi.AMap.LocationValue
import typings.amapJsApi.AMap.Pixel
import typings.amapJsApi.AMap.SizeValue
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options[ExtraData]
  extends typings.amapJsApi.AMap.Overlay.Options[ExtraData] {
  
  /**
    * 信息窗体锚点
    */
  var anchor: js.UndefOr[Anchor] = js.native
  
  /**
    * 是否自动调整窗体到视野内
    */
  var autoMove: js.UndefOr[Boolean] = js.native
  
  /**
    * 控制是否在鼠标点击地图后关闭信息窗体
    */
  var closeWhenClickMap: js.UndefOr[Boolean] = js.native
  
  /**
    * 显示内容
    */
  var content: js.UndefOr[String | HTMLElement] = js.native
  
  // internal
  var height: js.UndefOr[Double] = js.native
  
  /**
    * 是否自定义窗体
    */
  var isCustom: js.UndefOr[Boolean] = js.native
  
  /**
    * 信息窗体显示位置偏移量
    */
  var offset: js.UndefOr[Pixel] = js.native
  
  /**
    * 信息窗体显示基点位置
    */
  var position: js.UndefOr[LocationValue] = js.native
  
  /**
    * 是否显示信息窗体阴影
    */
  var showShadow: js.UndefOr[Boolean] = js.native
  
  /**
    * 信息窗体尺寸
    */
  var size: js.UndefOr[SizeValue] = js.native
}
object Options {
  
  @scala.inline
  def apply[ExtraData](): Options[ExtraData] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[ExtraData]]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options[_], ExtraData] (val x: Self with Options[ExtraData]) extends AnyVal {
    
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
    def setAnchor(value: Anchor): Self = this.set("anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setIsCustom(value: Boolean): Self = this.set("isCustom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCustom: Self = this.set("isCustom", js.undefined)
    
    @scala.inline
    def setOffset(value: Pixel): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setPosition(value: LocationValue): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setShowShadow(value: Boolean): Self = this.set("showShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowShadow: Self = this.set("showShadow", js.undefined)
    
    @scala.inline
    def setSize(value: SizeValue): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
