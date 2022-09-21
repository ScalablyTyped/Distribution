package typings.akamaiEdgeworkers.streamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadableStreamBYOBReader extends StObject {
  
  def cancel(): js.Promise[Unit] = js.native
  def cancel(reason: Any): js.Promise[Unit] = js.native
  
  val closed: js.Promise[Unit] = js.native
  
  def read[T /* <: js.typedarray.ArrayBufferView */](view: T): js.Promise[ReadableStreamReadResult[T]] = js.native
  
  def releaseLock(): Unit = js.native
}
