package typings.ahooks

import typings.react.mod.Dispatch
import typings.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useGetStateMod {
  
  @JSImport("ahooks/lib/useGetState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[S](): js.Tuple3[
    js.UndefOr[S], 
    Dispatch[SetStateAction[js.UndefOr[S]]], 
    GetStateAction[js.UndefOr[S]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Tuple3[
    js.UndefOr[S], 
    Dispatch[SetStateAction[js.UndefOr[S]]], 
    GetStateAction[js.UndefOr[S]]
  ]]
  inline def default[S](initialState: S): js.Tuple3[S, Dispatch[SetStateAction[S]], GetStateAction[S]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[S, Dispatch[SetStateAction[S]], GetStateAction[S]]]
  inline def default[S](initialState: js.Function0[S]): js.Tuple3[S, Dispatch[SetStateAction[S]], GetStateAction[S]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[S, Dispatch[SetStateAction[S]], GetStateAction[S]]]
  
  type GetStateAction[S] = js.Function0[S]
}
