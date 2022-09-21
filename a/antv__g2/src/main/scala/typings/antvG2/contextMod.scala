package typings.antvG2

import typings.antvG2.libInterfaceMod.IAction
import typings.antvG2.libInterfaceMod.IInteractionContext
import typings.antvG2.viewMod.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod {
  
  @JSImport("@antv/g2/lib/interaction/context", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Context {
    def this(view: View) = this()
  }
  
  @js.native
  trait Context
    extends StObject
       with IInteractionContext {
    
    /**
      * 缓存信息
      * @param params 缓存的字段
      *  - 如果一个字段则获取缓存
      *  - 两个字段则设置缓存
      */
    def cache(params: Any*): Any = js.native
    
    /* private */ var cacheMap: Any = js.native
    
    /**
      * 获取 Action
      * @param name Action 的名称
      */
    def getAction(name: String): IAction = js.native
  }
}
