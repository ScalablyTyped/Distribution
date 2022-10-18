package typings.angularUiRouter.mod

import typings.uirouterCore.libTransitionInterfaceMod.HookFn
import typings.uirouterCore.libTransitionInterfaceMod.HookMatchCriteria
import typings.uirouterCore.libTransitionInterfaceMod.HookRegOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("angular-ui-router", "RegisteredHook")
@js.native
open class RegisteredHook protected ()
  extends typings.uirouterCore.mod.RegisteredHook {
  def this(
    tranSvc: typings.uirouterCore.libTransitionTransitionServiceMod.TransitionService,
    eventType: typings.uirouterCore.libTransitionTransitionEventTypeMod.TransitionEventType,
    callback: HookFn,
    matchCriteria: HookMatchCriteria,
    removeHookFromRegistry: js.Function1[/* hook */ typings.uirouterCore.libTransitionHookRegistryMod.RegisteredHook, Unit]
  ) = this()
  def this(
    tranSvc: typings.uirouterCore.libTransitionTransitionServiceMod.TransitionService,
    eventType: typings.uirouterCore.libTransitionTransitionEventTypeMod.TransitionEventType,
    callback: HookFn,
    matchCriteria: HookMatchCriteria,
    removeHookFromRegistry: js.Function1[/* hook */ typings.uirouterCore.libTransitionHookRegistryMod.RegisteredHook, Unit],
    options: HookRegOptions
  ) = this()
}
