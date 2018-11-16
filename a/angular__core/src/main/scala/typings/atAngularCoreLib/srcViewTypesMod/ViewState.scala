package typings
package atAngularCoreLib.srcViewTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ViewState extends js.Object

@JSImport("@angular/core/src/view/types", "ViewState")
@js.native
object ViewState extends js.Object {
  @js.native
  sealed trait Attached
    extends atAngularCoreLib.srcViewTypesMod.ViewState
  
  @js.native
  sealed trait BeforeFirstCheck
    extends atAngularCoreLib.srcViewTypesMod.ViewState
  
  @js.native
  sealed trait CatDetectChanges
    extends atAngularCoreLib.srcViewTypesMod.ViewState
  
  @js.native
  sealed trait CatInit
    extends atAngularCoreLib.srcViewTypesMod.ViewState
  
  @js.native
  sealed trait CheckProjectedView
    extends atAngularCoreLib.srcViewTypesMod.ViewState
  
  @js.native
  sealed trait CheckProjectedViews
    extends atAngularCoreLib.srcViewTypesMod.ViewState
  
  @js.native
  sealed trait ChecksEnabled
    extends atAngularCoreLib.srcViewTypesMod.ViewState
  
  @js.native
  sealed trait Destroyed
    extends atAngularCoreLib.srcViewTypesMod.ViewState
  
  @js.native
  sealed trait FirstCheck
    extends atAngularCoreLib.srcViewTypesMod.ViewState
  
  @js.native
  sealed trait InitState_AfterInit
    extends atAngularCoreLib.srcViewTypesMod.ViewState
  
  @js.native
  sealed trait InitState_BeforeInit
    extends atAngularCoreLib.srcViewTypesMod.ViewState
  
  @js.native
  sealed trait InitState_CallingAfterContentInit
    extends atAngularCoreLib.srcViewTypesMod.ViewState
  
  @js.native
  sealed trait InitState_CallingAfterViewInit
    extends atAngularCoreLib.srcViewTypesMod.ViewState
  
  @js.native
  sealed trait InitState_CallingOnInit
    extends atAngularCoreLib.srcViewTypesMod.ViewState
  
  @js.native
  sealed trait InitState_Mask
    extends atAngularCoreLib.srcViewTypesMod.ViewState
  
  @js.native
  sealed trait IsProjectedView
    extends atAngularCoreLib.srcViewTypesMod.ViewState
  
  /* 4 */ val Attached: Attached with scala.Double = js.native
  /* 1 */ val BeforeFirstCheck: BeforeFirstCheck with scala.Double = js.native
  /* 12 */ val CatDetectChanges: CatDetectChanges with scala.Double = js.native
  /* 13 */ val CatInit: CatInit with scala.Double = js.native
  /* 32 */ val CheckProjectedView: CheckProjectedView with scala.Double = js.native
  /* 64 */ val CheckProjectedViews: CheckProjectedViews with scala.Double = js.native
  /* 8 */ val ChecksEnabled: ChecksEnabled with scala.Double = js.native
  /* 128 */ val Destroyed: Destroyed with scala.Double = js.native
  /* 2 */ val FirstCheck: FirstCheck with scala.Double = js.native
  /* 1024 */ val InitState_AfterInit: InitState_AfterInit with scala.Double = js.native
  /* 0 */ val InitState_BeforeInit: InitState_BeforeInit with scala.Double = js.native
  /* 512 */ val InitState_CallingAfterContentInit: InitState_CallingAfterContentInit with scala.Double = js.native
  /* 768 */ val InitState_CallingAfterViewInit: InitState_CallingAfterViewInit with scala.Double = js.native
  /* 256 */ val InitState_CallingOnInit: InitState_CallingOnInit with scala.Double = js.native
  /* 1792 */ val InitState_Mask: InitState_Mask with scala.Double = js.native
  /* 16 */ val IsProjectedView: IsProjectedView with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCoreLib.srcViewTypesMod.ViewState with scala.Double] = js.native
}

