package typings.angularCompiler.mod

import typings.angularCompiler.mlParserAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "ParseTreeResult")
@js.native
class ParseTreeResult protected ()
  extends typings.angularCompiler.compilerMod.ParseTreeResult {
  def this(rootNodes: js.Array[Node], errors: js.Array[typings.angularCompiler.srcParseUtilMod.ParseError]) = this()
}

