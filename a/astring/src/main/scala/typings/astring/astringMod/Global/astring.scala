package typings.astring.astringMod.Global

import typings.astring.Anon_Output
import typings.astring.Fn_Node
import typings.astring.astringMod.Generator
import typings.astring.astringMod.Options
import typings.estree.estreeMod.Node
import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait astring extends js.Object {
  /** Base generator that can be used to extend Astring. See https://github.com/davidbonnet/astring#extending */
  var baseGenerator: Generator = js.native
  @JSName("generate")
  var generate_Original: Fn_Node = js.native
  def generate(node: Node): String = js.native
  def generate(node: Node, options: Options with Anon_Output): Stream = js.native
  @JSName("generate")
  def generate_String(node: Node, options: Options): String = js.native
}

