package typings.antdMobile

import typings.react.mod.RefObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsUseResizeEffectMod {
  
  @JSImport("antd-mobile/es/utils/use-resize-effect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useResizeEffect[T /* <: HTMLElement */](effect: js.Function1[/* target */ T, Unit], targetRef: RefObject[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useResizeEffect")(effect.asInstanceOf[js.Any], targetRef.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
