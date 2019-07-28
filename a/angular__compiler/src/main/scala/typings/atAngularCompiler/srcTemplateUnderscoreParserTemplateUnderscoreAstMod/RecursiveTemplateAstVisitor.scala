package typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/template_parser/template_ast", "RecursiveTemplateAstVisitor")
@js.native
class RecursiveTemplateAstVisitor () extends NullTemplateVisitor {
  /* protected */ def visitChildren[T /* <: TemplateAst */](
    context: js.Any,
    cb: js.Function1[
      /* visit */ js.Function1[/* children */ js.UndefOr[js.Array[TemplateAst]], Unit], 
      Unit
    ]
  ): js.Any = js.native
}

