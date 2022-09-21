package typings.ahooks

import typings.std.Pick
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useSetStateMod {
  
  @JSImport("ahooks/lib/useSetState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[S /* <: Record[String, Any] */](initialState: S): js.Tuple2[S, SetState[S]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, SetState[S]]]
  inline def default[S /* <: Record[String, Any] */](initialState: js.Function0[S]): js.Tuple2[S, SetState[S]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, SetState[S]]]
  
  type SetState[S /* <: Record[String, Any] */] = js.Function1[
    /* state */ (Pick[S, /* keyof S */ String]) | Null | (js.Function1[/* prevState */ S, (Pick[S, /* keyof S */ String]) | S | Null]), 
    Unit
  ]
}
