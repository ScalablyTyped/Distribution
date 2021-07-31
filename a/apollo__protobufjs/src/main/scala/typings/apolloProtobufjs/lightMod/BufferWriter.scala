package typings.apolloProtobufjs.lightMod

import typings.apolloProtobufjs.mod.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/protobufjs/light", "BufferWriter")
@js.native
/** Constructs a new buffer writer instance. */
class BufferWriter ()
  extends typings.apolloProtobufjs.mod.BufferWriter
/* static members */
object BufferWriter {
  
  @JSImport("@apollo/protobufjs/light", "BufferWriter")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Allocates a buffer of the specified size.
    * @param size Buffer size
    * @returns Buffer
    */
  @scala.inline
  def alloc(size: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any]).asInstanceOf[Buffer]
}
