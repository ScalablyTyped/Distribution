package typings
package adoneLib.glossesStdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/glosses/std", "readline")
@js.native
object readlineNs extends js.Object {
  @js.native
  class Interface protected ()
    extends nodeLib.readlineMod.Interface {
    /**
             * NOTE: According to the documentation:
             *
             * > Instances of the `readline.Interface` class are constructed using the
             * > `readline.createInterface()` method.
             *
             * @see https://nodejs.org/dist/latest-v10.x/docs/api/readline.html#readline_class_interface
             */
    protected def this(input: nodeLib.NodeJSNs.ReadableStream) = this()
    /**
             * NOTE: According to the documentation:
             *
             * > Instances of the `readline.Interface` class are constructed using the
             * > `readline.createInterface()` method.
             *
             * @see https://nodejs.org/dist/latest-v10.x/docs/api/readline.html#readline_class_interface
             */
    protected def this(options: nodeLib.readlineMod.ReadLineOptions) = this()
    /**
             * NOTE: According to the documentation:
             *
             * > Instances of the `readline.Interface` class are constructed using the
             * > `readline.createInterface()` method.
             *
             * @see https://nodejs.org/dist/latest-v10.x/docs/api/readline.html#readline_class_interface
             */
    protected def this(input: nodeLib.NodeJSNs.ReadableStream, output: nodeLib.NodeJSNs.WritableStream) = this()
    /**
             * NOTE: According to the documentation:
             *
             * > Instances of the `readline.Interface` class are constructed using the
             * > `readline.createInterface()` method.
             *
             * @see https://nodejs.org/dist/latest-v10.x/docs/api/readline.html#readline_class_interface
             */
    protected def this(input: nodeLib.NodeJSNs.ReadableStream, output: nodeLib.NodeJSNs.WritableStream, completer: nodeLib.readlineMod.AsyncCompleter) = this()
    /**
             * NOTE: According to the documentation:
             *
             * > Instances of the `readline.Interface` class are constructed using the
             * > `readline.createInterface()` method.
             *
             * @see https://nodejs.org/dist/latest-v10.x/docs/api/readline.html#readline_class_interface
             */
    protected def this(input: nodeLib.NodeJSNs.ReadableStream, output: nodeLib.NodeJSNs.WritableStream, completer: nodeLib.readlineMod.Completer) = this()
    /**
             * NOTE: According to the documentation:
             *
             * > Instances of the `readline.Interface` class are constructed using the
             * > `readline.createInterface()` method.
             *
             * @see https://nodejs.org/dist/latest-v10.x/docs/api/readline.html#readline_class_interface
             */
    protected def this(input: nodeLib.NodeJSNs.ReadableStream, output: nodeLib.NodeJSNs.WritableStream, completer: nodeLib.readlineMod.AsyncCompleter, terminal: scala.Boolean) = this()
    /**
             * NOTE: According to the documentation:
             *
             * > Instances of the `readline.Interface` class are constructed using the
             * > `readline.createInterface()` method.
             *
             * @see https://nodejs.org/dist/latest-v10.x/docs/api/readline.html#readline_class_interface
             */
    protected def this(input: nodeLib.NodeJSNs.ReadableStream, output: nodeLib.NodeJSNs.WritableStream, completer: nodeLib.readlineMod.Completer, terminal: scala.Boolean) = this()
  }
  
  def clearLine(stream: nodeLib.NodeJSNs.WritableStream, dir: scala.Double): scala.Unit = js.native
  def clearScreenDown(stream: nodeLib.NodeJSNs.WritableStream): scala.Unit = js.native
  def createInterface(input: nodeLib.NodeJSNs.ReadableStream): nodeLib.readlineMod.Interface = js.native
  def createInterface(input: nodeLib.NodeJSNs.ReadableStream, output: nodeLib.NodeJSNs.WritableStream): nodeLib.readlineMod.Interface = js.native
  def createInterface(
    input: nodeLib.NodeJSNs.ReadableStream,
    output: nodeLib.NodeJSNs.WritableStream,
    completer: nodeLib.readlineMod.AsyncCompleter
  ): nodeLib.readlineMod.Interface = js.native
  def createInterface(
    input: nodeLib.NodeJSNs.ReadableStream,
    output: nodeLib.NodeJSNs.WritableStream,
    completer: nodeLib.readlineMod.AsyncCompleter,
    terminal: scala.Boolean
  ): nodeLib.readlineMod.Interface = js.native
  def createInterface(
    input: nodeLib.NodeJSNs.ReadableStream,
    output: nodeLib.NodeJSNs.WritableStream,
    completer: nodeLib.readlineMod.Completer
  ): nodeLib.readlineMod.Interface = js.native
  def createInterface(
    input: nodeLib.NodeJSNs.ReadableStream,
    output: nodeLib.NodeJSNs.WritableStream,
    completer: nodeLib.readlineMod.Completer,
    terminal: scala.Boolean
  ): nodeLib.readlineMod.Interface = js.native
  def createInterface(options: nodeLib.readlineMod.ReadLineOptions): nodeLib.readlineMod.Interface = js.native
  def cursorTo(stream: nodeLib.NodeJSNs.WritableStream, x: scala.Double): scala.Unit = js.native
  def cursorTo(stream: nodeLib.NodeJSNs.WritableStream, x: scala.Double, y: scala.Double): scala.Unit = js.native
  def emitKeypressEvents(stream: nodeLib.NodeJSNs.ReadableStream): scala.Unit = js.native
  def emitKeypressEvents(stream: nodeLib.NodeJSNs.ReadableStream, interface: nodeLib.readlineMod.Interface): scala.Unit = js.native
  def moveCursor(stream: nodeLib.NodeJSNs.WritableStream, dx: java.lang.String, dy: java.lang.String): scala.Unit = js.native
  def moveCursor(stream: nodeLib.NodeJSNs.WritableStream, dx: java.lang.String, dy: scala.Double): scala.Unit = js.native
  def moveCursor(stream: nodeLib.NodeJSNs.WritableStream, dx: scala.Double, dy: java.lang.String): scala.Unit = js.native
  def moveCursor(stream: nodeLib.NodeJSNs.WritableStream, dx: scala.Double, dy: scala.Double): scala.Unit = js.native
}

