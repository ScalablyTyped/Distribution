package typings.antvComponent

import typings.antvComponent.libInterfacesMod.ILocation
import typings.antvComponent.libTypesMod.ComponentCfg
import typings.antvComponent.libTypesMod.LocationCfg
import typings.antvComponent.libTypesMod.LocationType
import typings.antvComponent.libTypesMod.OffsetPoint
import typings.antvEventEmitter.mod.EventType
import typings.antvGBase.libTypesMod.BBox
import typings.antvGBase.mod.Base
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAbstractComponentMod {
  
  /* note: abstract class */ @JSImport("@antv/component/lib/abstract/component", JSImport.Default)
  @js.native
  open class default[T /* <: ComponentCfg */] protected () extends Component[T] {
    def this(cfg: T) = this()
    
    /**
      * 获取定位信息
      * @return {T} 定位信息
      */
    /* CompleteClass */
    override def getLocation(): LocationCfg = js.native
    
    /**
      * 获取定位方式，point，points，region，circle，'none' 五种值
      * @return {LocationType} 定位方式
      */
    /* CompleteClass */
    override def getLocationType(): LocationType = js.native
    
    /**
      * 获取偏移信息
      * @return {OffsetPoint} 偏移信息
      */
    /* CompleteClass */
    override def getOffset(): OffsetPoint = js.native
    
    /**
      * 设置定位信息
      * @param {T} cfg 定位信息
      */
    /* CompleteClass */
    override def setLocation(cfg: LocationCfg): Any = js.native
    
    /**
      * 设置偏移量
      * @param {number} offsetX 偏移 x
      * @param {number} offsetY 偏移 y
      */
    /* CompleteClass */
    override def setOffset(offsetX: Double, offsetY: Double): Any = js.native
  }
  
  @js.native
  trait Component[T /* <: ComponentCfg */]
    extends Base
       with ILocation[LocationCfg] {
    
    /* protected */ def afterUpdate(cfg: Partial[T]): Unit = js.native
    
    /**
      * 清理组件的内容，一般配合 render 使用
      * @example
      * axis.clear();
      * axis.render();
      */
    def clear(): Unit = js.native
    
    def getBBox(): BBox = js.native
    
    /* InferMemberOverrides */
    override def getEvents(): Any & (Record[String, js.Array[EventType]]) = js.native
    
    def getLayoutBBox(): BBox = js.native
    
    /**
      * 隐藏
      */
    def hide(): Any = js.native
    
    /**
      * @protected
      * 初始化，用于具体的组件继承
      */
    def init(): Unit = js.native
    
    /* private */ var initCfg: Any = js.native
    
    def isList(): Boolean = js.native
    
    def isSlider(): Boolean = js.native
    
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
      * 绘制组件
      */
    def render(): Any = js.native
    
    def setCapture(capture: Boolean): Any = js.native
    
    /**
      * 显示
      */
    def show(): Any = js.native
    
    /**
      * 更新组件
      * @param {object} cfg 更新属性
      */
    def update(cfg: Partial[T]): Unit = js.native
    
    /* protected */ def updateInner(cfg: Partial[T]): Unit = js.native
  }
}
