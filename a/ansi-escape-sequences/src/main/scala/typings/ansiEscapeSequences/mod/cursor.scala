package typings.ansiEscapeSequences.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ansi-escape-sequences", "cursor")
@js.native
object cursor extends js.Object {
  /**
    * Hides the cursor
    */
  val hide: String = js.native
  /**
    * Shows the cursor
    */
  val show: String = js.native
  /**
    * Moves the cursor `lines` cells back. If the cursor is already at the edge
    * of the screen, this has no effect.
    * @param lines default=1
    */
  def back(): String = js.native
  def back(lines: Double): String = js.native
  /**
    * Moves the cursor `lines` cells down. If the cursor is already at the edge
    * of the screen, this has no effect.
    * @param lines default=1
    */
  def down(): String = js.native
  def down(lines: Double): String = js.native
  /**
    * Moves the cursor `lines` cells forward. If the cursor is already at the
    * edge of the screen, this has no effect.
    * @param lines default=1
    */
  def forward(): String = js.native
  def forward(lines: Double): String = js.native
  /**
    * Moves the cursor to column n.
    * @param n column number
    */
  def horizontalAbsolute(n: Double): String = js.native
  /**
    * Moves cursor to beginning of the line n lines down.
    * @param lines default=1
    */
  def nextLine(): String = js.native
  def nextLine(lines: Double): String = js.native
  /**
    * Moves the cursor to row n, column m. The values are 1-based, and default
    * to 1 (top left corner) if omitted.
    *
    * @param n row number, default=1
    * @param m column number, default=1
    */
  def position(): String = js.native
  def position(n: js.UndefOr[scala.Nothing], m: Double): String = js.native
  def position(n: Double): String = js.native
  def position(n: Double, m: Double): String = js.native
  /**
    * Moves cursor to beginning of the line n lines up.
    * @param lines default=1
    */
  def previousLine(): String = js.native
  def previousLine(lines: Double): String = js.native
  /**
    * Moves the cursor `lines` cells up. If the cursor is already at the edge
    * of the screen, this has no effect.
    * @param lines default=1
    */
  def up(): String = js.native
  def up(lines: Double): String = js.native
}

