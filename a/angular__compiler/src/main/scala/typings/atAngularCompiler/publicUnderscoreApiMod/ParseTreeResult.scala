package typings.atAngularCompiler.publicUnderscoreApiMod

import typings.atAngularCompiler.srcMlUnderscoreParserAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "ParseTreeResult")
@js.native
class ParseTreeResult protected ()
  extends typings.atAngularCompiler.srcCompilerMod.ParseTreeResult {
  def this(
    rootNodes: js.Array[Node],
    errors: js.Array[typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseError]
  ) = this()
}

