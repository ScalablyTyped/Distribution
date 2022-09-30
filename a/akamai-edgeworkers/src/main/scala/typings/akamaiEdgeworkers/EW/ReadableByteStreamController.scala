package typings.akamaiEdgeworkers.EW

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadableByteStreamController extends StObject {
  
  val byobRequest: js.UndefOr[ReadableStreamBYOBRequest] = js.native
  
  def close(): Unit = js.native
  
  val desiredSize: Double | Null = js.native
  
  def enqueue(chunk: js.typedarray.ArrayBufferView): Unit = js.native
  
  def error(): Unit = js.native
  def error(error: Any): Unit = js.native
}
