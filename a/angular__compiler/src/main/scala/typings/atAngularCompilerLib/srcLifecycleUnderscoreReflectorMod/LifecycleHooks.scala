package typings
package atAngularCompilerLib.srcLifecycleUnderscoreReflectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LifecycleHooks extends js.Object

@JSImport("@angular/compiler/src/lifecycle_reflector", "LifecycleHooks")
@js.native
object LifecycleHooks extends js.Object {
  @js.native
  sealed trait AfterContentChecked
    extends atAngularCompilerLib.srcLifecycleUnderscoreReflectorMod.LifecycleHooks
  
  @js.native
  sealed trait AfterContentInit
    extends atAngularCompilerLib.srcLifecycleUnderscoreReflectorMod.LifecycleHooks
  
  @js.native
  sealed trait AfterViewChecked
    extends atAngularCompilerLib.srcLifecycleUnderscoreReflectorMod.LifecycleHooks
  
  @js.native
  sealed trait AfterViewInit
    extends atAngularCompilerLib.srcLifecycleUnderscoreReflectorMod.LifecycleHooks
  
  @js.native
  sealed trait DoCheck
    extends atAngularCompilerLib.srcLifecycleUnderscoreReflectorMod.LifecycleHooks
  
  @js.native
  sealed trait OnChanges
    extends atAngularCompilerLib.srcLifecycleUnderscoreReflectorMod.LifecycleHooks
  
  @js.native
  sealed trait OnDestroy
    extends atAngularCompilerLib.srcLifecycleUnderscoreReflectorMod.LifecycleHooks
  
  @js.native
  sealed trait OnInit
    extends atAngularCompilerLib.srcLifecycleUnderscoreReflectorMod.LifecycleHooks
  
  /* 5 */ val AfterContentChecked: AfterContentChecked with scala.Double = js.native
  /* 4 */ val AfterContentInit: AfterContentInit with scala.Double = js.native
  /* 7 */ val AfterViewChecked: AfterViewChecked with scala.Double = js.native
  /* 6 */ val AfterViewInit: AfterViewInit with scala.Double = js.native
  /* 2 */ val DoCheck: DoCheck with scala.Double = js.native
  /* 3 */ val OnChanges: OnChanges with scala.Double = js.native
  /* 1 */ val OnDestroy: OnDestroy with scala.Double = js.native
  /* 0 */ val OnInit: OnInit with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atAngularCompilerLib.srcLifecycleUnderscoreReflectorMod.LifecycleHooks with scala.Double
  ] = js.native
}

