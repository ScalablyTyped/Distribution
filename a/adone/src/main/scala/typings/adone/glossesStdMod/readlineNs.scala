package typings.adone.glossesStdMod

import typings.node.NodeJSNs.ReadableStream
import typings.node.NodeJSNs.WritableStream
import typings.node.readlineMod.AsyncCompleter
import typings.node.readlineMod.Completer
import typings.node.readlineMod.ReadLineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/glosses/std", "readline")
@js.native
object readlineNs extends js.Object {
  @js.native
  class Interface protected ()
    extends typings.node.readlineMod.Interface {
    /**
      * NOTE: According to the documentation:
      *
      * > Instances of the `readline.Interface` class are constructed using the
      * > `readline.createInterface()` method.
      *
      * @see https://nodejs.org/dist/latest-v10.x/docs/api/readline.html#readline_class_interface
      */
    protected def this(input: ReadableStream) = this()
    /**
      * NOTE: According to the documentation:
      *
      * > Instances of the `readline.Interface` class are constructed using the
      * > `readline.createInterface()` method.
      *
      * @see https://nodejs.org/dist/latest-v10.x/docs/api/readline.html#readline_class_interface
      */
    protected def this(options: ReadLineOptions) = this()
    protected def this(input: ReadableStream, output: WritableStream) = this()
    protected def this(input: ReadableStream, output: WritableStream, completer: AsyncCompleter) = this()
    protected def this(input: ReadableStream, output: WritableStream, completer: Completer) = this()
    protected def this(input: ReadableStream, output: WritableStream, completer: AsyncCompleter, terminal: Boolean) = this()
    protected def this(input: ReadableStream, output: WritableStream, completer: Completer, terminal: Boolean) = this()
  }
  
  def clearLine(stream: WritableStream, dir: Double): Unit = js.native
  def clearScreenDown(stream: WritableStream): Unit = js.native
  def createInterface(input: ReadableStream): typings.node.readlineMod.Interface = js.native
  def createInterface(input: ReadableStream, output: WritableStream): typings.node.readlineMod.Interface = js.native
  def createInterface(input: ReadableStream, output: WritableStream, completer: AsyncCompleter): typings.node.readlineMod.Interface = js.native
  def createInterface(input: ReadableStream, output: WritableStream, completer: AsyncCompleter, terminal: Boolean): typings.node.readlineMod.Interface = js.native
  def createInterface(input: ReadableStream, output: WritableStream, completer: Completer): typings.node.readlineMod.Interface = js.native
  def createInterface(input: ReadableStream, output: WritableStream, completer: Completer, terminal: Boolean): typings.node.readlineMod.Interface = js.native
  def createInterface(options: ReadLineOptions): typings.node.readlineMod.Interface = js.native
  def cursorTo(stream: WritableStream, x: Double): Unit = js.native
  def cursorTo(stream: WritableStream, x: Double, y: Double): Unit = js.native
  def emitKeypressEvents(stream: ReadableStream): Unit = js.native
  def emitKeypressEvents(stream: ReadableStream, interface: typings.node.readlineMod.Interface): Unit = js.native
  def moveCursor(stream: WritableStream, dx: String, dy: String): Unit = js.native
  def moveCursor(stream: WritableStream, dx: String, dy: Double): Unit = js.native
  def moveCursor(stream: WritableStream, dx: Double, dy: String): Unit = js.native
  def moveCursor(stream: WritableStream, dx: Double, dy: Double): Unit = js.native
}

