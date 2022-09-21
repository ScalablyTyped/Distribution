package typings.akamaiEdgeworkers.streamsMod

import typings.akamaiEdgeworkers.anon.Mode
import typings.akamaiEdgeworkers.anon.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadableStream[R] extends StObject {
  
  def cancel(): js.Promise[Unit] = js.native
  def cancel(reason: Any): js.Promise[Unit] = js.native
  
  def getReader(): ReadableStreamDefaultReader[R] = js.native
  def getReader(options: Mode): ReadableStreamBYOBReader = js.native
  
  val locked: Boolean = js.native
  
  def pipeThrough[T](hasWritableReadable: Readable[R, T]): ReadableStream[T] = js.native
  def pipeThrough[T](hasWritableReadable: Readable[R, T], options: PipeOptions): ReadableStream[T] = js.native
  
  def pipeTo(dest: WritableStream[R]): js.Promise[Unit] = js.native
  def pipeTo(dest: WritableStream[R], options: PipeOptions): js.Promise[Unit] = js.native
  
  def tee(): js.Tuple2[ReadableStream[R], ReadableStream[R]] = js.native
}
