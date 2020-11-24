package typings.akamaiEdgeworkers.streamsMod

import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadableByteStreamController extends js.Object {
  
  val byobRequest: js.UndefOr[ReadableStreamBYOBRequest] = js.native
  
  def close(): Unit = js.native
  
  val desiredSize: Double | Null = js.native
  
  def enqueue(chunk: ArrayBufferView): Unit = js.native
  
  def error(): Unit = js.native
  def error(error: js.Any): Unit = js.native
}
