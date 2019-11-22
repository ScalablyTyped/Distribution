package typings.atApolloProtobufjs.minimalMod

import typings.atApolloProtobufjs.atApolloProtobufjsMod.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/protobufjs/minimal", "Reader")
@js.native
class Reader protected ()
  extends typings.atApolloProtobufjs.atApolloProtobufjsMod.Reader {
  /**
    * Constructs a new reader instance using the specified buffer.
    * @param buffer Buffer to read from
    */
  def this(buffer: Uint8Array) = this()
}

/* static members */
@JSImport("@apollo/protobufjs/minimal", "Reader")
@js.native
object Reader extends js.Object {
  /**
    * Creates a new reader using the specified buffer.
    * @param buffer Buffer to read from
    * @returns A {@link BufferReader} if `buffer` is a Buffer, otherwise a {@link Reader}
    * @throws {Error} If `buffer` is not a valid buffer
    */
  def create(buffer: Buffer | Uint8Array): typings.atApolloProtobufjs.atApolloProtobufjsMod.Reader | typings.atApolloProtobufjs.atApolloProtobufjsMod.BufferReader = js.native
}

