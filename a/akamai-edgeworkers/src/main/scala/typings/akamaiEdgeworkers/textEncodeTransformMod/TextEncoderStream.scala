package typings.akamaiEdgeworkers.textEncodeTransformMod

import org.scalablytyped.runtime.Instantiable0
import typings.akamaiEdgeworkers.streamsMod.ReadableStream
import typings.akamaiEdgeworkers.streamsMod.WritableStream
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextEncoderStream
  extends GenericTransformStream
     with TextEncoderCommon {
  
  @JSName("readable")
  val readable_TextEncoderStream: ReadableStream[Uint8Array] = js.native
  
  @JSName("writable")
  val writable_TextEncoderStream: WritableStream[String] = js.native
}
@JSImport("text-encode-transform", "TextEncoderStream")
@js.native
object TextEncoderStream extends Instantiable0[TextEncoderStream]
