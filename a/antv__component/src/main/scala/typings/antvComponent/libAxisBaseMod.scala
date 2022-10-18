package typings.antvComponent

import typings.antvComponent.libInterfacesMod.IList
import typings.antvComponent.libTypesMod.AxisBaseCfg
import typings.antvComponent.libTypesMod.ListItem
import typings.antvEventEmitter.mod.EventType
import typings.antvGBase.libTypesMod.Point
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAxisBaseMod {
  
  /* note: abstract class */ @JSImport("@antv/component/lib/axis/base", JSImport.Default)
  @js.native
  open class default[T /* <: AxisBaseCfg */] () extends AxisBase[T] {
    
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
  trait AxisBase[T /* <: AxisBaseCfg */]
    extends typings.antvComponent.libAbstractGroupComponentMod.default[T]
       with IList {
    
    /* private */ var applyTickStates: Any = js.native
    
    /* private */ var drawDescriptionIcon: Any = js.native
    
    /* private */ var drawLabels: Any = js.native
    
    /* private */ var drawLine: Any = js.native
    
    /* private */ var drawTick: Any = js.native
    
    /* private */ var drawTickLines: Any = js.native
    
    /* private */ var drawTicks: Any = js.native
    
    /* private */ var drawTitle: Any = js.native
    
    /**
      * 获取坐标轴的向量
      * @param {Point} point 坐标轴上的点
      */
    /* protected */ def getAxisVector(point: Point): js.Tuple2[Double, Double] = js.native
    
    /* InferMemberOverrides */
    override def getEvents(): Any & (Record[String, js.Array[EventType]]) = js.native
    
    def getItemStates(item: ListItem): js.Array[String] = js.native
    
    /**
      * 根据状态获取图例项
      * @param  {string}     state [description]
      * @return {ListItem[]}       [description]
      */
    def getItemsByState(state: String): js.Array[ListItem] = js.native
    
    /* private */ var getLabelAttrs: Any = js.native
    
    /**
      * @protected
      * 获取坐标轴线的路径，不同的坐标轴不一样
      */
    /* protected */ def getLinePath(): js.Array[Any] = js.native
    
    /* protected */ def getSidePoint(point: Point, offset: Double): Point = js.native
    
    /**
      * 获取坐标轴垂直方向的向量
      * @param {number} offset 距离点距离
      * @param {Point} point  坐标轴上的一点
      */
    /* protected */ def getSideVector(offset: Double, point: Point): Any = js.native
    
    /* private */ var getSubTickLineItems: Any = js.native
    
    /* protected */ def getTextAnchor(vector: js.Array[Double]): String = js.native
    
    /* protected */ def getTextBaseline(vector: js.Array[Double]): String = js.native
    
    /* private */ var getTickLineAttrs: Any = js.native
    
    /* private */ var getTickLineItems: Any = js.native
    
    /**
      * 根据 tick.value 获取坐标轴上对应的点
      * @param {number} tickValue
      * @returns {Point}
      */
    /* protected */ def getTickPoint(tickValue: Double): Point = js.native
    
    /* private */ var getTitleAttrs: Any = js.native
    
    /**
      * 移除事件
      */
    /* InferMemberOverrides */
    override def off(): Any & this.type = js.native
    /**
      * 移除事件
      * @param eventName 事件名
      */
    /* InferMemberOverrides */
    override def off(eventName: String): Any & this.type = js.native
    /**
      * 移除事件
      * @param eventName 事件名
      * @param callback  回调函数
      */
    /* InferMemberOverrides */
    override def off(eventName: String, callback: js.Function): Any & this.type = js.native
    
    /**
      * 绑定事件
      * @param  eventName 事件名
      * @param callback  回调函数
      */
    /* InferMemberOverrides */
    override def on(eventName: String, callback: js.Function): Any & this.type = js.native
    
    /**
      * 根据 optimize 配置对 ticks 进行抽样，对抽样过后的 ticks 才进行真实的渲染
      */
    /* private */ var optimizeTicks: Any = js.native
    
    /* protected */ def processOverlap(labelGroup: Any): Unit = js.native
    
    /* private */ var processTicks: Any = js.native
    
    /* private */ var updateTickStates: Any = js.native
  }
}
