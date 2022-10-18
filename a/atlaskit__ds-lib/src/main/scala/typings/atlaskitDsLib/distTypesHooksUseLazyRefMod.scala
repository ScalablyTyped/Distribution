package typings.atlaskitDsLib

import typings.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksUseLazyRefMod {
  
  @JSImport("@atlaskit/ds-lib/dist/types/hooks/use-lazy-ref", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](initializer: js.Function0[T]): MutableRefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(initializer.asInstanceOf[js.Any]).asInstanceOf[MutableRefObject[T]]
}
