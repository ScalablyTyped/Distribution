package typings.astring.astringMod

import org.scalablytyped.runtime.TopLevel
import typings.astring.Anon_Output
import typings.astring.Fn_Node
import typings.estree.estreeMod.Node
import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object _Global_ extends js.Object {
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
  
  @js.native
  object astring
    extends TopLevel[typings.astring.astringMod._Global_.astring]
  
}

