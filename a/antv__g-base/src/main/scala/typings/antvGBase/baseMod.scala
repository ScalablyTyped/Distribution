package typings.antvGBase

import typings.antvEventEmitter.mod.EventType
import typings.antvGBase.interfacesMod.IBase
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseMod {
  
  @JSImport("@antv/g-base/lib/abstract/base", JSImport.Default)
  @js.native
  abstract class default protected () extends Base {
    def this(cfg: Any) = this()
  }
  
  @js.native
  trait Base
    extends typings.antvEventEmitter.mod.default
       with IBase {
    
    def get(name: Any): Any = js.native
    
    /**
      * @protected
      * 默认的配置项
      * @returns {object} 默认的配置项
      */
    def getDefaultCfg(): js.Object = js.native
    
    /* InferMemberOverrides */
    override def getEvents(): (Record[String, js.Array[EventType]]) & Any = js.native
    
    /**
      * 取消监听一个事件，或者一个channel
      * @param evt
      * @param callback
      */
    /* InferMemberOverrides */
    override def off(): this.type & Any = js.native
    /* InferMemberOverrides */
    override def off(evt: String): this.type & Any = js.native
    /* InferMemberOverrides */
    override def off(evt: String, callback: js.Function): this.type & Any = js.native
    
    /**
      * 监听一个事件
      * @param evt
      * @param callback
      * @param once
      */
    /* InferMemberOverrides */
    override def on(evt: String, callback: js.Function): this.type & Any = js.native
    
    def set(name: Any, value: Any): Unit = js.native
  }
}
