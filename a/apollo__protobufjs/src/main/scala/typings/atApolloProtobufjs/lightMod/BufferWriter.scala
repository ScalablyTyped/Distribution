package typings.atApolloProtobufjs.lightMod

import typings.atApolloProtobufjs.atApolloProtobufjsMod.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/protobufjs/light", "BufferWriter")
@js.native
/** Constructs a new buffer writer instance. */
class BufferWriter ()
  extends typings.atApolloProtobufjs.atApolloProtobufjsMod.BufferWriter

/* static members */
@JSImport("@apollo/protobufjs/light", "BufferWriter")
@js.native
object BufferWriter extends js.Object {
  /**
    * Allocates a buffer of the specified size.
    * @param size Buffer size
    * @returns Buffer
    */
  def alloc(size: Double): Buffer = js.native
}

