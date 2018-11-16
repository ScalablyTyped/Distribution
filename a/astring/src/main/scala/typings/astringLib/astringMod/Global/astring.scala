package typings
package astringLib.astringMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait astring extends js.Object {
  /** Base generator that can be used to extend Astring. See https://github.com/davidbonnet/astring#extending */
  var baseGenerator: astringLib.astringMod.Generator = js.native
  @JSName("generate")
  var generate_Original: js.Function2[
    /* node */ estreeLib.estreeMod.Node, 
    /* options */ astringLib.astringMod.Options with astringLib.Anon_Output, 
    nodeLib.streamMod.Stream
  ] = js.native
  def generate(node: estreeLib.estreeMod.Node, options: astringLib.astringMod.Options with astringLib.Anon_Output): nodeLib.streamMod.Stream = js.native
}

