package typings
package ansiDashEscapeDashSequencesLib.ansiDashEscapeDashSequencesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ansi-escape-sequences", "cursor")
@js.native
object cursorNs extends js.Object {
  /**
       * Hides the cursor
       */
  val hide: java.lang.String = js.native
  /**
       * Shows the cursor
       */
  val show: java.lang.String = js.native
  /**
       * Moves the cursor `lines` cells back. If the cursor is already at the edge
       * of the screen, this has no effect.
       * @param lines default=1
       */
  def back(): java.lang.String = js.native
  /**
       * Moves the cursor `lines` cells back. If the cursor is already at the edge
       * of the screen, this has no effect.
       * @param lines default=1
       */
  def back(lines: scala.Double): java.lang.String = js.native
  /**
       * Moves the cursor `lines` cells down. If the cursor is already at the edge
       * of the screen, this has no effect.
       * @param lines default=1
       */
  def down(): java.lang.String = js.native
  /**
       * Moves the cursor `lines` cells down. If the cursor is already at the edge
       * of the screen, this has no effect.
       * @param lines default=1
       */
  def down(lines: scala.Double): java.lang.String = js.native
  /**
       * Moves the cursor `lines` cells forward. If the cursor is already at the
       * edge of the screen, this has no effect.
       * @param lines default=1
       */
  def forward(): java.lang.String = js.native
  /**
       * Moves the cursor `lines` cells forward. If the cursor is already at the
       * edge of the screen, this has no effect.
       * @param lines default=1
       */
  def forward(lines: scala.Double): java.lang.String = js.native
  /**
       * Moves the cursor to column n.
       * @param n column number
       */
  def horizontalAbsolute(n: scala.Double): java.lang.String = js.native
  /**
       * Moves cursor to beginning of the line n lines down.
       * @param lines default=1
       */
  def nextLine(): java.lang.String = js.native
  /**
       * Moves cursor to beginning of the line n lines down.
       * @param lines default=1
       */
  def nextLine(lines: scala.Double): java.lang.String = js.native
  /**
       * Moves the cursor to row n, column m. The values are 1-based, and default
       * to 1 (top left corner) if omitted.
       *
       * @param n row number, default=1
       * @param m column number, default=1
       */
  def position(): java.lang.String = js.native
  /**
       * Moves the cursor to row n, column m. The values are 1-based, and default
       * to 1 (top left corner) if omitted.
       *
       * @param n row number, default=1
       * @param m column number, default=1
       */
  def position(n: scala.Double): java.lang.String = js.native
  /**
       * Moves the cursor to row n, column m. The values are 1-based, and default
       * to 1 (top left corner) if omitted.
       *
       * @param n row number, default=1
       * @param m column number, default=1
       */
  def position(n: scala.Double, m: scala.Double): java.lang.String = js.native
  /**
       * Moves cursor to beginning of the line n lines up.
       * @param lines default=1
       */
  def previousLine(): java.lang.String = js.native
  /**
       * Moves cursor to beginning of the line n lines up.
       * @param lines default=1
       */
  def previousLine(lines: scala.Double): java.lang.String = js.native
  /**
       * Moves the cursor `lines` cells up. If the cursor is already at the edge
       * of the screen, this has no effect.
       * @param lines default=1
       */
  def up(): java.lang.String = js.native
  /**
       * Moves the cursor `lines` cells up. If the cursor is already at the edge
       * of the screen, this has no effect.
       * @param lines default=1
       */
  def up(lines: scala.Double): java.lang.String = js.native
}

