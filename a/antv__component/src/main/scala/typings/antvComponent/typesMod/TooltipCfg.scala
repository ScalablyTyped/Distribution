package typings.antvComponent.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipCfg
  extends StObject
     with HtmlComponentCfg {
  
  /**
    * DOM 节点的 id
    * @type {string}
    */
  var containerId: js.UndefOr[String] = js.undefined
  
  /**
    * 容器的模板
    * @type {string}
    */
  var containerTpl: js.UndefOr[String] = js.undefined
  
  /**
    * crosshairs 的类型， x,y,xy
    * @type {string}
    */
  var crosshairs: js.UndefOr[String] = js.undefined
  
  /**
    * crosshairs 限制的区域
    * @type {Region}
    */
  var crosshairsRegion: js.UndefOr[Region] = js.undefined
  
  /**
    * 默认的各个 dom 的样式
    * @type {object}
    */
  var defaultStyles: js.UndefOr[js.Object] = js.undefined
  
  /**
    * 传入各个 dom 的样式
    * @type {object}
    */
  @JSName("domStyles")
  var domStyles_TooltipCfg: js.UndefOr[js.Object] = js.undefined
  
  /**
    * 是否跟随鼠标移动，会影响 x，y的定位
    * @type {boolean}
    */
  var follow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 列表项的模板
    * @type {[type]}
    */
  var itemTpl: js.UndefOr[String] = js.undefined
  
  /**
    * 列表项集合
    * @type {ListItem[]}
    */
  var items: js.Array[ListItem]
  
  /**
    * 偏移量，同 position 相关
    * @type {number}
    */
  var offset: js.UndefOr[Double] = js.undefined
  
  /**
    * 位置，top, bottom, left, right
    * @type {string}
    */
  var position: js.UndefOr[TooltipPosition] = js.undefined
  
  /**
    * tooltip 限制的区域
    * @type {Region}
    */
  var region: js.UndefOr[Region] = js.undefined
  
  /**
    * 位置 x
    * @type {number}
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * 根据 x 定位的 crosshair 的模板
    * @type {string}
    */
  var xCrosshairTpl: js.UndefOr[String] = js.undefined
  
  /**
    * 位置 y
    * @type {number}
    */
  var y: js.UndefOr[Double] = js.undefined
  
  /**
    * 根据 y 定位的 crosshair 的模板
    * @type {[type]}
    */
  var yCrosshairTpl: js.UndefOr[String] = js.undefined
}
object TooltipCfg {
  
  inline def apply(items: js.Array[ListItem]): TooltipCfg = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipCfg]
  }
  
  extension [Self <: TooltipCfg](x: Self) {
    
    inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    inline def setContainerTpl(value: String): Self = StObject.set(x, "containerTpl", value.asInstanceOf[js.Any])
    
    inline def setContainerTplUndefined: Self = StObject.set(x, "containerTpl", js.undefined)
    
    inline def setCrosshairs(value: String): Self = StObject.set(x, "crosshairs", value.asInstanceOf[js.Any])
    
    inline def setCrosshairsRegion(value: Region): Self = StObject.set(x, "crosshairsRegion", value.asInstanceOf[js.Any])
    
    inline def setCrosshairsRegionUndefined: Self = StObject.set(x, "crosshairsRegion", js.undefined)
    
    inline def setCrosshairsUndefined: Self = StObject.set(x, "crosshairs", js.undefined)
    
    inline def setDefaultStyles(value: js.Object): Self = StObject.set(x, "defaultStyles", value.asInstanceOf[js.Any])
    
    inline def setDefaultStylesUndefined: Self = StObject.set(x, "defaultStyles", js.undefined)
    
    inline def setDomStyles(value: js.Object): Self = StObject.set(x, "domStyles", value.asInstanceOf[js.Any])
    
    inline def setDomStylesUndefined: Self = StObject.set(x, "domStyles", js.undefined)
    
    inline def setFollow(value: Boolean): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
    
    inline def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
    
    inline def setItemTpl(value: String): Self = StObject.set(x, "itemTpl", value.asInstanceOf[js.Any])
    
    inline def setItemTplUndefined: Self = StObject.set(x, "itemTpl", js.undefined)
    
    inline def setItems(value: js.Array[ListItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: ListItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPosition(value: TooltipPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXCrosshairTpl(value: String): Self = StObject.set(x, "xCrosshairTpl", value.asInstanceOf[js.Any])
    
    inline def setXCrosshairTplUndefined: Self = StObject.set(x, "xCrosshairTpl", js.undefined)
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYCrosshairTpl(value: String): Self = StObject.set(x, "yCrosshairTpl", value.asInstanceOf[js.Any])
    
    inline def setYCrosshairTplUndefined: Self = StObject.set(x, "yCrosshairTpl", js.undefined)
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
