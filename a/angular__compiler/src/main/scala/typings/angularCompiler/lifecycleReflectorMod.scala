package typings.angularCompiler

import org.scalablytyped.runtime.TopLevel
import typings.angularCompiler.compileReflectorMod.CompileReflector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/lifecycle_reflector", JSImport.Namespace)
@js.native
object lifecycleReflectorMod extends js.Object {
  @js.native
  sealed trait LifecycleHooks extends js.Object
  
  val LIFECYCLE_HOOKS_VALUES: js.Array[LifecycleHooks] = js.native
  def getAllLifecycleHooks(reflector: CompileReflector, token: js.Any): js.Array[LifecycleHooks] = js.native
  def hasLifecycleHook(reflector: CompileReflector, hook: LifecycleHooks, token: js.Any): Boolean = js.native
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LifecycleHooks with Double] = js.native
    /* 5 */ @js.native
    object AfterContentChecked extends TopLevel[AfterContentChecked with Double]
    
    /* 4 */ @js.native
    object AfterContentInit extends TopLevel[AfterContentInit with Double]
    
    /* 7 */ @js.native
    object AfterViewChecked extends TopLevel[AfterViewChecked with Double]
    
    /* 6 */ @js.native
    object AfterViewInit extends TopLevel[AfterViewInit with Double]
    
    /* 2 */ @js.native
    object DoCheck extends TopLevel[DoCheck with Double]
    
    /* 3 */ @js.native
    object OnChanges extends TopLevel[OnChanges with Double]
    
    /* 1 */ @js.native
    object OnDestroy extends TopLevel[OnDestroy with Double]
    
    /* 0 */ @js.native
    object OnInit extends TopLevel[OnInit with Double]
    
  }
  
}

