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
    _setColorCode: js.Function1[java.lang.String, Colorer],
    black: js.Function0[Cursor],
    blue: js.Function0[Cursor],
    brightBlack: js.Function0[Cursor],
    brightBlue: js.Function0[Cursor],
    brightCyan: js.Function0[Cursor],
    brightGreen: js.Function0[Cursor],
    brightMagenta: js.Function0[Cursor],
    brightRed: js.Function0[Cursor],
    brightWhite: js.Function0[Cursor],
    brightYellow: js.Function0[Cursor],
    cyan: js.Function0[Cursor],
    green: js.Function0[Cursor],
    grey: js.Function0[Cursor],
    hex: js.Function1[java.lang.String, Cursor],
    magenta: js.Function0[Cursor],
    red: js.Function0[Cursor],
    reset: js.Function0[Cursor],
    rgb: js.Function3[scala.Double, scala.Double, scala.Double, Cursor],
    white: js.Function0[Cursor],
    yellow: js.Function0[Cursor],
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, Cursor | Colorer]] = null
  ): Colorer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_setColorCode")(_setColorCode)
    __obj.updateDynamic("black")(black)
    __obj.updateDynamic("blue")(blue)
    __obj.updateDynamic("brightBlack")(brightBlack)
    __obj.updateDynamic("brightBlue")(brightBlue)
    __obj.updateDynamic("brightCyan")(brightCyan)
    __obj.updateDynamic("brightGreen")(brightGreen)
    __obj.updateDynamic("brightMagenta")(brightMagenta)
    __obj.updateDynamic("brightRed")(brightRed)
    __obj.updateDynamic("brightWhite")(brightWhite)
    __obj.updateDynamic("brightYellow")(brightYellow)
    __obj.updateDynamic("cyan")(cyan)
    __obj.updateDynamic("green")(green)
    __obj.updateDynamic("grey")(grey)
    __obj.updateDynamic("hex")(hex)
    __obj.updateDynamic("magenta")(magenta)
    __obj.updateDynamic("red")(red)
    __obj.updateDynamic("reset")(reset)
    __obj.updateDynamic("rgb")(rgb)
    __obj.updateDynamic("white")(white)
    __obj.updateDynamic("yellow")(yellow)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Colorer]
  }
}

