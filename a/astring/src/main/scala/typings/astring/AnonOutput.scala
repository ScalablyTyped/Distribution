package typings.astring

import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOutput extends js.Object {
  /** output stream to write the rendered code to (defaults to null) */
  var output: Stream
}

object AnonOutput {
  @scala.inline
  def apply(output: Stream): AnonOutput = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOutput]
  }
}

