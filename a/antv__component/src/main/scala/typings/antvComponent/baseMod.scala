package typings.antvComponent

import typings.antvComponent.interfacesMod.IList
import typings.antvComponent.typesMod.AxisBaseCfg
import typings.antvComponent.typesMod.ListItem
import typings.antvEventEmitter.mod.EventType
import typings.antvGBase.typesMod.Point
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseMod {
  
  @JSImport("@antv/component/lib/axis/base", JSImport.Default)
  @js.native
  abstract class default[T /* <: AxisBaseCfg */] () extends AxisBase[T]
  
  @js.native
  trait AxisBase[T /* <: AxisBaseCfg */]
    extends typings.antvComponent.groupComponentMod.default[T]
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
    override def getEvents(): (Record[String, js.Array[EventType]]) with js.Any = js.native
    
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
    
    /* protected */ def processOverlap(labelGroup: js.Any): Unit = js.native
    
    var processTicks: js.Any = js.native
    
    var updateTickStates: js.Any = js.native
  }
}
