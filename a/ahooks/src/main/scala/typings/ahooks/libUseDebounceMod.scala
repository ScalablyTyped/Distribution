package typings.ahooks

import typings.ahooks.libUseDebounceDebounceOptionsMod.DebounceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseDebounceMod {
  
  @JSImport("ahooks/lib/useDebounce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def default[T](value: T, options: DebounceOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
}
