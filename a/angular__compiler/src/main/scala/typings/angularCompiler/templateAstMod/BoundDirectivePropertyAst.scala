package typings.angularCompiler.templateAstMod

import typings.angularCompiler.astMod.ASTWithSource
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/template_parser/template_ast", "BoundDirectivePropertyAst")
@js.native
class BoundDirectivePropertyAst protected () extends TemplateAst {
  def this(directiveName: String, templateName: String, value: ASTWithSource, sourceSpan: ParseSourceSpan) = this()
  var directiveName: String = js.native
  var templateName: String = js.native
  var value: ASTWithSource = js.native
}

