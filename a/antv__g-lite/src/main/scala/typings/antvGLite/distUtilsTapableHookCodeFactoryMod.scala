package typings.antvGLite

import typings.antvGLite.anon.After
import typings.antvGLite.anon.DoneReturns
import typings.antvGLite.anon.OnDone
import typings.antvGLite.anon.OnError
import typings.antvGLite.anon.OnResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsTapableHookCodeFactoryMod {
  
  @JSImport("@antv/g-lite/dist/utils/tapable/HookCodeFactory", "HookCodeFactory")
  @js.native
  open class HookCodeFactory protected () extends StObject {
    def this(config: Any) = this()
    
    def args(): Any = js.native
    def args(param0: After): Any = js.native
    
    def callTap(tapIndex: Any, param1: OnDone): String = js.native
    
    def callTapsLooping(param0: OnError): Any = js.native
    
    def callTapsParallel(param0: OnResult): Any = js.native
    
    def callTapsSeries(param0: DoneReturns): Any = js.native
    
    def contentWithInterceptors(options: Any): Any = js.native
    
    def create(options: Any): Any = js.native
    
    def deinit(): Unit = js.native
    
    def getInterceptor(idx: Any): String = js.native
    
    def getTap(idx: Any): String = js.native
    
    def getTapFn(idx: Any): String = js.native
    
    def header(): String = js.native
    
    /**
      * @param {{ type: "sync" | "promise" | "async", taps: Array<Tap>, interceptors: Array<Interceptor> }} options
      */
    def init(options: Any): Unit = js.native
    
    def needContext(): Boolean = js.native
    
    def setup(instance: Any, options: Any): Unit = js.native
  }
}
