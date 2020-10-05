package typings.angularCompiler.templateAstMod

import typings.angularCompiler.compileMetadataMod.CompileTokenMetadata
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/template_parser/template_ast", "ReferenceAst")
@js.native
class ReferenceAst protected () extends TemplateAst {
  def this(name: String, value: CompileTokenMetadata, originalValue: String, sourceSpan: ParseSourceSpan) = this()
  var name: String = js.native
  var originalValue: String = js.native
  var value: CompileTokenMetadata = js.native
}

