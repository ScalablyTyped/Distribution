package typings.atAngularCompiler.srcTemplateUnderscoreParserBindingUnderscoreParserMod

import typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.BindingPipe
import typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.RecursiveAstVisitor
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/template_parser/binding_parser", "PipeCollector")
@js.native
class PipeCollector () extends RecursiveAstVisitor {
  var pipes: Map[String, BindingPipe] = js.native
}

