package typings.angularCompiler.templateAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/template_parser/template_ast", "RecursiveTemplateAstVisitor")
@js.native
class RecursiveTemplateAstVisitor () extends NullTemplateVisitor {
  /* protected */ def visitChildren(
    context: js.Any,
    cb: js.Function1[
      /* visit */ js.Function1[/* children */ js.UndefOr[js.Array[TemplateAst]], Unit], 
      Unit
    ]
  ): js.Array[_] = js.native
}

