package typings
package ansiDashEscapesLib.ansiDashEscapesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ansi-escapes", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  	Output a beeping sound.
  	*/
  var beep: java.lang.String = js.native
  /**
  	Clear the terminal screen. (Viewport)
  	*/
  var clearScreen: java.lang.String = js.native
  /**
  	Clear the whole terminal, including scrollback buffer. (Not just the visible part of it)
  	*/
  var clearTerminal: java.lang.String = js.native
  /**
  	Get cursor position.
  	*/
  var cursorGetPosition: java.lang.String = js.native
  /**
  	Hide cursor.
  	*/
  var cursorHide: java.lang.String = js.native
  /**
  	Move cursor to the left side.
  	*/
  var cursorLeft: java.lang.String = js.native
  /**
  	Move cursor to the next line.
  	*/
  var cursorNextLine: java.lang.String = js.native
  /**
  	Move cursor to the previous line.
  	*/
  var cursorPrevLine: java.lang.String = js.native
  /**
  	Restore saved cursor position.
  	*/
  var cursorRestorePosition: java.lang.String = js.native
  /**
  	Save cursor position.
  	*/
  var cursorSavePosition: java.lang.String = js.native
  /**
  	Show cursor.
  	*/
  var cursorShow: java.lang.String = js.native
  // TODO: remove this in the next major version
  var default: ansiDashEscapesLib.Anon_Beep = js.native
  /**
  	Erase the screen from the current line down to the bottom of the screen.
  	*/
  var eraseDown: java.lang.String = js.native
  /**
  	Erase from the current cursor position to the end of the current line.
  	*/
  var eraseEndLine: java.lang.String = js.native
  /**
  	Erase the entire current line.
  	*/
  var eraseLine: java.lang.String = js.native
  /**
  	Erase the screen and move the cursor the top left position.
  	*/
  var eraseScreen: java.lang.String = js.native
  /**
  	Erase from the current cursor position to the start of the current line.
  	*/
  var eraseStartLine: java.lang.String = js.native
  /**
  	Erase the screen from the current line up to the top of the screen.
  	*/
  var eraseUp: java.lang.String = js.native
  var iTerm: ansiDashEscapesLib.Anon_Cwd = js.native
  /**
  	Scroll display down one line.
  	*/
  var scrollDown: java.lang.String = js.native
  /**
  	Scroll display up one line.
  	*/
  var scrollUp: java.lang.String = js.native
  /**
  	Move cursor backward a specific amount of rows.
  	@param count - Count of rows to move backward. Default is `1`.
  	*/
  def cursorBackward(): java.lang.String = js.native
  def cursorBackward(count: scala.Double): java.lang.String = js.native
  /**
  	Move cursor down a specific amount of rows.
  	@param count - Count of rows to move down. Default is `1`.
  	*/
  def cursorDown(): java.lang.String = js.native
  def cursorDown(count: scala.Double): java.lang.String = js.native
  /**
  	Move cursor forward a specific amount of rows.
  	@param count - Count of rows to move forward. Default is `1`.
  	*/
  def cursorForward(): java.lang.String = js.native
  def cursorForward(count: scala.Double): java.lang.String = js.native
  /**
  	Set the position of the cursor relative to its current position.
  	*/
  def cursorMove(x: scala.Double): java.lang.String = js.native
  def cursorMove(x: scala.Double, y: scala.Double): java.lang.String = js.native
  /**
  	Set the absolute position of the cursor. `x0` `y0` is the top left of the screen.
  	*/
  def cursorTo(x: scala.Double): java.lang.String = js.native
  def cursorTo(x: scala.Double, y: scala.Double): java.lang.String = js.native
  /**
  	Move cursor up a specific amount of rows.
  	@param count - Count of rows to move up. Default is `1`.
  	*/
  def cursorUp(): java.lang.String = js.native
  def cursorUp(count: scala.Double): java.lang.String = js.native
  /**
  	Erase from the current cursor position up the specified amount of rows.
  	@param count - Count of rows to erase.
  	*/
  def eraseLines(count: scala.Double): java.lang.String = js.native
  /**
  	Display an image.
  	_Currently only supported on iTerm2 >=3_
  	See [term-img](https://github.com/sindresorhus/term-img) for a higher-level module.
  	@param buffer - Buffer of an image. Usually read in with `fs.readFile()`.
  	*/
  def image(buffer: nodeLib.Buffer): java.lang.String = js.native
  def image(buffer: nodeLib.Buffer, options: ImageOptions): java.lang.String = js.native
  /**
  	Create a clickable link.
  	[Supported terminals.](https://gist.github.com/egmontkob/eb114294efbcd5adb1944c9f3cb5feda) Use [`supports-hyperlinks`](https://github.com/jamestalmage/supports-hyperlinks) to detect link support.
  	*/
  def link(text: java.lang.String, url: java.lang.String): java.lang.String = js.native
}

