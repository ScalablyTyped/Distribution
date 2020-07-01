package typings.arrayifyStream

import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("arrayify-stream", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * Converts a Node readable stream into an array that is returned as a promise.
    */
  def apply(input: Readable): js.Promise[js.Array[_]] = js.native
}

