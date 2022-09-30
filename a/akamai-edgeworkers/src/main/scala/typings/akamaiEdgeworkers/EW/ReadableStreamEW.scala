package typings.akamaiEdgeworkers.EW

import typings.akamaiEdgeworkers.anon.Mode
import typings.akamaiEdgeworkers.anon.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadableStreamEW[R] extends StObject {
  
  def cancel(): js.Promise[Unit] = js.native
  def cancel(reason: Any): js.Promise[Unit] = js.native
  
  def getReader(): ReadableStreamDefaultReader[R] = js.native
  def getReader(options: Mode): ReadableStreamBYOBReader = js.native
  
  val locked: Boolean = js.native
  
  def pipeThrough[T](hasWritableReadable: Readable[R, T]): ReadableStreamEW[T] = js.native
  def pipeThrough[T](hasWritableReadable: Readable[R, T], options: PipeOptions): ReadableStreamEW[T] = js.native
  
  def pipeTo(dest: WritableStreamEW[R]): js.Promise[Unit] = js.native
  def pipeTo(dest: WritableStreamEW[R], options: PipeOptions): js.Promise[Unit] = js.native
  
  def tee(): js.Tuple2[ReadableStreamEW[R], ReadableStreamEW[R]] = js.native
}
