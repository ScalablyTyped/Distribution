package typings.apolloProtobufjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/protobufjs", "BufferWriter")
@js.native
/** Constructs a new buffer writer instance. */
class BufferWriter () extends Writer

/* static members */
@JSImport("@apollo/protobufjs", "BufferWriter")
@js.native
object BufferWriter extends js.Object {
  /**
    * Allocates a buffer of the specified size.
    * @param size Buffer size
    * @returns Buffer
    */
  def alloc(size: Double): Buffer = js.native
}

