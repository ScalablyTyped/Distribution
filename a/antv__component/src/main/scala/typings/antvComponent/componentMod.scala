package typings.antvComponent

import typings.antvComponent.interfacesMod.ILocation
import typings.antvComponent.typesMod.ComponentCfg
import typings.antvComponent.typesMod.LocationCfg
import typings.antvEventEmitter.mod.EventType
import typings.antvGBase.mod.Base
import typings.antvGBase.typesMod.BBox
import typings.std.Partial
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/component/lib/abstract/component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  
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
    /* InferMemberOverrides */
    override def getEvents(): js.Any with (Record[String, js.Array[EventType]]) = js.native
    
    def getLayoutBBox(): BBox = js.native
    
    /**
      * 隐藏
      */
    def hide(): js.Any = js.native
    
    /**
      * @protected
      * 初始化，用于具体的组件继承
      */
    def init(): Unit = js.native
    
    var initCfg: js.Any = js.native
    
    def isList(): Boolean = js.native
    
    def isSlider(): Boolean = js.native
    
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
    
    /**
      * 绘制组件
      */
    def render(): js.Any = js.native
    
    def setCapture(capture: Boolean): js.Any = js.native
    
    /**
      * 显示
      */
    def show(): js.Any = js.native
    
    /**
      * 更新组件
      * @param {object} cfg 更新属性
      */
    def update(cfg: Partial[T]): Unit = js.native
    
    /* protected */ def updateInner(cfg: Partial[T]): Unit = js.native
  }
  
  @js.native
  abstract class default[T /* <: ComponentCfg */] protected () extends Component[T] {
    def this(cfg: T) = this()
  }
}
