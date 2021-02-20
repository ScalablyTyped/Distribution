package typings.antvComponent.typesMod

import org.scalablytyped.runtime.StObject
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
  implicit class TooltipCfgMutableBuilder[Self <: TooltipCfg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerTpl(value: String): Self = StObject.set(x, "containerTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerTplUndefined: Self = StObject.set(x, "containerTpl", js.undefined)
    
    @scala.inline
    def setCrosshairs(value: String): Self = StObject.set(x, "crosshairs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrosshairsRegion(value: Region): Self = StObject.set(x, "crosshairsRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrosshairsRegionUndefined: Self = StObject.set(x, "crosshairsRegion", js.undefined)
    
    @scala.inline
    def setCrosshairsUndefined: Self = StObject.set(x, "crosshairs", js.undefined)
    
    @scala.inline
    def setDefaultStyles(value: js.Object): Self = StObject.set(x, "defaultStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultStylesUndefined: Self = StObject.set(x, "defaultStyles", js.undefined)
    
    @scala.inline
    def setDomStyles(value: js.Object): Self = StObject.set(x, "domStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomStylesUndefined: Self = StObject.set(x, "domStyles", js.undefined)
    
    @scala.inline
    def setFollow(value: Boolean): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
    
    @scala.inline
    def setItemTpl(value: String): Self = StObject.set(x, "itemTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemTplUndefined: Self = StObject.set(x, "itemTpl", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[ListItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: ListItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setPosition(value: TooltipPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXCrosshairTpl(value: String): Self = StObject.set(x, "xCrosshairTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXCrosshairTplUndefined: Self = StObject.set(x, "xCrosshairTpl", js.undefined)
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYCrosshairTpl(value: String): Self = StObject.set(x, "yCrosshairTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYCrosshairTplUndefined: Self = StObject.set(x, "yCrosshairTpl", js.undefined)
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
