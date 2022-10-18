package typings.antDesignProUtils

import typings.antDesignProUtils.anon.Cancel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseDebounceFnMod {
  
  @JSImport("@ant-design/pro-utils/es/hooks/useDebounceFn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useDebounceFn[T /* <: js.Array[Any] */, U](fn: js.Function1[/* args */ T, js.Promise[Any]]): Cancel[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDebounceFn")(fn.asInstanceOf[js.Any]).asInstanceOf[Cancel[U]]
  inline def useDebounceFn[T /* <: js.Array[Any] */, U](fn: js.Function1[/* args */ T, js.Promise[Any]], wait: Double): Cancel[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebounceFn")(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[Cancel[U]]
}
