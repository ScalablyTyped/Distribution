package typings.angularCompiler.templateAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/template_parser/template_ast", "NgContentAst")
@js.native
class NgContentAst protected () extends TemplateAst {
  def this(index: Double, ngContentIndex: Double, sourceSpan: ParseSourceSpan) = this()
  var index: Double = js.native
  var ngContentIndex: Double = js.native
}

