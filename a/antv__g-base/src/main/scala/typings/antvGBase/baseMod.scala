package typings.antvGBase

import typings.antvEventEmitter.mod.EventEmitter
import typings.antvEventEmitter.mod.EventType
import typings.antvGBase.interfacesMod.IBase
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-base/lib/abstract/base", JSImport.Namespace)
@js.native
object baseMod extends js.Object {
  
  @js.native
  trait Base
    extends IBase
       with EventEmitter {
    
    def get(name: js.Any): js.Any = js.native
    
    /**
      * @protected
      * 默认的配置项
      * @returns {object} 默认的配置项
      */
    def getDefaultCfg(): js.Object = js.native
    
    /* InferMemberOverrides */
    override def getEvents(): js.Any with (Record[String, js.Array[EventType]]) = js.native
    
    /**
      * 移除事件
      */
    /* InferMemberOverrides */
    override def off(): js.Any with this.type = js.native
    /**
      * 移除事件
      * @param eventName 事件名
      */
    /* InferMemberOverrides */
    override def off(eventName: String): js.Any with this.type = js.native
    /**
      * 移除事件
      * @param eventName 事件名
      * @param callback  回调函数
      */
    /* InferMemberOverrides */
    override def off(eventName: String, callback: js.Function): js.Any with this.type = js.native
    
    /**
      * 绑定事件
      * @param  eventName 事件名
      * @param callback  回调函数
      */
    /* InferMemberOverrides */
    override def on(eventName: String, callback: js.Function): js.Any with this.type = js.native
    
    def set(name: js.Any, value: js.Any): Unit = js.native
  }
  
  @js.native
  abstract class default protected () extends Base {
    def this(cfg: js.Any) = this()
  }
}
