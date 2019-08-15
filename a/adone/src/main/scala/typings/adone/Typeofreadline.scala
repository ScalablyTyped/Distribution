package typings.adone

import org.scalablytyped.runtime.Instantiable1
import typings.node.NodeJSNs.ReadableStream
import typings.node.NodeJSNs.WritableStream
import typings.node.readlineMod.AsyncCompleter
import typings.node.readlineMod.Completer
import typings.node.readlineMod.Direction
import typings.node.readlineMod.Interface
import typings.node.readlineMod.ReadLineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofreadline extends js.Object {
  var Interface: Instantiable1[/* input */ ReadableStream, typings.adone.glossesStdMod.readlineNs.Interface] = js.native
  /**
    * Clears the current line of this WriteStream in a direction identified by `dir`.
    */
  def clearLine(stream: WritableStream, dir: Direction): Boolean = js.native
  def clearLine(stream: WritableStream, dir: Direction, callback: js.Function0[Unit]): Boolean = js.native
  /**
    * Clears this `WriteStream` from the current cursor down.
    */
  def clearScreenDown(stream: WritableStream): Boolean = js.native
  def clearScreenDown(stream: WritableStream, callback: js.Function0[Unit]): Boolean = js.native
  def createInterface(input: ReadableStream): Interface = js.native
  def createInterface(input: ReadableStream, output: WritableStream): Interface = js.native
  def createInterface(input: ReadableStream, output: WritableStream, completer: AsyncCompleter): Interface = js.native
  def createInterface(input: ReadableStream, output: WritableStream, completer: AsyncCompleter, terminal: Boolean): Interface = js.native
  def createInterface(input: ReadableStream, output: WritableStream, completer: Completer): Interface = js.native
  def createInterface(input: ReadableStream, output: WritableStream, completer: Completer, terminal: Boolean): Interface = js.native
  def createInterface(options: ReadLineOptions): Interface = js.native
  /**
    * Moves this WriteStream's cursor to the specified position.
    */
  def cursorTo(stream: WritableStream, x: Double): Boolean = js.native
  def cursorTo(stream: WritableStream, x: Double, y: Double): Boolean = js.native
  def cursorTo(stream: WritableStream, x: Double, y: Double, callback: js.Function0[Unit]): Boolean = js.native
  def emitKeypressEvents(stream: ReadableStream): Unit = js.native
  def emitKeypressEvents(stream: ReadableStream, interface: Interface): Unit = js.native
  /**
    * Moves this WriteStream's cursor relative to its current position.
    */
  def moveCursor(stream: WritableStream, dx: Double, dy: Double): Boolean = js.native
  def moveCursor(stream: WritableStream, dx: Double, dy: Double, callback: js.Function0[Unit]): Boolean = js.native
}

