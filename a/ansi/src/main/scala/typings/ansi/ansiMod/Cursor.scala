package typings.ansi.ansiMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ansi", "Cursor")
@js.native
class Cursor protected ()
  extends /* key */ StringDictionary[(js.Function1[/* repeated */ js.Any, Cursor]) | Colorer] {
  def this(stream: Stream) = this()
  def this(stream: Stream, options: CursorOptions) = this()
  var bg: Colorer = js.native
  var fg: Colorer = js.native
  def back(): Cursor = js.native
  /**
    * Makes a beep sound!
    */
  def beep(): Cursor = js.native
  def black(): Cursor = js.native
  def blue(): Cursor = js.native
  def bold(): Cursor = js.native
  def brightBlack(): Cursor = js.native
  def brightBlue(): Cursor = js.native
  def brightCyan(): Cursor = js.native
  def brightGreen(): Cursor = js.native
  def brightMagenta(): Cursor = js.native
  def brightRed(): Cursor = js.native
  def brightWhite(): Cursor = js.native
  def brightYellow(): Cursor = js.native
  /**
    * Buffer `write()` calls into memory.
    *
    * @api public
    */
  def buffer(): Cursor = js.native
  def cyan(): Cursor = js.native
  def down(): Cursor = js.native
  def eraseData(): Cursor = js.native
  def eraseLine(): Cursor = js.native
  /**
    * Write out the in-memory buffer.
    *
    * @api public
    */
  def flush(): Cursor = js.native
  def forward(): Cursor = js.native
  /**
    * Moves cursor to specific position
    */
  def goto(): Cursor = js.native
  def goto(x: Double): Cursor = js.native
  def goto(x: Double, y: Double): Cursor = js.native
  def green(): Cursor = js.native
  def grey(): Cursor = js.native
  /**
    * Accepts CSS color codes for use with ANSI escape codes.
    * For example: `#FF000` would be bright red.
    */
  def hex(color: String): Cursor = js.native
  def hide(): Cursor = js.native
  def horizontalAbsolute(): Cursor = js.native
  def inverse(): Cursor = js.native
  def italic(): Cursor = js.native
  def magenta(): Cursor = js.native
  def nextLine(): Cursor = js.native
  def previousLine(): Cursor = js.native
  def queryPosition(): Cursor = js.native
  def red(): Cursor = js.native
  /**
    * Resets all ANSI formatting on the stream.
    */
  def reset(): Cursor = js.native
  def resetbold(): Cursor = js.native
  def resetinverse(): Cursor = js.native
  def resetitalic(): Cursor = js.native
  def resetunderline(): Cursor = js.native
  def restorePosition(): Cursor = js.native
  /**
    * Sets the foreground color with the given RGB values.
    * The closest match out of the 216 colors is picked.
    */
  def rgb(r: Double, g: Double, b: Double): Cursor = js.native
  def savePosition(): Cursor = js.native
  def scrollDown(): Cursor = js.native
  def scrollUp(): Cursor = js.native
  def show(): Cursor = js.native
  def underline(): Cursor = js.native
  def up(): Cursor = js.native
  def white(): Cursor = js.native
  /**
    * Helper function that calls `write()` on the underlying Stream.
    * Returns `this` instead of the write() return value to keep
    * the chaining going.
    */
  def write(data: String): Cursor = js.native
  def yellow(): Cursor = js.native
}

