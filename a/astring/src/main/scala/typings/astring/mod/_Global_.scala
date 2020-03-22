package typings.astring.mod

import org.scalablytyped.runtime.TopLevel
import typings.astring.FnCall
import typings.astring.OptionsoutputStream
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
    var generate_Original: FnCall = js.native
    def generate(node: Node): String = js.native
    def generate(node: Node, options: OptionsoutputStream): Stream = js.native
    def generate(node: Node, options: Options): String = js.native
  }
  
  @js.native
  object astring extends TopLevel[astring]
  
}

