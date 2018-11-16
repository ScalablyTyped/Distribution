package typings
package astringLib.astringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("astring", JSImport.Namespace)
@js.native
object astringModMembers extends js.Object {
  val baseGenerator: Generator = js.native
  def generate(node: estreeLib.estreeMod.Node): java.lang.String = js.native
  def generate(node: estreeLib.estreeMod.Node, options: Options): java.lang.String = js.native
  @JSName("generate")
  def generate_Stream(node: estreeLib.estreeMod.Node, options: Options with astringLib.Anon_Output): nodeLib.streamMod.Stream = js.native
}

