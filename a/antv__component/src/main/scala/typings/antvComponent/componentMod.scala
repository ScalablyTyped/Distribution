package typings.antvComponent

import typings.antvComponent.interfacesMod.ILocation
import typings.antvComponent.typesMod.ComponentCfg
import typings.antvComponent.typesMod.LocationCfg
import typings.antvEventEmitter.mod.EventType
import typings.antvGBase.mod.Base
import typings.antvGBase.typesMod.BBox
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@antv/component/lib/abstract/component", JSImport.Default)
  @js.native
  abstract class default[T /* <: ComponentCfg */] protected () extends Component[T] {
    def this(cfg: T) = this()
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
    /* InferMemberOverrides */
    override def getEvents(): (Record[String, js.Array[EventType]]) with js.Any = js.native
    
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
}
