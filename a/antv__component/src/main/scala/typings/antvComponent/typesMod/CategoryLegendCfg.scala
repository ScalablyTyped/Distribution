package typings.antvComponent.typesMod

import typings.antvGBase.interfacesMod.IGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CategoryLegendCfg
  extends StObject
     with LegendBaseCfg {
  
  /**
    * 图例的高度，默认为 null
    * @type {[type]}
    */
  var itemHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * 图例项 name 文本的配置
    * @type {LegendItemNameCfg}
    */
  var itemName: js.UndefOr[LegendItemNameCfg] = js.undefined
  
  /**
    * 图例项水平方向的间距
    * @type {number}
    */
  var itemSpacing: js.UndefOr[Double] = js.undefined
  
  /**
    * 图例项 value 附加值的配置项
    * @type {LegendItemValueCfg}
    */
  var itemValue: js.UndefOr[LegendItemValueCfg] = js.undefined
  
  /**
    * 图例项的宽度, 默认为 null，自动计算
    * @type {number}
    */
  var itemWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * 图例项集合
    * @type {ListItem[]}
    */
  var items: js.Array[ListItem]
  
  /**
    * 图例项的 marker 图标的配置
    * @type {LegendMarkerCfg}
    */
  var marker: js.UndefOr[LegendMarkerCfg] = js.undefined
  
  /**
    * 最大高度
    * @type {number}
    */
  var maxHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * 图例项的最大宽度，默认为 null，由上层传入
    */
  var maxItemWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * 最大宽度
    * @type {number}
    */
  var maxWidth: js.UndefOr[Double] = js.undefined
}
object CategoryLegendCfg {
  
  @scala.inline
  def apply(container: IGroup, items: js.Array[ListItem]): CategoryLegendCfg = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryLegendCfg]
  }
  
  @scala.inline
  implicit class CategoryLegendCfgMutableBuilder[Self <: CategoryLegendCfg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemHeight(value: Double): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemHeightUndefined: Self = StObject.set(x, "itemHeight", js.undefined)
    
    @scala.inline
    def setItemName(value: LegendItemNameCfg): Self = StObject.set(x, "itemName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemNameUndefined: Self = StObject.set(x, "itemName", js.undefined)
    
    @scala.inline
    def setItemSpacing(value: Double): Self = StObject.set(x, "itemSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemSpacingUndefined: Self = StObject.set(x, "itemSpacing", js.undefined)
    
    @scala.inline
    def setItemValue(value: LegendItemValueCfg): Self = StObject.set(x, "itemValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemValueUndefined: Self = StObject.set(x, "itemValue", js.undefined)
    
    @scala.inline
    def setItemWidth(value: Double): Self = StObject.set(x, "itemWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemWidthUndefined: Self = StObject.set(x, "itemWidth", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[ListItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: ListItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: LegendMarkerCfg): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    @scala.inline
    def setMaxItemWidth(value: Double): Self = StObject.set(x, "maxItemWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItemWidthUndefined: Self = StObject.set(x, "maxItemWidth", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
  }
}
