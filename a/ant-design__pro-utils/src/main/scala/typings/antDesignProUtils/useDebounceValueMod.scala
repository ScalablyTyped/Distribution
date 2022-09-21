package typings.antDesignProUtils

import typings.react.mod.DependencyList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useDebounceValueMod {
  
  @JSImport("@ant-design/pro-utils/es/hooks/useDebounceValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useDebounceValue[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useDebounceValue")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def useDebounceValue[T](value: T, delay: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebounceValue")(value.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def useDebounceValue[T](value: T, delay: Double, deps: DependencyList): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebounceValue")(value.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def useDebounceValue[T](value: T, delay: Unit, deps: DependencyList): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebounceValue")(value.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]
}
