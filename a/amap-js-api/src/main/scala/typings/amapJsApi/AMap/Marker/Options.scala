package typings.amapJsApi.AMap.Marker

import typings.amapJsApi.AMap.AnimationName
import typings.amapJsApi.AMap.Icon
import typings.amapJsApi.AMap.LocationValue
import typings.amapJsApi.AMap.MarkerShape
import typings.amapJsApi.AMap.Pixel
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options[ExtraData]
  extends typings.amapJsApi.AMap.Overlay.Options[ExtraData] {
  
  /**
    * 标记锚点
    */
  var anchor: js.UndefOr[Anchor] = js.native
  
  /**
    * 点标记的旋转角度
    */
  var angle: js.UndefOr[Double] = js.native
  
  /**
    * 点标记的动画效果
    */
  var animation: js.UndefOr[AnimationName] = js.native
  
  /**
    * 是否自动旋转
    */
  var autoRotation: js.UndefOr[Boolean] = js.native
  
  /**
    * 点标记显示内容
    */
  var content: js.UndefOr[String | HTMLElement] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  /**
    * 需在点标记中显示的图标
    */
  var icon: js.UndefOr[String | Icon] = js.native
  
  /**
    * 文本标注
    */
  var label: js.UndefOr[Label] = js.native
  
  /**
    * 点标记显示位置偏移量
    */
  var offset: js.UndefOr[Pixel] = js.native
  
  /**
    * 点标记在地图上显示的位置
    */
  var position: js.UndefOr[LocationValue] = js.native
  
  /**
    * 拖拽点标记时是否开启点标记离开地图的效果
    */
  var raiseOnDrag: js.UndefOr[Boolean] = js.native
  
  /**
    * 点标记阴影
    */
  var shadow: js.UndefOr[Icon | String] = js.native
  
  /**
    * 可点击区域
    */
  var shape: js.UndefOr[MarkerShape] = js.native
  
  /**
    * 鼠标滑过点标记时的文字提示
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * 鼠标点击时marker是否置顶
    */
  var topWhenClick: js.UndefOr[Boolean] = js.native
  
  var topWhenMouseOver: js.UndefOr[Boolean] = js.native
  
  /**
    * 点标记是否可见
    */
  var visible: js.UndefOr[Boolean] = js.native
  
  /**
    * 点标记的叠加顺序
    */
  var zIndex: js.UndefOr[Double] = js.native
  
  // internal
  var zooms: js.UndefOr[js.Tuple2[Double, Double]] = js.native
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
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    
    @scala.inline
    def setAnimation(value: AnimationName): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setAutoRotation(value: Boolean): Self = this.set("autoRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoRotation: Self = this.set("autoRotation", js.undefined)
    
    @scala.inline
    def setContent(value: String | HTMLElement): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setIcon(value: String | Icon): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setLabel(value: Label): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setOffset(value: Pixel): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setPosition(value: LocationValue): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setRaiseOnDrag(value: Boolean): Self = this.set("raiseOnDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaiseOnDrag: Self = this.set("raiseOnDrag", js.undefined)
    
    @scala.inline
    def setShadow(value: Icon | String): Self = this.set("shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadow: Self = this.set("shadow", js.undefined)
    
    @scala.inline
    def setShape(value: MarkerShape): Self = this.set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTopWhenClick(value: Boolean): Self = this.set("topWhenClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopWhenClick: Self = this.set("topWhenClick", js.undefined)
    
    @scala.inline
    def setTopWhenMouseOver(value: Boolean): Self = this.set("topWhenMouseOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopWhenMouseOver: Self = this.set("topWhenMouseOver", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
    
    @scala.inline
    def setZooms(value: js.Tuple2[Double, Double]): Self = this.set("zooms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZooms: Self = this.set("zooms", js.undefined)
  }
}
