package typings.ansi.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Colorer` class manages both the background and foreground colors.
  */
@JSImport("ansi", "Colorer")
@js.native
class Colorer protected ()
  extends /* key */ StringDictionary[js.Function1[/* repeated */ js.Any, Cursor | Colorer]] {
  def this(cursor: Cursor, base: String) = this()
  
  /**
    * Write an ANSI color code, ensuring that the same code doesn't get rewritten.
    */
  def _setColorCode(code: String): Colorer = js.native
  
  def black(): Cursor = js.native
  
  def blue(): Cursor = js.native
  
  def brightBlack(): Cursor = js.native
  
  def brightBlue(): Cursor = js.native
  
  def brightCyan(): Cursor = js.native
  
  def brightGreen(): Cursor = js.native
  
  def brightMagenta(): Cursor = js.native
  
  def brightRed(): Cursor = js.native
  
  def brightWhite(): Cursor = js.native
  
  def brightYellow(): Cursor = js.native
  
  def cyan(): Cursor = js.native
  
  def green(): Cursor = js.native
  
  def grey(): Cursor = js.native
  
  /**
    * Accepts CSS color codes for use with ANSI escape codes.
    * For example: `#FF000` would be bright red.
    */
  def hex(color: String): Cursor = js.native
  
  def magenta(): Cursor = js.native
  
  def red(): Cursor = js.native
  
  /**
    * Resets the color.
    */
  def reset(): Cursor = js.native
  
  /**
    * Sets the foreground color with the given RGB values.
    * The closest match out of the 216 colors is picked.
    */
  def rgb(r: Double, g: Double, b: Double): Cursor = js.native
  
  def white(): Cursor = js.native
  
  def yellow(): Cursor = js.native
}
