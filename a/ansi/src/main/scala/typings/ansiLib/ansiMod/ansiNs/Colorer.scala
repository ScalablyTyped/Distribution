package typings
package ansiLib.ansiMod.ansiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `Colorer` class manages both the background and foreground colors.
  */
trait Colorer
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, Cursor | Colorer]] {
  /**
    * Write an ANSI color code, ensuring that the same code doesn't get rewritten.
    */
  def _setColorCode(code: java.lang.String): Colorer
  def black(): Cursor
  def blue(): Cursor
  def brightBlack(): Cursor
  def brightBlue(): Cursor
  def brightCyan(): Cursor
  def brightGreen(): Cursor
  def brightMagenta(): Cursor
  def brightRed(): Cursor
  def brightWhite(): Cursor
  def brightYellow(): Cursor
  def cyan(): Cursor
  def green(): Cursor
  def grey(): Cursor
  /**
    * Accepts CSS color codes for use with ANSI escape codes.
    * For example: `#FF000` would be bright red.
    */
  def hex(color: java.lang.String): Cursor
  def magenta(): Cursor
  def red(): Cursor
  /**
    * Resets the color.
    */
  def reset(): Cursor
  /**
    * Sets the foreground color with the given RGB values.
    * The closest match out of the 216 colors is picked.
    */
  def rgb(r: scala.Double, g: scala.Double, b: scala.Double): Cursor
  def white(): Cursor
  def yellow(): Cursor
}

object Colorer {
  @scala.inline
  def apply(
    _setColorCode: java.lang.String => Colorer,
    black: () => Cursor,
    blue: () => Cursor,
    brightBlack: () => Cursor,
    brightBlue: () => Cursor,
    brightCyan: () => Cursor,
    brightGreen: () => Cursor,
    brightMagenta: () => Cursor,
    brightRed: () => Cursor,
    brightWhite: () => Cursor,
    brightYellow: () => Cursor,
    cyan: () => Cursor,
    green: () => Cursor,
    grey: () => Cursor,
    hex: java.lang.String => Cursor,
    magenta: () => Cursor,
    red: () => Cursor,
    reset: () => Cursor,
    rgb: (scala.Double, scala.Double, scala.Double) => Cursor,
    white: () => Cursor,
    yellow: () => Cursor,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, Cursor | Colorer]] = null
  ): Colorer = {
    val __obj = js.Dynamic.literal(_setColorCode = js.Any.fromFunction1(_setColorCode), black = js.Any.fromFunction0(black), blue = js.Any.fromFunction0(blue), brightBlack = js.Any.fromFunction0(brightBlack), brightBlue = js.Any.fromFunction0(brightBlue), brightCyan = js.Any.fromFunction0(brightCyan), brightGreen = js.Any.fromFunction0(brightGreen), brightMagenta = js.Any.fromFunction0(brightMagenta), brightRed = js.Any.fromFunction0(brightRed), brightWhite = js.Any.fromFunction0(brightWhite), brightYellow = js.Any.fromFunction0(brightYellow), cyan = js.Any.fromFunction0(cyan), green = js.Any.fromFunction0(green), grey = js.Any.fromFunction0(grey), hex = js.Any.fromFunction1(hex), magenta = js.Any.fromFunction0(magenta), red = js.Any.fromFunction0(red), reset = js.Any.fromFunction0(reset), rgb = js.Any.fromFunction3(rgb), white = js.Any.fromFunction0(white), yellow = js.Any.fromFunction0(yellow))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Colorer]
  }
}

