package typings.asyncWriter.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.streamMod.Stream
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async-writer", "AsyncWriter")
@js.native
class AsyncWriter () extends js.Object {
  def this(writer: js.Any) = this()
  def this(writer: js.UndefOr[scala.Nothing], global: StringDictionary[js.Any]) = this()
  def this(writer: js.Any, global: StringDictionary[js.Any]) = this()
  def this(writer: js.UndefOr[scala.Nothing], global: js.UndefOr[scala.Nothing], async: Boolean) = this()
  def this(writer: js.UndefOr[scala.Nothing], global: StringDictionary[js.Any], async: Boolean) = this()
  def this(writer: js.Any, global: js.UndefOr[scala.Nothing], async: Boolean) = this()
  def this(writer: js.Any, global: StringDictionary[js.Any], async: Boolean) = this()
  def this(
    writer: js.UndefOr[scala.Nothing],
    global: js.UndefOr[scala.Nothing],
    async: js.UndefOr[scala.Nothing],
    buffer: Boolean
  ) = this()
  def this(
    writer: js.UndefOr[scala.Nothing],
    global: js.UndefOr[scala.Nothing],
    async: Boolean,
    buffer: Boolean
  ) = this()
  def this(
    writer: js.UndefOr[scala.Nothing],
    global: StringDictionary[js.Any],
    async: js.UndefOr[scala.Nothing],
    buffer: Boolean
  ) = this()
  def this(
    writer: js.UndefOr[scala.Nothing],
    global: StringDictionary[js.Any],
    async: Boolean,
    buffer: Boolean
  ) = this()
  def this(
    writer: js.Any,
    global: js.UndefOr[scala.Nothing],
    async: js.UndefOr[scala.Nothing],
    buffer: Boolean
  ) = this()
  def this(writer: js.Any, global: js.UndefOr[scala.Nothing], async: Boolean, buffer: Boolean) = this()
  def this(
    writer: js.Any,
    global: StringDictionary[js.Any],
    async: js.UndefOr[scala.Nothing],
    buffer: Boolean
  ) = this()
  def this(writer: js.Any, global: StringDictionary[js.Any], async: Boolean, buffer: Boolean) = this()
  var isAsyncWriter: AsyncWriter = js.native
  def _finish(): Unit = js.native
  def beginAsync(): AsyncWriter = js.native
  def beginAsync(options: Double): AsyncWriter = js.native
  def beginAsync(options: BeginAsyncOptions): AsyncWriter = js.native
  def captureString(func: js.Function, thisObj: js.Object): String = js.native
  def createNestedWriter(writer: BufferedWriter): AsyncWriter = js.native
  def createNestedWriter(writer: StringWriter): AsyncWriter = js.native
  def emit(arg: js.Any): AsyncWriter = js.native
  def end(): AsyncWriter = js.native
  def end(data: js.Any): AsyncWriter = js.native
  def error(e: Error): Unit = js.native
  def flush(): Unit = js.native
  def getAttribute(): js.Any = js.native
  def getAttributes(): StringDictionary[js.Any] = js.native
  def getOutput(): String = js.native
  def handleBeginAsync(options: Double, parent: AsyncWriter): Unit = js.native
  def handleBeginAsync(options: BeginAsyncOptions, parent: AsyncWriter): Unit = js.native
  def handleEnd(isAsync: Boolean): Unit = js.native
  def on(event: String, callback: js.Function): AsyncWriter = js.native
  def onLast(callback: js.Function): AsyncWriter = js.native
  def once(event: String, callback: js.Function): AsyncWriter = js.native
  def pipe(stream: Stream): AsyncWriter = js.native
  def removeListener(): AsyncWriter = js.native
  def swapWriter(newWriter: BufferedWriter, func: js.Function, thisObj: js.Object): Unit = js.native
  def swapWriter(newWriter: StringWriter, func: js.Function, thisObj: js.Object): Unit = js.native
  def sync(): Unit = js.native
  def write(str: String): AsyncWriter = js.native
}

/* static members */
@JSImport("async-writer", "AsyncWriter")
@js.native
object AsyncWriter extends js.Object {
  def enableAsyncStackTrace(): Unit = js.native
}

