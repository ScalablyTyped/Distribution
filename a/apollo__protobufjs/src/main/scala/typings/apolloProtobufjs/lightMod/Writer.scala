package typings.apolloProtobufjs.lightMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/protobufjs/light", "Writer")
@js.native
/** Constructs a new writer instance. */
class Writer ()
  extends typings.apolloProtobufjs.mod.Writer
/* static members */
@JSImport("@apollo/protobufjs/light", "Writer")
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
  def create(): typings.apolloProtobufjs.mod.BufferWriter | typings.apolloProtobufjs.mod.Writer = js.native
}
