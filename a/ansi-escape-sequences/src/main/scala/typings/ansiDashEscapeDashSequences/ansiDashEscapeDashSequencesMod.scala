package typings.ansiDashEscapeDashSequences

import typings.ansiDashEscapeDashSequences.ansiDashEscapeDashSequencesMod.Style
import typings.ansiDashEscapeDashSequences.ansiDashEscapeDashSequencesNumbers.`0`
import typings.ansiDashEscapeDashSequences.ansiDashEscapeDashSequencesNumbers.`1`
import typings.ansiDashEscapeDashSequences.ansiDashEscapeDashSequencesNumbers.`2`
import typings.ansiDashEscapeDashSequences.ansiDashEscapeDashSequencesNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ansi-escape-sequences", JSImport.Namespace)
@js.native
object ansiDashEscapeDashSequencesMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.ansiDashEscapeDashSequences.ansiDashEscapeDashSequencesStrings.reset
    - typings.ansiDashEscapeDashSequences.ansiDashEscapeDashSequencesStrings.bold
    - typings.ansiDashEscapeDashSequences.ansiDashEscapeDashSequencesStrings.italic
    - typings.ansiDashEscapeDashSequences.ansiDashEscapeDashSequencesStrings.underline
    - typings.ansiDashEscapeDashSequences.ansiDashEscapeDashSequencesStrings.fontDefault
    - typings.ansiDashEscapeDashSequences.ansiDashEscapeDashSequencesStrings.font2
    - typings.ansiDashEscapeDashSequences.ansiDashEscapeDashSequencesStrings.font3
    - typings.ansiDashEscapeDashSequences.ansiDashEscapeDashSequencesStrings.font4
    - typings.ansiDashEscapeDashSequences.ansiDashEscapeDashSequencesStrings.font5
    - typings.ansiDashEscapeDashSequences.ansiDashEscapeDashSequencesStrings.font6
    - typings.ansiDashEscapeDashSequences.ansiDashEscapeDashSequencesStrings.imageNegative
    - typings.ansiDashEscapeDashSequences.ansiDashEscapeDashSequencesStrings.imagePositive
    - typings.ansiDashEscapeDashSequences.ansiDashEscapeDashSequencesStrings.black
    - typings.ansiDashEscapeDashSequences.ansiDashEscapeDashSequencesStrings.red
    - typings.ansiDashEscapeDashSequences.ansiDashEscapeDashSequencesStrings.green
    - typings.ansiDashEscapeDashSequences.ansiDashEscapeDashSequencesStrings.yellow
    - typings.ansiDashEscapeDashSequences.ansiDashEscapeDashSequencesStrings.blue
    - typings.ansiDashEscapeDashSequences.ansiDashEscapeDashSequencesStrings.magenta
    - typings.ansiDashEscapeDashSequences.ansiDashEscapeDashSequencesStrings.cyan
    - typings.ansiDashEscapeDashSequences.ansiDashEscapeDashSequencesStrings.white
    - typings.ansiDashEscapeDashSequences.ansiDashEscapeDashSequencesStrings.grey
    - typings.ansiDashEscapeDashSequences.ansiDashEscapeDashSequencesStrings.gray
    - typings.ansiDashEscapeDashSequences.ansiDashEscapeDashSequencesStrings.`bg-black`
    - typings.ansiDashEscapeDashSequences.ansiDashEscapeDashSequencesStrings.`bg-red`
    - typings.ansiDashEscapeDashSequences.ansiDashEscapeDashSequencesStrings.`bg-green`
    - typings.ansiDashEscapeDashSequences.ansiDashEscapeDashSequencesStrings.`bg-yellow`
    - typings.ansiDashEscapeDashSequences.ansiDashEscapeDashSequencesStrings.`bg-blue`
    - typings.ansiDashEscapeDashSequences.ansiDashEscapeDashSequencesStrings.`bg-magenta`
    - typings.ansiDashEscapeDashSequences.ansiDashEscapeDashSequencesStrings.`bg-cyan`
    - typings.ansiDashEscapeDashSequences.ansiDashEscapeDashSequencesStrings.`bg-white`
    - typings.ansiDashEscapeDashSequences.ansiDashEscapeDashSequencesStrings.`bg-grey`
    - typings.ansiDashEscapeDashSequences.ansiDashEscapeDashSequencesStrings.`bg-gray`
  */
  trait Style extends js.Object
  
  def format(str: String): String = js.native
  def format(str: String, styles: js.Array[Style]): String = js.native
  def format(str: String, styles: Style): String = js.native
  def styles(styles: js.Array[Style]): String = js.native
  def styles(styles: Style): String = js.native
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
  
  @js.native
  object erase extends js.Object {
    /**
      * Clears part of the screen. If n is 0 (or missing), clear from cursor to
      * end of screen. If n is 1, clear from cursor to beginning of the screen.
      * If n is 2, clear entire screen. If n is 3, clear entire screen and delete
      * all lines saved in the scrollback buffer (some terminals only).
      */
    def display(): String = js.native
    @JSName("display")
    def display_0(n: `0`): String = js.native
    @JSName("display")
    def display_1(n: `1`): String = js.native
    @JSName("display")
    def display_2(n: `2`): String = js.native
    @JSName("display")
    def display_3(n: `3`): String = js.native
    /**
      * Erases part of the line. If n is zero (or missing), clear from cursor to
      * the end of the line. If n is one, clear from cursor to beginning of the
      * line. If n is two, clear entire line. Cursor position does not change.
      */
    def inLine(): String = js.native
    @JSName("inLine")
    def inLine_0(n: `0`): String = js.native
    @JSName("inLine")
    def inLine_1(n: `1`): String = js.native
    @JSName("inLine")
    def inLine_2(n: `2`): String = js.native
  }
  
}

