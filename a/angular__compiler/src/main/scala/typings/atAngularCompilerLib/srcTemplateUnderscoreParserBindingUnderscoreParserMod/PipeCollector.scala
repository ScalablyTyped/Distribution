package typings
package atAngularCompilerLib.srcTemplateUnderscoreParserBindingUnderscoreParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/template_parser/binding_parser", "PipeCollector")
@js.native
class PipeCollector ()
  extends atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.RecursiveAstVisitor {
  var pipes: stdLib.Map[
    java.lang.String, 
    atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.BindingPipe
  ] = js.native
}

