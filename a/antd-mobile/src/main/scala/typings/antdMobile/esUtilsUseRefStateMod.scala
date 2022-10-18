package typings.antdMobile

import typings.react.mod.Dispatch
import typings.react.mod.MutableRefObject
import typings.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsUseRefStateMod {
  
  @JSImport("antd-mobile/es/utils/use-ref-state", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useRefState[T](initialState: T): js.Tuple3[T, Dispatch[SetStateAction[T]], MutableRefObject[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRefState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[T, Dispatch[SetStateAction[T]], MutableRefObject[T]]]
  inline def useRefState[T](initialState: js.Function0[T]): js.Tuple3[T, Dispatch[SetStateAction[T]], MutableRefObject[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRefState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[T, Dispatch[SetStateAction[T]], MutableRefObject[T]]]
}
