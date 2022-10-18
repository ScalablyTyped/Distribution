package typings.ahooks

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseReactiveMod {
  
  @JSImport("ahooks/lib/useReactive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[S /* <: Record[String, Any] */](initialState: S): S = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(initialState.asInstanceOf[js.Any]).asInstanceOf[S]
}
