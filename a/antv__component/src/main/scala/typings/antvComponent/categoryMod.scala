package typings.antvComponent

import typings.antvComponent.interfacesMod.IList
import typings.antvComponent.typesMod.CategoryLegendCfg
import typings.antvComponent.typesMod.ListItem
import typings.antvEventEmitter.mod.EventType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object categoryMod {
  
  @JSImport("@antv/component/lib/legend/category", JSImport.Default)
  @js.native
  class default () extends Category
  
  @js.native
  trait Category
    extends typings.antvComponent.legendBaseMod.default[CategoryLegendCfg]
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
    override def getEvents(): (Record[String, js.Array[EventType]]) with js.Any = js.native
    
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
      * 取消监听一个事件，或者一个channel
      * @param evt
      * @param callback
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def off(): this.type with js.Any = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def off(evt: String): this.type with js.Any = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def off(evt: String, callback: js.Function): this.type with js.Any = js.native
    
    /**
      * 监听一个事件
      * @param evt
      * @param callback
      * @param once
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def on(evt: String, callback: js.Function): this.type with js.Any = js.native
    
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
}
