package typings
package ansiDashEscapeDashSequencesLib.ansiDashEscapeDashSequencesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ansi-escape-sequences", "erase")
@js.native
object eraseNs extends js.Object {
  /**
    * Clears part of the screen. If n is 0 (or missing), clear from cursor to
    * end of screen. If n is 1, clear from cursor to beginning of the screen.
    * If n is 2, clear entire screen. If n is 3, clear entire screen and delete
    * all lines saved in the scrollback buffer (some terminals only).
    */
  def display(): java.lang.String = js.native
  @JSName("display")
  def display_0(n: ansiDashEscapeDashSequencesLib.ansiDashEscapeDashSequencesLibNumbers.`0`): java.lang.String = js.native
  @JSName("display")
  def display_1(n: ansiDashEscapeDashSequencesLib.ansiDashEscapeDashSequencesLibNumbers.`1`): java.lang.String = js.native
  @JSName("display")
  def display_2(n: ansiDashEscapeDashSequencesLib.ansiDashEscapeDashSequencesLibNumbers.`2`): java.lang.String = js.native
  @JSName("display")
  def display_3(n: ansiDashEscapeDashSequencesLib.ansiDashEscapeDashSequencesLibNumbers.`3`): java.lang.String = js.native
  /**
    * Erases part of the line. If n is zero (or missing), clear from cursor to
    * the end of the line. If n is one, clear from cursor to beginning of the
    * line. If n is two, clear entire line. Cursor position does not change.
    */
  def inLine(): java.lang.String = js.native
  @JSName("inLine")
  def inLine_0(n: ansiDashEscapeDashSequencesLib.ansiDashEscapeDashSequencesLibNumbers.`0`): java.lang.String = js.native
  @JSName("inLine")
  def inLine_1(n: ansiDashEscapeDashSequencesLib.ansiDashEscapeDashSequencesLibNumbers.`1`): java.lang.String = js.native
  @JSName("inLine")
  def inLine_2(n: ansiDashEscapeDashSequencesLib.ansiDashEscapeDashSequencesLibNumbers.`2`): java.lang.String = js.native
}

