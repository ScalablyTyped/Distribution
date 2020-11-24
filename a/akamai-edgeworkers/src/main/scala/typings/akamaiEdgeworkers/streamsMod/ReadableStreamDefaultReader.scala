package typings.akamaiEdgeworkers.streamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadableStreamDefaultReader[R] extends js.Object {
  
  def cancel(): js.Promise[Unit] = js.native
  def cancel(reason: js.Any): js.Promise[Unit] = js.native
  
  val closed: js.Promise[Unit] = js.native
  
  def read(): js.Promise[ReadableStreamReadResult[R]] = js.native
  
  def releaseLock(): Unit = js.native
}
