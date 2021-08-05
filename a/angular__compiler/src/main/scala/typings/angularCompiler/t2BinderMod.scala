package typings.angularCompiler

import typings.angularCompiler.anon.Directive
import typings.angularCompiler.astMod.AST
import typings.angularCompiler.r3AstMod.BoundAttribute
import typings.angularCompiler.r3AstMod.BoundEvent
import typings.angularCompiler.r3AstMod.Element
import typings.angularCompiler.r3AstMod.Reference
import typings.angularCompiler.r3AstMod.Template
import typings.angularCompiler.r3AstMod.TextAttribute
import typings.angularCompiler.r3AstMod.Variable
import typings.angularCompiler.selectorMod.SelectorMatcher
import typings.angularCompiler.t2ApiMod.BoundTarget
import typings.angularCompiler.t2ApiMod.DirectiveMeta
import typings.angularCompiler.t2ApiMod.Target
import typings.angularCompiler.t2ApiMod.TargetBinder
import typings.std.Map
import typings.std.ReadonlySet
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object t2BinderMod {
  
  @JSImport("@angular/compiler/src/render3/view/t2_binder", "R3BoundTarget")
  @js.native
  class R3BoundTarget[DirectiveT /* <: DirectiveMeta */] protected ()
    extends StObject
       with BoundTarget[DirectiveT] {
    def this(
      target: Target,
      directives: Map[Element | Template, js.Array[DirectiveT]],
      bindings: Map[BoundAttribute | BoundEvent | TextAttribute, DirectiveT | Element | Template],
      references: Map[
            BoundAttribute | BoundEvent | Reference | TextAttribute, 
            Directive[DirectiveT] | Element | Template
          ],
      exprTargets: Map[AST, Reference | Variable],
      symbols: Map[Reference | Variable, Template],
      nestingLevel: Map[Template, Double],
      templateEntities: Map[Template | Null, ReadonlySet[Reference | Variable]],
      usedPipes: Set[String]
    ) = this()
    
    /* private */ var bindings: js.Any = js.native
    
    /* private */ var directives: js.Any = js.native
    
    /* private */ var exprTargets: js.Any = js.native
    
    /* private */ var nestingLevel: js.Any = js.native
    
    /* private */ var references: js.Any = js.native
    
    /* private */ var symbols: js.Any = js.native
    
    /* private */ var templateEntities: js.Any = js.native
    
    /* private */ var usedPipes: js.Any = js.native
  }
  
  @JSImport("@angular/compiler/src/render3/view/t2_binder", "R3TargetBinder")
  @js.native
  class R3TargetBinder[DirectiveT /* <: DirectiveMeta */] protected ()
    extends StObject
       with TargetBinder[DirectiveT] {
    def this(directiveMatcher: SelectorMatcher[DirectiveT]) = this()
    
    /* CompleteClass */
    override def bind(target: Target): BoundTarget[DirectiveT] = js.native
    
    /* private */ var directiveMatcher: js.Any = js.native
  }
}
