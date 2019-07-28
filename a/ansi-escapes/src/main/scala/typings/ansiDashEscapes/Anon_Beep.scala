package typings.ansiDashEscapes

import typings.ansiDashEscapes.ansiDashEscapesMod.ImageOptions
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Beep extends js.Object {
  /**
  	Output a beeping sound.
  	*/
  var beep: String = js.native
  /**
  	Clear the terminal screen. (Viewport)
  	*/
  var clearScreen: String = js.native
  /**
  	Clear the whole terminal, including scrollback buffer. (Not just the visible part of it)
  	*/
  var clearTerminal: String = js.native
  /**
  	Get cursor position.
  	*/
  var cursorGetPosition: String = js.native
  /**
  	Hide cursor.
  	*/
  var cursorHide: String = js.native
  /**
  	Move cursor to the left side.
  	*/
  var cursorLeft: String = js.native
  /**
  	Move cursor to the next line.
  	*/
  var cursorNextLine: String = js.native
  /**
  	Move cursor to the previous line.
  	*/
  var cursorPrevLine: String = js.native
  /**
  	Restore saved cursor position.
  	*/
  var cursorRestorePosition: String = js.native
  /**
  	Save cursor position.
  	*/
  var cursorSavePosition: String = js.native
  /**
  	Show cursor.
  	*/
  var cursorShow: String = js.native
  /**
  	Erase the screen from the current line down to the bottom of the screen.
  	*/
  var eraseDown: String = js.native
  /**
  	Erase from the current cursor position to the end of the current line.
  	*/
  var eraseEndLine: String = js.native
  /**
  	Erase the entire current line.
  	*/
  var eraseLine: String = js.native
  /**
  	Erase the screen and move the cursor the top left position.
  	*/
  var eraseScreen: String = js.native
  /**
  	Erase from the current cursor position to the start of the current line.
  	*/
  var eraseStartLine: String = js.native
  /**
  	Erase the screen from the current line up to the top of the screen.
  	*/
  var eraseUp: String = js.native
  var iTerm: Anon_Cwd = js.native
  /**
  	Scroll display down one line.
  	*/
  var scrollDown: String = js.native
  /**
  	Scroll display up one line.
  	*/
  var scrollUp: String = js.native
  /**
  	Move cursor backward a specific amount of rows.
  	@param count - Count of rows to move backward. Default is `1`.
  	*/
  def cursorBackward(): String = js.native
  def cursorBackward(count: Double): String = js.native
  /**
  	Move cursor down a specific amount of rows.
  	@param count - Count of rows to move down. Default is `1`.
  	*/
  def cursorDown(): String = js.native
  def cursorDown(count: Double): String = js.native
  /**
  	Move cursor forward a specific amount of rows.
  	@param count - Count of rows to move forward. Default is `1`.
  	*/
  def cursorForward(): String = js.native
  def cursorForward(count: Double): String = js.native
  /**
  	Set the position of the cursor relative to its current position.
  	*/
  def cursorMove(x: Double): String = js.native
  def cursorMove(x: Double, y: Double): String = js.native
  /**
  	Set the absolute position of the cursor. `x0` `y0` is the top left of the screen.
  	*/
  def cursorTo(x: Double): String = js.native
  def cursorTo(x: Double, y: Double): String = js.native
  /**
  	Move cursor up a specific amount of rows.
  	@param count - Count of rows to move up. Default is `1`.
  	*/
  def cursorUp(): String = js.native
  def cursorUp(count: Double): String = js.native
  /**
  	Erase from the current cursor position up the specified amount of rows.
  	@param count - Count of rows to erase.
  	*/
  def eraseLines(count: Double): String = js.native
  /**
  	Display an image.
  	_Currently only supported on iTerm2 >=3_
  	See [term-img](https://github.com/sindresorhus/term-img) for a higher-level module.
  	@param buffer - Buffer of an image. Usually read in with `fs.readFile()`.
  	*/
  def image(buffer: Buffer): String = js.native
  def image(buffer: Buffer, options: ImageOptions): String = js.native
  /**
  	Create a clickable link.
  	[Supported terminals.](https://gist.github.com/egmontkob/eb114294efbcd5adb1944c9f3cb5feda) Use [`supports-hyperlinks`](https://github.com/jamestalmage/supports-hyperlinks) to detect link support.
  	*/
  def link(text: String, url: String): String = js.native
}

