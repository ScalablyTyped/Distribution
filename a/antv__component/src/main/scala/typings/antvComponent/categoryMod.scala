package typings.antvComponent

import typings.antvComponent.interfacesMod.IList
import typings.antvComponent.legendBaseMod.LegendBase
import typings.antvComponent.typesMod.CategoryLegendCfg
import typings.antvComponent.typesMod.ListItem
import typings.antvEventEmitter.mod.EventType
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/component/lib/legend/category", JSImport.Namespace)
@js.native
object categoryMod extends js.Object {
  
  @js.native
  trait Category
    extends LegendBase[CategoryLegendCfg]
       with IList {
    
    var adjustNavigation: js.Any = js.native
    
    var applyItemStates: js.Any = js.native
    
    var currentPageIndex: js.Any = js.native
    
    var drawArrow: js.Any = js.native
    
    var drawItem: js.Any = js.native
    
    var drawItemText: js.Any = js.native
    
    var drawItems: js.Any = js.native
    
    var drawMarker: js.Any = js.native
    
    var drawNavigation: js.Any = js.native
    
    var getCurrentNavigationMatrix: js.Any = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def getEvents(): js.Any with (Record[String, js.Array[EventType]]) = js.native
    
    var getItemHeight: js.Any = js.native
    
    def getItemStates(item: ListItem): js.Array[String] = js.native
    
    /**
      * 根据状态获取图例项
      * @param  {string}     state [description]
      * @return {ListItem[]}       [description]
      */
    def getItemsByState(state: String): js.Array[ListItem] = js.native
    
    var getLimitItemWidth: js.Any = js.native
    
    /**
      * 移除事件
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def off(): js.Any with this.type = js.native
    /**
      * 移除事件
      * @param eventName 事件名
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def off(eventName: String): js.Any with this.type = js.native
    /**
      * 移除事件
      * @param eventName 事件名
      * @param callback  回调函数
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def off(eventName: String, callback: js.Function): js.Any with this.type = js.native
    
    /**
      * 绑定事件
      * @param  eventName 事件名
      * @param callback  回调函数
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def on(eventName: String, callback: js.Function): js.Any with this.type = js.native
    
    var onNavigationAfter: js.Any = js.native
    
    var onNavigationBack: js.Any = js.native
    
    var pageHeight: js.Any = js.native
    
    var pageWidth: js.Any = js.native
    
    var processItems: js.Any = js.native
    
    var startX: js.Any = js.native
    
    var startY: js.Any = js.native
    
    var totalPagesCnt: js.Any = js.native
    
    var updateNavigation: js.Any = js.native
  }
  
  @js.native
  class default () extends Category
}
