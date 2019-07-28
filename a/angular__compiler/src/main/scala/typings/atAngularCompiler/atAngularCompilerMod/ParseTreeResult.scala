package typings.atAngularCompiler.atAngularCompilerMod

import typings.atAngularCompiler.srcMlUnderscoreParserAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "ParseTreeResult")
@js.native
class ParseTreeResult protected ()
  extends typings.atAngularCompiler.publicUnderscoreApiMod.ParseTreeResult {
  def this(
    rootNodes: js.Array[Node],
    errors: js.Array[typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseError]
  ) = this()
}

