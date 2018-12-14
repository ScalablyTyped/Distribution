package typings
package ansiLib.ansiMod.ansiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The `Colorer` class manages both the background and foreground colors.
     */

trait Colorer
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */js.Any, Cursor | Colorer]] {
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

