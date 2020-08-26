package typings.angularCompiler.templateAstMod

import typings.angularCompiler.astMod.ASTWithSource
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/template_parser/template_ast", "BoundTextAst")
@js.native
class BoundTextAst protected () extends TemplateAst {
  def this(value: ASTWithSource, ngContentIndex: Double, sourceSpan: ParseSourceSpan) = this()
  var ngContentIndex: Double = js.native
  var value: ASTWithSource = js.native
}

