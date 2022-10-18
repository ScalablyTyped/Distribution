package typings.ahooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseMemoizedFnMod {
  
  @JSImport("ahooks/lib/useMemoizedFn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: noop */](fn: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @js.native
  trait noop extends StObject {
    
    def apply(args: Any*): Any = js.native
  }
}
