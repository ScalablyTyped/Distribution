package typings.apolloProtobufjs.lightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/protobufjs/light", "Writer")
@js.native
/** Constructs a new writer instance. */
open class Writer ()
  extends typings.apolloProtobufjs.mod.Writer
/* static members */
object Writer {
  
  @JSImport("@apollo/protobufjs/light", "Writer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Allocates a buffer of the specified size.
    * @param size Buffer size
    * @returns Buffer
    */
  inline def alloc(size: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  /**
    * Creates a new writer.
    * @returns A {@link BufferWriter} when Buffers are supported, otherwise a {@link Writer}
    */
  inline def create(): typings.apolloProtobufjs.mod.BufferWriter | typings.apolloProtobufjs.mod.Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.apolloProtobufjs.mod.BufferWriter | typings.apolloProtobufjs.mod.Writer]
}
