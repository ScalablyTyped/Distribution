package typings.angularCompiler

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
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/view/t2_binder", JSImport.Namespace)
@js.native
object t2BinderMod extends js.Object {
  @js.native
  class R3BoundTarget[DirectiveT /* <: DirectiveMeta */] protected () extends BoundTarget[DirectiveT] {
    def this(
      target: Target,
      directives: Map[Element | Template, js.Array[DirectiveT]],
      bindings: Map[BoundAttribute | BoundEvent | TextAttribute, DirectiveT | Element | Template],
      references: Map[
            BoundAttribute | BoundEvent | Reference | TextAttribute, 
            AnonDirective[DirectiveT] | Element | Template
          ],
      exprTargets: Map[AST, Reference | Variable],
      symbols: Map[Reference | Variable, Template],
      nestingLevel: Map[Template, Double],
      usedPipes: Set[String]
    ) = this()
    var bindings: js.Any = js.native
    var directives: js.Any = js.native
    var exprTargets: js.Any = js.native
    var nestingLevel: js.Any = js.native
    var references: js.Any = js.native
    var symbols: js.Any = js.native
    var usedPipes: js.Any = js.native
  }
  
  @js.native
  class R3TargetBinder[DirectiveT /* <: DirectiveMeta */] protected () extends TargetBinder[DirectiveT] {
    def this(directiveMatcher: SelectorMatcher[DirectiveT]) = this()
    var directiveMatcher: js.Any = js.native
    /* CompleteClass */
    override def bind(target: Target): BoundTarget[DirectiveT] = js.native
  }
  
}

