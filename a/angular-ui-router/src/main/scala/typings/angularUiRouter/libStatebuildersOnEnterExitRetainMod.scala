package typings.angularUiRouter

import typings.angularUiRouter.angularUiRouterStrings.onEnter
import typings.angularUiRouter.angularUiRouterStrings.onExit
import typings.angularUiRouter.angularUiRouterStrings.onRetain
import typings.uirouterCore.libTransitionInterfaceMod.TransitionStateHookFn
import typings.uirouterCore.mod.StateObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStatebuildersOnEnterExitRetainMod {
  
  @JSImport("angular-ui-router/lib/statebuilders/onEnterExitRetain", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStateHookBuilder(hookName: onEnter | onExit | onRetain): js.Function1[/* stateObject */ StateObject, TransitionStateHookFn] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStateHookBuilder")(hookName.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* stateObject */ StateObject, TransitionStateHookFn]]
}
