package typings.antvComponent.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipCfg extends HtmlComponentCfg {
  
  /**
    * 容器的模板
    * @type {string}
    */
  var containerTpl: js.UndefOr[String] = js.native
  
  /**
    * crosshairs 的类型， x,y,xy
    * @type {string}
    */
  var crosshairs: js.UndefOr[String] = js.native
  
  /**
    * crosshairs 限制的区域
    * @type {Region}
    */
  var crosshairsRegion: js.UndefOr[Region] = js.native
  
  /**
    * 默认的各个 dom 的样式
    * @type {object}
    */
  var defaultStyles: js.UndefOr[js.Object] = js.native
  
  /**
    * 传入各个 dom 的样式
    * @type {object}
    */
  @JSName("domStyles")
  var domStyles_TooltipCfg: js.UndefOr[js.Object] = js.native
  
  /**
    * 是否跟随鼠标移动，会影响 x，y的定位
    * @type {boolean}
    */
  var follow: js.UndefOr[Boolean] = js.native
  
  /**
    * 列表项的模板
    * @type {[type]}
    */
  var itemTpl: js.UndefOr[String] = js.native
  
  /**
    * 列表项集合
    * @type {ListItem[]}
    */
  var items: js.Array[ListItem] = js.native
  
  /**
    * 偏移量，同 position 相关
    * @type {number}
    */
  var offset: js.UndefOr[Double] = js.native
  
  /**
    * 位置，top, bottom, left, right
    * @type {string}
    */
  var position: js.UndefOr[TooltipPosition] = js.native
  
  /**
    * tooltip 限制的区域
    * @type {Region}
    */
  var region: js.UndefOr[Region] = js.native
  
  /**
    * 位置 x
    * @type {number}
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * 根据 x 定位的 crosshair 的模板
    * @type {string}
    */
  var xCrosshairTpl: js.UndefOr[String] = js.native
  
  /**
    * 位置 y
    * @type {number}
    */
  var y: js.UndefOr[Double] = js.native
  
  /**
    * 根据 y 定位的 crosshair 的模板
    * @type {[type]}
    */
  var yCrosshairTpl: js.UndefOr[String] = js.native
}
object TooltipCfg {
  
  @scala.inline
  def apply(items: js.Array[ListItem]): TooltipCfg = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipCfg]
  }
  
  @scala.inline
  implicit class TooltipCfgOps[Self <: TooltipCfg] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: ListItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[ListItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerTpl(value: String): Self = this.set("containerTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerTpl: Self = this.set("containerTpl", js.undefined)
    
    @scala.inline
    def setCrosshairs(value: String): Self = this.set("crosshairs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrosshairs: Self = this.set("crosshairs", js.undefined)
    
    @scala.inline
    def setCrosshairsRegion(value: Region): Self = this.set("crosshairsRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrosshairsRegion: Self = this.set("crosshairsRegion", js.undefined)
    
    @scala.inline
    def setDefaultStyles(value: js.Object): Self = this.set("defaultStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultStyles: Self = this.set("defaultStyles", js.undefined)
    
    @scala.inline
    def setDomStyles(value: js.Object): Self = this.set("domStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomStyles: Self = this.set("domStyles", js.undefined)
    
    @scala.inline
    def setFollow(value: Boolean): Self = this.set("follow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollow: Self = this.set("follow", js.undefined)
    
    @scala.inline
    def setItemTpl(value: String): Self = this.set("itemTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemTpl: Self = this.set("itemTpl", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setPosition(value: TooltipPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setRegion(value: Region): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setXCrosshairTpl(value: String): Self = this.set("xCrosshairTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXCrosshairTpl: Self = this.set("xCrosshairTpl", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    
    @scala.inline
    def setYCrosshairTpl(value: String): Self = this.set("yCrosshairTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYCrosshairTpl: Self = this.set("yCrosshairTpl", js.undefined)
  }
}
