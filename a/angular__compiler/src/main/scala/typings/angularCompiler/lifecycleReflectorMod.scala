package typings.angularCompiler

import typings.angularCompiler.compileReflectorMod.CompileReflector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lifecycleReflectorMod {
  
  @JSImport("@angular/compiler/src/lifecycle_reflector", "LIFECYCLE_HOOKS_VALUES")
  @js.native
  val LIFECYCLE_HOOKS_VALUES: js.Array[LifecycleHooks] = js.native
  
  @js.native
  sealed trait LifecycleHooks extends StObject
  @JSImport("@angular/compiler/src/lifecycle_reflector", "LifecycleHooks")
  @js.native
  object LifecycleHooks extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LifecycleHooks with Double] = js.native
    
    @js.native
    sealed trait AfterContentChecked extends LifecycleHooks
    /* 5 */ val AfterContentChecked: typings.angularCompiler.lifecycleReflectorMod.LifecycleHooks.AfterContentChecked with Double = js.native
    
    @js.native
    sealed trait AfterContentInit extends LifecycleHooks
    /* 4 */ val AfterContentInit: typings.angularCompiler.lifecycleReflectorMod.LifecycleHooks.AfterContentInit with Double = js.native
    
    @js.native
    sealed trait AfterViewChecked extends LifecycleHooks
    /* 7 */ val AfterViewChecked: typings.angularCompiler.lifecycleReflectorMod.LifecycleHooks.AfterViewChecked with Double = js.native
    
    @js.native
    sealed trait AfterViewInit extends LifecycleHooks
    /* 6 */ val AfterViewInit: typings.angularCompiler.lifecycleReflectorMod.LifecycleHooks.AfterViewInit with Double = js.native
    
    @js.native
    sealed trait DoCheck extends LifecycleHooks
    /* 2 */ val DoCheck: typings.angularCompiler.lifecycleReflectorMod.LifecycleHooks.DoCheck with Double = js.native
    
    @js.native
    sealed trait OnChanges extends LifecycleHooks
    /* 3 */ val OnChanges: typings.angularCompiler.lifecycleReflectorMod.LifecycleHooks.OnChanges with Double = js.native
    
    @js.native
    sealed trait OnDestroy extends LifecycleHooks
    /* 1 */ val OnDestroy: typings.angularCompiler.lifecycleReflectorMod.LifecycleHooks.OnDestroy with Double = js.native
    
    @js.native
    sealed trait OnInit extends LifecycleHooks
    /* 0 */ val OnInit: typings.angularCompiler.lifecycleReflectorMod.LifecycleHooks.OnInit with Double = js.native
  }
  
  @JSImport("@angular/compiler/src/lifecycle_reflector", "getAllLifecycleHooks")
  @js.native
  def getAllLifecycleHooks(reflector: CompileReflector, token: js.Any): js.Array[LifecycleHooks] = js.native
  
  @JSImport("@angular/compiler/src/lifecycle_reflector", "hasLifecycleHook")
  @js.native
  def hasLifecycleHook(reflector: CompileReflector, hook: LifecycleHooks, token: js.Any): Boolean = js.native
}
