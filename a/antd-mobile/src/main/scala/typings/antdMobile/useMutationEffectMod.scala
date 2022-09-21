package typings.antdMobile

import typings.react.mod.RefObject
import typings.std.HTMLElement
import typings.std.MutationObserverInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useMutationEffectMod {
  
  @JSImport("antd-mobile/es/utils/use-mutation-effect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useMutationEffect(effect: js.Function0[Unit], targetRef: RefObject[HTMLElement], options: MutationObserverInit): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useMutationEffect")(effect.asInstanceOf[js.Any], targetRef.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
