package typings.antDesignProUtils

import typings.antDesignProUtils.anon.Params
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseFetchDataMod {
  
  @JSImport("@ant-design/pro-utils/es/hooks/useFetchData", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useFetchData[T, U /* <: Record[String, Any] */](props: Params[U, T]): js.Array[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFetchData")(props.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.UndefOr[T]]]
  
  type ProRequestData[T, U] = js.Function2[/* params */ U, /* props */ Any, js.Promise[T]]
}
