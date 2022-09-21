package typings.ahooks

import typings.ahooks.anon.Cancel
import typings.ahooks.throttleOptionsMod.ThrottleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useThrottleFnMod {
  
  @JSImport("ahooks/lib/useThrottleFn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: noop */](fn: T): Cancel[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[Cancel[T]]
  inline def default[T /* <: noop */](fn: T, options: ThrottleOptions): Cancel[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Cancel[T]]
  
  type noop = js.Function1[/* args */ Any, Any]
}
