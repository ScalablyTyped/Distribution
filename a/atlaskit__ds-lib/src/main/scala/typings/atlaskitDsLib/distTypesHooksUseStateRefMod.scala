package typings.atlaskitDsLib

import typings.react.mod.Dispatch
import typings.react.mod.MutableRefObject
import typings.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksUseStateRefMod {
  
  @JSImport("@atlaskit/ds-lib/dist/types/hooks/use-state-ref", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TValue](initialState: TValue): js.Tuple2[MutableRefObject[TValue], Dispatch[SetStateAction[TValue]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[MutableRefObject[TValue], Dispatch[SetStateAction[TValue]]]]
  inline def default[TValue](initialState: js.Function0[TValue]): js.Tuple2[MutableRefObject[TValue], Dispatch[SetStateAction[TValue]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[MutableRefObject[TValue], Dispatch[SetStateAction[TValue]]]]
}
