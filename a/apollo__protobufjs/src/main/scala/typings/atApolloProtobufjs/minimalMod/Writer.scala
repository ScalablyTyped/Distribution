package typings.atApolloProtobufjs.minimalMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/protobufjs/minimal", "Writer")
@js.native
/** Constructs a new writer instance. */
class Writer ()
  extends typings.atApolloProtobufjs.atApolloProtobufjsMod.Writer

/* static members */
@JSImport("@apollo/protobufjs/minimal", "Writer")
@js.native
object Writer extends js.Object {
  /**
    * Allocates a buffer of the specified size.
    * @param size Buffer size
    * @returns Buffer
    */
  def alloc(size: Double): Uint8Array = js.native
  /**
    * Creates a new writer.
    * @returns A {@link BufferWriter} when Buffers are supported, otherwise a {@link Writer}
    */
  def create(): typings.atApolloProtobufjs.atApolloProtobufjsMod.BufferWriter | typings.atApolloProtobufjs.atApolloProtobufjsMod.Writer = js.native
}

