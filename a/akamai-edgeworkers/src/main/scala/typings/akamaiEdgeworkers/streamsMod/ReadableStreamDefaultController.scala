package typings.akamaiEdgeworkers.streamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadableStreamDefaultController[R] extends StObject {
  
  def close(): Unit = js.native
  
  val desiredSize: Double | Null = js.native
  
  def enqueue(chunk: R): Unit = js.native
  
  def error(): Unit = js.native
  def error(error: Any): Unit = js.native
}
