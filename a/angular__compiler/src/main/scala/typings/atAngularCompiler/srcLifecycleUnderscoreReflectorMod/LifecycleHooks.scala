package typings.atAngularCompiler.srcLifecycleUnderscoreReflectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LifecycleHooks extends js.Object

@JSImport("@angular/compiler/src/lifecycle_reflector", "LifecycleHooks")
@js.native
object LifecycleHooks extends js.Object {
  @js.native
  sealed trait AfterContentChecked extends LifecycleHooks
  
  @js.native
  sealed trait AfterContentInit extends LifecycleHooks
  
  @js.native
  sealed trait AfterViewChecked extends LifecycleHooks
  
  @js.native
  sealed trait AfterViewInit extends LifecycleHooks
  
  @js.native
  sealed trait DoCheck extends LifecycleHooks
  
  @js.native
  sealed trait OnChanges extends LifecycleHooks
  
  @js.native
  sealed trait OnDestroy extends LifecycleHooks
  
  @js.native
  sealed trait OnInit extends LifecycleHooks
  
  /* 5 */ val AfterContentChecked: typings.atAngularCompiler.srcLifecycleUnderscoreReflectorMod.LifecycleHooks.AfterContentChecked with Double = js.native
  /* 4 */ val AfterContentInit: typings.atAngularCompiler.srcLifecycleUnderscoreReflectorMod.LifecycleHooks.AfterContentInit with Double = js.native
  /* 7 */ val AfterViewChecked: typings.atAngularCompiler.srcLifecycleUnderscoreReflectorMod.LifecycleHooks.AfterViewChecked with Double = js.native
  /* 6 */ val AfterViewInit: typings.atAngularCompiler.srcLifecycleUnderscoreReflectorMod.LifecycleHooks.AfterViewInit with Double = js.native
  /* 2 */ val DoCheck: typings.atAngularCompiler.srcLifecycleUnderscoreReflectorMod.LifecycleHooks.DoCheck with Double = js.native
  /* 3 */ val OnChanges: typings.atAngularCompiler.srcLifecycleUnderscoreReflectorMod.LifecycleHooks.OnChanges with Double = js.native
  /* 1 */ val OnDestroy: typings.atAngularCompiler.srcLifecycleUnderscoreReflectorMod.LifecycleHooks.OnDestroy with Double = js.native
  /* 0 */ val OnInit: typings.atAngularCompiler.srcLifecycleUnderscoreReflectorMod.LifecycleHooks.OnInit with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LifecycleHooks with Double] = js.native
}

