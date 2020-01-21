package typings.angularCompiler.mod

import typings.angularCompiler.mlParserAstMod.HtmlAstPath
import typings.angularCompiler.mlParserAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "findNode")
@js.native
object findNode extends js.Object {
  def apply(nodes: js.Array[Node], position: Double): HtmlAstPath = js.native
}

