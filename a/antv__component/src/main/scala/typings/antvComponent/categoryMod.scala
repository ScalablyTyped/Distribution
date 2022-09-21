package typings.antvComponent

import typings.antvComponent.interfacesMod.IList
import typings.antvComponent.typesMod.CategoryLegendCfg
import typings.antvComponent.typesMod.ListItem
import typings.antvEventEmitter.mod.EventType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object categoryMod {
  
  @JSImport("@antv/component/lib/legend/category", JSImport.Default)
  @js.native
  open class default () extends Category {
    
    /**
      * 清空列表
      */
    /* CompleteClass */
    override def clearItems(): Any = js.native
    
    /**
      * 清楚所有列表项的状态
      * @param {string} state 状态值
      */
    /* CompleteClass */
    override def clearItemsState(state: String): Any = js.native
    
    /**
      * 获取列表项
      * @return {ListItem[]} 列表项集合
      */
    /* CompleteClass */
    override def getItems(): js.Array[ListItem] = js.native
    
    /**
      * 根据状态获取
      * @param  {state}     state 状态名
      * @return {ListItem[]} 列表项
      */
    /* CompleteClass */
    override def getItemsByState(state: Any): js.Array[ListItem] = js.native
    
    /**
      * 是否存在指定的状态
      * @param {ListItem} item  列表项
      * @param {string} state 状态名
      */
    /* CompleteClass */
    override def hasState(item: ListItem, state: String): Boolean = js.native
    
    /**
      * 设置列表项的状态
      * @param {ListItem} item  列表项
      * @param {string}   state 状态名
      * @param {boolean}  value 状态值, true, false
      */
    /* CompleteClass */
    override def setItemState(item: ListItem, state: String, value: Boolean): Any = js.native
    
    /**
      * 设置列表项
      * @param {ListItem[]} items 列表项集合
      */
    /* CompleteClass */
    override def setItems(items: js.Array[ListItem]): Any = js.native
    
    /**
      * 更新列表项
      * @param {ListItem} item 列表项
      * @param {object}   cfg  列表项
      */
    /* CompleteClass */
    override def updateItem(item: ListItem, cfg: js.Object): Any = js.native
  }
  
  @js.native
  trait Category
    extends typings.antvComponent.legendBaseMod.default[CategoryLegendCfg]
       with IList {
    
    /* private */ var adjustNavigation: Any = js.native
    
    /* private */ var applyItemStates: Any = js.native
    
    /* private */ var currentPageIndex: Any = js.native
    
    /* private */ var drawArrow: Any = js.native
    
    /* private */ var drawItem: Any = js.native
    
    /* private */ var drawItemText: Any = js.native
    
    /* private */ var drawItems: Any = js.native
    
    /* private */ var drawMarker: Any = js.native
    
    /**
      * 绘制分页器
      */
    /* private */ var drawNavigation: Any = js.native
    
    /* private */ var drawRadio: Any = js.native
    
    /* private */ var getCurrentNavigationMatrix: Any = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def getEvents(): (Record[String, js.Array[EventType]]) & Any = js.native
    
    /* private */ var getItemHeight: Any = js.native
    
    def getItemStates(item: ListItem): js.Array[String] = js.native
    
    /**
      * 根据状态获取图例项
      * @param  {string}     state [description]
      * @return {ListItem[]}       [description]
      */
    def getItemsByState(state: String): js.Array[ListItem] = js.native
    
    /* private */ var getLimitItemWidth: Any = js.native
    
    /**
      * 取消监听一个事件，或者一个channel
      * @param evt
      * @param callback
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def off(): this.type & Any = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def off(evt: String): this.type & Any = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def off(evt: String, callback: js.Function): this.type & Any = js.native
    
    /**
      * 监听一个事件
      * @param evt
      * @param callback
      * @param once
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def on(evt: String, callback: js.Function): this.type & Any = js.native
    
    /* private */ var onNavigationAfter: Any = js.native
    
    /* private */ var onNavigationBack: Any = js.native
    
    /* private */ var pageHeight: Any = js.native
    
    /* private */ var pageWidth: Any = js.native
    
    /* private */ var processItems: Any = js.native
    
    /* private */ var startX: Any = js.native
    
    /* private */ var startY: Any = js.native
    
    /* private */ var totalPagesCnt: Any = js.native
    
    /**
      * 更新分页器 arrow 组件
      */
    /* private */ var updateArrowPath: Any = js.native
    
    /* private */ var updateNavigation: Any = js.native
  }
}
