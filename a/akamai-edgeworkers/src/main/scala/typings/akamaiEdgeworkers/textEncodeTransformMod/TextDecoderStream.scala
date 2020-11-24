package typings.akamaiEdgeworkers.textEncodeTransformMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.akamaiEdgeworkers.streamsMod.ReadableStream
import typings.akamaiEdgeworkers.streamsMod.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextDecoderStream
  extends GenericTransformStream
     with TextDecoderCommon {
  
  @JSName("readable")
  val readable_TextDecoderStream: ReadableStream[String] = js.native
  
  @JSName("writable")
  val writable_TextDecoderStream: WritableStream[BufferSource] = js.native
}
@JSImport("text-encode-transform", "TextDecoderStream")
@js.native
object TextDecoderStream
  extends Instantiable0[TextDecoderStream]
     with Instantiable1[/* label */ String, TextDecoderStream]
     with Instantiable2[js.UndefOr[/* label */ String], /* options */ TextDecoderOptions, TextDecoderStream]
