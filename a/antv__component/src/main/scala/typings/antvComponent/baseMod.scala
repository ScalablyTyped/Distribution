package typings.antvComponent

import typings.antvComponent.groupComponentMod.GroupComponent
import typings.antvComponent.interfacesMod.IList
import typings.antvComponent.typesMod.AxisBaseCfg
import typings.antvComponent.typesMod.ListItem
import typings.antvEventEmitter.mod.EventType
import typings.antvGBase.typesMod.Point
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/component/lib/axis/base", JSImport.Namespace)
@js.native
object baseMod extends js.Object {
  
  @js.native
  trait AxisBase[T /* <: AxisBaseCfg */]
    extends GroupComponent[T]
       with IList {
    
    var applyTickStates: js.Any = js.native
    
    var drawLabels: js.Any = js.native
    
    var drawLine: js.Any = js.native
    
    var drawTick: js.Any = js.native
    
    var drawTickLines: js.Any = js.native
    
    var drawTicks: js.Any = js.native
    
    var drawTitle: js.Any = js.native
    
    /**
      * 获取坐标轴的向量
      * @param {Point} point 坐标轴上的点
      */
    /* protected */ def getAxisVector(point: Point): js.Tuple2[Double, Double] = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def getEvents(): js.Any with (Record[String, js.Array[EventType]]) = js.native
    
    def getItemStates(item: ListItem): js.Array[String] = js.native
    
    /**
      * 根据状态获取图例项
      * @param  {string}     state [description]
      * @return {ListItem[]}       [description]
      */
    def getItemsByState(state: String): js.Array[ListItem] = js.native
    
    var getLabelAttrs: js.Any = js.native
    
    /**
      * @protected
      * 获取坐标轴线的路径，不同的坐标轴不一样
      */
    /* protected */ def getLinePath(): js.Array[_] = js.native
    
    /* protected */ def getSidePoint(point: Point, offset: Double): Point = js.native
    
    /**
      * 获取坐标轴垂直方向的向量
      * @param {number} offset 距离点距离
      * @param {Point} point  坐标轴上的一点
      */
    /* protected */ def getSideVector(offset: Double, point: Point): js.Any = js.native
    
    var getSubTickLineItems: js.Any = js.native
    
    /* protected */ def getTextAnchor(vector: js.Array[Double]): String = js.native
    
    /* protected */ def getTextBaseline(vector: js.Array[Double]): String = js.native
    
    var getTickLineAttrs: js.Any = js.native
    
    var getTickLineItems: js.Any = js.native
    
    /**
      * 根据 tick.value 获取坐标轴上对应的点
      * @param {number} tickValue
      * @returns {Point}
      */
    /* protected */ def getTickPoint(tickValue: Double): Point = js.native
    
    var getTitleAttrs: js.Any = js.native
    
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
    
    /* protected */ def processOverlap(labelGroup: js.Any): Unit = js.native
    
    var processTicks: js.Any = js.native
    
    var updateTickStates: js.Any = js.native
  }
  
  @js.native
  abstract class default[T /* <: AxisBaseCfg */] () extends AxisBase[T]
}
