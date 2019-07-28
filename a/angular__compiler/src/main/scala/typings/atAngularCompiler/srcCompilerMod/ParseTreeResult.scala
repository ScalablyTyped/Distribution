package typings.atAngularCompiler.srcCompilerMod

import typings.atAngularCompiler.srcMlUnderscoreParserAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "ParseTreeResult")
@js.native
class ParseTreeResult protected ()
  extends typings.atAngularCompiler.srcMlUnderscoreParserHtmlUnderscoreParserMod.ParseTreeResult {
  def this(
    rootNodes: js.Array[Node],
    errors: js.Array[typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseError]
  ) = this()
}

