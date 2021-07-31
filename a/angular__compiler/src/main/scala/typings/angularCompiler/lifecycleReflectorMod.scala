package typings.angularCompiler

import typings.angularCompiler.compileReflectorMod.CompileReflector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lifecycleReflectorMod {
  
  @JSImport("@angular/compiler/src/lifecycle_reflector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler/src/lifecycle_reflector", "LIFECYCLE_HOOKS_VALUES")
  @js.native
  val LIFECYCLE_HOOKS_VALUES: js.Array[LifecycleHooks] = js.native
  
  @js.native
  sealed trait LifecycleHooks extends StObject
  @JSImport("@angular/compiler/src/lifecycle_reflector", "LifecycleHooks")
  @js.native
  object LifecycleHooks extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LifecycleHooks & Double] = js.native
    
    @js.native
    sealed trait AfterContentChecked
      extends StObject
         with LifecycleHooks
    /* 5 */ val AfterContentChecked: typings.angularCompiler.lifecycleReflectorMod.LifecycleHooks.AfterContentChecked & Double = js.native
    
    @js.native
    sealed trait AfterContentInit
      extends StObject
         with LifecycleHooks
    /* 4 */ val AfterContentInit: typings.angularCompiler.lifecycleReflectorMod.LifecycleHooks.AfterContentInit & Double = js.native
    
    @js.native
    sealed trait AfterViewChecked
      extends StObject
         with LifecycleHooks
    /* 7 */ val AfterViewChecked: typings.angularCompiler.lifecycleReflectorMod.LifecycleHooks.AfterViewChecked & Double = js.native
    
    @js.native
    sealed trait AfterViewInit
      extends StObject
         with LifecycleHooks
    /* 6 */ val AfterViewInit: typings.angularCompiler.lifecycleReflectorMod.LifecycleHooks.AfterViewInit & Double = js.native
    
    @js.native
    sealed trait DoCheck
      extends StObject
         with LifecycleHooks
    /* 2 */ val DoCheck: typings.angularCompiler.lifecycleReflectorMod.LifecycleHooks.DoCheck & Double = js.native
    
    @js.native
    sealed trait OnChanges
      extends StObject
         with LifecycleHooks
    /* 3 */ val OnChanges: typings.angularCompiler.lifecycleReflectorMod.LifecycleHooks.OnChanges & Double = js.native
    
    @js.native
    sealed trait OnDestroy
      extends StObject
         with LifecycleHooks
    /* 1 */ val OnDestroy: typings.angularCompiler.lifecycleReflectorMod.LifecycleHooks.OnDestroy & Double = js.native
    
    @js.native
    sealed trait OnInit
      extends StObject
         with LifecycleHooks
    /* 0 */ val OnInit: typings.angularCompiler.lifecycleReflectorMod.LifecycleHooks.OnInit & Double = js.native
  }
  
  @scala.inline
  def getAllLifecycleHooks(reflector: CompileReflector, token: js.Any): js.Array[LifecycleHooks] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAllLifecycleHooks")(reflector.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[js.Array[LifecycleHooks]]
  
  @scala.inline
  def hasLifecycleHook(reflector: CompileReflector, hook: LifecycleHooks, token: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasLifecycleHook")(reflector.asInstanceOf[js.Any], hook.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
