package typings.adone

import org.scalablytyped.runtime.Instantiable1
import typings.node.NodeJSNs.ReadableStream
import typings.node.NodeJSNs.WritableStream
import typings.node.readlineMod.AsyncCompleter
import typings.node.readlineMod.Completer
import typings.node.readlineMod.Interface
import typings.node.readlineMod.ReadLineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofreadline extends js.Object {
  var Interface: Instantiable1[/* input */ ReadableStream, typings.adone.glossesStdMod.readlineNs.Interface] = js.native
  def clearLine(stream: WritableStream, dir: Double): Unit = js.native
  def clearScreenDown(stream: WritableStream): Unit = js.native
  def createInterface(input: ReadableStream): Interface = js.native
  def createInterface(input: ReadableStream, output: WritableStream): Interface = js.native
  def createInterface(input: ReadableStream, output: WritableStream, completer: AsyncCompleter): Interface = js.native
  def createInterface(input: ReadableStream, output: WritableStream, completer: AsyncCompleter, terminal: Boolean): Interface = js.native
  def createInterface(input: ReadableStream, output: WritableStream, completer: Completer): Interface = js.native
  def createInterface(input: ReadableStream, output: WritableStream, completer: Completer, terminal: Boolean): Interface = js.native
  def createInterface(options: ReadLineOptions): Interface = js.native
  def cursorTo(stream: WritableStream, x: Double): Unit = js.native
  def cursorTo(stream: WritableStream, x: Double, y: Double): Unit = js.native
  def emitKeypressEvents(stream: ReadableStream): Unit = js.native
  def emitKeypressEvents(stream: ReadableStream, interface: Interface): Unit = js.native
  def moveCursor(stream: WritableStream, dx: String, dy: String): Unit = js.native
  def moveCursor(stream: WritableStream, dx: String, dy: Double): Unit = js.native
  def moveCursor(stream: WritableStream, dx: Double, dy: String): Unit = js.native
  def moveCursor(stream: WritableStream, dx: Double, dy: Double): Unit = js.native
}

