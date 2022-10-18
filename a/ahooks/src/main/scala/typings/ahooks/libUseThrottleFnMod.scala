package typings.ahooks

import typings.ahooks.anon.Flush
import typings.ahooks.libUseThrottleThrottleOptionsMod.ThrottleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseThrottleFnMod {
  
  @JSImport("ahooks/lib/useThrottleFn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: noop */](fn: T): Flush[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[Flush[T]]
  inline def default[T /* <: noop */](fn: T, options: ThrottleOptions): Flush[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Flush[T]]
  
  type noop = js.Function1[/* args */ Any, Any]
}
