package typings
package asyncDashWriterLib.asyncDashWriterMod.asyncUnderscoreWriterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncWriter extends js.Object {
  var isAsyncWriter: AsyncWriter = js.native
  def _finish(): scala.Unit = js.native
  def beginAsync(): AsyncWriter = js.native
  def beginAsync(options: BeginAsyncOptions): AsyncWriter = js.native
  def beginAsync(options: scala.Double): AsyncWriter = js.native
  def captureString(func: js.Function, thisObj: js.Object): java.lang.String = js.native
  def createNestedWriter(writer: BufferedWriter): AsyncWriter = js.native
  def createNestedWriter(writer: StringWriter): AsyncWriter = js.native
  def emit(arg: js.Any): AsyncWriter = js.native
  def end(): AsyncWriter = js.native
  def end(data: js.Any): AsyncWriter = js.native
  def error(e: stdLib.Error): scala.Unit = js.native
  def flush(): scala.Unit = js.native
  def getAttribute(): js.Any = js.native
  def getAttributes(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def getOutput(): java.lang.String = js.native
  def handleBeginAsync(options: BeginAsyncOptions, parent: AsyncWriter): scala.Unit = js.native
  def handleBeginAsync(options: scala.Double, parent: AsyncWriter): scala.Unit = js.native
  def handleEnd(isAsync: scala.Boolean): scala.Unit = js.native
  def on(event: java.lang.String, callback: js.Function): AsyncWriter = js.native
  def onLast(callback: js.Function): AsyncWriter = js.native
  def once(event: java.lang.String, callback: js.Function): AsyncWriter = js.native
  def pipe(stream: nodeLib.streamMod.Stream): AsyncWriter = js.native
  def removeListener(): AsyncWriter = js.native
  def swapWriter(newWriter: BufferedWriter, func: js.Function, thisObj: js.Object): scala.Unit = js.native
  def swapWriter(newWriter: StringWriter, func: js.Function, thisObj: js.Object): scala.Unit = js.native
  def sync(): scala.Unit = js.native
  def write(str: java.lang.String): AsyncWriter = js.native
}

