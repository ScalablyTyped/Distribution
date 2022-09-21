package typings.atlaskitDsLib

import typings.react.mod.Ref
import typings.react.mod.RefObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeRefsMod {
  
  @JSImport("@atlaskit/ds-lib/dist/types/utils/merge-refs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(refs: js.Array[Refs]): js.Function1[/* value */ HTMLElement | Null, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(refs.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ HTMLElement | Null, Unit]]
  
  type Refs = (Ref[HTMLElement | Null]) | (RefObject[HTMLElement | Null]) | (js.Function1[/* node */ HTMLElement | Null, Unit])
}
