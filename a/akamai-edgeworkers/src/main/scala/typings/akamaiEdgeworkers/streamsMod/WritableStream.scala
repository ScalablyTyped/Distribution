package typings.akamaiEdgeworkers.streamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WritableStream[W] extends StObject {
  
  def abort(): js.Promise[Unit] = js.native
  def abort(reason: js.Any): js.Promise[Unit] = js.native
  
  def close(): js.Promise[Unit] = js.native
  
  def getWriter(): WritableStreamDefaultWriter[W] = js.native
  
  val locked: Boolean = js.native
}
