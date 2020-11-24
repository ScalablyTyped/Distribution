package typings.angularCompiler.templateAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/template_parser/template_ast", "TextAst")
@js.native
class TextAst protected () extends TemplateAst {
  def this(value: String, ngContentIndex: Double, sourceSpan: ParseSourceSpan) = this()
  
  var ngContentIndex: Double = js.native
  
  var value: String = js.native
}
