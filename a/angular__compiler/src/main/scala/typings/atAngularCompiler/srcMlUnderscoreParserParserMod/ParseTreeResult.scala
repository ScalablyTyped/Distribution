package typings.atAngularCompiler.srcMlUnderscoreParserParserMod

import typings.atAngularCompiler.srcMlUnderscoreParserAstMod.Node
import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/parser", "ParseTreeResult")
@js.native
class ParseTreeResult protected () extends js.Object {
  def this(rootNodes: js.Array[Node], errors: js.Array[ParseError]) = this()
  var errors: js.Array[ParseError] = js.native
  var rootNodes: js.Array[Node] = js.native
}

