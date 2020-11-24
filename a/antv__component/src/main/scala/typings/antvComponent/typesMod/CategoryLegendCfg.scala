package typings.antvComponent.typesMod

import typings.antvGBase.interfacesMod.IGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CategoryLegendCfg extends LegendBaseCfg {
  
  /**
    * 图例的高度，默认为 null
    * @type {[type]}
    */
  var itemHeight: js.UndefOr[Double] = js.native
  
  /**
    * 图例项 name 文本的配置
    * @type {LegendItemNameCfg}
    */
  var itemName: js.UndefOr[LegendItemNameCfg] = js.native
  
  /**
    * 图例项水平方向的间距
    * @type {number}
    */
  var itemSpacing: js.UndefOr[Double] = js.native
  
  /**
    * 图例项 value 附加值的配置项
    * @type {LegendItemValueCfg}
    */
  var itemValue: js.UndefOr[LegendItemValueCfg] = js.native
  
  /**
    * 图例项的宽度, 默认为 null，自动计算
    * @type {number}
    */
  var itemWidth: js.UndefOr[Double] = js.native
  
  /**
    * 图例项集合
    * @type {ListItem[]}
    */
  var items: js.Array[ListItem] = js.native
  
  /**
    * 图例项的 marker 图标的配置
    * @type {LegendMarkerCfg}
    */
  var marker: js.UndefOr[LegendMarkerCfg] = js.native
  
  /**
    * 最大高度
    * @type {number}
    */
  var maxHeight: js.UndefOr[Double] = js.native
  
  /**
    * 图例项的最大宽度，默认为 null，由上层传入
    */
  var maxItemWidth: js.UndefOr[Double] = js.native
  
  /**
    * 最大宽度
    * @type {number}
    */
  var maxWidth: js.UndefOr[Double] = js.native
}
object CategoryLegendCfg {
  
  @scala.inline
  def apply(container: IGroup, items: js.Array[ListItem]): CategoryLegendCfg = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryLegendCfg]
  }
  
  @scala.inline
  implicit class CategoryLegendCfgOps[Self <: CategoryLegendCfg] (val x: Self) extends AnyVal {
    
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
    def setItemHeight(value: Double): Self = this.set("itemHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemHeight: Self = this.set("itemHeight", js.undefined)
    
    @scala.inline
    def setItemName(value: LegendItemNameCfg): Self = this.set("itemName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemName: Self = this.set("itemName", js.undefined)
    
    @scala.inline
    def setItemSpacing(value: Double): Self = this.set("itemSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemSpacing: Self = this.set("itemSpacing", js.undefined)
    
    @scala.inline
    def setItemValue(value: LegendItemValueCfg): Self = this.set("itemValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemValue: Self = this.set("itemValue", js.undefined)
    
    @scala.inline
    def setItemWidth(value: Double): Self = this.set("itemWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemWidth: Self = this.set("itemWidth", js.undefined)
    
    @scala.inline
    def setMarker(value: LegendMarkerCfg): Self = this.set("marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    
    @scala.inline
    def setMaxItemWidth(value: Double): Self = this.set("maxItemWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxItemWidth: Self = this.set("maxItemWidth", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
  }
}
