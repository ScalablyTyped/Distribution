package typings.atAngularCompiler.atAngularCompilerMod

import typings.atAngularCompiler.Anon_Directive
import typings.atAngularCompiler.srcRender3R3UnderscoreAstMod.BoundAttribute
import typings.atAngularCompiler.srcRender3R3UnderscoreAstMod.BoundEvent
import typings.atAngularCompiler.srcRender3R3UnderscoreAstMod.Reference
import typings.atAngularCompiler.srcRender3R3UnderscoreAstMod.Template
import typings.atAngularCompiler.srcRender3R3UnderscoreAstMod.TextAttribute
import typings.atAngularCompiler.srcRender3R3UnderscoreAstMod.Variable
import typings.atAngularCompiler.srcRender3ViewT2UnderscoreApiMod.DirectiveMeta
import typings.atAngularCompiler.srcRender3ViewT2UnderscoreApiMod.Target
import typings.std.Map
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "R3BoundTarget")
@js.native
class R3BoundTarget[DirectiveT /* <: DirectiveMeta */] protected ()
  extends typings.atAngularCompiler.publicUnderscoreApiMod.R3BoundTarget[DirectiveT] {
  def this(
    target: Target,
    directives: Map[
        typings.atAngularCompiler.srcRender3R3UnderscoreAstMod.Element | Template, 
        js.Array[DirectiveT]
      ],
    bindings: Map[
        BoundAttribute | BoundEvent | TextAttribute, 
        DirectiveT | typings.atAngularCompiler.srcRender3R3UnderscoreAstMod.Element | Template
      ],
    references: Map[
        BoundAttribute | BoundEvent | Reference | TextAttribute, 
        Anon_Directive[DirectiveT] | typings.atAngularCompiler.srcRender3R3UnderscoreAstMod.Element | Template
      ],
    exprTargets: Map[
        typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST, 
        Reference | Variable
      ],
    symbols: Map[Reference | Variable, Template],
    nestingLevel: Map[Template, Double],
    usedPipes: Set[String]
  ) = this()
}

