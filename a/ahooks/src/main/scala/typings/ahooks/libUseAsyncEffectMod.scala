package typings.ahooks

import typings.react.mod.DependencyList
import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseAsyncEffectMod {
  
  @JSImport("ahooks/lib/useAsyncEffect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(effect: js.Function0[(AsyncGenerator[Unit, Unit, Unit]) | js.Promise[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def default(effect: js.Function0[(AsyncGenerator[Unit, Unit, Unit]) | js.Promise[Unit]], deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
