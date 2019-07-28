package typings.atAngularCompiler.srcRender3ViewT2UnderscoreBinderMod

import typings.atAngularCompiler.Anon_Directive
import typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST
import typings.atAngularCompiler.srcRender3R3UnderscoreAstMod.BoundAttribute
import typings.atAngularCompiler.srcRender3R3UnderscoreAstMod.BoundEvent
import typings.atAngularCompiler.srcRender3R3UnderscoreAstMod.Element
import typings.atAngularCompiler.srcRender3R3UnderscoreAstMod.Reference
import typings.atAngularCompiler.srcRender3R3UnderscoreAstMod.Template
import typings.atAngularCompiler.srcRender3R3UnderscoreAstMod.TextAttribute
import typings.atAngularCompiler.srcRender3R3UnderscoreAstMod.Variable
import typings.atAngularCompiler.srcRender3ViewT2UnderscoreApiMod.BoundTarget
import typings.atAngularCompiler.srcRender3ViewT2UnderscoreApiMod.DirectiveMeta
import typings.atAngularCompiler.srcRender3ViewT2UnderscoreApiMod.Target
import typings.std.Map
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/view/t2_binder", "R3BoundTarget")
@js.native
class R3BoundTarget[DirectiveT /* <: DirectiveMeta */] protected () extends BoundTarget[DirectiveT] {
  def this(
    target: Target,
    directives: Map[Element | Template, js.Array[DirectiveT]],
    bindings: Map[BoundAttribute | BoundEvent | TextAttribute, DirectiveT | Element | Template],
    references: Map[
        BoundAttribute | BoundEvent | Reference | TextAttribute, 
        Anon_Directive[DirectiveT] | Element | Template
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

