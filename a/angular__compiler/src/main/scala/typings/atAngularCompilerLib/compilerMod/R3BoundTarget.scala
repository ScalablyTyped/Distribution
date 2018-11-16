package typings
package atAngularCompilerLib.compilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "R3BoundTarget")
@js.native
class R3BoundTarget[DirectiveT /* <: atAngularCompilerLib.srcRender3ViewT2UnderscoreApiMod.DirectiveMeta */] protected ()
  extends atAngularCompilerLib.publicUnderscoreApiMod.R3BoundTarget[DirectiveT] {
  def this(target: atAngularCompilerLib.srcRender3ViewT2UnderscoreApiMod.Target, directives: stdLib.Map[
      atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Element | atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Template, 
      js.Array[DirectiveT]
    ], bindings: stdLib.Map[
      atAngularCompilerLib.srcRender3R3UnderscoreAstMod.BoundAttribute | atAngularCompilerLib.srcRender3R3UnderscoreAstMod.BoundEvent | atAngularCompilerLib.srcRender3R3UnderscoreAstMod.TextAttribute, 
      DirectiveT | atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Element | atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Template
    ], references: stdLib.Map[
      atAngularCompilerLib.srcRender3R3UnderscoreAstMod.BoundAttribute | atAngularCompilerLib.srcRender3R3UnderscoreAstMod.BoundEvent | atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Reference | atAngularCompilerLib.srcRender3R3UnderscoreAstMod.TextAttribute, 
      atAngularCompilerLib.Anon_Node[DirectiveT] | atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Element | atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Template
    ], exprTargets: stdLib.Map[
      atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST, 
      atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Reference | atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Variable
    ], symbols: stdLib.Map[
      atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Reference | atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Variable, 
      atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Template
    ], nestingLevel: stdLib.Map[atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Template, scala.Double]) = this()
}

