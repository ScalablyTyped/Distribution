package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait R3SelectorScopeMode extends StObject
@JSImport("@angular/compiler", "R3SelectorScopeMode")
@js.native
object R3SelectorScopeMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[R3SelectorScopeMode & Double] = js.native
  
  /**
    * Emit the declarations inline into the module definition.
    *
    * This option is useful in certain contexts where it's known that JIT support is required. The
    * tradeoff here is that this emit style prevents directives and pipes from being tree-shaken if
    * they are unused, but the NgModule is used.
    */
  @js.native
  sealed trait Inline
    extends StObject
       with R3SelectorScopeMode
  /* 0 */ val Inline: typings.angularCompiler.mod.R3SelectorScopeMode.Inline & Double = js.native
  
  /**
    * Don't generate selector scopes at all.
    *
    * This is useful for contexts where JIT support is known to be unnecessary.
    */
  @js.native
  sealed trait Omit
    extends StObject
       with R3SelectorScopeMode
  /* 2 */ val Omit: typings.angularCompiler.mod.R3SelectorScopeMode.Omit & Double = js.native
  
  /**
    * Emit the declarations using a side effectful function call, `ɵɵsetNgModuleScope`, that is
    * guarded with the `ngJitMode` flag.
    *
    * This form of emit supports JIT and can be optimized away if the `ngJitMode` flag is set to
    * false, which allows unused directives and pipes to be tree-shaken.
    */
  @js.native
  sealed trait SideEffect
    extends StObject
       with R3SelectorScopeMode
  /* 1 */ val SideEffect: typings.angularCompiler.mod.R3SelectorScopeMode.SideEffect & Double = js.native
}
