package typings.akamaiEdgeworkers.streamsMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.akamaiEdgeworkers.anon.Mode
import typings.akamaiEdgeworkers.anon.Readable
import typings.akamaiEdgeworkers.anon.Size
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadableStream[R] extends js.Object {
  
  def cancel(): js.Promise[Unit] = js.native
  def cancel(reason: js.Any): js.Promise[Unit] = js.native
  
  def getReader(): ReadableStreamDefaultReader[R] = js.native
  def getReader(options: Mode): ReadableStreamBYOBReader = js.native
  
  val locked: Boolean = js.native
  
  def pipeThrough[T](hasWritableReadable: Readable[R, T]): ReadableStream[T] = js.native
  def pipeThrough[T](hasWritableReadable: Readable[R, T], options: PipeOptions): ReadableStream[T] = js.native
  
  def pipeTo(dest: WritableStream[R]): js.Promise[Unit] = js.native
  def pipeTo(dest: WritableStream[R], options: PipeOptions): js.Promise[Unit] = js.native
  
  def tee(): js.Tuple2[ReadableStream[R], ReadableStream[R]] = js.native
}
@JSImport("streams", "ReadableStream")
@js.native
object ReadableStream
  extends Instantiable0[ReadableStream[js.Object]]
     with Instantiable1[
      (/* underlyingSource */ UnderlyingByteSource) | (/* underlyingSource */ UnderlyingSource[js.Object]), 
      ReadableStream[js.Object | Uint8Array]
    ]
     with Instantiable2[
      js.UndefOr[
        (/* underlyingSource */ UnderlyingByteSource) | (/* underlyingSource */ UnderlyingSource[js.Object])
      ], 
      (/* strategy */ QueuingStrategy[js.Object]) | (/* strategy */ Size), 
      ReadableStream[js.Object | Uint8Array]
    ]
