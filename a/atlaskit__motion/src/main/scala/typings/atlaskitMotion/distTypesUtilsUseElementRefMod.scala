package typings.atlaskitMotion

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsUseElementRefMod {
  
  @JSImport("@atlaskit/motion/dist/types/utils/use-element-ref", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useElementRef(): js.Tuple2[Element, CallbackRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("useElementRef")().asInstanceOf[js.Tuple2[Element, CallbackRef]]
  
  type CallbackRef = js.Function1[/* instance */ Element, Unit]
  
  type Element = HTMLElement | Null
}
