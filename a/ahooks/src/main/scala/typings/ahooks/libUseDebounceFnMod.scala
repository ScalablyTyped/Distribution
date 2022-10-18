package typings.ahooks

import typings.ahooks.anon.Cancel
import typings.ahooks.libUseDebounceDebounceOptionsMod.DebounceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseDebounceFnMod {
  
  @JSImport("ahooks/lib/useDebounceFn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: noop */](fn: T): Cancel[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[Cancel[T]]
  inline def default[T /* <: noop */](fn: T, options: DebounceOptions): Cancel[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Cancel[T]]
  
  type noop = js.Function1[/* args */ Any, Any]
}
