package typings
package atAngularCoreLib.srcRender3InterfacesViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LViewFlags extends js.Object

@JSImport("@angular/core/src/render3/interfaces/view", "LViewFlags")
@js.native
object LViewFlags extends js.Object {
  /** Whether or not this view is currently attached to change detection tree. */
  @js.native
  sealed trait Attached
    extends atAngularCoreLib.srcRender3InterfacesViewMod.LViewFlags
  
  /** Whether this view has default change detection strategy (checks always) or onPush */
  @js.native
  sealed trait CheckAlways
    extends atAngularCoreLib.srcRender3InterfacesViewMod.LViewFlags
  
  /**
    * Whether or not the view is in creationMode.
    *
    * This must be stored in the view rather than using `data` as a marker so that
    * we can properly support embedded views. Otherwise, when exiting a child view
    * back into the parent view, `data` will be defined and `creationMode` will be
    * improperly reported as false.
    */
  @js.native
  sealed trait CreationMode
    extends atAngularCoreLib.srcRender3InterfacesViewMod.LViewFlags
  
  /** Whether or not this view is destroyed. */
  @js.native
  sealed trait Destroyed
    extends atAngularCoreLib.srcRender3InterfacesViewMod.LViewFlags
  
  /** Whether or not this view is currently dirty (needing check) */
  @js.native
  sealed trait Dirty
    extends atAngularCoreLib.srcRender3InterfacesViewMod.LViewFlags
  
  /** Whether or not this view is the root view */
  @js.native
  sealed trait IsRoot
    extends atAngularCoreLib.srcRender3InterfacesViewMod.LViewFlags
  
  /**
    *  Whether or not the init hooks have run.
    *
    * If on, the init hooks haven't yet been run and should be executed by the first component that
    * runs OR the first cR() instruction that runs (so inits are run for the top level view before
    * any embedded views).
    */
  @js.native
  sealed trait RunInit
    extends atAngularCoreLib.srcRender3InterfacesViewMod.LViewFlags
  
  /* 8 */ val Attached: Attached with scala.Double = js.native
  /* 2 */ val CheckAlways: CheckAlways with scala.Double = js.native
  /* 1 */ val CreationMode: CreationMode with scala.Double = js.native
  /* 32 */ val Destroyed: Destroyed with scala.Double = js.native
  /* 4 */ val Dirty: Dirty with scala.Double = js.native
  /* 64 */ val IsRoot: IsRoot with scala.Double = js.native
  /* 16 */ val RunInit: RunInit with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCoreLib.srcRender3InterfacesViewMod.LViewFlags with scala.Double] = js.native
}

