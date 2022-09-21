package typings.antDesignProUtils

import typings.std.Parameters
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useRefFunctionMod {
  
  @JSImport("@ant-design/pro-utils/es/hooks/useRefFunction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useRefFunction[T /* <: js.Function1[/* args */ Any, Any] */](reFunction: T): js.Function1[/* rest */ Parameters[T], ReturnType[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRefFunction")(reFunction.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* rest */ Parameters[T], ReturnType[T]]]
}
