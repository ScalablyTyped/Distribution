package typings.astring

import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Output extends js.Object {
  /** output stream to write the rendered code to (defaults to null) */
  var output: Stream
}

object Anon_Output {
  @scala.inline
  def apply(output: Stream): Anon_Output = {
    val __obj = js.Dynamic.literal(output = output)
  
    __obj.asInstanceOf[Anon_Output]
  }
}

