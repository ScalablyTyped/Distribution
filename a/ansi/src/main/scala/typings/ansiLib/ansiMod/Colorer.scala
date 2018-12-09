package typings
package ansiLib.ansiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The `Colorer` class manages both the background and foreground colors.
     */
@JSImport("ansi", "Colorer")
@js.native
class Colorer protected ()
  extends ansiLib.ansiMod.ansiNs.Colorer {
  def this(cursor: ansiLib.ansiMod.ansiNs.Cursor, base: java.lang.String) = this()
  /**
           * Write an ANSI color code, ensuring that the same code doesn't get rewritten.
           */
  /* CompleteClass */
  override def _setColorCode(code: java.lang.String): ansiLib.ansiMod.ansiNs.Colorer = js.native
  /* CompleteClass */
  override def black(): ansiLib.ansiMod.ansiNs.Cursor = js.native
  /* CompleteClass */
  override def blue(): ansiLib.ansiMod.ansiNs.Cursor = js.native
  /* CompleteClass */
  override def brightBlack(): ansiLib.ansiMod.ansiNs.Cursor = js.native
  /* CompleteClass */
  override def brightBlue(): ansiLib.ansiMod.ansiNs.Cursor = js.native
  /* CompleteClass */
  override def brightCyan(): ansiLib.ansiMod.ansiNs.Cursor = js.native
  /* CompleteClass */
  override def brightGreen(): ansiLib.ansiMod.ansiNs.Cursor = js.native
  /* CompleteClass */
  override def brightMagenta(): ansiLib.ansiMod.ansiNs.Cursor = js.native
  /* CompleteClass */
  override def brightRed(): ansiLib.ansiMod.ansiNs.Cursor = js.native
  /* CompleteClass */
  override def brightWhite(): ansiLib.ansiMod.ansiNs.Cursor = js.native
  /* CompleteClass */
  override def brightYellow(): ansiLib.ansiMod.ansiNs.Cursor = js.native
  /* CompleteClass */
  override def cyan(): ansiLib.ansiMod.ansiNs.Cursor = js.native
  /* CompleteClass */
  override def green(): ansiLib.ansiMod.ansiNs.Cursor = js.native
  /* CompleteClass */
  override def grey(): ansiLib.ansiMod.ansiNs.Cursor = js.native
  /**
           * Accepts CSS color codes for use with ANSI escape codes.
           * For example: `#FF000` would be bright red.
           */
  /* CompleteClass */
  override def hex(color: java.lang.String): ansiLib.ansiMod.ansiNs.Cursor = js.native
  /* CompleteClass */
  override def magenta(): ansiLib.ansiMod.ansiNs.Cursor = js.native
  /* CompleteClass */
  override def red(): ansiLib.ansiMod.ansiNs.Cursor = js.native
  /**
           * Resets the color.
           */
  /* CompleteClass */
  override def reset(): ansiLib.ansiMod.ansiNs.Cursor = js.native
  /**
           * Sets the foreground color with the given RGB values.
           * The closest match out of the 216 colors is picked.
           */
  /* CompleteClass */
  override def rgb(r: scala.Double, g: scala.Double, b: scala.Double): ansiLib.ansiMod.ansiNs.Cursor = js.native
  /* CompleteClass */
  override def white(): ansiLib.ansiMod.ansiNs.Cursor = js.native
  /* CompleteClass */
  override def yellow(): ansiLib.ansiMod.ansiNs.Cursor = js.native
}

