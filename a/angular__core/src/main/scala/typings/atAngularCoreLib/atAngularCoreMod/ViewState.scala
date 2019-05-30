package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ViewState extends js.Object

/**
  * Bitmask of states
  */
@JSImport("@angular/core", "ViewState")
@js.native
object ViewState extends js.Object {
  @js.native
  sealed trait Attached
    extends atAngularCoreLib.atAngularCoreMod.ViewState
  
  @js.native
  sealed trait BeforeFirstCheck
    extends atAngularCoreLib.atAngularCoreMod.ViewState
  
  @js.native
  sealed trait CatDetectChanges
    extends atAngularCoreLib.atAngularCoreMod.ViewState
  
  @js.native
  sealed trait CatInit
    extends atAngularCoreLib.atAngularCoreMod.ViewState
  
  @js.native
  sealed trait CheckProjectedView
    extends atAngularCoreLib.atAngularCoreMod.ViewState
  
  @js.native
  sealed trait CheckProjectedViews
    extends atAngularCoreLib.atAngularCoreMod.ViewState
  
  @js.native
  sealed trait ChecksEnabled
    extends atAngularCoreLib.atAngularCoreMod.ViewState
  
  @js.native
  sealed trait Destroyed
    extends atAngularCoreLib.atAngularCoreMod.ViewState
  
  @js.native
  sealed trait FirstCheck
    extends atAngularCoreLib.atAngularCoreMod.ViewState
  
  @js.native
  sealed trait InitState_AfterInit
    extends atAngularCoreLib.atAngularCoreMod.ViewState
  
  @js.native
  sealed trait InitState_BeforeInit
    extends atAngularCoreLib.atAngularCoreMod.ViewState
  
  @js.native
  sealed trait InitState_CallingAfterContentInit
    extends atAngularCoreLib.atAngularCoreMod.ViewState
  
  @js.native
  sealed trait InitState_CallingAfterViewInit
    extends atAngularCoreLib.atAngularCoreMod.ViewState
  
  @js.native
  sealed trait InitState_CallingOnInit
    extends atAngularCoreLib.atAngularCoreMod.ViewState
  
  @js.native
  sealed trait InitState_Mask
    extends atAngularCoreLib.atAngularCoreMod.ViewState
  
  @js.native
  sealed trait IsProjectedView
    extends atAngularCoreLib.atAngularCoreMod.ViewState
  
}

