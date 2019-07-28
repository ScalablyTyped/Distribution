package typings.astring.astringMod

import typings.astring.Anon_Output
import typings.estree.estreeMod.Node
import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("astring", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val baseGenerator: Generator = js.native
  def generate(node: Node): String = js.native
  def generate(node: Node, options: Options with Anon_Output): Stream = js.native
  @JSName("generate")
  def generate_String(node: Node, options: Options): String = js.native
}

