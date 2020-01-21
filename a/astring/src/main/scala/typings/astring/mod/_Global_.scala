package typings.astring.mod

import org.scalablytyped.runtime.TopLevel
import typings.astring.AnonOutput
import typings.astring.FnNode
import typings.estree.mod.Node
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
    var generate_Original: FnNode = js.native
    def generate(node: Node): String = js.native
    def generate(node: Node, options: Options): String = js.native
    @JSName("generate")
    def generate_Stream(node: Node, options: Options with AnonOutput): Stream = js.native
  }
  
  @js.native
  object astring extends TopLevel[astring]
  
}

