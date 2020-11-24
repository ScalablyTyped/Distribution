package typings.apolloProtobufjs.minimalMod

import typings.apolloProtobufjs.mod.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/protobufjs/minimal", "BufferWriter")
@js.native
/** Constructs a new buffer writer instance. */
class BufferWriter ()
  extends typings.apolloProtobufjs.mod.BufferWriter
/* static members */
@JSImport("@apollo/protobufjs/minimal", "BufferWriter")
@js.native
object BufferWriter extends js.Object {
  
  /**
    * Allocates a buffer of the specified size.
    * @param size Buffer size
    * @returns Buffer
    */
  def alloc(size: Double): Buffer = js.native
}
