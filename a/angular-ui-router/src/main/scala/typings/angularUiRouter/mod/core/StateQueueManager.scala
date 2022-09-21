package typings.angularUiRouter.mod.core

import org.scalablytyped.runtime.StringDictionary
import typings.uirouterCore.stateRegistryMod.StateRegistryListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("angular-ui-router", "core.StateQueueManager")
@js.native
open class StateQueueManager protected ()
  extends typings.uirouterCore.mod.StateQueueManager {
  def this(
    router: typings.uirouterCore.routerMod.UIRouter,
    states: StringDictionary[typings.uirouterCore.stateObjectMod.StateObject],
    builder: typings.uirouterCore.stateBuilderMod.StateBuilder,
    listeners: js.Array[StateRegistryListener]
  ) = this()
}
