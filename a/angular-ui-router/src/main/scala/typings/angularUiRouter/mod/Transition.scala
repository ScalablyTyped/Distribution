package typings.angularUiRouter.mod

import typings.uirouterCore.anon.TypeofTransition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("angular-ui-router", "Transition")
@js.native
open class Transition protected ()
  extends typings.uirouterCore.mod.Transition {
  /**
    * Creates a new Transition object.
    *
    * If the target state is not valid, an error is thrown.
    *
    * @internal
    *
    * @param fromPath The path of [[PathNode]]s from which the transition is leaving.  The last node in the `fromPath`
    *        encapsulates the "from state".
    * @param targetState The target state and parameters being transitioned to (also, the transition options)
    * @param router The [[UIRouter]] instance
    * @internal
    */
  def this(
    fromPath: js.Array[typings.uirouterCore.libPathPathNodeMod.PathNode],
    targetState: typings.uirouterCore.libStateTargetStateMod.TargetState,
    router: typings.uirouterCore.libRouterMod.UIRouter
  ) = this()
}
/* static members */
object Transition {
  
  @JSImport("angular-ui-router", "Transition")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal */
  @JSImport("angular-ui-router", "Transition.diToken")
  @js.native
  def diToken: TypeofTransition = js.native
  inline def diToken_=(x: TypeofTransition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("diToken")(x.asInstanceOf[js.Any])
}
