package typings.ahooks

import typings.react.mod.Dispatch
import typings.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useResetStateMod {
  
  @JSImport("ahooks/lib/useResetState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[S](initialState: S): js.Tuple3[S, Dispatch[SetStateAction[S]], ResetState] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[S, Dispatch[SetStateAction[S]], ResetState]]
  inline def default[S](initialState: js.Function0[S]): js.Tuple3[S, Dispatch[SetStateAction[S]], ResetState] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[S, Dispatch[SetStateAction[S]], ResetState]]
  
  type ResetState = js.Function0[Unit]
}
